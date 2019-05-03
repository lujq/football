package com.example.spinwheel.service.impl;

import com.example.spinwheel.StatisticBo;
import com.example.spinwheel.base.dao.*;
import com.example.spinwheel.base.domain.*;
import com.example.spinwheel.base.dto.CommonListDto;
import com.example.spinwheel.base.dto.ResultDto;
import com.example.spinwheel.base.request.GetFileUrlReq;
import com.example.spinwheel.base.request.GetTotalScoreDetailReq;
import com.example.spinwheel.base.request.GetTotalScoreReq;
import com.example.spinwheel.base.response.GetFileUrlRsp;
import com.example.spinwheel.base.response.GetSeasonsRsp;
import com.example.spinwheel.base.response.GetTotalScoreDetailRsp;
import com.example.spinwheel.base.response.GetTotalScoreRsp;
import com.example.spinwheel.service.StatisticService;
import com.example.spinwheel.utils.GenLogTagTool;
import com.example.spinwheel.utils.LoggerManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.math.BigDecimal;
import java.util.*;

import static java.lang.Float.NaN;

@Service
public class StatisticServiceImpl implements StatisticService{

    private static final String SERVICE_NAME = "StatisticServiceImpl";

    protected LoggerManager logger = LoggerManager.getLogger(this.getClass());

    @Autowired
    StatisticBo statisticBo;

    @Autowired
    SclassMapper sclassMapper;

    @Autowired
    Schedule2016Mapper schedule2016Mapper;

    @Autowired
    Schedule20162017Mapper schedule20162017Mapper;

    @Autowired
    Schedule2017Mapper schedule2017Mapper;

    @Autowired
    Schedule20172018Mapper schedule20172018Mapper;

    @Autowired
    Schedule2018Mapper schedule2018Mapper;

    @Autowired
    Schedule20182019Mapper schedule20182019Mapper;

    @Autowired
    TotalScoreDetailMapper totalScoreDetailMapper;

    @Autowired
    TotalScoreRealMapper realMapper;


    /**
     * 查询大小球数据分析
     * @param req
     * @return
     */
    @Override
    public GetTotalScoreRsp getTotalScoreStatistic(GetTotalScoreReq req) {
        Map<String, String> logTags = GenLogTagTool.genlogTag(SERVICE_NAME, "getTotalScoreStatistic");
        logger.info(SERVICE_NAME + "getTotalScoreStatistic start.", logTags);
        GetTotalScoreRsp rsp = new GetTotalScoreRsp();
        List<ResultDto> resultDtoList = new ArrayList<>();
        List<TotalScoreReal> reals = new ArrayList<>();
        if (StringUtils.isEmpty(req.getSclass())) {
            List<Integer> classIdList = realMapper.selectClassId();
            List<ResultDto> dtoList = new ArrayList<>();
            for (Integer classId : classIdList) {
                TotalScoreRealExample example = new TotalScoreRealExample();
                TotalScoreRealExample.Criteria realCriteria = example.createCriteria().andClass_idEqualTo(classId);
                if (!StringUtils.isEmpty(req.getHomeScore())) {
                    realCriteria.andHome_half_scoreEqualTo(req.getHomeScore());
                }
                if (!StringUtils.isEmpty(req.getGuestScore())) {
                    realCriteria.andGuest_half_scoreEqualTo(req.getGuestScore());
                }
                if (!StringUtils.isEmpty(req.getGoal())) {
                    realCriteria.andGoalEqualTo(req.getGoal());
                }
                if (!StringUtils.isEmpty(req.getFirstGoal())) {
                    realCriteria.andFirst_goalEqualTo(req.getFirstGoal());
                }
                List<TotalScoreReal> tempList = realMapper.selectByExample(example);
                List<TotalScoreReal> goalList = statisticBo.checkTotalScore(tempList);
                List<TotalScoreReal> totalList = statisticBo.checkTotal(tempList);
                ResultDto dto = new ResultDto();
                dto.setResult(goalList.size());
                dto.setTotal(totalList.size());
                Sclass sclass = sclassMapper.selectByPrimaryKey(classId);
                dto.setClassId(classId);
                dto.setClassName(sclass.getName_J());
                dto.setRate(statisticBo.sumRate(tempList));
                if (dto.getTotal().equals(0)) {
                    dto.setWinRate(0F);
                } else {
                    BigDecimal b = new BigDecimal(Float.parseFloat(dto.getResult().toString()) / dto.getTotal());
                    dto.setWinRate(b.setScale(4, BigDecimal.ROUND_HALF_UP).floatValue());
                }
                if (dto.getTotal() != 0) {
                    dtoList.add(dto);
                }
            }
            Collections.sort(dtoList, new Comparator<ResultDto>() {
                @Override
                public int compare(ResultDto o1, ResultDto o2) {
//                    float percent1 = (float)(o1.getResult())/ o1.getTotal();
//                    if (percent1 == NaN) {
//                        percent1 = 0F;
//                    }
//                    float percent2 = (float)(o2.getResult())/ o2.getTotal();
//                    if (percent2 == NaN) {
//                        percent2 = 0F;
//                    }
//                    if (percent2 > percent1) {
//                        return 1;
//                    } else if (percent2 < percent1) {
//                        return -1;
//                    }
                    if (o1.getWinRate() - o2.getWinRate() > 0) {
                        return -1;
                    }
                    if (o1.getWinRate() - o2.getWinRate() < 0) {
                        return 1;
                    }
                    return 0;
                }
            });
            rsp.setResultList(dtoList);
        } else {
            TotalScoreRealExample example = new TotalScoreRealExample();
            TotalScoreRealExample.Criteria criteria = example.createCriteria().andClass_idEqualTo(req.getSclass());
            if (!StringUtils.isEmpty(req.getHomeScore())) {
                criteria.andHome_half_scoreEqualTo(req.getHomeScore());
            }
            if (!StringUtils.isEmpty(req.getGuestScore())) {
                criteria.andGuest_half_scoreEqualTo(req.getGuestScore());
            }
            if (!StringUtils.isEmpty(req.getGoal())) {
                criteria.andGoalEqualTo(req.getGoal());
            }
            if (!StringUtils.isEmpty(req.getFirstGoal())) {
                criteria.andFirst_goalEqualTo(req.getFirstGoal());
            }
            reals = realMapper.selectByExample(example);
            List<TotalScoreReal> goalList = statisticBo.checkTotalScore(reals);
            List<TotalScoreReal> totalList = statisticBo.checkTotal(reals);
            ResultDto dto = new ResultDto();
            dto.setResult(goalList.size());
            dto.setTotal(totalList.size());
            Sclass sclass = sclassMapper.selectByPrimaryKey(req.getSclass());
            dto.setClassId(req.getSclass());
            dto.setClassName(sclass.getName_J());
            dto.setRate(statisticBo.sumRate(reals));
            if (dto.getTotal().equals(0)) {
                dto.setWinRate(0F);
            } else {
                BigDecimal b = new BigDecimal(Float.parseFloat(dto.getResult().toString())/dto.getTotal());
                dto.setWinRate(b.setScale(4, BigDecimal.ROUND_HALF_UP).floatValue());
            }
            List<ResultDto> dtoList = new ArrayList<>();
            dtoList.add(dto);
            rsp.setResultList(dtoList);
        }
        logger.info(SERVICE_NAME + "getTotalScoreStatistic end.", logTags);
        return rsp;
    }

    /**
     * 查询大小球详细信息
     * @param req
     * @return
     */
    @Override
    public GetTotalScoreDetailRsp getTotalScoreDetail(GetTotalScoreDetailReq req) {
        GetTotalScoreDetailRsp rsp = new GetTotalScoreDetailRsp();
        TotalScoreRealExample example = new TotalScoreRealExample();
        TotalScoreRealExample.Criteria criteria = example.createCriteria().andClass_idEqualTo(req.getSclass());
        if (!StringUtils.isEmpty(req.getHomeScore())) {
            criteria.andHome_half_scoreEqualTo(req.getHomeScore());
        }
        if (!StringUtils.isEmpty(req.getGuestScore())) {
            criteria.andGuest_half_scoreEqualTo(req.getGuestScore());
        }
        if (!StringUtils.isEmpty(req.getGoal())) {
            criteria.andGoalEqualTo(req.getGoal());
        }
        if (!StringUtils.isEmpty(req.getFirstGoal())) {
            criteria.andFirst_goalEqualTo(req.getFirstGoal());
        }
        List<TotalScoreReal> reals = realMapper.selectByExample(example);
        List<TotalScoreReal> totalList = statisticBo.checkTotal(reals);
        rsp.setResultList(totalList);
        return rsp;
    }

    /**
     * 查询赛季
     * @return
     */
    @Override
    public GetSeasonsRsp getSeasons() {
        GetSeasonsRsp rsp = new GetSeasonsRsp();
        List<CommonListDto> list = realMapper.selectSeasons();
        rsp.setSeasons(list);
        rsp.setHomeHalfScores(realMapper.selectHomeHalfScores());
        rsp.setGuestHalfScores(realMapper.selectGuestHalfScores());
        rsp.setFirstGoals(realMapper.selectFirstGoals());
        rsp.setGoals(realMapper.selectGoals());
        return rsp;
    }

    /**
     * 查询文件下载地址
     * @param req
     * @return
     */
    @Override
    public GetFileUrlRsp getFileUrl(GetFileUrlReq req) {
        return null;
    }

    @Override
    public void completeData() {
        Schedule2016Example example = new Schedule2016Example();
        Schedule2016Example.Criteria criteria = example.createCriteria();
        List<Schedule2016> list = schedule2016Mapper.selectByExample(example);
        Long count = 0L;
        for (Schedule2016 schedule : list) {
            count++;
            System.out.println("2016" + count + "start." + "Total is " + list.size());
            TotalScoreDetailExample midExample = new TotalScoreDetailExample();
            TotalScoreDetailExample.Criteria midCriteria= midExample.createCriteria().andOddsIDEqualTo(schedule.getOdds_id()).andModifyTimeLessThanOrEqualTo(schedule.getMatch_time());
            TotalScoreDetailExample finalExample = new TotalScoreDetailExample();
            Date matchTime2 = schedule.getMatch_time2();
            if (null == matchTime2) {
                matchTime2 = schedule.getMatch_time();
            }
            TotalScoreDetailExample.Criteria finalCriteria= finalExample.createCriteria().andOddsIDEqualTo(schedule.getOdds_id()).andModifyTimeLessThanOrEqualTo(matchTime2);
            List<TotalScoreDetail> midDetails = totalScoreDetailMapper.selectByExample(midExample);
            List<TotalScoreDetail> finalDetails = totalScoreDetailMapper.selectByExample(finalExample);
            System.out.println(count + "running." + midDetails.size() + "midDetails");
            System.out.println(count + "running." + finalDetails.size() + "finalDetails");
            if (!CollectionUtils.isEmpty(midDetails)) {
                TotalScoreDetail detail = midDetails.get(midDetails.size()-1);
                schedule.setFirst_goal(detail.getGoal());
                schedule.setFirst_up_odds(detail.getUpOdds());
                schedule.setFirst_down_odds(detail.getDownOdds());
            }
            if (!CollectionUtils.isEmpty(finalDetails)) {
                TotalScoreDetail finalDetail = finalDetails.get(finalDetails.size()-1);
                schedule.setGoal(finalDetail.getGoal());
                schedule.setUp_odds(finalDetail.getUpOdds());
                schedule.setDown_odds(finalDetail.getDownOdds());
            }
            schedule2016Mapper.updateByPrimaryKey(schedule);
        }
    }

    @Override
    public void completeData20162017() {
        Schedule20162017Example example = new Schedule20162017Example();
        Schedule20162017Example.Criteria criteria = example.createCriteria();
        List<Schedule20162017> list = schedule20162017Mapper.selectByExample(example);
        Long count = 0L;
        for (Schedule20162017 schedule : list) {
            count++;
            System.out.println("2016-2017" + count + "start." + "Total is " + list.size());
            TotalScoreDetailExample midExample = new TotalScoreDetailExample();
            TotalScoreDetailExample.Criteria midCriteria= midExample.createCriteria().andOddsIDEqualTo(schedule.getOdds_id()).andModifyTimeLessThanOrEqualTo(schedule.getMatch_time());
            TotalScoreDetailExample finalExample = new TotalScoreDetailExample();
            Date matchTime2 = schedule.getMatch_time2();
            if (null == matchTime2) {
                matchTime2 = schedule.getMatch_time();
            }
            TotalScoreDetailExample.Criteria finalCriteria= finalExample.createCriteria().andOddsIDEqualTo(schedule.getOdds_id()).andModifyTimeLessThanOrEqualTo(matchTime2);
            List<TotalScoreDetail> midDetails = totalScoreDetailMapper.selectByExample(midExample);
            List<TotalScoreDetail> finalDetails = totalScoreDetailMapper.selectByExample(finalExample);
            System.out.println(count + "running." + midDetails.size() + "midDetails");
            System.out.println(count + "running." + finalDetails.size() + "finalDetails");
            if (!CollectionUtils.isEmpty(midDetails)) {
                TotalScoreDetail detail = midDetails.get(midDetails.size()-1);
                schedule.setFirst_goal(detail.getGoal());
                schedule.setFirst_up_odds(detail.getUpOdds());
                schedule.setFirst_down_odds(detail.getDownOdds());
            }
            if (!CollectionUtils.isEmpty(finalDetails)) {
                TotalScoreDetail finalDetail = finalDetails.get(finalDetails.size()-1);
                schedule.setGoal(finalDetail.getGoal());
                schedule.setUp_odds(finalDetail.getUpOdds());
                schedule.setDown_odds(finalDetail.getDownOdds());
            }
            schedule20162017Mapper.updateByPrimaryKey(schedule);
        }
    }

    @Override
    public void completeData2017() {
        Schedule2017Example example = new Schedule2017Example();
        Schedule2017Example.Criteria criteria = example.createCriteria();
        List<Schedule2017> list = schedule2017Mapper.selectByExample(example);
        Long count = 0L;
        for (Schedule2017 schedule : list) {
            count++;
            System.out.println("2017" + count + "start." + "Total is " + list.size());
            TotalScoreDetailExample midExample = new TotalScoreDetailExample();
            TotalScoreDetailExample.Criteria midCriteria= midExample.createCriteria().andOddsIDEqualTo(schedule.getOdds_id()).andModifyTimeLessThanOrEqualTo(schedule.getMatch_time());
            TotalScoreDetailExample finalExample = new TotalScoreDetailExample();
            Date matchTime2 = schedule.getMatch_time2();
            if (null == matchTime2) {
                matchTime2 = schedule.getMatch_time();
            }
            TotalScoreDetailExample.Criteria finalCriteria= finalExample.createCriteria().andOddsIDEqualTo(schedule.getOdds_id()).andModifyTimeLessThanOrEqualTo(matchTime2);
            List<TotalScoreDetail> midDetails = totalScoreDetailMapper.selectByExample(midExample);
            List<TotalScoreDetail> finalDetails = totalScoreDetailMapper.selectByExample(finalExample);
            System.out.println(count + "running." + midDetails.size() + "midDetails");
            System.out.println(count + "running." + finalDetails.size() + "finalDetails");
            if (!CollectionUtils.isEmpty(midDetails)) {
                TotalScoreDetail detail = midDetails.get(midDetails.size()-1);
                schedule.setFirst_goal(detail.getGoal());
                schedule.setFirst_up_odds(detail.getUpOdds());
                schedule.setFirst_down_odds(detail.getDownOdds());
            }
            if (!CollectionUtils.isEmpty(finalDetails)) {
                TotalScoreDetail finalDetail = finalDetails.get(finalDetails.size()-1);
                schedule.setGoal(finalDetail.getGoal());
                schedule.setUp_odds(finalDetail.getUpOdds());
                schedule.setDown_odds(finalDetail.getDownOdds());
            }
            schedule2017Mapper.updateByPrimaryKey(schedule);
        }
    }

    @Override
    public void completeData20172018() {
        Schedule20172018Example example = new Schedule20172018Example();
        Schedule20172018Example.Criteria criteria = example.createCriteria();
        List<Schedule20172018> list = schedule20172018Mapper.selectByExample(example);
        Long count = 0L;
        for (Schedule20172018 schedule : list) {
            count++;
            System.out.println("2017-2018" + count + "start." + "Total is " + list.size());
            TotalScoreDetailExample midExample = new TotalScoreDetailExample();
            TotalScoreDetailExample.Criteria midCriteria= midExample.createCriteria().andOddsIDEqualTo(schedule.getOdds_id()).andModifyTimeLessThanOrEqualTo(schedule.getMatch_time());
            midExample.setOrderByClause("ModifyTime ASC");
            TotalScoreDetailExample finalExample = new TotalScoreDetailExample();
            Date matchTime2 = schedule.getMatch_time2();
            if (null == matchTime2) {
                matchTime2 = schedule.getMatch_time();
            }
            TotalScoreDetailExample.Criteria finalCriteria= finalExample.createCriteria().andOddsIDEqualTo(schedule.getOdds_id()).andModifyTimeLessThanOrEqualTo(matchTime2);
            finalExample.setOrderByClause("ModifyTime ASC");
            List<TotalScoreDetail> midDetails = totalScoreDetailMapper.selectByExample(midExample);
            List<TotalScoreDetail> finalDetails = totalScoreDetailMapper.selectByExample(finalExample);
            System.out.println(count + "running." + midDetails.size() + "midDetails");
            System.out.println(count + "running." + finalDetails.size() + "finalDetails");
            if (!CollectionUtils.isEmpty(midDetails)) {
                TotalScoreDetail detail = midDetails.get(midDetails.size()-1);
                schedule.setFirst_goal(detail.getGoal());
                schedule.setFirst_up_odds(detail.getUpOdds());
                schedule.setFirst_down_odds(detail.getDownOdds());
            }
            if (!CollectionUtils.isEmpty(finalDetails)) {
                TotalScoreDetail finalDetail = finalDetails.get(finalDetails.size()-1);
                schedule.setGoal(finalDetail.getGoal());
                schedule.setUp_odds(finalDetail.getUpOdds());
                schedule.setDown_odds(finalDetail.getDownOdds());
            }
            schedule20172018Mapper.updateByPrimaryKey(schedule);
        }
    }

    @Override
    public void completeData2018() {
        Schedule2018Example example = new Schedule2018Example();
        Schedule2018Example.Criteria criteria = example.createCriteria();
        List<Schedule2018> list = schedule2018Mapper.selectByExample(example);
        Long count = 0L;
        for (Schedule2018 schedule : list) {
            count++;
            System.out.println("2018" + count + "start." + "Total is " + list.size());
            TotalScoreDetailExample midExample = new TotalScoreDetailExample();
            TotalScoreDetailExample.Criteria midCriteria= midExample.createCriteria().andOddsIDEqualTo(schedule.getOdds_id()).andModifyTimeLessThanOrEqualTo(schedule.getMatch_time());
            midExample.setOrderByClause("ModifyTime ASC");
            TotalScoreDetailExample finalExample = new TotalScoreDetailExample();
            Date matchTime2 = schedule.getMatch_time2();
            if (null == matchTime2) {
                matchTime2 = schedule.getMatch_time();
            }
            TotalScoreDetailExample.Criteria finalCriteria= finalExample.createCriteria().andOddsIDEqualTo(schedule.getOdds_id()).andModifyTimeLessThanOrEqualTo(matchTime2);
            finalExample.setOrderByClause("ModifyTime ASC");
            List<TotalScoreDetail> midDetails = totalScoreDetailMapper.selectByExample(midExample);
            List<TotalScoreDetail> finalDetails = totalScoreDetailMapper.selectByExample(finalExample);
            System.out.println(count + "running." + midDetails.size() + "midDetails");
            System.out.println(count + "running." + finalDetails.size() + "finalDetails");
            if (!CollectionUtils.isEmpty(midDetails)) {
                TotalScoreDetail detail = midDetails.get(midDetails.size()-1);
                schedule.setFirst_goal(detail.getGoal());
                schedule.setFirst_up_odds(detail.getUpOdds());
                schedule.setFirst_down_odds(detail.getDownOdds());
            }
            if (!CollectionUtils.isEmpty(finalDetails)) {
                TotalScoreDetail finalDetail = finalDetails.get(finalDetails.size()-1);
                schedule.setGoal(finalDetail.getGoal());
                schedule.setUp_odds(finalDetail.getUpOdds());
                schedule.setDown_odds(finalDetail.getDownOdds());
            }
            schedule2018Mapper.updateByPrimaryKey(schedule);
        }
    }

    @Override
    public void completeData20182019() {
        Schedule20182019Example example = new Schedule20182019Example();
        Schedule20182019Example.Criteria criteria = example.createCriteria();
        List<Schedule20182019> list = schedule20182019Mapper.selectByExample(example);
        Long count = 0L;
        for (Schedule20182019 schedule : list) {
            count++;
            System.out.println("2018-2019" + count + "start." + "Total is " + list.size());
            TotalScoreDetailExample midExample = new TotalScoreDetailExample();
            TotalScoreDetailExample.Criteria midCriteria= midExample.createCriteria().andOddsIDEqualTo(schedule.getOdds_id()).andModifyTimeLessThanOrEqualTo(schedule.getMatch_time());
            midExample.setOrderByClause("ModifyTime ASC");
            TotalScoreDetailExample finalExample = new TotalScoreDetailExample();
            Date matchTime2 = schedule.getMatch_time2();
            if (null == matchTime2) {
                matchTime2 = schedule.getMatch_time();
            }
            TotalScoreDetailExample.Criteria finalCriteria= finalExample.createCriteria().andOddsIDEqualTo(schedule.getOdds_id()).andModifyTimeLessThanOrEqualTo(matchTime2);
            finalExample.setOrderByClause("ModifyTime ASC");
            List<TotalScoreDetail> midDetails = totalScoreDetailMapper.selectByExample(midExample);
            List<TotalScoreDetail> finalDetails = totalScoreDetailMapper.selectByExample(finalExample);
            System.out.println(count + "running." + midDetails.size() + "midDetails");
            System.out.println(count + "running." + finalDetails.size() + "finalDetails");
            if (!CollectionUtils.isEmpty(midDetails)) {
                TotalScoreDetail detail = midDetails.get(midDetails.size()-1);
                schedule.setFirst_goal(detail.getGoal());
                schedule.setFirst_up_odds(detail.getUpOdds());
                schedule.setFirst_down_odds(detail.getDownOdds());
            }
            if (!CollectionUtils.isEmpty(finalDetails)) {
                TotalScoreDetail finalDetail = finalDetails.get(finalDetails.size()-1);
                schedule.setGoal(finalDetail.getGoal());
                schedule.setUp_odds(finalDetail.getUpOdds());
                schedule.setDown_odds(finalDetail.getDownOdds());
            }
            schedule20182019Mapper.updateByPrimaryKey(schedule);
        }
    }
}
