package com.example.spinwheel.base.domain;

import java.util.Date;

public class TotalScoreDetail {
    private Integer ID;

    private Integer oddsID;

    private Float upOdds;

    private Float goal;

    private Float downOdds;

    private Date modifyTime;

    private Boolean isEarly;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getOddsID() {
        return oddsID;
    }

    public void setOddsID(Integer oddsID) {
        this.oddsID = oddsID;
    }

    public Float getUpOdds() {
        return upOdds;
    }

    public void setUpOdds(Float upOdds) {
        this.upOdds = upOdds;
    }

    public Float getGoal() {
        return goal;
    }

    public void setGoal(Float goal) {
        this.goal = goal;
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

    public Boolean getIsEarly() {
        return isEarly;
    }

    public void setIsEarly(Boolean isEarly) {
        this.isEarly = isEarly;
    }
}