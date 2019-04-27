package com.example.spinwheel.base.response;

import com.example.spinwheel.base.domain.TotalScoreReal;
import com.example.spinwheel.base.dto.ResultDto;
import lombok.Data;

import java.util.List;

@Data
public class GetTotalScoreDetailRsp extends HttpResponseBaseDto{

    private List<TotalScoreReal> resultList;

}
