package com.example.spinwheel.controller;

import com.example.spinwheel.base.request.GetTotalScoreReq;
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
        GetTotalScoreRsp rsp = statisticService.getTotalScoreStatistic(req, id);
        rsp.setFlowNo(String.valueOf(id));
        rsp.setCode("SUCCESS");
        rsp.setMessage("成功");
        return rsp;
    }
}
