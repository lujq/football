package com.example.spinwheel.base.domain;

import java.util.Date;

public class TotalScore {
    private Integer oddsID;

    private Integer scheduleID;

    private Integer companyID;

    private Float firstGoal;

    private Float firstUpodds;

    private Float firstDownodds;

    private Float goal;

    private Float upOdds;

    private Float downOdds;

    private Date modifyTime;

    private Byte result;

    private Boolean closePan;

    private Boolean zoudi;

    private Float goal_real;

    private Float upOdds_real;

    private Float downOdds_real;

    private Boolean isStopLive;

    private Date startTime;

    public Integer getOddsID() {
        return oddsID;
    }

    public void setOddsID(Integer oddsID) {
        this.oddsID = oddsID;
    }

    public Integer getScheduleID() {
        return scheduleID;
    }

    public void setScheduleID(Integer scheduleID) {
        this.scheduleID = scheduleID;
    }

    public Integer getCompanyID() {
        return companyID;
    }

    public void setCompanyID(Integer companyID) {
        this.companyID = companyID;
    }

    public Float getFirstGoal() {
        return firstGoal;
    }

    public void setFirstGoal(Float firstGoal) {
        this.firstGoal = firstGoal;
    }

    public Float getFirstUpodds() {
        return firstUpodds;
    }

    public void setFirstUpodds(Float firstUpodds) {
        this.firstUpodds = firstUpodds;
    }

    public Float getFirstDownodds() {
        return firstDownodds;
    }

    public void setFirstDownodds(Float firstDownodds) {
        this.firstDownodds = firstDownodds;
    }

    public Float getGoal() {
        return goal;
    }

    public void setGoal(Float goal) {
        this.goal = goal;
    }

    public Float getUpOdds() {
        return upOdds;
    }

    public void setUpOdds(Float upOdds) {
        this.upOdds = upOdds;
    }

    public Float getDownOdds() {
        return downOdds;
    }

    public void setDownOdds(Float downOdds) {
        this.downOdds = downOdds;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Byte getResult() {
        return result;
    }

    public void setResult(Byte result) {
        this.result = result;
    }

    public Boolean getClosePan() {
        return closePan;
    }

    public void setClosePan(Boolean closePan) {
        this.closePan = closePan;
    }

    public Boolean getZoudi() {
        return zoudi;
    }

    public void setZoudi(Boolean zoudi) {
        this.zoudi = zoudi;
    }

    public Float getGoal_real() {
        return goal_real;
    }

    public void setGoal_real(Float goal_real) {
        this.goal_real = goal_real;
    }

    public Float getUpOdds_real() {
        return upOdds_real;
    }

    public void setUpOdds_real(Float upOdds_real) {
        this.upOdds_real = upOdds_real;
    }

    public Float getDownOdds_real() {
        return downOdds_real;
    }

    public void setDownOdds_real(Float downOdds_real) {
        this.downOdds_real = downOdds_real;
    }

    public Boolean getIsStopLive() {
        return isStopLive;
    }

    public void setIsStopLive(Boolean isStopLive) {
        this.isStopLive = isStopLive;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }
}