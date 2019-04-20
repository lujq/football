package com.example.spinwheel.base.domain;

import com.sun.org.apache.xpath.internal.operations.Bool;
import lombok.Data;

import java.util.Date;

@Data
public class TotalScorehalf {

    private Integer oddsID;
    private Integer scheduleID;
    private Integer companyID;
    private Float firstGoal;
    private Float firstUpOdds;
    private Float firstDownOdds;
    private Float goal;
    private Float upOdds;
    private Float downOdds;
    private Date modifyTime;
    private Boolean zoudi;
    private Float goalReal;
    private Float upOddsReal;
    private Float downOddsReal;
    private Date startTime;
}
