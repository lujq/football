package com.example.spinwheel.base.domain;

import java.util.Date;

public class SbOddsDetail {
    private Integer id;

    private Integer scheduleID;

    private String happenTime;

    private Short homeScore;

    private Short guestScore;

    private Double upOdds;

    private Double goal;

    private Double downOdds;

    private Integer homeRed;

    private Integer guestRed;

    private Integer type;

    private Date modifytime;

    private Integer companyID;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getScheduleID() {
        return scheduleID;
    }

    public void setScheduleID(Integer scheduleID) {
        this.scheduleID = scheduleID;
    }

    public String getHappenTime() {
        return happenTime;
    }

    public void setHappenTime(String happenTime) {
        this.happenTime = happenTime == null ? null : happenTime.trim();
    }

    public Short getHomeScore() {
        return homeScore;
    }

    public void setHomeScore(Short homeScore) {
        this.homeScore = homeScore;
    }

    public Short getGuestScore() {
        return guestScore;
    }

    public void setGuestScore(Short guestScore) {
        this.guestScore = guestScore;
    }

    public Double getUpOdds() {
        return upOdds;
    }

    public void setUpOdds(Double upOdds) {
        this.upOdds = upOdds;
    }

    public Double getGoal() {
        return goal;
    }

    public void setGoal(Double goal) {
        this.goal = goal;
    }

    public Double getDownOdds() {
        return downOdds;
    }

    public void setDownOdds(Double downOdds) {
        this.downOdds = downOdds;
    }

    public Integer getHomeRed() {
        return homeRed;
    }

    public void setHomeRed(Integer homeRed) {
        this.homeRed = homeRed;
    }

    public Integer getGuestRed() {
        return guestRed;
    }

    public void setGuestRed(Integer guestRed) {
        this.guestRed = guestRed;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Date getModifytime() {
        return modifytime;
    }

    public void setModifytime(Date modifytime) {
        this.modifytime = modifytime;
    }

    public Integer getCompanyID() {
        return companyID;
    }

    public void setCompanyID(Integer companyID) {
        this.companyID = companyID;
    }
}