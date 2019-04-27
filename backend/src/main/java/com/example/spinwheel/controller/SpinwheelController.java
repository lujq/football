package com.example.spinwheel.controller;

import com.example.spinwheel.base.request.GetTotalScoreDetailReq;
import com.example.spinwheel.base.request.GetTotalScoreReq;
import com.example.spinwheel.base.response.GetTotalScoreDetailRsp;
import com.example.spinwheel.base.response.GetTotalScoreRsp;
import com.example.spinwheel.service.StatisticService;
import com.example.spinwheel.utils.GenLogTagTool;
import com.example.spinwheel.utils.LoggerManager;
import com.example.spinwheel.utils.SnowflakeIdWorker;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping
public class SpinwheelController {

    private static LoggerManager logger = LoggerManager.getLogger(SpinwheelController.class);

    @Autowired
    private StatisticService statisticService;

    @GetMapping(value = "/getRank")
    public String getRank() {
        return "zym";
    }

    @ApiOperation(value="查询大小球统计信息", notes="查询大小球统计信息")
    @PostMapping(value = "/getTotalScoreStatistic")
    public GetTotalScoreRsp getTotalScoreStatistic(
            @ApiParam(value = "查询大小球统计信息参数", required = true)@RequestBody GetTotalScoreReq req) {
        Map<String, String> logTags = GenLogTagTool.genlogTag("SpinwheelController", "getTotalScoreStatistic");
        SnowflakeIdWorker idWorker = new SnowflakeIdWorker(0, 0);
        long id = idWorker.nextId();
        GetTotalScoreRsp rsp = statisticService.getTotalScoreStatistic(req);
        rsp.setCode("SUCCESS");
        rsp.setMessage("成功");
        return rsp;
    }

    @ApiOperation(value="查询大小球详细信息", notes="查询大小球详细信息")
    @PostMapping(value = "/getTotalScoreDetail")
    public GetTotalScoreDetailRsp getTotalScoreDetail(
            @ApiParam(value = "查询大小球详细信息参数", required = true)@RequestBody GetTotalScoreDetailReq req) {
        Map<String, String> logTags = GenLogTagTool.genlogTag("SpinwheelController", "getTotalScoreStatistic");
        SnowflakeIdWorker idWorker = new SnowflakeIdWorker(0, 0);
        long id = idWorker.nextId();
        GetTotalScoreDetailRsp rsp = statisticService.getTotalScoreDetail(req);
        rsp.setCode("SUCCESS");
        rsp.setMessage("成功");
        return rsp;
    }

//    @ApiOperation(value="补全2016数据", notes="补全2016数据")
//    @PostMapping(value = "/complete2016")
//    public void complete2016(
//            @ApiParam(value = "查询大小球统计信息参数", required = true)@RequestBody GetTotalScoreReq req) {
//        Map<String, String> logTags = GenLogTagTool.genlogTag("SpinwheelController", "complete2016");
//        statisticService.completeData();
//    }
//
//    @ApiOperation(value="补全20162017数据", notes="补全20162017数据")
//    @PostMapping(value = "/complete20162017")
//    public void complete20162017(
//            @ApiParam(value = "查询大小球统计信息参数", required = true)@RequestBody GetTotalScoreReq req) {
//        Map<String, String> logTags = GenLogTagTool.genlogTag("SpinwheelController", "complete20162017");
//        statisticService.completeData20162017();
//    }
//
//    @ApiOperation(value="补全2017数据", notes="补全2017数据")
//    @PostMapping(value = "/complete2017")
//    public void complete2017(
//            @ApiParam(value = "查询大小球统计信息参数", required = true)@RequestBody GetTotalScoreReq req) {
//        Map<String, String> logTags = GenLogTagTool.genlogTag("SpinwheelController", "complete2017");
//        statisticService.completeData2017();
//    }
//
//    @ApiOperation(value="补全20172018数据", notes="补全20172018数据")
//    @PostMapping(value = "/complete20172018")
//    public void complete20172018(
//            @ApiParam(value = "查询大小球统计信息参数", required = true)@RequestBody GetTotalScoreReq req) {
//        Map<String, String> logTags = GenLogTagTool.genlogTag("SpinwheelController", "complete20172018");
//        statisticService.completeData20172018();
//    }
//
//    @ApiOperation(value="补全2018数据", notes="补全2018数据")
//    @PostMapping(value = "/complete2018")
//    public void complete2018(
//            @ApiParam(value = "查询大小球统计信息参数", required = true)@RequestBody GetTotalScoreReq req) {
//        Map<String, String> logTags = GenLogTagTool.genlogTag("SpinwheelController", "complete2018");
//        statisticService.completeData2018();
//    }
//
//    @ApiOperation(value="补全20182019数据", notes="补全20182019数据")
//    @PostMapping(value = "/complete20182019")
//    public void complete20182019(
//            @ApiParam(value = "查询大小球统计信息参数", required = true)@RequestBody GetTotalScoreReq req) {
//        Map<String, String> logTags = GenLogTagTool.genlogTag("SpinwheelController", "complete20182019");
//        statisticService.completeData20182019();
//    }
}
