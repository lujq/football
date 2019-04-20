package com.example.spinwheel.service.impl;

import com.example.spinwheel.base.dao.ScheduleMapper;
import com.example.spinwheel.base.dao.SclassMapper;
import com.example.spinwheel.base.dao.TotalScorehalfMapper;
import com.example.spinwheel.base.domain.Schedule;
import com.example.spinwheel.base.domain.Sclass;
import com.example.spinwheel.base.domain.TotalScorehalf;
import com.example.spinwheel.base.request.GetFileUrlReq;
import com.example.spinwheel.base.request.GetTotalScoreReq;
import com.example.spinwheel.base.response.GetFileUrlRsp;
import com.example.spinwheel.base.response.GetTotalScoreRsp;
import com.example.spinwheel.service.StatisticService;
import com.example.spinwheel.utils.GenLogTagTool;
import com.example.spinwheel.utils.LoggerManager;
import com.example.spinwheel.utils.SnowflakeIdWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import tk.mybatis.mapper.entity.Example;

import java.util.List;
import java.util.Map;

public class StatisticServiceImpl implements StatisticService{

    private static final String SERVICE_NAME = "StatisticServiceImpl";

    protected LoggerManager logger = LoggerManager.getLogger(this.getClass());

    @Autowired
    private SclassMapper sclassMapper;

    @Autowired
    private ScheduleMapper scheduleMapper;

    @Autowired
    private TotalScorehalfMapper totalScorehalfMapper;

    /**
     * 查询大小球数据分析
     * @param req
     * @return
     */
    @Override
    @Async
    public GetTotalScoreRsp getTotalScoreStatistic(GetTotalScoreReq req, long flowNo) {
        Map<String, String> logTags = GenLogTagTool.genlogTag(SERVICE_NAME, "getTotalScoreStatistic");
        logger.info(SERVICE_NAME + "getTotalScoreStatistic start.", logTags);
        GetTotalScoreRsp rsp = new GetTotalScoreRsp();
        List<Sclass> sclassList = sclassMapper.selectAll();
        for(Sclass sclass: sclassList) {
            Integer classId = sclass.getSclassID();
            Example example = new Example(Schedule.class);
            Example.Criteria criteria = example.createCriteria();
            criteria.andEqualTo("SclassId", classId);
            List<Schedule> scheduleList = scheduleMapper.selectByExample(example);
            for (Schedule schedule: scheduleList) {
                Example totalScoreExample = new Example(TotalScorehalf.class);
                Example.Criteria totalScoreCriteria = example.createCriteria();
                totalScoreCriteria.andEqualTo("scheduleId", schedule.getScheduleId());
                List<TotalScorehalf> scorehalfList = totalScorehalfMapper.selectByExample(example);

            }
        }
        logger.info(SERVICE_NAME + "getTotalScoreStatistic end.", logTags);
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
}
