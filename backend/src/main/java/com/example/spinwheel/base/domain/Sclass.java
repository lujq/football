package com.example.spinwheel.base.domain;

import lombok.Data;

import java.util.Date;

@Data
public class Sclass {

    private Integer sclassID;
    private String color;
    private String nameJ;
    private String nameF;
    private String nameE;
    private String nameJS;
    private String nameFS;
    private String nameES;
    private String nameS;
    private Short kind;
    private Short mode;
    private Short countRound;
    private Short currRound;
    private String currMatchSeason;
    private String sclassPic;
    private Short ifstop;
    private Short sclassType;
    private Short countGroup;
    private String sclassRule;
    private Short bfSimplyDisp;
    private Short sclassSequence;
    private Short infoID;
    private Short bfIfDisp;
    private Date modifyTime;
    private String beginSeason;
    private Integer subSclassID;
    private Boolean ifHaveSub;
    private Boolean ifSort;
    private Boolean ifHavePaper;
    private Boolean ifShowScore;
    private String rankMatchSeason;
}
