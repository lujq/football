package com.example.spinwheel.base.response;

import com.example.spinwheel.base.dto.CommonListDto;
import lombok.Data;

import java.util.List;

@Data
public class GetSeasonsRsp extends HttpResponseBaseDto{

    private List<CommonListDto> seasons;

    private List<Integer> homeHalfScores;

    private List<Integer> guestHalfScores;

    private List<Float> firstGoals;

    private List<Float> goals;

}
