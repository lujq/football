package com.example.spinwheel.base.domain;

import java.util.Date;

public class Sclass {
    private Integer sclassID;

    private String color;

    private String name_J;

    private String name_F;

    private String name_E;

    private String name_JS;

    private String name_FS;

    private String name_ES;

    private String name_S;

    private Short kind;

    private Short mode;

    private Short count_round;

    private Short curr_round;

    private String curr_matchSeason;

    private String sclass_pic;

    private Byte ifstop;

    private Byte sclass_type;

    private Short count_group;

    private Byte bf_simply_disp;

    private Short sclass_sequence;

    private Short infoID;

    private Byte bf_IfDisp;

    private Date modifyTime;

    private String beginSeason;

    private Integer subSclassID;

    private Boolean ifHaveSub;

    private Boolean ifSort;

    private Boolean ifHavePaper;

    private Boolean ifShowScore;

    private String rank_matchSeason;

    private String sclass_rule;

    public Integer getSclassID() {
        return sclassID;
    }

    public void setSclassID(Integer sclassID) {
        this.sclassID = sclassID;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color == null ? null : color.trim();
    }

    public String getName_J() {
        return name_J;
    }

    public void setName_J(String name_J) {
        this.name_J = name_J == null ? null : name_J.trim();
    }

    public String getName_F() {
        return name_F;
    }

    public void setName_F(String name_F) {
        this.name_F = name_F == null ? null : name_F.trim();
    }

    public String getName_E() {
        return name_E;
    }

    public void setName_E(String name_E) {
        this.name_E = name_E == null ? null : name_E.trim();
    }

    public String getName_JS() {
        return name_JS;
    }

    public void setName_JS(String name_JS) {
        this.name_JS = name_JS == null ? null : name_JS.trim();
    }

    public String getName_FS() {
        return name_FS;
    }

    public void setName_FS(String name_FS) {
        this.name_FS = name_FS == null ? null : name_FS.trim();
    }

    public String getName_ES() {
        return name_ES;
    }

    public void setName_ES(String name_ES) {
        this.name_ES = name_ES == null ? null : name_ES.trim();
    }

    public String getName_S() {
        return name_S;
    }

    public void setName_S(String name_S) {
        this.name_S = name_S == null ? null : name_S.trim();
    }

    public Short getKind() {
        return kind;
    }

    public void setKind(Short kind) {
        this.kind = kind;
    }

    public Short getMode() {
        return mode;
    }

    public void setMode(Short mode) {
        this.mode = mode;
    }

    public Short getCount_round() {
        return count_round;
    }

    public void setCount_round(Short count_round) {
        this.count_round = count_round;
    }

    public Short getCurr_round() {
        return curr_round;
    }

    public void setCurr_round(Short curr_round) {
        this.curr_round = curr_round;
    }

    public String getCurr_matchSeason() {
        return curr_matchSeason;
    }

    public void setCurr_matchSeason(String curr_matchSeason) {
        this.curr_matchSeason = curr_matchSeason == null ? null : curr_matchSeason.trim();
    }

    public String getSclass_pic() {
        return sclass_pic;
    }

    public void setSclass_pic(String sclass_pic) {
        this.sclass_pic = sclass_pic == null ? null : sclass_pic.trim();
    }

    public Byte getIfstop() {
        return ifstop;
    }

    public void setIfstop(Byte ifstop) {
        this.ifstop = ifstop;
    }

    public Byte getSclass_type() {
        return sclass_type;
    }

    public void setSclass_type(Byte sclass_type) {
        this.sclass_type = sclass_type;
    }

    public Short getCount_group() {
        return count_group;
    }

    public void setCount_group(Short count_group) {
        this.count_group = count_group;
    }

    public Byte getBf_simply_disp() {
        return bf_simply_disp;
    }

    public void setBf_simply_disp(Byte bf_simply_disp) {
        this.bf_simply_disp = bf_simply_disp;
    }

    public Short getSclass_sequence() {
        return sclass_sequence;
    }

    public void setSclass_sequence(Short sclass_sequence) {
        this.sclass_sequence = sclass_sequence;
    }

    public Short getInfoID() {
        return infoID;
    }

    public void setInfoID(Short infoID) {
        this.infoID = infoID;
    }

    public Byte getBf_IfDisp() {
        return bf_IfDisp;
    }

    public void setBf_IfDisp(Byte bf_IfDisp) {
        this.bf_IfDisp = bf_IfDisp;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getBeginSeason() {
        return beginSeason;
    }

    public void setBeginSeason(String beginSeason) {
        this.beginSeason = beginSeason == null ? null : beginSeason.trim();
    }

    public Integer getSubSclassID() {
        return subSclassID;
    }

    public void setSubSclassID(Integer subSclassID) {
        this.subSclassID = subSclassID;
    }

    public Boolean getIfHaveSub() {
        return ifHaveSub;
    }

    public void setIfHaveSub(Boolean ifHaveSub) {
        this.ifHaveSub = ifHaveSub;
    }

    public Boolean getIfSort() {
        return ifSort;
    }

    public void setIfSort(Boolean ifSort) {
        this.ifSort = ifSort;
    }

    public Boolean getIfHavePaper() {
        return ifHavePaper;
    }

    public void setIfHavePaper(Boolean ifHavePaper) {
        this.ifHavePaper = ifHavePaper;
    }

    public Boolean getIfShowScore() {
        return ifShowScore;
    }

    public void setIfShowScore(Boolean ifShowScore) {
        this.ifShowScore = ifShowScore;
    }

    public String getRank_matchSeason() {
        return rank_matchSeason;
    }

    public void setRank_matchSeason(String rank_matchSeason) {
        this.rank_matchSeason = rank_matchSeason == null ? null : rank_matchSeason.trim();
    }

    public String getSclass_rule() {
        return sclass_rule;
    }

    public void setSclass_rule(String sclass_rule) {
        this.sclass_rule = sclass_rule == null ? null : sclass_rule.trim();
    }
}