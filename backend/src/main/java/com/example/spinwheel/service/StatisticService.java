package com.example.spinwheel.service;

import com.example.spinwheel.base.request.GetFileUrlReq;
import com.example.spinwheel.base.request.GetTotalScoreDetailReq;
import com.example.spinwheel.base.request.GetTotalScoreReq;
import com.example.spinwheel.base.response.GetFileUrlRsp;
import com.example.spinwheel.base.response.GetSeasonsRsp;
import com.example.spinwheel.base.response.GetTotalScoreDetailRsp;
import com.example.spinwheel.base.response.GetTotalScoreRsp;
import org.springframework.stereotype.Service;

@Service
public interface StatisticService {

    /**
     * 查询大小球数据分析
     * @param req
     * @return
     */
    GetTotalScoreRsp getTotalScoreStatistic(GetTotalScoreReq req);

    /**
     * 查询大小球明细数据
     * @param req
     * @return
     */
    GetTotalScoreDetailRsp getTotalScoreDetail(GetTotalScoreDetailReq req);

    /**
     * 查询赛季
     * @return
     */
    GetSeasonsRsp getSeasons();

    /**
     * 查询文件下载地址
     * @param req
     * @return
     */
    GetFileUrlRsp getFileUrl(GetFileUrlReq req);

    void completeData();

    void completeData20162017();

    void completeData2017();

    void completeData20172018();

    void completeData2018();

    void completeData20182019();

}
