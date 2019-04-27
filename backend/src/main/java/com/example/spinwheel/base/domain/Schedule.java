package com.example.spinwheel.base.domain;

import java.util.Date;

public class Schedule {
    private Integer scheduleID;

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

    private String home_Order;

    private String guest_Order;

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

    private Short home_Red;

    private Short guest_Red;

    private Short home_Yellow;

    private Short guest_Yellow;

    private Date bf_changetime;

    private Byte shangpan;

    private String grouping2;

    private Boolean bfShow;

    private Integer subSclassID;

    private String explainlist;

    private Integer venuesID;

    private Boolean isGuessRed;

    private Boolean isLive;

    private Byte homeCorner;

    private Byte homeCornerHalf;

    private Byte guestCorner;

    private Byte guestCornerHalf;

    private String explain;

    public Integer getScheduleID() {
        return scheduleID;
    }

    public void setScheduleID(Integer scheduleID) {
        this.scheduleID = scheduleID;
    }

    public Integer getSclassID() {
        return sclassID;
    }

    public void setSclassID(Integer sclassID) {
        this.sclassID = sclassID;
    }

    public String getMatchSeason() {
        return matchSeason;
    }

    public void setMatchSeason(String matchSeason) {
        this.matchSeason = matchSeason == null ? null : matchSeason.trim();
    }

    public Short getRound() {
        return round;
    }

    public void setRound(Short round) {
        this.round = round;
    }

    public String getGrouping() {
        return grouping;
    }

    public void setGrouping(String grouping) {
        this.grouping = grouping == null ? null : grouping.trim();
    }

    public Integer getHomeTeamID() {
        return homeTeamID;
    }

    public void setHomeTeamID(Integer homeTeamID) {
        this.homeTeamID = homeTeamID;
    }

    public Integer getGuestTeamID() {
        return guestTeamID;
    }

    public void setGuestTeamID(Integer guestTeamID) {
        this.guestTeamID = guestTeamID;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(String homeTeam) {
        this.homeTeam = homeTeam == null ? null : homeTeam.trim();
    }

    public String getGuestTeam() {
        return guestTeam;
    }

    public void setGuestTeam(String guestTeam) {
        this.guestTeam = guestTeam == null ? null : guestTeam.trim();
    }

    public Boolean getNeutrality() {
        return neutrality;
    }

    public void setNeutrality(Boolean neutrality) {
        this.neutrality = neutrality;
    }

    public Date getMatchTime() {
        return matchTime;
    }

    public void setMatchTime(Date matchTime) {
        this.matchTime = matchTime;
    }

    public Date getMatchTime2() {
        return matchTime2;
    }

    public void setMatchTime2(Date matchTime2) {
        this.matchTime2 = matchTime2;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public String getHome_Order() {
        return home_Order;
    }

    public void setHome_Order(String home_Order) {
        this.home_Order = home_Order == null ? null : home_Order.trim();
    }

    public String getGuest_Order() {
        return guest_Order;
    }

    public void setGuest_Order(String guest_Order) {
        this.guest_Order = guest_Order == null ? null : guest_Order.trim();
    }

    public Short getMatchState() {
        return matchState;
    }

    public void setMatchState(Short matchState) {
        this.matchState = matchState;
    }

    public Short getWeatherIcon() {
        return weatherIcon;
    }

    public void setWeatherIcon(Short weatherIcon) {
        this.weatherIcon = weatherIcon;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather == null ? null : weather.trim();
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature == null ? null : temperature.trim();
    }

    public String getTV() {
        return TV;
    }

    public void setTV(String TV) {
        this.TV = TV == null ? null : TV.trim();
    }

    public String getUmpire() {
        return umpire;
    }

    public void setUmpire(String umpire) {
        this.umpire = umpire == null ? null : umpire.trim();
    }

    public Integer getVisitor() {
        return visitor;
    }

    public void setVisitor(Integer visitor) {
        this.visitor = visitor;
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

    public Short getHomeHalfScore() {
        return homeHalfScore;
    }

    public void setHomeHalfScore(Short homeHalfScore) {
        this.homeHalfScore = homeHalfScore;
    }

    public Short getGuestHalfScore() {
        return guestHalfScore;
    }

    public void setGuestHalfScore(Short guestHalfScore) {
        this.guestHalfScore = guestHalfScore;
    }

    public Short getHome_Red() {
        return home_Red;
    }

    public void setHome_Red(Short home_Red) {
        this.home_Red = home_Red;
    }

    public Short getGuest_Red() {
        return guest_Red;
    }

    public void setGuest_Red(Short guest_Red) {
        this.guest_Red = guest_Red;
    }

    public Short getHome_Yellow() {
        return home_Yellow;
    }

    public void setHome_Yellow(Short home_Yellow) {
        this.home_Yellow = home_Yellow;
    }

    public Short getGuest_Yellow() {
        return guest_Yellow;
    }

    public void setGuest_Yellow(Short guest_Yellow) {
        this.guest_Yellow = guest_Yellow;
    }

    public Date getBf_changetime() {
        return bf_changetime;
    }

    public void setBf_changetime(Date bf_changetime) {
        this.bf_changetime = bf_changetime;
    }

    public Byte getShangpan() {
        return shangpan;
    }

    public void setShangpan(Byte shangpan) {
        this.shangpan = shangpan;
    }

    public String getGrouping2() {
        return grouping2;
    }

    public void setGrouping2(String grouping2) {
        this.grouping2 = grouping2 == null ? null : grouping2.trim();
    }

    public Boolean getBfShow() {
        return bfShow;
    }

    public void setBfShow(Boolean bfShow) {
        this.bfShow = bfShow;
    }

    public Integer getSubSclassID() {
        return subSclassID;
    }

    public void setSubSclassID(Integer subSclassID) {
        this.subSclassID = subSclassID;
    }

    public String getExplainlist() {
        return explainlist;
    }

    public void setExplainlist(String explainlist) {
        this.explainlist = explainlist == null ? null : explainlist.trim();
    }

    public Integer getVenuesID() {
        return venuesID;
    }

    public void setVenuesID(Integer venuesID) {
        this.venuesID = venuesID;
    }

    public Boolean getIsGuessRed() {
        return isGuessRed;
    }

    public void setIsGuessRed(Boolean isGuessRed) {
        this.isGuessRed = isGuessRed;
    }

    public Boolean getIsLive() {
        return isLive;
    }

    public void setIsLive(Boolean isLive) {
        this.isLive = isLive;
    }

    public Byte getHomeCorner() {
        return homeCorner;
    }

    public void setHomeCorner(Byte homeCorner) {
        this.homeCorner = homeCorner;
    }

    public Byte getHomeCornerHalf() {
        return homeCornerHalf;
    }

    public void setHomeCornerHalf(Byte homeCornerHalf) {
        this.homeCornerHalf = homeCornerHalf;
    }

    public Byte getGuestCorner() {
        return guestCorner;
    }

    public void setGuestCorner(Byte guestCorner) {
        this.guestCorner = guestCorner;
    }

    public Byte getGuestCornerHalf() {
        return guestCornerHalf;
    }

    public void setGuestCornerHalf(Byte guestCornerHalf) {
        this.guestCornerHalf = guestCornerHalf;
    }

    public String getExplain() {
        return explain;
    }

    public void setExplain(String explain) {
        this.explain = explain == null ? null : explain.trim();
    }
}