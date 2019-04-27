package com.example.spinwheel.base.response;

import com.example.spinwheel.base.dto.ResultDto;
import lombok.Data;

import java.util.List;

@Data
public class GetTotalScoreRsp extends HttpResponseBaseDto{

    private List<ResultDto> resultList;

}
