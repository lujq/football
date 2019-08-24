package com.example.spinwheel.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.spinwheel.base.request.GetTotalScoreDetailReq;
import com.example.spinwheel.base.request.GetTotalScoreReq;
import com.example.spinwheel.base.response.GetSeasonsRsp;
import com.example.spinwheel.base.response.GetTotalScoreDetailRsp;
import com.example.spinwheel.base.response.GetTotalScoreRsp;
import com.example.spinwheel.base.response.HttpResponseBaseDto;
import com.example.spinwheel.service.StatisticService;
import com.example.spinwheel.utils.GenLogTagTool;
import com.example.spinwheel.utils.LoggerManager;
import com.example.spinwheel.utils.RealtimeOddsUtil;
import com.example.spinwheel.utils.SnowflakeIdWorker;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.apache.http.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;


@CrossOrigin
@RestController
@RequestMapping
public class SpinwheelController {

    private static LoggerManager logger = LoggerManager.getLogger(SpinwheelController.class);

    @Autowired
    private StatisticService statisticService;

    @Autowired
    private RealtimeOddsUtil util;

    @ApiOperation(value="查询rawData", notes="查询rawData")
    @PostMapping(value = "/getRawData")
    public String getRawData() {
        String url = "http://interface.win007.com/zq/odds.aspx";
        String rawResult = util.sendGet(url);
        String resultStr = null;
        if (null != rawResult) {
            String[] result = rawResult.split("\\$");
            if (result.length == 1) {
                logger.error(rawResult);
                return null;
            }
            // 释放内存
            rawResult = null;
            // 联赛信息
            String[] classes = result[0].split(";");
            // 当期比赛
            String[] schedules = result[1].split(";");
            // 实时让球盘
            String[] letGoals = result[2].split(";");
            // 实时大小球
            String[] totalGoals = result[4].split(";");

            // 联赛清单
            Map<String, String> leagues = new HashMap<>();
            for (int i = 0; i < classes.length; i++) {
                String[] classDetail = classes[i].split(",");
                if (classDetail[1].equals("1")) {
                    leagues.put(classDetail[0], classDetail[3]);
                    resultStr += classDetail[3];
                }
            }
            classes = null;

        }
        return rawResult;
    }

    @GetMapping(value = "/getRank")
    public String getRank() {
        return "zym";
    }

//    @ApiOperation(value="查询openID", notes="查询openID")
//    @PostMapping(value = "/getOpenId")
//    public String getOpenIds() {
//        String accessTokenResp = sendGet("https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=wx581c631ff7ed0c70&secret=0d9340d2b107c65e58f1591291853754");
//        JSONObject jsonObject = JSONObject.parseObject(accessTokenResp);
//        String accessToken = jsonObject.getString("access_token");
//        String openIdResp = sendGet("https://api.weixin.qq.com/cgi-bin/user/get?access_token="+ accessToken);
//        return openIdResp;
//    }
//
//    @ApiOperation(value="试着发送消息模板", notes="试着发送消息模板")
//    @PostMapping(value = "/sendTemplate")
//    public String sendTemplate1() {
//        String accessToken = null;
//        String accessTokenResp = sendGet("https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=wx581c631ff7ed0c70&secret=0d9340d2b107c65e58f1591291853754");
//        JSONObject jsonObject = JSONObject.parseObject(accessTokenResp);
//        accessToken = jsonObject.getString("access_token");
//        String response = null;
//        try {
//            response = sendTemplate(accessToken, "主队", "客队");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return response;
//    }

    @ApiOperation(value="查询大小球统计信息", notes="查询大小球统计信息")
    @PostMapping(value = "/getTotalScoreStatistic")
    public GetTotalScoreRsp getTotalScoreStatistic(
            @ApiParam(value = "查询大小球统计信息参数", required = true)@RequestBody GetTotalScoreReq req) {
        Map<String, String> logTags = GenLogTagTool.genlogTag("SpinwheelController", "getTotalScoreStatistic");
        SnowflakeIdWorker idWorker = new SnowflakeIdWorker(0, 0);
        long id = idWorker.nextId();
        GetTotalScoreRsp rsp = new GetTotalScoreRsp();
        try {
            rsp = statisticService.getTotalScoreStatistic(req);
        } catch (Exception e) {
            logger.info("getTotalScoreStatistic error. Exception is :" + e.getMessage());
            rsp.setCode("FAILURE");
            rsp.setMessage("系统内部错误");
        }
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
        GetTotalScoreDetailRsp rsp = new GetTotalScoreDetailRsp();
        try {
            rsp = statisticService.getTotalScoreDetail(req);
        } catch (Exception e) {
            logger.info("getTotalScoreDetail error. Exception is :" + e.getMessage());
            rsp.setCode("FAILURE");
            rsp.setMessage("系统内部错误");
        }
        rsp.setCode("SUCCESS");
        rsp.setMessage("成功");
        return rsp;
    }

    @ApiOperation(value="查询联赛信息", notes="查询联赛信息")
    @PostMapping(value = "/getSeasons")
    public GetSeasonsRsp getSeasons() {
        Map<String, String> logTags = GenLogTagTool.genlogTag("SpinwheelController", "getSeasons");
        SnowflakeIdWorker idWorker = new SnowflakeIdWorker(0, 0);
        long id = idWorker.nextId();
        GetSeasonsRsp rsp = new GetSeasonsRsp();
        try {
            rsp = statisticService.getSeasons();
        } catch (Exception e) {
            logger.info("getSeasons error. Exception is :" + e.getMessage());
            rsp.setCode("FAILURE");
            rsp.setMessage("系统内部错误");
        }
        rsp.setCode("SUCCESS");
        rsp.setMessage("成功");
        return rsp;
    }

    @ApiOperation(value="导出csv", notes="导出csv")
    @PostMapping(value = "/exportCsv")
    public void exportCsv() {
        Map<String, String> logTags = GenLogTagTool.genlogTag("SpinwheelController", "exportCsv");
        SnowflakeIdWorker idWorker = new SnowflakeIdWorker(0, 0);
        long id = idWorker.nextId();
        try {
            statisticService.generateCsv();
        } catch (Exception e) {
            logger.info("exportCsv error. Exception is :" + e.getMessage());
        }
    }

    @ApiOperation(value="导出csv", notes="导出csv")
    @PostMapping(value = "/exportXlsx")
    public void exportXlsx() {
        Map<String, String> logTags = GenLogTagTool.genlogTag("SpinwheelController", "exportXlsx");
        SnowflakeIdWorker idWorker = new SnowflakeIdWorker(0, 0);
        long id = idWorker.nextId();
        try {
            statisticService.generateLetGoal();
        } catch (Exception e) {
            logger.info("exportCsv error. Exception is :" + e.getMessage());
        }
    }

    @ApiOperation(value="导出csv", notes="导出csv")
    @PostMapping(value = "/export2018_2019")
    public void export2018_2019() {
        Map<String, String> logTags = GenLogTagTool.genlogTag("SpinwheelController", "export2018_2019");
        SnowflakeIdWorker idWorker = new SnowflakeIdWorker(0, 0);
        long id = idWorker.nextId();
        try {
            statisticService.newGenerateCsv();
        } catch (Exception e) {
            logger.info("exportCsv error. Exception is :" + e.getMessage());
        }
    }

    @ApiOperation(value="导出csv", notes="导出csv")
    @PostMapping(value = "/export2018_20191")
    public void export2018_20191() {
        Map<String, String> logTags = GenLogTagTool.genlogTag("SpinwheelController", "export2018_2019");
        SnowflakeIdWorker idWorker = new SnowflakeIdWorker(0, 0);
        long id = idWorker.nextId();
        try {
            statisticService.newGenerateCsv1();
        } catch (Exception e) {
            logger.info("exportCsv error. Exception is :" + e.getMessage());
        }
    }

    @ApiOperation(value="导出csv", notes="导出csv")
    @PostMapping(value = "/export2018_20192")
    public void export2018_20192() {
        Map<String, String> logTags = GenLogTagTool.genlogTag("SpinwheelController", "export2018_2019");
        SnowflakeIdWorker idWorker = new SnowflakeIdWorker(0, 0);
        long id = idWorker.nextId();
        try {
            statisticService.newGenerateCsv2();
        } catch (Exception e) {
            logger.info("exportCsv error. Exception is :" + e.getMessage());
        }
    }

    @ApiOperation(value="导出csv", notes="导出csv")
    @PostMapping(value = "/export2018_20193")
    public void export2018_20193() {
        Map<String, String> logTags = GenLogTagTool.genlogTag("SpinwheelController", "export2018_2019");
        SnowflakeIdWorker idWorker = new SnowflakeIdWorker(0, 0);
        long id = idWorker.nextId();
        try {
            statisticService.newGenerateCsv3();
        } catch (Exception e) {
            logger.info("exportCsv error. Exception is :" + e.getMessage());
        }
    }

    @ApiOperation(value="导出csv", notes="导出csv")
    @PostMapping(value = "/export2018_20194")
    public void export2018_20194() {
        Map<String, String> logTags = GenLogTagTool.genlogTag("SpinwheelController", "export2018_2019");
        SnowflakeIdWorker idWorker = new SnowflakeIdWorker(0, 0);
        long id = idWorker.nextId();
        try {
            statisticService.newGenerateCsv4();
        } catch (Exception e) {
            logger.info("exportCsv error. Exception is :" + e.getMessage());
        }
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
