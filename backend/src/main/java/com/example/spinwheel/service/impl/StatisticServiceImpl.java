package com.example.spinwheel.service.impl;

import com.csvreader.CsvWriter;
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

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
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

    @Autowired
    TotalScoreDetailMapper detailMapper;

    @Autowired
    TotalScoreMapper totalScoreMapper;

    @Autowired
    LetGoalMapper letGoalMapper;

    @Autowired
    LetGoalDetailMapper letGoalDetailMapper;

    @Autowired
    ScheduleMapper scheduleMapper;

    @Autowired
    SbOddsDetailMapper sbOddsDetailMapper;

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

    @Override
    public void generateCsv() {
        String fileName = "football2.csv";
        File file = new File("/Users/zhangyimin/文档/"+ fileName);
        CsvWriter writer = new CsvWriter("/Users/zhangyimin/文档/"+ fileName,',', Charset.forName("GBK"));
        String[] header = {"开赛日期", "开赛时间",  "联赛名称", "主队", "客队", "主队（半场得分）", "客队（半场得分）", "主队（整场得分）", "客队（整场得分）", "盘口（早鸟盘）",  "盘口（中场）", "大球水位（早鸟盘）",  "小球水位（早鸟盘）","大球水位（中场）", "小球水位（中场）"};
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        try {
            writer.writeRecord(header);
            TotalScoreRealExample example = new TotalScoreRealExample();
            List<TotalScoreReal> list = realMapper.selectByExample(example);
            Long count = 0L;
            for (TotalScoreReal real : list) {
                count++;
                logger.info("generateCsv now is :"+ count);
                List<String> content = new ArrayList<>();
                // 开赛日期
                content.add(dateFormat.format(real.getMatch_time()));
                // 开赛时间
                content.add(timeFormat.format(real.getMatch_time()));
                // 联赛名称
                Sclass sclass = sclassMapper.selectByPrimaryKey(real.getClass_id());
                content.add(sclass.getName_J());
                // 主队
                content.add(real.getHome_team());
                // 客队
                content.add(real.getGuest_team());
                // 主队（半场得分）
                content.add(real.getHome_half_score().toString());
                // 客队（半场得分）
                content.add(real.getGuest_half_score().toString());
                // 主队（整场得分）
                content.add(real.getHome_score().toString());
                // 客队（整场得分）
                content.add(real.getGuest_score().toString());
                // 盘口（早鸟盘）
                TotalScoreDetailExample breakfastExample = new TotalScoreDetailExample();
                TotalScoreDetailExample.Criteria breakfastCriteria = breakfastExample.createCriteria().andOddsIDEqualTo(real.getOdds_id()).andIsEarlyEqualTo(true);
                breakfastExample.setOrderByClause("ModifyTime ASC");
                List<TotalScoreDetail> breakfasts = detailMapper.selectByExample(breakfastExample);
                if (!CollectionUtils.isEmpty(breakfasts)) {
                    content.add(breakfasts.get(breakfasts.size() - 1).getGoal().toString());
                } else {
                    content.add("");
                }
                // 盘口（中场）
                content.add(real.getGoal().toString());
                // 大球水位（早鸟盘）
                if (!CollectionUtils.isEmpty(breakfasts)) {
                    content.add(breakfasts.get(breakfasts.size() - 1).getUpOdds().toString());
                } else {
                    content.add("");
                }
                // 小球水位（早鸟盘）
                if (!CollectionUtils.isEmpty(breakfasts)) {
                    content.add(breakfasts.get(breakfasts.size() - 1).getDownOdds().toString());
                } else {
                    content.add("");
                }
                // 大球水位（中场）
                content.add(real.getUp_odds().toString());
                // 小球水位（中场）
                content.add(real.getDown_odds().toString());

                // 中场相对盘口
//                content.add((real.getGoal() - real.getHalf_score()) + "");
                // 投小盈利
//                Float odds = real.getScore() - real.getGoal();
//                Float result = 0F;
//                Float valid = 0F;
//                if (odds > 0.25) {
//                    result = 0F;
//                    valid = -1F;
//                }
//                if (odds == 0.25) {
//                    result = 0.5F;
//                    valid = -0.5F;
//                }
//                if (odds == 0) {
//                    result = 1F;
//                    valid = 0F;
//                }
//                if (odds == -0.25) {
//                    result = (1F + real.getDown_odds()/2);
//                    valid = 0.5F;
//                }
//                if (odds < -0.25) {
//                    result = (1F + real.getDown_odds());
//                    valid = 1F;
//                }
//                content.add(result.toString());
//                // 有效场数
//                content.add(valid.toString());
                String[] contentList = content.toArray(new String[content.size()]);
                writer.writeRecord(contentList);
            }
            writer.flush();
        } catch (IOException e) {
            logger.error("generateCsv error: exception is "+ e);
        }
    }

    @Override
    public void generateLetGoal() {
        String fileName = "football_letgoal.csv";
        File file = new File("/Users/zhangyimin/文档/"+ fileName);
        CsvWriter writer = new CsvWriter("/Users/zhangyimin/文档/"+ fileName,',', Charset.forName("GBK"));
        String[] header = {"开赛日期", "开赛时间", "联赛名称", "是否是联赛（1-Y,0-N）", "主队", "客队", "主队（整场得分）", "客队（整场得分）", "盘口（初盘）", "上盘水位（初盘）",  "下盘水位（初盘）"};
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        try {
            writer.writeRecord(header);
            LetGoalExample example = new LetGoalExample();
            LetGoalExample.Criteria criteria = example.createCriteria().andZouDiEqualTo(true).andCompanyIDEqualTo(3);
            List<LetGoal> list = letGoalMapper.selectByExample(example);
            Long count = 0L;
            for (LetGoal goal: list) {
                count++;
                logger.info("generateCsv now is :"+ count);
                Schedule schedule = scheduleMapper.selectByPrimaryKey(goal.getScheduleID());
                Sclass sclass = sclassMapper.selectByPrimaryKey(schedule.getSclassID());
                List<String> content = new ArrayList<>();
                // 赛季
//                content.add(schedule.getMatchSeason().trim());
                // 开赛日期
                if (null == schedule || null == sclass) {
                    continue;
                }
                content.add(dateFormat.format(schedule.getMatchTime()));
                // 开赛时间
                content.add(timeFormat.format(schedule.getMatchTime()));
                // 联赛名称
                content.add(sclass.getName_J());
                // 是否是联赛
                if (1 == sclass.getKind()) {
                    content.add("1");
                } else if (2 == sclass.getKind()) {
                    content.add("2");
                } else {
                    content.add("其他");
                }
                // 主队
                content.add(schedule.getHomeTeam());
                // 客队
                content.add(schedule.getGuestTeam());
                // 主队得分
                content.add(null == schedule.getHomeScore()? "" : schedule.getHomeScore().toString());
                // 客队得分
                content.add(null == schedule.getGuestScore()? "" : schedule.getGuestScore().toString());
                // 盘口
                content.add(null == goal.getFirstGoal() ? "" : goal.getFirstGoal().toString());
                // 上水
                content.add(null == goal.getFirstUpodds() ? "" : goal.getFirstUpodds().toString());
                // 下水
                content.add(null == goal.getFirstDownodds() ? "" : goal.getFirstDownodds().toString());
                String[] contentList = content.toArray(new String[content.size()]);
                writer.writeRecord(contentList);
            }
        } catch (Exception e) {
            logger.error("generateCsv error: exception is "+ e);
        }
    }

    @Override
    public void newGenerateCsv() {
        String fileName = "TotalGoal_REAL_20182019.csv";
        File file = new File("/Users/zhangyimin/文档/"+ fileName);
        CsvWriter writer = new CsvWriter("/Users/zhangyimin/文档/"+ fileName,',', Charset.forName("GBK"));
        String[] header = {"开赛日期", "开赛时间",  "联赛名称", "主队", "客队", "主队（半场得分）", "客队（半场得分）", "主队（整场得分）", "客队（整场得分）", "盘口（早鸟盘）",  "盘口（中场）", "大球水位（早鸟盘）",  "小球水位（早鸟盘）","大球水位（中场）", "小球水位（中场）"};
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        try {
            writer.writeRecord(header);
            Schedule20182019Example example = new Schedule20182019Example();
            List<Schedule20182019> list = schedule20182019Mapper.selectByExample(example);
            Long count = 0L;
            for (Schedule20182019 real : list) {
                count++;
                logger.info("newGenerateCsv now is :"+ count);
                if (null == real.getHome_half_score() || null == real.getGuest_half_score() || null == real.getHome_score() || null == real.getGuest_score() || null == real.getFirst_up_odds() || null == real.getFirst_down_odds()
                        || null == real.getFirst_goal()) {
                    continue;
                }
                List<String> content = new ArrayList<>();
                // 开赛日期
                content.add(dateFormat.format(real.getMatch_time()));
                // 开赛时间
                content.add(timeFormat.format(real.getMatch_time()));
                // 联赛名称
                Sclass sclass = sclassMapper.selectByPrimaryKey(real.getClass_id());
                content.add(sclass.getName_J());
                // 主队
                content.add(real.getHome_team());
                // 客队
                content.add(real.getGuest_team());
                // 主队（半场得分）
                content.add(real.getHome_half_score().toString());
                // 客队（半场得分）
                content.add(real.getGuest_half_score().toString());
                // 主队（整场得分）
                content.add(real.getHome_score().toString());
                // 客队（整场得分）
                content.add(real.getGuest_score().toString());
                // 盘口（早鸟盘）
                content.add(real.getFirst_goal().toString());

                SbOddsDetailExample midExample = new SbOddsDetailExample();
                List<String> param = new ArrayList<>();
                param.add("中场");
                param.add("半场");
                SbOddsDetailExample.Criteria midCriteria = midExample.createCriteria().andScheduleIDEqualTo(real.getSchedule_id()).andHappenTimeIn(param).andTypeEqualTo(2);
                midExample.setOrderByClause("ModifyTime DESC");
                List<SbOddsDetail> mids = sbOddsDetailMapper.selectByExample(midExample);
                if (CollectionUtils.isEmpty(mids)) {
                    continue;
                }
                // 盘口（中场）
                content.add(mids.get(0).getGoal().toString());
                // 大球水位（早鸟盘）
                content.add(real.getFirst_up_odds().toString());
                // 小球水位（早鸟盘）
                content.add(real.getFirst_down_odds().toString());
                // 大球水位（中场）
                content.add(mids.get(0).getUpOdds().toString());
                // 小球水位（中场）
                content.add(mids.get(0).getDownOdds().toString());
                String[] contentList = content.toArray(new String[content.size()]);
                writer.writeRecord(contentList);
            }
            writer.flush();
        } catch (IOException e) {
            logger.error("generateCsv error: exception is "+ e);
        }
    }


    @Override
    public void newGenerateCsv1() {
        String fileName = "Total_2018.csv";
        File file = new File("/Users/zhangyimin/文档/"+ fileName);
        CsvWriter writer = new CsvWriter("/Users/zhangyimin/文档/"+ fileName,',', Charset.forName("GBK"));
        String[] header = {"赛季","开赛日期", "开赛时间",  "联赛名称","是否是联赛（1-Y，0-N）",  "主队", "客队", "主队（半场得分）", "客队（半场得分）", "主队（整场得分）", "客队（整场得分）", "盘口（早鸟盘）",  "盘口（中场）", "大球水位（早鸟盘）",  "小球水位（早鸟盘）","大球水位（中场）", "小球水位（中场）","盘口（初盘）", "盘口（盘中）","上盘水位（初盘）",  "下盘水位（初盘）"};
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        try {
            writer.writeRecord(header);
            Schedule2018Example example = new Schedule2018Example();
            List<Schedule2018> list = schedule2018Mapper.selectByExample(example);
            Long count2018 = 0L;
            for (Schedule2018 real : list) {
                count2018++;
                logger.info("newGenerateCsv_20182019 now is :"+ count2018);
                LetGoalExample letGoalExample = new LetGoalExample();
                LetGoalExample.Criteria letGoalCriteria = letGoalExample.createCriteria().andZouDiEqualTo(true).andCompanyIDEqualTo(3).andScheduleIDEqualTo(real.getSchedule_id());
                List<LetGoal> letGoalList = letGoalMapper.selectByExample(letGoalExample);
                if (CollectionUtils.isEmpty(letGoalList)) {
                    continue;
                }
                LetGoal goal = letGoalList.get(0);

                if (null == real.getHome_half_score() || null == real.getGuest_half_score() || null == real.getHome_score() || null == real.getGuest_score() || null == real.getFirst_up_odds() || null == real.getFirst_down_odds()
                        || null == real.getFirst_goal()) {
                    continue;
                }
                List<String> content = new ArrayList<>();
                // 赛季
                content.add(real.getMatch_season());
                // 开赛日期
                content.add(dateFormat.format(real.getMatch_time()));
                // 开赛时间
                content.add(timeFormat.format(real.getMatch_time()));
                // 联赛名称
                Sclass sclass = sclassMapper.selectByPrimaryKey(real.getClass_id());
                content.add(sclass.getName_J());
                // 是否是联赛
                if (1 == sclass.getKind()) {
                    content.add("1");
                } else if (2 == sclass.getKind()) {
                    content.add("2");
                } else {
                    content.add("其他");
                }
                // 主队
                content.add(real.getHome_team());
                // 客队
                content.add(real.getGuest_team());
                // 主队（半场得分）
                content.add(real.getHome_half_score().toString());
                // 客队（半场得分）
                content.add(real.getGuest_half_score().toString());
                // 主队（整场得分）
                content.add(real.getHome_score().toString());
                // 客队（整场得分）
                content.add(real.getGuest_score().toString());
                // 盘口（早鸟盘）
                content.add(real.getFirst_goal().toString());

                SbOddsDetailExample midExample = new SbOddsDetailExample();
                List<String> param = new ArrayList<>();
                param.add("中场");
                param.add("半场");
                SbOddsDetailExample.Criteria midCriteria = midExample.createCriteria().andScheduleIDEqualTo(real.getSchedule_id()).andHappenTimeIn(param).andTypeEqualTo(2);
                midExample.setOrderByClause("ModifyTime DESC");
                List<SbOddsDetail> mids = sbOddsDetailMapper.selectByExample(midExample);
                if (CollectionUtils.isEmpty(mids)) {
                    continue;
                }
                // 盘口（中场）
                content.add(mids.get(0).getGoal().toString());
                // 大球水位（早鸟盘）
                content.add(real.getFirst_up_odds().toString());
                // 小球水位（早鸟盘）
                content.add(real.getFirst_down_odds().toString());
                // 大球水位（中场）
                content.add(mids.get(0).getUpOdds().toString());
                // 小球水位（中场）
                content.add(mids.get(0).getDownOdds().toString());
                // 盘口
                content.add(null == goal.getFirstGoal() ? "" : goal.getFirstGoal().toString());
                // 盘口（盘中）
                Schedule schedule = scheduleMapper.selectByPrimaryKey(real.getSchedule_id());
                if (null == schedule.getMatchTime2()) {
                    content.add("");
                } else {
                    LetGoalDetailExample letGoalDetailExample = new LetGoalDetailExample();
                    LetGoalDetailExample.Criteria letGoalDetailCriteria = letGoalDetailExample.createCriteria().andOddsIDEqualTo(goal.getOddsID()).andModifyTimeLessThan(schedule.getMatchTime2());
                    letGoalDetailExample.setOrderByClause("ModifyTime DESC");
                    List<LetGoalDetail> letGoalDetailList = letGoalDetailMapper.selectByExample(letGoalDetailExample);
                    content.add(CollectionUtils.isEmpty(letGoalDetailList) ? "" : letGoalDetailList.get(0).getGoal().toString());
                }
                // 上水
                content.add(null == goal.getFirstUpodds() ? "" : goal.getFirstUpodds().toString());
                // 下水
                content.add(null == goal.getFirstDownodds() ? "" : goal.getFirstDownodds().toString());
                String[] contentList = content.toArray(new String[content.size()]);
                writer.writeRecord(contentList);
            }
            writer.flush();
        } catch (IOException e) {
            logger.error("generateCsv error: exception is "+ e);
        }
    }

    @Override
    public void newGenerateCsv2() {
        String fileName = "TotalGoal_REAL_20172018.csv";
        File file = new File("/Users/zhangyimin/文档/"+ fileName);
        CsvWriter writer = new CsvWriter("/Users/zhangyimin/文档/"+ fileName,',', Charset.forName("GBK"));
        String[] header = {"开赛日期", "开赛时间",  "联赛名称", "主队", "客队", "主队（半场得分）", "客队（半场得分）", "主队（整场得分）", "客队（整场得分）", "盘口（早鸟盘）",  "盘口（中场）", "大球水位（早鸟盘）",  "小球水位（早鸟盘）","大球水位（中场）", "小球水位（中场）"};
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        try {
            writer.writeRecord(header);
            Schedule20172018Example example = new Schedule20172018Example();
            List<Schedule20172018> list = schedule20172018Mapper.selectByExample(example);
            Long count20172018 = 0L;
            for (Schedule20172018 real : list) {
                count20172018++;
                logger.info("newGenerateCsv_20172018 now is :"+ count20172018);
                if (null == real.getHome_half_score() || null == real.getGuest_half_score() || null == real.getHome_score() || null == real.getGuest_score() || null == real.getFirst_up_odds() || null == real.getFirst_down_odds()
                        || null == real.getFirst_goal()) {
                    continue;
                }
                List<String> content = new ArrayList<>();
                // 开赛日期
                content.add(dateFormat.format(real.getMatch_time()));
                // 开赛时间
                content.add(timeFormat.format(real.getMatch_time()));
                // 联赛名称
                Sclass sclass = sclassMapper.selectByPrimaryKey(real.getClass_id());
                content.add(sclass.getName_J());
                // 主队
                content.add(real.getHome_team());
                // 客队
                content.add(real.getGuest_team());
                // 主队（半场得分）
                content.add(real.getHome_half_score().toString());
                // 客队（半场得分）
                content.add(real.getGuest_half_score().toString());
                // 主队（整场得分）
                content.add(real.getHome_score().toString());
                // 客队（整场得分）
                content.add(real.getGuest_score().toString());
                // 盘口（早鸟盘）
                content.add(real.getFirst_goal().toString());

                SbOddsDetailExample midExample = new SbOddsDetailExample();
                List<String> param = new ArrayList<>();
                param.add("中场");
                param.add("半场");
                SbOddsDetailExample.Criteria midCriteria = midExample.createCriteria().andScheduleIDEqualTo(real.getSchedule_id()).andHappenTimeIn(param).andTypeEqualTo(2);
                midExample.setOrderByClause("ModifyTime DESC");
                List<SbOddsDetail> mids = sbOddsDetailMapper.selectByExample(midExample);
                if (CollectionUtils.isEmpty(mids)) {
                    continue;
                }
                // 盘口（中场）
                content.add(mids.get(0).getGoal().toString());
                // 大球水位（早鸟盘）
                content.add(real.getFirst_up_odds().toString());
                // 小球水位（早鸟盘）
                content.add(real.getFirst_down_odds().toString());
                // 大球水位（中场）
                content.add(mids.get(0).getUpOdds().toString());
                // 小球水位（中场）
                content.add(mids.get(0).getDownOdds().toString());
                String[] contentList = content.toArray(new String[content.size()]);
                writer.writeRecord(contentList);
            }
            writer.flush();
        } catch (IOException e) {
            logger.error("generateCsv error: exception is "+ e);
        }
    }

    @Override
    public void newGenerateCsv3() {
        String fileName = "TotalGoal_REAL_2017.csv";
        File file = new File("/Users/zhangyimin/文档/"+ fileName);
        CsvWriter writer = new CsvWriter("/Users/zhangyimin/文档/"+ fileName,',', Charset.forName("GBK"));
        String[] header = {"开赛日期", "开赛时间",  "联赛名称", "主队", "客队", "主队（半场得分）", "客队（半场得分）", "主队（整场得分）", "客队（整场得分）", "盘口（早鸟盘）",  "盘口（中场）", "大球水位（早鸟盘）",  "小球水位（早鸟盘）","大球水位（中场）", "小球水位（中场）"};
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        try {
            writer.writeRecord(header);
            Schedule2017Example example = new Schedule2017Example();
            List<Schedule2017> list = schedule2017Mapper.selectByExample(example);
            Long count2017 = 0L;
            for (Schedule2017 real : list) {
                count2017++;
                logger.info("newGenerateCsv_2017 now is :"+ count2017);
                if (null == real.getHome_half_score() || null == real.getGuest_half_score() || null == real.getHome_score() || null == real.getGuest_score() || null == real.getFirst_up_odds() || null == real.getFirst_down_odds()
                        || null == real.getFirst_goal()) {
                    continue;
                }
                List<String> content = new ArrayList<>();
                // 开赛日期
                content.add(dateFormat.format(real.getMatch_time()));
                // 开赛时间
                content.add(timeFormat.format(real.getMatch_time()));
                // 联赛名称
                Sclass sclass = sclassMapper.selectByPrimaryKey(real.getClass_id());
                content.add(sclass.getName_J());
                // 主队
                content.add(real.getHome_team());
                // 客队
                content.add(real.getGuest_team());
                // 主队（半场得分）
                content.add(real.getHome_half_score().toString());
                // 客队（半场得分）
                content.add(real.getGuest_half_score().toString());
                // 主队（整场得分）
                content.add(real.getHome_score().toString());
                // 客队（整场得分）
                content.add(real.getGuest_score().toString());
                // 盘口（早鸟盘）
                content.add(real.getFirst_goal().toString());

                SbOddsDetailExample midExample = new SbOddsDetailExample();
                List<String> param = new ArrayList<>();
                param.add("中场");
                param.add("半场");
                SbOddsDetailExample.Criteria midCriteria = midExample.createCriteria().andScheduleIDEqualTo(real.getSchedule_id()).andHappenTimeIn(param).andTypeEqualTo(2);
                midExample.setOrderByClause("ModifyTime DESC");
                List<SbOddsDetail> mids = sbOddsDetailMapper.selectByExample(midExample);
                if (CollectionUtils.isEmpty(mids)) {
                    continue;
                }
                // 盘口（中场）
                content.add(mids.get(0).getGoal().toString());
                // 大球水位（早鸟盘）
                content.add(real.getFirst_up_odds().toString());
                // 小球水位（早鸟盘）
                content.add(real.getFirst_down_odds().toString());
                // 大球水位（中场）
                content.add(mids.get(0).getUpOdds().toString());
                // 小球水位（中场）
                content.add(mids.get(0).getDownOdds().toString());
                String[] contentList = content.toArray(new String[content.size()]);
                writer.writeRecord(contentList);
            }
            writer.flush();
        } catch (IOException e) {
            logger.error("generateCsv error: exception is "+ e);
        }
    }

    @Override
    public void newGenerateCsv4() {
        String fileName = "TotalGoal_REAL_20162017.csv";
        File file = new File("/Users/zhangyimin/文档/"+ fileName);
        CsvWriter writer = new CsvWriter("/Users/zhangyimin/文档/"+ fileName,',', Charset.forName("GBK"));
        String[] header = {"开赛日期", "开赛时间",  "联赛名称", "主队", "客队", "主队（半场得分）", "客队（半场得分）", "主队（整场得分）", "客队（整场得分）", "盘口（早鸟盘）",  "盘口（中场）", "大球水位（早鸟盘）",  "小球水位（早鸟盘）","大球水位（中场）", "小球水位（中场）"};
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        try {
            writer.writeRecord(header);
            Schedule20162017Example example = new Schedule20162017Example();
            List<Schedule20162017> list = schedule20162017Mapper.selectByExample(example);
            Long count20162017 = 0L;
            for (Schedule20162017 real : list) {
                count20162017++;
                logger.info("newGenerateCsv_20162017 now is :"+ count20162017);
                if (null == real.getHome_half_score() || null == real.getGuest_half_score() || null == real.getHome_score() || null == real.getGuest_score() || null == real.getFirst_up_odds() || null == real.getFirst_down_odds()
                        || null == real.getFirst_goal()) {
                    continue;
                }
                List<String> content = new ArrayList<>();
                // 开赛日期
                content.add(dateFormat.format(real.getMatch_time()));
                // 开赛时间
                content.add(timeFormat.format(real.getMatch_time()));
                // 联赛名称
                Sclass sclass = sclassMapper.selectByPrimaryKey(real.getClass_id());
                content.add(sclass.getName_J());
                // 主队
                content.add(real.getHome_team());
                // 客队
                content.add(real.getGuest_team());
                // 主队（半场得分）
                content.add(real.getHome_half_score().toString());
                // 客队（半场得分）
                content.add(real.getGuest_half_score().toString());
                // 主队（整场得分）
                content.add(real.getHome_score().toString());
                // 客队（整场得分）
                content.add(real.getGuest_score().toString());
                // 盘口（早鸟盘）
                content.add(real.getFirst_goal().toString());

                SbOddsDetailExample midExample = new SbOddsDetailExample();
                List<String> param = new ArrayList<>();
                param.add("中场");
                param.add("半场");
                SbOddsDetailExample.Criteria midCriteria = midExample.createCriteria().andScheduleIDEqualTo(real.getSchedule_id()).andHappenTimeIn(param).andTypeEqualTo(2);
                midExample.setOrderByClause("ModifyTime DESC");
                List<SbOddsDetail> mids = sbOddsDetailMapper.selectByExample(midExample);
                if (CollectionUtils.isEmpty(mids)) {
                    continue;
                }
                // 盘口（中场）
                content.add(mids.get(0).getGoal().toString());
                // 大球水位（早鸟盘）
                content.add(real.getFirst_up_odds().toString());
                // 小球水位（早鸟盘）
                content.add(real.getFirst_down_odds().toString());
                // 大球水位（中场）
                content.add(mids.get(0).getUpOdds().toString());
                // 小球水位（中场）
                content.add(mids.get(0).getDownOdds().toString());
                String[] contentList = content.toArray(new String[content.size()]);
                writer.writeRecord(contentList);
            }
            writer.flush();
        } catch (IOException e) {
            logger.error("generateCsv error: exception is "+ e);
        }
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
        Schedule20182019Example example = new Schedule20182019Example();
        Schedule20182019Example.Criteria criteria = example.createCriteria();
        List<Schedule20182019> list = schedule20182019Mapper.selectByExample(example);
        Long count = 0L;
        for (Schedule20182019 schedule : list) {
            count++;
            System.out.println("20182019" + count + "start." + "Total is " + list.size());
            TotalScoreDetailExample finalExample = new TotalScoreDetailExample();
            Date matchTime2 = schedule.getMatch_time2();
            if (null == matchTime2) {
                matchTime2 = schedule.getMatch_time();
            }
            TotalScoreDetailExample.Criteria finalCriteria= finalExample.createCriteria().andOddsIDEqualTo(schedule.getOdds_id()).andModifyTimeLessThanOrEqualTo(matchTime2);
            finalExample.setOrderByClause("ModifyTime ASC");
            TotalScore midDetails = totalScoreMapper.selectByPrimaryKey(schedule.getOdds_id());
//            List<TotalScoreDetail> finalDetails = totalScoreDetailMapper.selectByExample(finalExample);
//            System.out.println(count + "running." + finalDetails.size() + "finalDetails");
            if (null != midDetails) {
                schedule.setFirst_goal(midDetails.getFirstGoal());
                schedule.setFirst_up_odds(midDetails.getFirstUpodds());
                schedule.setFirst_down_odds(midDetails.getFirstDownodds());
            }
//            if (!CollectionUtils.isEmpty(finalDetails)) {
//                TotalScoreDetail finalDetail = finalDetails.get(finalDetails.size()-1);
//                schedule.setGoal(finalDetail.getGoal());
//                schedule.setUp_odds(finalDetail.getUpOdds());
//                schedule.setDown_odds(finalDetail.getDownOdds());
//            }
            schedule20182019Mapper.updateByPrimaryKey(schedule);
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
