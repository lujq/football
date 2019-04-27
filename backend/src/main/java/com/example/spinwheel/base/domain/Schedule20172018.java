package com.example.spinwheel.base.domain;

import java.util.Date;

public class Schedule20172018 {
    private Integer odds_id;

    private Integer class_id;

    private String match_season;

    private Integer home_team_id;

    private Integer guest_team_id;

    private String home_team;

    private String guest_team;

    private Date match_time;

    private Date match_time2;

    private Integer home_score;

    private Integer guest_score;

    private Integer score;

    private Integer home_half_score;

    private Integer guest_half_score;

    private Integer half_score;

    private String result;

    private Float first_goal;

    private Float goal;

    private Float first_up_odds;

    private Float up_odds;

    private Float first_down_odds;

    private Float down_odds;

    private Integer schedule_id;

    public Integer getOdds_id() {
        return odds_id;
    }

    public void setOdds_id(Integer odds_id) {
        this.odds_id = odds_id;
    }

    public Integer getClass_id() {
        return class_id;
    }

    public void setClass_id(Integer class_id) {
        this.class_id = class_id;
    }

    public String getMatch_season() {
        return match_season;
    }

    public void setMatch_season(String match_season) {
        this.match_season = match_season == null ? null : match_season.trim();
    }

    public Integer getHome_team_id() {
        return home_team_id;
    }

    public void setHome_team_id(Integer home_team_id) {
        this.home_team_id = home_team_id;
    }

    public Integer getGuest_team_id() {
        return guest_team_id;
    }

    public void setGuest_team_id(Integer guest_team_id) {
        this.guest_team_id = guest_team_id;
    }

    public String getHome_team() {
        return home_team;
    }

    public void setHome_team(String home_team) {
        this.home_team = home_team == null ? null : home_team.trim();
    }

    public String getGuest_team() {
        return guest_team;
    }

    public void setGuest_team(String guest_team) {
        this.guest_team = guest_team == null ? null : guest_team.trim();
    }

    public Date getMatch_time() {
        return match_time;
    }

    public void setMatch_time(Date match_time) {
        this.match_time = match_time;
    }

    public Date getMatch_time2() {
        return match_time2;
    }

    public void setMatch_time2(Date match_time2) {
        this.match_time2 = match_time2;
    }

    public Integer getHome_score() {
        return home_score;
    }

    public void setHome_score(Integer home_score) {
        this.home_score = home_score;
    }

    public Integer getGuest_score() {
        return guest_score;
    }

    public void setGuest_score(Integer guest_score) {
        this.guest_score = guest_score;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getHome_half_score() {
        return home_half_score;
    }

    public void setHome_half_score(Integer home_half_score) {
        this.home_half_score = home_half_score;
    }

    public Integer getGuest_half_score() {
        return guest_half_score;
    }

    public void setGuest_half_score(Integer guest_half_score) {
        this.guest_half_score = guest_half_score;
    }

    public Integer getHalf_score() {
        return half_score;
    }

    public void setHalf_score(Integer half_score) {
        this.half_score = half_score;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result == null ? null : result.trim();
    }

    public Float getFirst_goal() {
        return first_goal;
    }

    public void setFirst_goal(Float first_goal) {
        this.first_goal = first_goal;
    }

    public Float getGoal() {
        return goal;
    }

    public void setGoal(Float goal) {
        this.goal = goal;
    }

    public Float getFirst_up_odds() {
        return first_up_odds;
    }

    public void setFirst_up_odds(Float first_up_odds) {
        this.first_up_odds = first_up_odds;
    }

    public Float getUp_odds() {
        return up_odds;
    }

    public void setUp_odds(Float up_odds) {
        this.up_odds = up_odds;
    }

    public Float getFirst_down_odds() {
        return first_down_odds;
    }

    public void setFirst_down_odds(Float first_down_odds) {
        this.first_down_odds = first_down_odds;
    }

    public Float getDown_odds() {
        return down_odds;
    }

    public void setDown_odds(Float down_odds) {
        this.down_odds = down_odds;
    }

    public Integer getSchedule_id() {
        return schedule_id;
    }

    public void setSchedule_id(Integer schedule_id) {
        this.schedule_id = schedule_id;
    }
}