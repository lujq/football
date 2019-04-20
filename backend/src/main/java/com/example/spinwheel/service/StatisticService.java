package com.example.spinwheel.service;

import com.example.spinwheel.base.request.GetFileUrlReq;
import com.example.spinwheel.base.request.GetTotalScoreReq;
import com.example.spinwheel.base.response.GetFileUrlRsp;
import com.example.spinwheel.base.response.GetTotalScoreRsp;
import org.springframework.stereotype.Service;

@Service
public interface StatisticService {

    /**
     * 查询大小球数据分析
     * @param req
     * @return
     */
    GetTotalScoreRsp getTotalScoreStatistic(GetTotalScoreReq req, long flowNo);

    /**
     * 查询文件下载地址
     * @param req
     * @return
     */
    GetFileUrlRsp getFileUrl(GetFileUrlReq req);
}
