package com.example.spinwheel.base.request;

import lombok.Data;

@Data
public class GetTotalScoreReq {

    private Integer sclass;

    private Integer homeScore;

    private Integer guestScore;

    private Float firstGoal;

    private Float goal;


}
