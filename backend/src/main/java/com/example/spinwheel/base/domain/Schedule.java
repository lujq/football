package com.example.spinwheel.base.domain;

import lombok.Data;

import java.util.Date;

@Data
public class Schedule {

    private Integer scheduleId;
    private Integer sclassID;
    private String matchSeason;
    private Short round;
    private String grouping;
    private Integer homeTeamID;
    private Integer guestTeamID;
    private String homeTeam;
    private String guestTeam;
    private Boolean neutrality;
    private Date matchTime;
    private Date matchTime2;
    private String location;
    private String homeOrder;
    private String guestOrder;
    private Short matchState;
    private Short weatherIcon;
    private String weather;
    private String temperature;
    private String TV;
    private String umpire;
    private Integer visitor;
    private Short homeScore;
    private Short guestScore;
    private Short homeHalfScore;
    private Short guestHalfScore;
    private String explain;
    private Date bfChangetime;
    private Short shangpan;
    private String grouping2;
    private Boolean bfShow;
    private Integer subSclassID;
    private String explainList;
    private Integer venuesID;
    private Boolean isGuessRed;
    private Boolean isLive;
    private Short homeCorner;
    private Short homeCornerHalf;
    private Short guestCorner;
    private Short guestCornerHalf;
}
