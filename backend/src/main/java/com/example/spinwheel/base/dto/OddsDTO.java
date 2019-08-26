package com.example.spinwheel.base.dto;

import lombok.Data;

@Data
public class OddsDTO {

    /**
     * 比赛ID
     */
    private String scheduleId;

    /**
     * 赛制Id
     */
    private String classId;

    /**
     * 赛制名称
     */
    private String className;

    /**
     * 赛制类型（1-联赛；2-杯赛）
     */
    private String classType;

    /**
     * 主队得分
     */
    private String homeScore;

    /**
     * 客队得分
     */
    private String guestScore;

    /**
     * 主队名称
     */
    private String homeName;

    /**
     * 客队名称
     */
    private String guestName;

    /**
     * 主队红牌
     */
    private String homeRed;

    /**
     * 客队红牌
     */
    private String guestRed;

    private String firstLetGoal;

    private String startTime;

}
