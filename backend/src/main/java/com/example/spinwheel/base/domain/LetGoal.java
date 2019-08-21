package com.example.spinwheel.base.domain;

import java.util.Date;

public class LetGoal {
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

    private Boolean zouDi;

    private Boolean running;

    private Float goal_Real;

    private Float upOdds_Real;

    private Float downOdds_Real;

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

    public Boolean getZouDi() {
        return zouDi;
    }

    public void setZouDi(Boolean zouDi) {
        this.zouDi = zouDi;
    }

    public Boolean getRunning() {
        return running;
    }

    public void setRunning(Boolean running) {
        this.running = running;
    }

    public Float getGoal_Real() {
        return goal_Real;
    }

    public void setGoal_Real(Float goal_Real) {
        this.goal_Real = goal_Real;
    }

    public Float getUpOdds_Real() {
        return upOdds_Real;
    }

    public void setUpOdds_Real(Float upOdds_Real) {
        this.upOdds_Real = upOdds_Real;
    }

    public Float getDownOdds_Real() {
        return downOdds_Real;
    }

    public void setDownOdds_Real(Float downOdds_Real) {
        this.downOdds_Real = downOdds_Real;
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