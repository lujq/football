package com.example.spinwheel.base.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ScheduleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ScheduleExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andScheduleIDIsNull() {
            addCriterion("ScheduleID is null");
            return (Criteria) this;
        }

        public Criteria andScheduleIDIsNotNull() {
            addCriterion("ScheduleID is not null");
            return (Criteria) this;
        }

        public Criteria andScheduleIDEqualTo(Integer value) {
            addCriterion("ScheduleID =", value, "scheduleID");
            return (Criteria) this;
        }

        public Criteria andScheduleIDNotEqualTo(Integer value) {
            addCriterion("ScheduleID <>", value, "scheduleID");
            return (Criteria) this;
        }

        public Criteria andScheduleIDGreaterThan(Integer value) {
            addCriterion("ScheduleID >", value, "scheduleID");
            return (Criteria) this;
        }

        public Criteria andScheduleIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("ScheduleID >=", value, "scheduleID");
            return (Criteria) this;
        }

        public Criteria andScheduleIDLessThan(Integer value) {
            addCriterion("ScheduleID <", value, "scheduleID");
            return (Criteria) this;
        }

        public Criteria andScheduleIDLessThanOrEqualTo(Integer value) {
            addCriterion("ScheduleID <=", value, "scheduleID");
            return (Criteria) this;
        }

        public Criteria andScheduleIDIn(List<Integer> values) {
            addCriterion("ScheduleID in", values, "scheduleID");
            return (Criteria) this;
        }

        public Criteria andScheduleIDNotIn(List<Integer> values) {
            addCriterion("ScheduleID not in", values, "scheduleID");
            return (Criteria) this;
        }

        public Criteria andScheduleIDBetween(Integer value1, Integer value2) {
            addCriterion("ScheduleID between", value1, value2, "scheduleID");
            return (Criteria) this;
        }

        public Criteria andScheduleIDNotBetween(Integer value1, Integer value2) {
            addCriterion("ScheduleID not between", value1, value2, "scheduleID");
            return (Criteria) this;
        }

        public Criteria andSclassIDIsNull() {
            addCriterion("SclassID is null");
            return (Criteria) this;
        }

        public Criteria andSclassIDIsNotNull() {
            addCriterion("SclassID is not null");
            return (Criteria) this;
        }

        public Criteria andSclassIDEqualTo(Integer value) {
            addCriterion("SclassID =", value, "sclassID");
            return (Criteria) this;
        }

        public Criteria andSclassIDNotEqualTo(Integer value) {
            addCriterion("SclassID <>", value, "sclassID");
            return (Criteria) this;
        }

        public Criteria andSclassIDGreaterThan(Integer value) {
            addCriterion("SclassID >", value, "sclassID");
            return (Criteria) this;
        }

        public Criteria andSclassIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("SclassID >=", value, "sclassID");
            return (Criteria) this;
        }

        public Criteria andSclassIDLessThan(Integer value) {
            addCriterion("SclassID <", value, "sclassID");
            return (Criteria) this;
        }

        public Criteria andSclassIDLessThanOrEqualTo(Integer value) {
            addCriterion("SclassID <=", value, "sclassID");
            return (Criteria) this;
        }

        public Criteria andSclassIDIn(List<Integer> values) {
            addCriterion("SclassID in", values, "sclassID");
            return (Criteria) this;
        }

        public Criteria andSclassIDNotIn(List<Integer> values) {
            addCriterion("SclassID not in", values, "sclassID");
            return (Criteria) this;
        }

        public Criteria andSclassIDBetween(Integer value1, Integer value2) {
            addCriterion("SclassID between", value1, value2, "sclassID");
            return (Criteria) this;
        }

        public Criteria andSclassIDNotBetween(Integer value1, Integer value2) {
            addCriterion("SclassID not between", value1, value2, "sclassID");
            return (Criteria) this;
        }

        public Criteria andMatchSeasonIsNull() {
            addCriterion("MatchSeason is null");
            return (Criteria) this;
        }

        public Criteria andMatchSeasonIsNotNull() {
            addCriterion("MatchSeason is not null");
            return (Criteria) this;
        }

        public Criteria andMatchSeasonEqualTo(String value) {
            addCriterion("MatchSeason =", value, "matchSeason");
            return (Criteria) this;
        }

        public Criteria andMatchSeasonNotEqualTo(String value) {
            addCriterion("MatchSeason <>", value, "matchSeason");
            return (Criteria) this;
        }

        public Criteria andMatchSeasonGreaterThan(String value) {
            addCriterion("MatchSeason >", value, "matchSeason");
            return (Criteria) this;
        }

        public Criteria andMatchSeasonGreaterThanOrEqualTo(String value) {
            addCriterion("MatchSeason >=", value, "matchSeason");
            return (Criteria) this;
        }

        public Criteria andMatchSeasonLessThan(String value) {
            addCriterion("MatchSeason <", value, "matchSeason");
            return (Criteria) this;
        }

        public Criteria andMatchSeasonLessThanOrEqualTo(String value) {
            addCriterion("MatchSeason <=", value, "matchSeason");
            return (Criteria) this;
        }

        public Criteria andMatchSeasonLike(String value) {
            addCriterion("MatchSeason like", value, "matchSeason");
            return (Criteria) this;
        }

        public Criteria andMatchSeasonNotLike(String value) {
            addCriterion("MatchSeason not like", value, "matchSeason");
            return (Criteria) this;
        }

        public Criteria andMatchSeasonIn(List<String> values) {
            addCriterion("MatchSeason in", values, "matchSeason");
            return (Criteria) this;
        }

        public Criteria andMatchSeasonNotIn(List<String> values) {
            addCriterion("MatchSeason not in", values, "matchSeason");
            return (Criteria) this;
        }

        public Criteria andMatchSeasonBetween(String value1, String value2) {
            addCriterion("MatchSeason between", value1, value2, "matchSeason");
            return (Criteria) this;
        }

        public Criteria andMatchSeasonNotBetween(String value1, String value2) {
            addCriterion("MatchSeason not between", value1, value2, "matchSeason");
            return (Criteria) this;
        }

        public Criteria andRoundIsNull() {
            addCriterion("round is null");
            return (Criteria) this;
        }

        public Criteria andRoundIsNotNull() {
            addCriterion("round is not null");
            return (Criteria) this;
        }

        public Criteria andRoundEqualTo(Short value) {
            addCriterion("round =", value, "round");
            return (Criteria) this;
        }

        public Criteria andRoundNotEqualTo(Short value) {
            addCriterion("round <>", value, "round");
            return (Criteria) this;
        }

        public Criteria andRoundGreaterThan(Short value) {
            addCriterion("round >", value, "round");
            return (Criteria) this;
        }

        public Criteria andRoundGreaterThanOrEqualTo(Short value) {
            addCriterion("round >=", value, "round");
            return (Criteria) this;
        }

        public Criteria andRoundLessThan(Short value) {
            addCriterion("round <", value, "round");
            return (Criteria) this;
        }

        public Criteria andRoundLessThanOrEqualTo(Short value) {
            addCriterion("round <=", value, "round");
            return (Criteria) this;
        }

        public Criteria andRoundIn(List<Short> values) {
            addCriterion("round in", values, "round");
            return (Criteria) this;
        }

        public Criteria andRoundNotIn(List<Short> values) {
            addCriterion("round not in", values, "round");
            return (Criteria) this;
        }

        public Criteria andRoundBetween(Short value1, Short value2) {
            addCriterion("round between", value1, value2, "round");
            return (Criteria) this;
        }

        public Criteria andRoundNotBetween(Short value1, Short value2) {
            addCriterion("round not between", value1, value2, "round");
            return (Criteria) this;
        }

        public Criteria andGroupingIsNull() {
            addCriterion("grouping is null");
            return (Criteria) this;
        }

        public Criteria andGroupingIsNotNull() {
            addCriterion("grouping is not null");
            return (Criteria) this;
        }

        public Criteria andGroupingEqualTo(String value) {
            addCriterion("grouping =", value, "grouping");
            return (Criteria) this;
        }

        public Criteria andGroupingNotEqualTo(String value) {
            addCriterion("grouping <>", value, "grouping");
            return (Criteria) this;
        }

        public Criteria andGroupingGreaterThan(String value) {
            addCriterion("grouping >", value, "grouping");
            return (Criteria) this;
        }

        public Criteria andGroupingGreaterThanOrEqualTo(String value) {
            addCriterion("grouping >=", value, "grouping");
            return (Criteria) this;
        }

        public Criteria andGroupingLessThan(String value) {
            addCriterion("grouping <", value, "grouping");
            return (Criteria) this;
        }

        public Criteria andGroupingLessThanOrEqualTo(String value) {
            addCriterion("grouping <=", value, "grouping");
            return (Criteria) this;
        }

        public Criteria andGroupingLike(String value) {
            addCriterion("grouping like", value, "grouping");
            return (Criteria) this;
        }

        public Criteria andGroupingNotLike(String value) {
            addCriterion("grouping not like", value, "grouping");
            return (Criteria) this;
        }

        public Criteria andGroupingIn(List<String> values) {
            addCriterion("grouping in", values, "grouping");
            return (Criteria) this;
        }

        public Criteria andGroupingNotIn(List<String> values) {
            addCriterion("grouping not in", values, "grouping");
            return (Criteria) this;
        }

        public Criteria andGroupingBetween(String value1, String value2) {
            addCriterion("grouping between", value1, value2, "grouping");
            return (Criteria) this;
        }

        public Criteria andGroupingNotBetween(String value1, String value2) {
            addCriterion("grouping not between", value1, value2, "grouping");
            return (Criteria) this;
        }

        public Criteria andHomeTeamIDIsNull() {
            addCriterion("HomeTeamID is null");
            return (Criteria) this;
        }

        public Criteria andHomeTeamIDIsNotNull() {
            addCriterion("HomeTeamID is not null");
            return (Criteria) this;
        }

        public Criteria andHomeTeamIDEqualTo(Integer value) {
            addCriterion("HomeTeamID =", value, "homeTeamID");
            return (Criteria) this;
        }

        public Criteria andHomeTeamIDNotEqualTo(Integer value) {
            addCriterion("HomeTeamID <>", value, "homeTeamID");
            return (Criteria) this;
        }

        public Criteria andHomeTeamIDGreaterThan(Integer value) {
            addCriterion("HomeTeamID >", value, "homeTeamID");
            return (Criteria) this;
        }

        public Criteria andHomeTeamIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("HomeTeamID >=", value, "homeTeamID");
            return (Criteria) this;
        }

        public Criteria andHomeTeamIDLessThan(Integer value) {
            addCriterion("HomeTeamID <", value, "homeTeamID");
            return (Criteria) this;
        }

        public Criteria andHomeTeamIDLessThanOrEqualTo(Integer value) {
            addCriterion("HomeTeamID <=", value, "homeTeamID");
            return (Criteria) this;
        }

        public Criteria andHomeTeamIDIn(List<Integer> values) {
            addCriterion("HomeTeamID in", values, "homeTeamID");
            return (Criteria) this;
        }

        public Criteria andHomeTeamIDNotIn(List<Integer> values) {
            addCriterion("HomeTeamID not in", values, "homeTeamID");
            return (Criteria) this;
        }

        public Criteria andHomeTeamIDBetween(Integer value1, Integer value2) {
            addCriterion("HomeTeamID between", value1, value2, "homeTeamID");
            return (Criteria) this;
        }

        public Criteria andHomeTeamIDNotBetween(Integer value1, Integer value2) {
            addCriterion("HomeTeamID not between", value1, value2, "homeTeamID");
            return (Criteria) this;
        }

        public Criteria andGuestTeamIDIsNull() {
            addCriterion("GuestTeamID is null");
            return (Criteria) this;
        }

        public Criteria andGuestTeamIDIsNotNull() {
            addCriterion("GuestTeamID is not null");
            return (Criteria) this;
        }

        public Criteria andGuestTeamIDEqualTo(Integer value) {
            addCriterion("GuestTeamID =", value, "guestTeamID");
            return (Criteria) this;
        }

        public Criteria andGuestTeamIDNotEqualTo(Integer value) {
            addCriterion("GuestTeamID <>", value, "guestTeamID");
            return (Criteria) this;
        }

        public Criteria andGuestTeamIDGreaterThan(Integer value) {
            addCriterion("GuestTeamID >", value, "guestTeamID");
            return (Criteria) this;
        }

        public Criteria andGuestTeamIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("GuestTeamID >=", value, "guestTeamID");
            return (Criteria) this;
        }

        public Criteria andGuestTeamIDLessThan(Integer value) {
            addCriterion("GuestTeamID <", value, "guestTeamID");
            return (Criteria) this;
        }

        public Criteria andGuestTeamIDLessThanOrEqualTo(Integer value) {
            addCriterion("GuestTeamID <=", value, "guestTeamID");
            return (Criteria) this;
        }

        public Criteria andGuestTeamIDIn(List<Integer> values) {
            addCriterion("GuestTeamID in", values, "guestTeamID");
            return (Criteria) this;
        }

        public Criteria andGuestTeamIDNotIn(List<Integer> values) {
            addCriterion("GuestTeamID not in", values, "guestTeamID");
            return (Criteria) this;
        }

        public Criteria andGuestTeamIDBetween(Integer value1, Integer value2) {
            addCriterion("GuestTeamID between", value1, value2, "guestTeamID");
            return (Criteria) this;
        }

        public Criteria andGuestTeamIDNotBetween(Integer value1, Integer value2) {
            addCriterion("GuestTeamID not between", value1, value2, "guestTeamID");
            return (Criteria) this;
        }

        public Criteria andHomeTeamIsNull() {
            addCriterion("HomeTeam is null");
            return (Criteria) this;
        }

        public Criteria andHomeTeamIsNotNull() {
            addCriterion("HomeTeam is not null");
            return (Criteria) this;
        }

        public Criteria andHomeTeamEqualTo(String value) {
            addCriterion("HomeTeam =", value, "homeTeam");
            return (Criteria) this;
        }

        public Criteria andHomeTeamNotEqualTo(String value) {
            addCriterion("HomeTeam <>", value, "homeTeam");
            return (Criteria) this;
        }

        public Criteria andHomeTeamGreaterThan(String value) {
            addCriterion("HomeTeam >", value, "homeTeam");
            return (Criteria) this;
        }

        public Criteria andHomeTeamGreaterThanOrEqualTo(String value) {
            addCriterion("HomeTeam >=", value, "homeTeam");
            return (Criteria) this;
        }

        public Criteria andHomeTeamLessThan(String value) {
            addCriterion("HomeTeam <", value, "homeTeam");
            return (Criteria) this;
        }

        public Criteria andHomeTeamLessThanOrEqualTo(String value) {
            addCriterion("HomeTeam <=", value, "homeTeam");
            return (Criteria) this;
        }

        public Criteria andHomeTeamLike(String value) {
            addCriterion("HomeTeam like", value, "homeTeam");
            return (Criteria) this;
        }

        public Criteria andHomeTeamNotLike(String value) {
            addCriterion("HomeTeam not like", value, "homeTeam");
            return (Criteria) this;
        }

        public Criteria andHomeTeamIn(List<String> values) {
            addCriterion("HomeTeam in", values, "homeTeam");
            return (Criteria) this;
        }

        public Criteria andHomeTeamNotIn(List<String> values) {
            addCriterion("HomeTeam not in", values, "homeTeam");
            return (Criteria) this;
        }

        public Criteria andHomeTeamBetween(String value1, String value2) {
            addCriterion("HomeTeam between", value1, value2, "homeTeam");
            return (Criteria) this;
        }

        public Criteria andHomeTeamNotBetween(String value1, String value2) {
            addCriterion("HomeTeam not between", value1, value2, "homeTeam");
            return (Criteria) this;
        }

        public Criteria andGuestTeamIsNull() {
            addCriterion("GuestTeam is null");
            return (Criteria) this;
        }

        public Criteria andGuestTeamIsNotNull() {
            addCriterion("GuestTeam is not null");
            return (Criteria) this;
        }

        public Criteria andGuestTeamEqualTo(String value) {
            addCriterion("GuestTeam =", value, "guestTeam");
            return (Criteria) this;
        }

        public Criteria andGuestTeamNotEqualTo(String value) {
            addCriterion("GuestTeam <>", value, "guestTeam");
            return (Criteria) this;
        }

        public Criteria andGuestTeamGreaterThan(String value) {
            addCriterion("GuestTeam >", value, "guestTeam");
            return (Criteria) this;
        }

        public Criteria andGuestTeamGreaterThanOrEqualTo(String value) {
            addCriterion("GuestTeam >=", value, "guestTeam");
            return (Criteria) this;
        }

        public Criteria andGuestTeamLessThan(String value) {
            addCriterion("GuestTeam <", value, "guestTeam");
            return (Criteria) this;
        }

        public Criteria andGuestTeamLessThanOrEqualTo(String value) {
            addCriterion("GuestTeam <=", value, "guestTeam");
            return (Criteria) this;
        }

        public Criteria andGuestTeamLike(String value) {
            addCriterion("GuestTeam like", value, "guestTeam");
            return (Criteria) this;
        }

        public Criteria andGuestTeamNotLike(String value) {
            addCriterion("GuestTeam not like", value, "guestTeam");
            return (Criteria) this;
        }

        public Criteria andGuestTeamIn(List<String> values) {
            addCriterion("GuestTeam in", values, "guestTeam");
            return (Criteria) this;
        }

        public Criteria andGuestTeamNotIn(List<String> values) {
            addCriterion("GuestTeam not in", values, "guestTeam");
            return (Criteria) this;
        }

        public Criteria andGuestTeamBetween(String value1, String value2) {
            addCriterion("GuestTeam between", value1, value2, "guestTeam");
            return (Criteria) this;
        }

        public Criteria andGuestTeamNotBetween(String value1, String value2) {
            addCriterion("GuestTeam not between", value1, value2, "guestTeam");
            return (Criteria) this;
        }

        public Criteria andNeutralityIsNull() {
            addCriterion("Neutrality is null");
            return (Criteria) this;
        }

        public Criteria andNeutralityIsNotNull() {
            addCriterion("Neutrality is not null");
            return (Criteria) this;
        }

        public Criteria andNeutralityEqualTo(Boolean value) {
            addCriterion("Neutrality =", value, "neutrality");
            return (Criteria) this;
        }

        public Criteria andNeutralityNotEqualTo(Boolean value) {
            addCriterion("Neutrality <>", value, "neutrality");
            return (Criteria) this;
        }

        public Criteria andNeutralityGreaterThan(Boolean value) {
            addCriterion("Neutrality >", value, "neutrality");
            return (Criteria) this;
        }

        public Criteria andNeutralityGreaterThanOrEqualTo(Boolean value) {
            addCriterion("Neutrality >=", value, "neutrality");
            return (Criteria) this;
        }

        public Criteria andNeutralityLessThan(Boolean value) {
            addCriterion("Neutrality <", value, "neutrality");
            return (Criteria) this;
        }

        public Criteria andNeutralityLessThanOrEqualTo(Boolean value) {
            addCriterion("Neutrality <=", value, "neutrality");
            return (Criteria) this;
        }

        public Criteria andNeutralityIn(List<Boolean> values) {
            addCriterion("Neutrality in", values, "neutrality");
            return (Criteria) this;
        }

        public Criteria andNeutralityNotIn(List<Boolean> values) {
            addCriterion("Neutrality not in", values, "neutrality");
            return (Criteria) this;
        }

        public Criteria andNeutralityBetween(Boolean value1, Boolean value2) {
            addCriterion("Neutrality between", value1, value2, "neutrality");
            return (Criteria) this;
        }

        public Criteria andNeutralityNotBetween(Boolean value1, Boolean value2) {
            addCriterion("Neutrality not between", value1, value2, "neutrality");
            return (Criteria) this;
        }

        public Criteria andMatchTimeIsNull() {
            addCriterion("MatchTime is null");
            return (Criteria) this;
        }

        public Criteria andMatchTimeIsNotNull() {
            addCriterion("MatchTime is not null");
            return (Criteria) this;
        }

        public Criteria andMatchTimeEqualTo(Date value) {
            addCriterion("MatchTime =", value, "matchTime");
            return (Criteria) this;
        }

        public Criteria andMatchTimeNotEqualTo(Date value) {
            addCriterion("MatchTime <>", value, "matchTime");
            return (Criteria) this;
        }

        public Criteria andMatchTimeGreaterThan(Date value) {
            addCriterion("MatchTime >", value, "matchTime");
            return (Criteria) this;
        }

        public Criteria andMatchTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("MatchTime >=", value, "matchTime");
            return (Criteria) this;
        }

        public Criteria andMatchTimeLessThan(Date value) {
            addCriterion("MatchTime <", value, "matchTime");
            return (Criteria) this;
        }

        public Criteria andMatchTimeLessThanOrEqualTo(Date value) {
            addCriterion("MatchTime <=", value, "matchTime");
            return (Criteria) this;
        }

        public Criteria andMatchTimeIn(List<Date> values) {
            addCriterion("MatchTime in", values, "matchTime");
            return (Criteria) this;
        }

        public Criteria andMatchTimeNotIn(List<Date> values) {
            addCriterion("MatchTime not in", values, "matchTime");
            return (Criteria) this;
        }

        public Criteria andMatchTimeBetween(Date value1, Date value2) {
            addCriterion("MatchTime between", value1, value2, "matchTime");
            return (Criteria) this;
        }

        public Criteria andMatchTimeNotBetween(Date value1, Date value2) {
            addCriterion("MatchTime not between", value1, value2, "matchTime");
            return (Criteria) this;
        }

        public Criteria andMatchTime2IsNull() {
            addCriterion("MatchTime2 is null");
            return (Criteria) this;
        }

        public Criteria andMatchTime2IsNotNull() {
            addCriterion("MatchTime2 is not null");
            return (Criteria) this;
        }

        public Criteria andMatchTime2EqualTo(Date value) {
            addCriterion("MatchTime2 =", value, "matchTime2");
            return (Criteria) this;
        }

        public Criteria andMatchTime2NotEqualTo(Date value) {
            addCriterion("MatchTime2 <>", value, "matchTime2");
            return (Criteria) this;
        }

        public Criteria andMatchTime2GreaterThan(Date value) {
            addCriterion("MatchTime2 >", value, "matchTime2");
            return (Criteria) this;
        }

        public Criteria andMatchTime2GreaterThanOrEqualTo(Date value) {
            addCriterion("MatchTime2 >=", value, "matchTime2");
            return (Criteria) this;
        }

        public Criteria andMatchTime2LessThan(Date value) {
            addCriterion("MatchTime2 <", value, "matchTime2");
            return (Criteria) this;
        }

        public Criteria andMatchTime2LessThanOrEqualTo(Date value) {
            addCriterion("MatchTime2 <=", value, "matchTime2");
            return (Criteria) this;
        }

        public Criteria andMatchTime2In(List<Date> values) {
            addCriterion("MatchTime2 in", values, "matchTime2");
            return (Criteria) this;
        }

        public Criteria andMatchTime2NotIn(List<Date> values) {
            addCriterion("MatchTime2 not in", values, "matchTime2");
            return (Criteria) this;
        }

        public Criteria andMatchTime2Between(Date value1, Date value2) {
            addCriterion("MatchTime2 between", value1, value2, "matchTime2");
            return (Criteria) this;
        }

        public Criteria andMatchTime2NotBetween(Date value1, Date value2) {
            addCriterion("MatchTime2 not between", value1, value2, "matchTime2");
            return (Criteria) this;
        }

        public Criteria andLocationIsNull() {
            addCriterion("Location is null");
            return (Criteria) this;
        }

        public Criteria andLocationIsNotNull() {
            addCriterion("Location is not null");
            return (Criteria) this;
        }

        public Criteria andLocationEqualTo(String value) {
            addCriterion("Location =", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotEqualTo(String value) {
            addCriterion("Location <>", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThan(String value) {
            addCriterion("Location >", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThanOrEqualTo(String value) {
            addCriterion("Location >=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThan(String value) {
            addCriterion("Location <", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThanOrEqualTo(String value) {
            addCriterion("Location <=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLike(String value) {
            addCriterion("Location like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotLike(String value) {
            addCriterion("Location not like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationIn(List<String> values) {
            addCriterion("Location in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotIn(List<String> values) {
            addCriterion("Location not in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationBetween(String value1, String value2) {
            addCriterion("Location between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotBetween(String value1, String value2) {
            addCriterion("Location not between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andHome_OrderIsNull() {
            addCriterion("Home_Order is null");
            return (Criteria) this;
        }

        public Criteria andHome_OrderIsNotNull() {
            addCriterion("Home_Order is not null");
            return (Criteria) this;
        }

        public Criteria andHome_OrderEqualTo(String value) {
            addCriterion("Home_Order =", value, "home_Order");
            return (Criteria) this;
        }

        public Criteria andHome_OrderNotEqualTo(String value) {
            addCriterion("Home_Order <>", value, "home_Order");
            return (Criteria) this;
        }

        public Criteria andHome_OrderGreaterThan(String value) {
            addCriterion("Home_Order >", value, "home_Order");
            return (Criteria) this;
        }

        public Criteria andHome_OrderGreaterThanOrEqualTo(String value) {
            addCriterion("Home_Order >=", value, "home_Order");
            return (Criteria) this;
        }

        public Criteria andHome_OrderLessThan(String value) {
            addCriterion("Home_Order <", value, "home_Order");
            return (Criteria) this;
        }

        public Criteria andHome_OrderLessThanOrEqualTo(String value) {
            addCriterion("Home_Order <=", value, "home_Order");
            return (Criteria) this;
        }

        public Criteria andHome_OrderLike(String value) {
            addCriterion("Home_Order like", value, "home_Order");
            return (Criteria) this;
        }

        public Criteria andHome_OrderNotLike(String value) {
            addCriterion("Home_Order not like", value, "home_Order");
            return (Criteria) this;
        }

        public Criteria andHome_OrderIn(List<String> values) {
            addCriterion("Home_Order in", values, "home_Order");
            return (Criteria) this;
        }

        public Criteria andHome_OrderNotIn(List<String> values) {
            addCriterion("Home_Order not in", values, "home_Order");
            return (Criteria) this;
        }

        public Criteria andHome_OrderBetween(String value1, String value2) {
            addCriterion("Home_Order between", value1, value2, "home_Order");
            return (Criteria) this;
        }

        public Criteria andHome_OrderNotBetween(String value1, String value2) {
            addCriterion("Home_Order not between", value1, value2, "home_Order");
            return (Criteria) this;
        }

        public Criteria andGuest_OrderIsNull() {
            addCriterion("Guest_Order is null");
            return (Criteria) this;
        }

        public Criteria andGuest_OrderIsNotNull() {
            addCriterion("Guest_Order is not null");
            return (Criteria) this;
        }

        public Criteria andGuest_OrderEqualTo(String value) {
            addCriterion("Guest_Order =", value, "guest_Order");
            return (Criteria) this;
        }

        public Criteria andGuest_OrderNotEqualTo(String value) {
            addCriterion("Guest_Order <>", value, "guest_Order");
            return (Criteria) this;
        }

        public Criteria andGuest_OrderGreaterThan(String value) {
            addCriterion("Guest_Order >", value, "guest_Order");
            return (Criteria) this;
        }

        public Criteria andGuest_OrderGreaterThanOrEqualTo(String value) {
            addCriterion("Guest_Order >=", value, "guest_Order");
            return (Criteria) this;
        }

        public Criteria andGuest_OrderLessThan(String value) {
            addCriterion("Guest_Order <", value, "guest_Order");
            return (Criteria) this;
        }

        public Criteria andGuest_OrderLessThanOrEqualTo(String value) {
            addCriterion("Guest_Order <=", value, "guest_Order");
            return (Criteria) this;
        }

        public Criteria andGuest_OrderLike(String value) {
            addCriterion("Guest_Order like", value, "guest_Order");
            return (Criteria) this;
        }

        public Criteria andGuest_OrderNotLike(String value) {
            addCriterion("Guest_Order not like", value, "guest_Order");
            return (Criteria) this;
        }

        public Criteria andGuest_OrderIn(List<String> values) {
            addCriterion("Guest_Order in", values, "guest_Order");
            return (Criteria) this;
        }

        public Criteria andGuest_OrderNotIn(List<String> values) {
            addCriterion("Guest_Order not in", values, "guest_Order");
            return (Criteria) this;
        }

        public Criteria andGuest_OrderBetween(String value1, String value2) {
            addCriterion("Guest_Order between", value1, value2, "guest_Order");
            return (Criteria) this;
        }

        public Criteria andGuest_OrderNotBetween(String value1, String value2) {
            addCriterion("Guest_Order not between", value1, value2, "guest_Order");
            return (Criteria) this;
        }

        public Criteria andMatchStateIsNull() {
            addCriterion("MatchState is null");
            return (Criteria) this;
        }

        public Criteria andMatchStateIsNotNull() {
            addCriterion("MatchState is not null");
            return (Criteria) this;
        }

        public Criteria andMatchStateEqualTo(Short value) {
            addCriterion("MatchState =", value, "matchState");
            return (Criteria) this;
        }

        public Criteria andMatchStateNotEqualTo(Short value) {
            addCriterion("MatchState <>", value, "matchState");
            return (Criteria) this;
        }

        public Criteria andMatchStateGreaterThan(Short value) {
            addCriterion("MatchState >", value, "matchState");
            return (Criteria) this;
        }

        public Criteria andMatchStateGreaterThanOrEqualTo(Short value) {
            addCriterion("MatchState >=", value, "matchState");
            return (Criteria) this;
        }

        public Criteria andMatchStateLessThan(Short value) {
            addCriterion("MatchState <", value, "matchState");
            return (Criteria) this;
        }

        public Criteria andMatchStateLessThanOrEqualTo(Short value) {
            addCriterion("MatchState <=", value, "matchState");
            return (Criteria) this;
        }

        public Criteria andMatchStateIn(List<Short> values) {
            addCriterion("MatchState in", values, "matchState");
            return (Criteria) this;
        }

        public Criteria andMatchStateNotIn(List<Short> values) {
            addCriterion("MatchState not in", values, "matchState");
            return (Criteria) this;
        }

        public Criteria andMatchStateBetween(Short value1, Short value2) {
            addCriterion("MatchState between", value1, value2, "matchState");
            return (Criteria) this;
        }

        public Criteria andMatchStateNotBetween(Short value1, Short value2) {
            addCriterion("MatchState not between", value1, value2, "matchState");
            return (Criteria) this;
        }

        public Criteria andWeatherIconIsNull() {
            addCriterion("WeatherIcon is null");
            return (Criteria) this;
        }

        public Criteria andWeatherIconIsNotNull() {
            addCriterion("WeatherIcon is not null");
            return (Criteria) this;
        }

        public Criteria andWeatherIconEqualTo(Short value) {
            addCriterion("WeatherIcon =", value, "weatherIcon");
            return (Criteria) this;
        }

        public Criteria andWeatherIconNotEqualTo(Short value) {
            addCriterion("WeatherIcon <>", value, "weatherIcon");
            return (Criteria) this;
        }

        public Criteria andWeatherIconGreaterThan(Short value) {
            addCriterion("WeatherIcon >", value, "weatherIcon");
            return (Criteria) this;
        }

        public Criteria andWeatherIconGreaterThanOrEqualTo(Short value) {
            addCriterion("WeatherIcon >=", value, "weatherIcon");
            return (Criteria) this;
        }

        public Criteria andWeatherIconLessThan(Short value) {
            addCriterion("WeatherIcon <", value, "weatherIcon");
            return (Criteria) this;
        }

        public Criteria andWeatherIconLessThanOrEqualTo(Short value) {
            addCriterion("WeatherIcon <=", value, "weatherIcon");
            return (Criteria) this;
        }

        public Criteria andWeatherIconIn(List<Short> values) {
            addCriterion("WeatherIcon in", values, "weatherIcon");
            return (Criteria) this;
        }

        public Criteria andWeatherIconNotIn(List<Short> values) {
            addCriterion("WeatherIcon not in", values, "weatherIcon");
            return (Criteria) this;
        }

        public Criteria andWeatherIconBetween(Short value1, Short value2) {
            addCriterion("WeatherIcon between", value1, value2, "weatherIcon");
            return (Criteria) this;
        }

        public Criteria andWeatherIconNotBetween(Short value1, Short value2) {
            addCriterion("WeatherIcon not between", value1, value2, "weatherIcon");
            return (Criteria) this;
        }

        public Criteria andWeatherIsNull() {
            addCriterion("Weather is null");
            return (Criteria) this;
        }

        public Criteria andWeatherIsNotNull() {
            addCriterion("Weather is not null");
            return (Criteria) this;
        }

        public Criteria andWeatherEqualTo(String value) {
            addCriterion("Weather =", value, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherNotEqualTo(String value) {
            addCriterion("Weather <>", value, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherGreaterThan(String value) {
            addCriterion("Weather >", value, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherGreaterThanOrEqualTo(String value) {
            addCriterion("Weather >=", value, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherLessThan(String value) {
            addCriterion("Weather <", value, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherLessThanOrEqualTo(String value) {
            addCriterion("Weather <=", value, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherLike(String value) {
            addCriterion("Weather like", value, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherNotLike(String value) {
            addCriterion("Weather not like", value, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherIn(List<String> values) {
            addCriterion("Weather in", values, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherNotIn(List<String> values) {
            addCriterion("Weather not in", values, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherBetween(String value1, String value2) {
            addCriterion("Weather between", value1, value2, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherNotBetween(String value1, String value2) {
            addCriterion("Weather not between", value1, value2, "weather");
            return (Criteria) this;
        }

        public Criteria andTemperatureIsNull() {
            addCriterion("Temperature is null");
            return (Criteria) this;
        }

        public Criteria andTemperatureIsNotNull() {
            addCriterion("Temperature is not null");
            return (Criteria) this;
        }

        public Criteria andTemperatureEqualTo(String value) {
            addCriterion("Temperature =", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotEqualTo(String value) {
            addCriterion("Temperature <>", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureGreaterThan(String value) {
            addCriterion("Temperature >", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureGreaterThanOrEqualTo(String value) {
            addCriterion("Temperature >=", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureLessThan(String value) {
            addCriterion("Temperature <", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureLessThanOrEqualTo(String value) {
            addCriterion("Temperature <=", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureLike(String value) {
            addCriterion("Temperature like", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotLike(String value) {
            addCriterion("Temperature not like", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureIn(List<String> values) {
            addCriterion("Temperature in", values, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotIn(List<String> values) {
            addCriterion("Temperature not in", values, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureBetween(String value1, String value2) {
            addCriterion("Temperature between", value1, value2, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotBetween(String value1, String value2) {
            addCriterion("Temperature not between", value1, value2, "temperature");
            return (Criteria) this;
        }

        public Criteria andTVIsNull() {
            addCriterion("TV is null");
            return (Criteria) this;
        }

        public Criteria andTVIsNotNull() {
            addCriterion("TV is not null");
            return (Criteria) this;
        }

        public Criteria andTVEqualTo(String value) {
            addCriterion("TV =", value, "TV");
            return (Criteria) this;
        }

        public Criteria andTVNotEqualTo(String value) {
            addCriterion("TV <>", value, "TV");
            return (Criteria) this;
        }

        public Criteria andTVGreaterThan(String value) {
            addCriterion("TV >", value, "TV");
            return (Criteria) this;
        }

        public Criteria andTVGreaterThanOrEqualTo(String value) {
            addCriterion("TV >=", value, "TV");
            return (Criteria) this;
        }

        public Criteria andTVLessThan(String value) {
            addCriterion("TV <", value, "TV");
            return (Criteria) this;
        }

        public Criteria andTVLessThanOrEqualTo(String value) {
            addCriterion("TV <=", value, "TV");
            return (Criteria) this;
        }

        public Criteria andTVLike(String value) {
            addCriterion("TV like", value, "TV");
            return (Criteria) this;
        }

        public Criteria andTVNotLike(String value) {
            addCriterion("TV not like", value, "TV");
            return (Criteria) this;
        }

        public Criteria andTVIn(List<String> values) {
            addCriterion("TV in", values, "TV");
            return (Criteria) this;
        }

        public Criteria andTVNotIn(List<String> values) {
            addCriterion("TV not in", values, "TV");
            return (Criteria) this;
        }

        public Criteria andTVBetween(String value1, String value2) {
            addCriterion("TV between", value1, value2, "TV");
            return (Criteria) this;
        }

        public Criteria andTVNotBetween(String value1, String value2) {
            addCriterion("TV not between", value1, value2, "TV");
            return (Criteria) this;
        }

        public Criteria andUmpireIsNull() {
            addCriterion("Umpire is null");
            return (Criteria) this;
        }

        public Criteria andUmpireIsNotNull() {
            addCriterion("Umpire is not null");
            return (Criteria) this;
        }

        public Criteria andUmpireEqualTo(String value) {
            addCriterion("Umpire =", value, "umpire");
            return (Criteria) this;
        }

        public Criteria andUmpireNotEqualTo(String value) {
            addCriterion("Umpire <>", value, "umpire");
            return (Criteria) this;
        }

        public Criteria andUmpireGreaterThan(String value) {
            addCriterion("Umpire >", value, "umpire");
            return (Criteria) this;
        }

        public Criteria andUmpireGreaterThanOrEqualTo(String value) {
            addCriterion("Umpire >=", value, "umpire");
            return (Criteria) this;
        }

        public Criteria andUmpireLessThan(String value) {
            addCriterion("Umpire <", value, "umpire");
            return (Criteria) this;
        }

        public Criteria andUmpireLessThanOrEqualTo(String value) {
            addCriterion("Umpire <=", value, "umpire");
            return (Criteria) this;
        }

        public Criteria andUmpireLike(String value) {
            addCriterion("Umpire like", value, "umpire");
            return (Criteria) this;
        }

        public Criteria andUmpireNotLike(String value) {
            addCriterion("Umpire not like", value, "umpire");
            return (Criteria) this;
        }

        public Criteria andUmpireIn(List<String> values) {
            addCriterion("Umpire in", values, "umpire");
            return (Criteria) this;
        }

        public Criteria andUmpireNotIn(List<String> values) {
            addCriterion("Umpire not in", values, "umpire");
            return (Criteria) this;
        }

        public Criteria andUmpireBetween(String value1, String value2) {
            addCriterion("Umpire between", value1, value2, "umpire");
            return (Criteria) this;
        }

        public Criteria andUmpireNotBetween(String value1, String value2) {
            addCriterion("Umpire not between", value1, value2, "umpire");
            return (Criteria) this;
        }

        public Criteria andVisitorIsNull() {
            addCriterion("Visitor is null");
            return (Criteria) this;
        }

        public Criteria andVisitorIsNotNull() {
            addCriterion("Visitor is not null");
            return (Criteria) this;
        }

        public Criteria andVisitorEqualTo(Integer value) {
            addCriterion("Visitor =", value, "visitor");
            return (Criteria) this;
        }

        public Criteria andVisitorNotEqualTo(Integer value) {
            addCriterion("Visitor <>", value, "visitor");
            return (Criteria) this;
        }

        public Criteria andVisitorGreaterThan(Integer value) {
            addCriterion("Visitor >", value, "visitor");
            return (Criteria) this;
        }

        public Criteria andVisitorGreaterThanOrEqualTo(Integer value) {
            addCriterion("Visitor >=", value, "visitor");
            return (Criteria) this;
        }

        public Criteria andVisitorLessThan(Integer value) {
            addCriterion("Visitor <", value, "visitor");
            return (Criteria) this;
        }

        public Criteria andVisitorLessThanOrEqualTo(Integer value) {
            addCriterion("Visitor <=", value, "visitor");
            return (Criteria) this;
        }

        public Criteria andVisitorIn(List<Integer> values) {
            addCriterion("Visitor in", values, "visitor");
            return (Criteria) this;
        }

        public Criteria andVisitorNotIn(List<Integer> values) {
            addCriterion("Visitor not in", values, "visitor");
            return (Criteria) this;
        }

        public Criteria andVisitorBetween(Integer value1, Integer value2) {
            addCriterion("Visitor between", value1, value2, "visitor");
            return (Criteria) this;
        }

        public Criteria andVisitorNotBetween(Integer value1, Integer value2) {
            addCriterion("Visitor not between", value1, value2, "visitor");
            return (Criteria) this;
        }

        public Criteria andHomeScoreIsNull() {
            addCriterion("HomeScore is null");
            return (Criteria) this;
        }

        public Criteria andHomeScoreIsNotNull() {
            addCriterion("HomeScore is not null");
            return (Criteria) this;
        }

        public Criteria andHomeScoreEqualTo(Short value) {
            addCriterion("HomeScore =", value, "homeScore");
            return (Criteria) this;
        }

        public Criteria andHomeScoreNotEqualTo(Short value) {
            addCriterion("HomeScore <>", value, "homeScore");
            return (Criteria) this;
        }

        public Criteria andHomeScoreGreaterThan(Short value) {
            addCriterion("HomeScore >", value, "homeScore");
            return (Criteria) this;
        }

        public Criteria andHomeScoreGreaterThanOrEqualTo(Short value) {
            addCriterion("HomeScore >=", value, "homeScore");
            return (Criteria) this;
        }

        public Criteria andHomeScoreLessThan(Short value) {
            addCriterion("HomeScore <", value, "homeScore");
            return (Criteria) this;
        }

        public Criteria andHomeScoreLessThanOrEqualTo(Short value) {
            addCriterion("HomeScore <=", value, "homeScore");
            return (Criteria) this;
        }

        public Criteria andHomeScoreIn(List<Short> values) {
            addCriterion("HomeScore in", values, "homeScore");
            return (Criteria) this;
        }

        public Criteria andHomeScoreNotIn(List<Short> values) {
            addCriterion("HomeScore not in", values, "homeScore");
            return (Criteria) this;
        }

        public Criteria andHomeScoreBetween(Short value1, Short value2) {
            addCriterion("HomeScore between", value1, value2, "homeScore");
            return (Criteria) this;
        }

        public Criteria andHomeScoreNotBetween(Short value1, Short value2) {
            addCriterion("HomeScore not between", value1, value2, "homeScore");
            return (Criteria) this;
        }

        public Criteria andGuestScoreIsNull() {
            addCriterion("GuestScore is null");
            return (Criteria) this;
        }

        public Criteria andGuestScoreIsNotNull() {
            addCriterion("GuestScore is not null");
            return (Criteria) this;
        }

        public Criteria andGuestScoreEqualTo(Short value) {
            addCriterion("GuestScore =", value, "guestScore");
            return (Criteria) this;
        }

        public Criteria andGuestScoreNotEqualTo(Short value) {
            addCriterion("GuestScore <>", value, "guestScore");
            return (Criteria) this;
        }

        public Criteria andGuestScoreGreaterThan(Short value) {
            addCriterion("GuestScore >", value, "guestScore");
            return (Criteria) this;
        }

        public Criteria andGuestScoreGreaterThanOrEqualTo(Short value) {
            addCriterion("GuestScore >=", value, "guestScore");
            return (Criteria) this;
        }

        public Criteria andGuestScoreLessThan(Short value) {
            addCriterion("GuestScore <", value, "guestScore");
            return (Criteria) this;
        }

        public Criteria andGuestScoreLessThanOrEqualTo(Short value) {
            addCriterion("GuestScore <=", value, "guestScore");
            return (Criteria) this;
        }

        public Criteria andGuestScoreIn(List<Short> values) {
            addCriterion("GuestScore in", values, "guestScore");
            return (Criteria) this;
        }

        public Criteria andGuestScoreNotIn(List<Short> values) {
            addCriterion("GuestScore not in", values, "guestScore");
            return (Criteria) this;
        }

        public Criteria andGuestScoreBetween(Short value1, Short value2) {
            addCriterion("GuestScore between", value1, value2, "guestScore");
            return (Criteria) this;
        }

        public Criteria andGuestScoreNotBetween(Short value1, Short value2) {
            addCriterion("GuestScore not between", value1, value2, "guestScore");
            return (Criteria) this;
        }

        public Criteria andHomeHalfScoreIsNull() {
            addCriterion("HomeHalfScore is null");
            return (Criteria) this;
        }

        public Criteria andHomeHalfScoreIsNotNull() {
            addCriterion("HomeHalfScore is not null");
            return (Criteria) this;
        }

        public Criteria andHomeHalfScoreEqualTo(Short value) {
            addCriterion("HomeHalfScore =", value, "homeHalfScore");
            return (Criteria) this;
        }

        public Criteria andHomeHalfScoreNotEqualTo(Short value) {
            addCriterion("HomeHalfScore <>", value, "homeHalfScore");
            return (Criteria) this;
        }

        public Criteria andHomeHalfScoreGreaterThan(Short value) {
            addCriterion("HomeHalfScore >", value, "homeHalfScore");
            return (Criteria) this;
        }

        public Criteria andHomeHalfScoreGreaterThanOrEqualTo(Short value) {
            addCriterion("HomeHalfScore >=", value, "homeHalfScore");
            return (Criteria) this;
        }

        public Criteria andHomeHalfScoreLessThan(Short value) {
            addCriterion("HomeHalfScore <", value, "homeHalfScore");
            return (Criteria) this;
        }

        public Criteria andHomeHalfScoreLessThanOrEqualTo(Short value) {
            addCriterion("HomeHalfScore <=", value, "homeHalfScore");
            return (Criteria) this;
        }

        public Criteria andHomeHalfScoreIn(List<Short> values) {
            addCriterion("HomeHalfScore in", values, "homeHalfScore");
            return (Criteria) this;
        }

        public Criteria andHomeHalfScoreNotIn(List<Short> values) {
            addCriterion("HomeHalfScore not in", values, "homeHalfScore");
            return (Criteria) this;
        }

        public Criteria andHomeHalfScoreBetween(Short value1, Short value2) {
            addCriterion("HomeHalfScore between", value1, value2, "homeHalfScore");
            return (Criteria) this;
        }

        public Criteria andHomeHalfScoreNotBetween(Short value1, Short value2) {
            addCriterion("HomeHalfScore not between", value1, value2, "homeHalfScore");
            return (Criteria) this;
        }

        public Criteria andGuestHalfScoreIsNull() {
            addCriterion("GuestHalfScore is null");
            return (Criteria) this;
        }

        public Criteria andGuestHalfScoreIsNotNull() {
            addCriterion("GuestHalfScore is not null");
            return (Criteria) this;
        }

        public Criteria andGuestHalfScoreEqualTo(Short value) {
            addCriterion("GuestHalfScore =", value, "guestHalfScore");
            return (Criteria) this;
        }

        public Criteria andGuestHalfScoreNotEqualTo(Short value) {
            addCriterion("GuestHalfScore <>", value, "guestHalfScore");
            return (Criteria) this;
        }

        public Criteria andGuestHalfScoreGreaterThan(Short value) {
            addCriterion("GuestHalfScore >", value, "guestHalfScore");
            return (Criteria) this;
        }

        public Criteria andGuestHalfScoreGreaterThanOrEqualTo(Short value) {
            addCriterion("GuestHalfScore >=", value, "guestHalfScore");
            return (Criteria) this;
        }

        public Criteria andGuestHalfScoreLessThan(Short value) {
            addCriterion("GuestHalfScore <", value, "guestHalfScore");
            return (Criteria) this;
        }

        public Criteria andGuestHalfScoreLessThanOrEqualTo(Short value) {
            addCriterion("GuestHalfScore <=", value, "guestHalfScore");
            return (Criteria) this;
        }

        public Criteria andGuestHalfScoreIn(List<Short> values) {
            addCriterion("GuestHalfScore in", values, "guestHalfScore");
            return (Criteria) this;
        }

        public Criteria andGuestHalfScoreNotIn(List<Short> values) {
            addCriterion("GuestHalfScore not in", values, "guestHalfScore");
            return (Criteria) this;
        }

        public Criteria andGuestHalfScoreBetween(Short value1, Short value2) {
            addCriterion("GuestHalfScore between", value1, value2, "guestHalfScore");
            return (Criteria) this;
        }

        public Criteria andGuestHalfScoreNotBetween(Short value1, Short value2) {
            addCriterion("GuestHalfScore not between", value1, value2, "guestHalfScore");
            return (Criteria) this;
        }

        public Criteria andHome_RedIsNull() {
            addCriterion("Home_Red is null");
            return (Criteria) this;
        }

        public Criteria andHome_RedIsNotNull() {
            addCriterion("Home_Red is not null");
            return (Criteria) this;
        }

        public Criteria andHome_RedEqualTo(Short value) {
            addCriterion("Home_Red =", value, "home_Red");
            return (Criteria) this;
        }

        public Criteria andHome_RedNotEqualTo(Short value) {
            addCriterion("Home_Red <>", value, "home_Red");
            return (Criteria) this;
        }

        public Criteria andHome_RedGreaterThan(Short value) {
            addCriterion("Home_Red >", value, "home_Red");
            return (Criteria) this;
        }

        public Criteria andHome_RedGreaterThanOrEqualTo(Short value) {
            addCriterion("Home_Red >=", value, "home_Red");
            return (Criteria) this;
        }

        public Criteria andHome_RedLessThan(Short value) {
            addCriterion("Home_Red <", value, "home_Red");
            return (Criteria) this;
        }

        public Criteria andHome_RedLessThanOrEqualTo(Short value) {
            addCriterion("Home_Red <=", value, "home_Red");
            return (Criteria) this;
        }

        public Criteria andHome_RedIn(List<Short> values) {
            addCriterion("Home_Red in", values, "home_Red");
            return (Criteria) this;
        }

        public Criteria andHome_RedNotIn(List<Short> values) {
            addCriterion("Home_Red not in", values, "home_Red");
            return (Criteria) this;
        }

        public Criteria andHome_RedBetween(Short value1, Short value2) {
            addCriterion("Home_Red between", value1, value2, "home_Red");
            return (Criteria) this;
        }

        public Criteria andHome_RedNotBetween(Short value1, Short value2) {
            addCriterion("Home_Red not between", value1, value2, "home_Red");
            return (Criteria) this;
        }

        public Criteria andGuest_RedIsNull() {
            addCriterion("Guest_Red is null");
            return (Criteria) this;
        }

        public Criteria andGuest_RedIsNotNull() {
            addCriterion("Guest_Red is not null");
            return (Criteria) this;
        }

        public Criteria andGuest_RedEqualTo(Short value) {
            addCriterion("Guest_Red =", value, "guest_Red");
            return (Criteria) this;
        }

        public Criteria andGuest_RedNotEqualTo(Short value) {
            addCriterion("Guest_Red <>", value, "guest_Red");
            return (Criteria) this;
        }

        public Criteria andGuest_RedGreaterThan(Short value) {
            addCriterion("Guest_Red >", value, "guest_Red");
            return (Criteria) this;
        }

        public Criteria andGuest_RedGreaterThanOrEqualTo(Short value) {
            addCriterion("Guest_Red >=", value, "guest_Red");
            return (Criteria) this;
        }

        public Criteria andGuest_RedLessThan(Short value) {
            addCriterion("Guest_Red <", value, "guest_Red");
            return (Criteria) this;
        }

        public Criteria andGuest_RedLessThanOrEqualTo(Short value) {
            addCriterion("Guest_Red <=", value, "guest_Red");
            return (Criteria) this;
        }

        public Criteria andGuest_RedIn(List<Short> values) {
            addCriterion("Guest_Red in", values, "guest_Red");
            return (Criteria) this;
        }

        public Criteria andGuest_RedNotIn(List<Short> values) {
            addCriterion("Guest_Red not in", values, "guest_Red");
            return (Criteria) this;
        }

        public Criteria andGuest_RedBetween(Short value1, Short value2) {
            addCriterion("Guest_Red between", value1, value2, "guest_Red");
            return (Criteria) this;
        }

        public Criteria andGuest_RedNotBetween(Short value1, Short value2) {
            addCriterion("Guest_Red not between", value1, value2, "guest_Red");
            return (Criteria) this;
        }

        public Criteria andHome_YellowIsNull() {
            addCriterion("Home_Yellow is null");
            return (Criteria) this;
        }

        public Criteria andHome_YellowIsNotNull() {
            addCriterion("Home_Yellow is not null");
            return (Criteria) this;
        }

        public Criteria andHome_YellowEqualTo(Short value) {
            addCriterion("Home_Yellow =", value, "home_Yellow");
            return (Criteria) this;
        }

        public Criteria andHome_YellowNotEqualTo(Short value) {
            addCriterion("Home_Yellow <>", value, "home_Yellow");
            return (Criteria) this;
        }

        public Criteria andHome_YellowGreaterThan(Short value) {
            addCriterion("Home_Yellow >", value, "home_Yellow");
            return (Criteria) this;
        }

        public Criteria andHome_YellowGreaterThanOrEqualTo(Short value) {
            addCriterion("Home_Yellow >=", value, "home_Yellow");
            return (Criteria) this;
        }

        public Criteria andHome_YellowLessThan(Short value) {
            addCriterion("Home_Yellow <", value, "home_Yellow");
            return (Criteria) this;
        }

        public Criteria andHome_YellowLessThanOrEqualTo(Short value) {
            addCriterion("Home_Yellow <=", value, "home_Yellow");
            return (Criteria) this;
        }

        public Criteria andHome_YellowIn(List<Short> values) {
            addCriterion("Home_Yellow in", values, "home_Yellow");
            return (Criteria) this;
        }

        public Criteria andHome_YellowNotIn(List<Short> values) {
            addCriterion("Home_Yellow not in", values, "home_Yellow");
            return (Criteria) this;
        }

        public Criteria andHome_YellowBetween(Short value1, Short value2) {
            addCriterion("Home_Yellow between", value1, value2, "home_Yellow");
            return (Criteria) this;
        }

        public Criteria andHome_YellowNotBetween(Short value1, Short value2) {
            addCriterion("Home_Yellow not between", value1, value2, "home_Yellow");
            return (Criteria) this;
        }

        public Criteria andGuest_YellowIsNull() {
            addCriterion("Guest_Yellow is null");
            return (Criteria) this;
        }

        public Criteria andGuest_YellowIsNotNull() {
            addCriterion("Guest_Yellow is not null");
            return (Criteria) this;
        }

        public Criteria andGuest_YellowEqualTo(Short value) {
            addCriterion("Guest_Yellow =", value, "guest_Yellow");
            return (Criteria) this;
        }

        public Criteria andGuest_YellowNotEqualTo(Short value) {
            addCriterion("Guest_Yellow <>", value, "guest_Yellow");
            return (Criteria) this;
        }

        public Criteria andGuest_YellowGreaterThan(Short value) {
            addCriterion("Guest_Yellow >", value, "guest_Yellow");
            return (Criteria) this;
        }

        public Criteria andGuest_YellowGreaterThanOrEqualTo(Short value) {
            addCriterion("Guest_Yellow >=", value, "guest_Yellow");
            return (Criteria) this;
        }

        public Criteria andGuest_YellowLessThan(Short value) {
            addCriterion("Guest_Yellow <", value, "guest_Yellow");
            return (Criteria) this;
        }

        public Criteria andGuest_YellowLessThanOrEqualTo(Short value) {
            addCriterion("Guest_Yellow <=", value, "guest_Yellow");
            return (Criteria) this;
        }

        public Criteria andGuest_YellowIn(List<Short> values) {
            addCriterion("Guest_Yellow in", values, "guest_Yellow");
            return (Criteria) this;
        }

        public Criteria andGuest_YellowNotIn(List<Short> values) {
            addCriterion("Guest_Yellow not in", values, "guest_Yellow");
            return (Criteria) this;
        }

        public Criteria andGuest_YellowBetween(Short value1, Short value2) {
            addCriterion("Guest_Yellow between", value1, value2, "guest_Yellow");
            return (Criteria) this;
        }

        public Criteria andGuest_YellowNotBetween(Short value1, Short value2) {
            addCriterion("Guest_Yellow not between", value1, value2, "guest_Yellow");
            return (Criteria) this;
        }

        public Criteria andBf_changetimeIsNull() {
            addCriterion("bf_changetime is null");
            return (Criteria) this;
        }

        public Criteria andBf_changetimeIsNotNull() {
            addCriterion("bf_changetime is not null");
            return (Criteria) this;
        }

        public Criteria andBf_changetimeEqualTo(Date value) {
            addCriterion("bf_changetime =", value, "bf_changetime");
            return (Criteria) this;
        }

        public Criteria andBf_changetimeNotEqualTo(Date value) {
            addCriterion("bf_changetime <>", value, "bf_changetime");
            return (Criteria) this;
        }

        public Criteria andBf_changetimeGreaterThan(Date value) {
            addCriterion("bf_changetime >", value, "bf_changetime");
            return (Criteria) this;
        }

        public Criteria andBf_changetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("bf_changetime >=", value, "bf_changetime");
            return (Criteria) this;
        }

        public Criteria andBf_changetimeLessThan(Date value) {
            addCriterion("bf_changetime <", value, "bf_changetime");
            return (Criteria) this;
        }

        public Criteria andBf_changetimeLessThanOrEqualTo(Date value) {
            addCriterion("bf_changetime <=", value, "bf_changetime");
            return (Criteria) this;
        }

        public Criteria andBf_changetimeIn(List<Date> values) {
            addCriterion("bf_changetime in", values, "bf_changetime");
            return (Criteria) this;
        }

        public Criteria andBf_changetimeNotIn(List<Date> values) {
            addCriterion("bf_changetime not in", values, "bf_changetime");
            return (Criteria) this;
        }

        public Criteria andBf_changetimeBetween(Date value1, Date value2) {
            addCriterion("bf_changetime between", value1, value2, "bf_changetime");
            return (Criteria) this;
        }

        public Criteria andBf_changetimeNotBetween(Date value1, Date value2) {
            addCriterion("bf_changetime not between", value1, value2, "bf_changetime");
            return (Criteria) this;
        }

        public Criteria andShangpanIsNull() {
            addCriterion("shangpan is null");
            return (Criteria) this;
        }

        public Criteria andShangpanIsNotNull() {
            addCriterion("shangpan is not null");
            return (Criteria) this;
        }

        public Criteria andShangpanEqualTo(Byte value) {
            addCriterion("shangpan =", value, "shangpan");
            return (Criteria) this;
        }

        public Criteria andShangpanNotEqualTo(Byte value) {
            addCriterion("shangpan <>", value, "shangpan");
            return (Criteria) this;
        }

        public Criteria andShangpanGreaterThan(Byte value) {
            addCriterion("shangpan >", value, "shangpan");
            return (Criteria) this;
        }

        public Criteria andShangpanGreaterThanOrEqualTo(Byte value) {
            addCriterion("shangpan >=", value, "shangpan");
            return (Criteria) this;
        }

        public Criteria andShangpanLessThan(Byte value) {
            addCriterion("shangpan <", value, "shangpan");
            return (Criteria) this;
        }

        public Criteria andShangpanLessThanOrEqualTo(Byte value) {
            addCriterion("shangpan <=", value, "shangpan");
            return (Criteria) this;
        }

        public Criteria andShangpanIn(List<Byte> values) {
            addCriterion("shangpan in", values, "shangpan");
            return (Criteria) this;
        }

        public Criteria andShangpanNotIn(List<Byte> values) {
            addCriterion("shangpan not in", values, "shangpan");
            return (Criteria) this;
        }

        public Criteria andShangpanBetween(Byte value1, Byte value2) {
            addCriterion("shangpan between", value1, value2, "shangpan");
            return (Criteria) this;
        }

        public Criteria andShangpanNotBetween(Byte value1, Byte value2) {
            addCriterion("shangpan not between", value1, value2, "shangpan");
            return (Criteria) this;
        }

        public Criteria andGrouping2IsNull() {
            addCriterion("grouping2 is null");
            return (Criteria) this;
        }

        public Criteria andGrouping2IsNotNull() {
            addCriterion("grouping2 is not null");
            return (Criteria) this;
        }

        public Criteria andGrouping2EqualTo(String value) {
            addCriterion("grouping2 =", value, "grouping2");
            return (Criteria) this;
        }

        public Criteria andGrouping2NotEqualTo(String value) {
            addCriterion("grouping2 <>", value, "grouping2");
            return (Criteria) this;
        }

        public Criteria andGrouping2GreaterThan(String value) {
            addCriterion("grouping2 >", value, "grouping2");
            return (Criteria) this;
        }

        public Criteria andGrouping2GreaterThanOrEqualTo(String value) {
            addCriterion("grouping2 >=", value, "grouping2");
            return (Criteria) this;
        }

        public Criteria andGrouping2LessThan(String value) {
            addCriterion("grouping2 <", value, "grouping2");
            return (Criteria) this;
        }

        public Criteria andGrouping2LessThanOrEqualTo(String value) {
            addCriterion("grouping2 <=", value, "grouping2");
            return (Criteria) this;
        }

        public Criteria andGrouping2Like(String value) {
            addCriterion("grouping2 like", value, "grouping2");
            return (Criteria) this;
        }

        public Criteria andGrouping2NotLike(String value) {
            addCriterion("grouping2 not like", value, "grouping2");
            return (Criteria) this;
        }

        public Criteria andGrouping2In(List<String> values) {
            addCriterion("grouping2 in", values, "grouping2");
            return (Criteria) this;
        }

        public Criteria andGrouping2NotIn(List<String> values) {
            addCriterion("grouping2 not in", values, "grouping2");
            return (Criteria) this;
        }

        public Criteria andGrouping2Between(String value1, String value2) {
            addCriterion("grouping2 between", value1, value2, "grouping2");
            return (Criteria) this;
        }

        public Criteria andGrouping2NotBetween(String value1, String value2) {
            addCriterion("grouping2 not between", value1, value2, "grouping2");
            return (Criteria) this;
        }

        public Criteria andBfShowIsNull() {
            addCriterion("bfShow is null");
            return (Criteria) this;
        }

        public Criteria andBfShowIsNotNull() {
            addCriterion("bfShow is not null");
            return (Criteria) this;
        }

        public Criteria andBfShowEqualTo(Boolean value) {
            addCriterion("bfShow =", value, "bfShow");
            return (Criteria) this;
        }

        public Criteria andBfShowNotEqualTo(Boolean value) {
            addCriterion("bfShow <>", value, "bfShow");
            return (Criteria) this;
        }

        public Criteria andBfShowGreaterThan(Boolean value) {
            addCriterion("bfShow >", value, "bfShow");
            return (Criteria) this;
        }

        public Criteria andBfShowGreaterThanOrEqualTo(Boolean value) {
            addCriterion("bfShow >=", value, "bfShow");
            return (Criteria) this;
        }

        public Criteria andBfShowLessThan(Boolean value) {
            addCriterion("bfShow <", value, "bfShow");
            return (Criteria) this;
        }

        public Criteria andBfShowLessThanOrEqualTo(Boolean value) {
            addCriterion("bfShow <=", value, "bfShow");
            return (Criteria) this;
        }

        public Criteria andBfShowIn(List<Boolean> values) {
            addCriterion("bfShow in", values, "bfShow");
            return (Criteria) this;
        }

        public Criteria andBfShowNotIn(List<Boolean> values) {
            addCriterion("bfShow not in", values, "bfShow");
            return (Criteria) this;
        }

        public Criteria andBfShowBetween(Boolean value1, Boolean value2) {
            addCriterion("bfShow between", value1, value2, "bfShow");
            return (Criteria) this;
        }

        public Criteria andBfShowNotBetween(Boolean value1, Boolean value2) {
            addCriterion("bfShow not between", value1, value2, "bfShow");
            return (Criteria) this;
        }

        public Criteria andSubSclassIDIsNull() {
            addCriterion("subSclassID is null");
            return (Criteria) this;
        }

        public Criteria andSubSclassIDIsNotNull() {
            addCriterion("subSclassID is not null");
            return (Criteria) this;
        }

        public Criteria andSubSclassIDEqualTo(Integer value) {
            addCriterion("subSclassID =", value, "subSclassID");
            return (Criteria) this;
        }

        public Criteria andSubSclassIDNotEqualTo(Integer value) {
            addCriterion("subSclassID <>", value, "subSclassID");
            return (Criteria) this;
        }

        public Criteria andSubSclassIDGreaterThan(Integer value) {
            addCriterion("subSclassID >", value, "subSclassID");
            return (Criteria) this;
        }

        public Criteria andSubSclassIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("subSclassID >=", value, "subSclassID");
            return (Criteria) this;
        }

        public Criteria andSubSclassIDLessThan(Integer value) {
            addCriterion("subSclassID <", value, "subSclassID");
            return (Criteria) this;
        }

        public Criteria andSubSclassIDLessThanOrEqualTo(Integer value) {
            addCriterion("subSclassID <=", value, "subSclassID");
            return (Criteria) this;
        }

        public Criteria andSubSclassIDIn(List<Integer> values) {
            addCriterion("subSclassID in", values, "subSclassID");
            return (Criteria) this;
        }

        public Criteria andSubSclassIDNotIn(List<Integer> values) {
            addCriterion("subSclassID not in", values, "subSclassID");
            return (Criteria) this;
        }

        public Criteria andSubSclassIDBetween(Integer value1, Integer value2) {
            addCriterion("subSclassID between", value1, value2, "subSclassID");
            return (Criteria) this;
        }

        public Criteria andSubSclassIDNotBetween(Integer value1, Integer value2) {
            addCriterion("subSclassID not between", value1, value2, "subSclassID");
            return (Criteria) this;
        }

        public Criteria andExplainlistIsNull() {
            addCriterion("Explainlist is null");
            return (Criteria) this;
        }

        public Criteria andExplainlistIsNotNull() {
            addCriterion("Explainlist is not null");
            return (Criteria) this;
        }

        public Criteria andExplainlistEqualTo(String value) {
            addCriterion("Explainlist =", value, "explainlist");
            return (Criteria) this;
        }

        public Criteria andExplainlistNotEqualTo(String value) {
            addCriterion("Explainlist <>", value, "explainlist");
            return (Criteria) this;
        }

        public Criteria andExplainlistGreaterThan(String value) {
            addCriterion("Explainlist >", value, "explainlist");
            return (Criteria) this;
        }

        public Criteria andExplainlistGreaterThanOrEqualTo(String value) {
            addCriterion("Explainlist >=", value, "explainlist");
            return (Criteria) this;
        }

        public Criteria andExplainlistLessThan(String value) {
            addCriterion("Explainlist <", value, "explainlist");
            return (Criteria) this;
        }

        public Criteria andExplainlistLessThanOrEqualTo(String value) {
            addCriterion("Explainlist <=", value, "explainlist");
            return (Criteria) this;
        }

        public Criteria andExplainlistLike(String value) {
            addCriterion("Explainlist like", value, "explainlist");
            return (Criteria) this;
        }

        public Criteria andExplainlistNotLike(String value) {
            addCriterion("Explainlist not like", value, "explainlist");
            return (Criteria) this;
        }

        public Criteria andExplainlistIn(List<String> values) {
            addCriterion("Explainlist in", values, "explainlist");
            return (Criteria) this;
        }

        public Criteria andExplainlistNotIn(List<String> values) {
            addCriterion("Explainlist not in", values, "explainlist");
            return (Criteria) this;
        }

        public Criteria andExplainlistBetween(String value1, String value2) {
            addCriterion("Explainlist between", value1, value2, "explainlist");
            return (Criteria) this;
        }

        public Criteria andExplainlistNotBetween(String value1, String value2) {
            addCriterion("Explainlist not between", value1, value2, "explainlist");
            return (Criteria) this;
        }

        public Criteria andVenuesIDIsNull() {
            addCriterion("VenuesID is null");
            return (Criteria) this;
        }

        public Criteria andVenuesIDIsNotNull() {
            addCriterion("VenuesID is not null");
            return (Criteria) this;
        }

        public Criteria andVenuesIDEqualTo(Integer value) {
            addCriterion("VenuesID =", value, "venuesID");
            return (Criteria) this;
        }

        public Criteria andVenuesIDNotEqualTo(Integer value) {
            addCriterion("VenuesID <>", value, "venuesID");
            return (Criteria) this;
        }

        public Criteria andVenuesIDGreaterThan(Integer value) {
            addCriterion("VenuesID >", value, "venuesID");
            return (Criteria) this;
        }

        public Criteria andVenuesIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("VenuesID >=", value, "venuesID");
            return (Criteria) this;
        }

        public Criteria andVenuesIDLessThan(Integer value) {
            addCriterion("VenuesID <", value, "venuesID");
            return (Criteria) this;
        }

        public Criteria andVenuesIDLessThanOrEqualTo(Integer value) {
            addCriterion("VenuesID <=", value, "venuesID");
            return (Criteria) this;
        }

        public Criteria andVenuesIDIn(List<Integer> values) {
            addCriterion("VenuesID in", values, "venuesID");
            return (Criteria) this;
        }

        public Criteria andVenuesIDNotIn(List<Integer> values) {
            addCriterion("VenuesID not in", values, "venuesID");
            return (Criteria) this;
        }

        public Criteria andVenuesIDBetween(Integer value1, Integer value2) {
            addCriterion("VenuesID between", value1, value2, "venuesID");
            return (Criteria) this;
        }

        public Criteria andVenuesIDNotBetween(Integer value1, Integer value2) {
            addCriterion("VenuesID not between", value1, value2, "venuesID");
            return (Criteria) this;
        }

        public Criteria andIsGuessRedIsNull() {
            addCriterion("isGuessRed is null");
            return (Criteria) this;
        }

        public Criteria andIsGuessRedIsNotNull() {
            addCriterion("isGuessRed is not null");
            return (Criteria) this;
        }

        public Criteria andIsGuessRedEqualTo(Boolean value) {
            addCriterion("isGuessRed =", value, "isGuessRed");
            return (Criteria) this;
        }

        public Criteria andIsGuessRedNotEqualTo(Boolean value) {
            addCriterion("isGuessRed <>", value, "isGuessRed");
            return (Criteria) this;
        }

        public Criteria andIsGuessRedGreaterThan(Boolean value) {
            addCriterion("isGuessRed >", value, "isGuessRed");
            return (Criteria) this;
        }

        public Criteria andIsGuessRedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isGuessRed >=", value, "isGuessRed");
            return (Criteria) this;
        }

        public Criteria andIsGuessRedLessThan(Boolean value) {
            addCriterion("isGuessRed <", value, "isGuessRed");
            return (Criteria) this;
        }

        public Criteria andIsGuessRedLessThanOrEqualTo(Boolean value) {
            addCriterion("isGuessRed <=", value, "isGuessRed");
            return (Criteria) this;
        }

        public Criteria andIsGuessRedIn(List<Boolean> values) {
            addCriterion("isGuessRed in", values, "isGuessRed");
            return (Criteria) this;
        }

        public Criteria andIsGuessRedNotIn(List<Boolean> values) {
            addCriterion("isGuessRed not in", values, "isGuessRed");
            return (Criteria) this;
        }

        public Criteria andIsGuessRedBetween(Boolean value1, Boolean value2) {
            addCriterion("isGuessRed between", value1, value2, "isGuessRed");
            return (Criteria) this;
        }

        public Criteria andIsGuessRedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isGuessRed not between", value1, value2, "isGuessRed");
            return (Criteria) this;
        }

        public Criteria andIsLiveIsNull() {
            addCriterion("isLive is null");
            return (Criteria) this;
        }

        public Criteria andIsLiveIsNotNull() {
            addCriterion("isLive is not null");
            return (Criteria) this;
        }

        public Criteria andIsLiveEqualTo(Boolean value) {
            addCriterion("isLive =", value, "isLive");
            return (Criteria) this;
        }

        public Criteria andIsLiveNotEqualTo(Boolean value) {
            addCriterion("isLive <>", value, "isLive");
            return (Criteria) this;
        }

        public Criteria andIsLiveGreaterThan(Boolean value) {
            addCriterion("isLive >", value, "isLive");
            return (Criteria) this;
        }

        public Criteria andIsLiveGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isLive >=", value, "isLive");
            return (Criteria) this;
        }

        public Criteria andIsLiveLessThan(Boolean value) {
            addCriterion("isLive <", value, "isLive");
            return (Criteria) this;
        }

        public Criteria andIsLiveLessThanOrEqualTo(Boolean value) {
            addCriterion("isLive <=", value, "isLive");
            return (Criteria) this;
        }

        public Criteria andIsLiveIn(List<Boolean> values) {
            addCriterion("isLive in", values, "isLive");
            return (Criteria) this;
        }

        public Criteria andIsLiveNotIn(List<Boolean> values) {
            addCriterion("isLive not in", values, "isLive");
            return (Criteria) this;
        }

        public Criteria andIsLiveBetween(Boolean value1, Boolean value2) {
            addCriterion("isLive between", value1, value2, "isLive");
            return (Criteria) this;
        }

        public Criteria andIsLiveNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isLive not between", value1, value2, "isLive");
            return (Criteria) this;
        }

        public Criteria andHomeCornerIsNull() {
            addCriterion("homeCorner is null");
            return (Criteria) this;
        }

        public Criteria andHomeCornerIsNotNull() {
            addCriterion("homeCorner is not null");
            return (Criteria) this;
        }

        public Criteria andHomeCornerEqualTo(Byte value) {
            addCriterion("homeCorner =", value, "homeCorner");
            return (Criteria) this;
        }

        public Criteria andHomeCornerNotEqualTo(Byte value) {
            addCriterion("homeCorner <>", value, "homeCorner");
            return (Criteria) this;
        }

        public Criteria andHomeCornerGreaterThan(Byte value) {
            addCriterion("homeCorner >", value, "homeCorner");
            return (Criteria) this;
        }

        public Criteria andHomeCornerGreaterThanOrEqualTo(Byte value) {
            addCriterion("homeCorner >=", value, "homeCorner");
            return (Criteria) this;
        }

        public Criteria andHomeCornerLessThan(Byte value) {
            addCriterion("homeCorner <", value, "homeCorner");
            return (Criteria) this;
        }

        public Criteria andHomeCornerLessThanOrEqualTo(Byte value) {
            addCriterion("homeCorner <=", value, "homeCorner");
            return (Criteria) this;
        }

        public Criteria andHomeCornerIn(List<Byte> values) {
            addCriterion("homeCorner in", values, "homeCorner");
            return (Criteria) this;
        }

        public Criteria andHomeCornerNotIn(List<Byte> values) {
            addCriterion("homeCorner not in", values, "homeCorner");
            return (Criteria) this;
        }

        public Criteria andHomeCornerBetween(Byte value1, Byte value2) {
            addCriterion("homeCorner between", value1, value2, "homeCorner");
            return (Criteria) this;
        }

        public Criteria andHomeCornerNotBetween(Byte value1, Byte value2) {
            addCriterion("homeCorner not between", value1, value2, "homeCorner");
            return (Criteria) this;
        }

        public Criteria andHomeCornerHalfIsNull() {
            addCriterion("homeCornerHalf is null");
            return (Criteria) this;
        }

        public Criteria andHomeCornerHalfIsNotNull() {
            addCriterion("homeCornerHalf is not null");
            return (Criteria) this;
        }

        public Criteria andHomeCornerHalfEqualTo(Byte value) {
            addCriterion("homeCornerHalf =", value, "homeCornerHalf");
            return (Criteria) this;
        }

        public Criteria andHomeCornerHalfNotEqualTo(Byte value) {
            addCriterion("homeCornerHalf <>", value, "homeCornerHalf");
            return (Criteria) this;
        }

        public Criteria andHomeCornerHalfGreaterThan(Byte value) {
            addCriterion("homeCornerHalf >", value, "homeCornerHalf");
            return (Criteria) this;
        }

        public Criteria andHomeCornerHalfGreaterThanOrEqualTo(Byte value) {
            addCriterion("homeCornerHalf >=", value, "homeCornerHalf");
            return (Criteria) this;
        }

        public Criteria andHomeCornerHalfLessThan(Byte value) {
            addCriterion("homeCornerHalf <", value, "homeCornerHalf");
            return (Criteria) this;
        }

        public Criteria andHomeCornerHalfLessThanOrEqualTo(Byte value) {
            addCriterion("homeCornerHalf <=", value, "homeCornerHalf");
            return (Criteria) this;
        }

        public Criteria andHomeCornerHalfIn(List<Byte> values) {
            addCriterion("homeCornerHalf in", values, "homeCornerHalf");
            return (Criteria) this;
        }

        public Criteria andHomeCornerHalfNotIn(List<Byte> values) {
            addCriterion("homeCornerHalf not in", values, "homeCornerHalf");
            return (Criteria) this;
        }

        public Criteria andHomeCornerHalfBetween(Byte value1, Byte value2) {
            addCriterion("homeCornerHalf between", value1, value2, "homeCornerHalf");
            return (Criteria) this;
        }

        public Criteria andHomeCornerHalfNotBetween(Byte value1, Byte value2) {
            addCriterion("homeCornerHalf not between", value1, value2, "homeCornerHalf");
            return (Criteria) this;
        }

        public Criteria andGuestCornerIsNull() {
            addCriterion("guestCorner is null");
            return (Criteria) this;
        }

        public Criteria andGuestCornerIsNotNull() {
            addCriterion("guestCorner is not null");
            return (Criteria) this;
        }

        public Criteria andGuestCornerEqualTo(Byte value) {
            addCriterion("guestCorner =", value, "guestCorner");
            return (Criteria) this;
        }

        public Criteria andGuestCornerNotEqualTo(Byte value) {
            addCriterion("guestCorner <>", value, "guestCorner");
            return (Criteria) this;
        }

        public Criteria andGuestCornerGreaterThan(Byte value) {
            addCriterion("guestCorner >", value, "guestCorner");
            return (Criteria) this;
        }

        public Criteria andGuestCornerGreaterThanOrEqualTo(Byte value) {
            addCriterion("guestCorner >=", value, "guestCorner");
            return (Criteria) this;
        }

        public Criteria andGuestCornerLessThan(Byte value) {
            addCriterion("guestCorner <", value, "guestCorner");
            return (Criteria) this;
        }

        public Criteria andGuestCornerLessThanOrEqualTo(Byte value) {
            addCriterion("guestCorner <=", value, "guestCorner");
            return (Criteria) this;
        }

        public Criteria andGuestCornerIn(List<Byte> values) {
            addCriterion("guestCorner in", values, "guestCorner");
            return (Criteria) this;
        }

        public Criteria andGuestCornerNotIn(List<Byte> values) {
            addCriterion("guestCorner not in", values, "guestCorner");
            return (Criteria) this;
        }

        public Criteria andGuestCornerBetween(Byte value1, Byte value2) {
            addCriterion("guestCorner between", value1, value2, "guestCorner");
            return (Criteria) this;
        }

        public Criteria andGuestCornerNotBetween(Byte value1, Byte value2) {
            addCriterion("guestCorner not between", value1, value2, "guestCorner");
            return (Criteria) this;
        }

        public Criteria andGuestCornerHalfIsNull() {
            addCriterion("guestCornerHalf is null");
            return (Criteria) this;
        }

        public Criteria andGuestCornerHalfIsNotNull() {
            addCriterion("guestCornerHalf is not null");
            return (Criteria) this;
        }

        public Criteria andGuestCornerHalfEqualTo(Byte value) {
            addCriterion("guestCornerHalf =", value, "guestCornerHalf");
            return (Criteria) this;
        }

        public Criteria andGuestCornerHalfNotEqualTo(Byte value) {
            addCriterion("guestCornerHalf <>", value, "guestCornerHalf");
            return (Criteria) this;
        }

        public Criteria andGuestCornerHalfGreaterThan(Byte value) {
            addCriterion("guestCornerHalf >", value, "guestCornerHalf");
            return (Criteria) this;
        }

        public Criteria andGuestCornerHalfGreaterThanOrEqualTo(Byte value) {
            addCriterion("guestCornerHalf >=", value, "guestCornerHalf");
            return (Criteria) this;
        }

        public Criteria andGuestCornerHalfLessThan(Byte value) {
            addCriterion("guestCornerHalf <", value, "guestCornerHalf");
            return (Criteria) this;
        }

        public Criteria andGuestCornerHalfLessThanOrEqualTo(Byte value) {
            addCriterion("guestCornerHalf <=", value, "guestCornerHalf");
            return (Criteria) this;
        }

        public Criteria andGuestCornerHalfIn(List<Byte> values) {
            addCriterion("guestCornerHalf in", values, "guestCornerHalf");
            return (Criteria) this;
        }

        public Criteria andGuestCornerHalfNotIn(List<Byte> values) {
            addCriterion("guestCornerHalf not in", values, "guestCornerHalf");
            return (Criteria) this;
        }

        public Criteria andGuestCornerHalfBetween(Byte value1, Byte value2) {
            addCriterion("guestCornerHalf between", value1, value2, "guestCornerHalf");
            return (Criteria) this;
        }

        public Criteria andGuestCornerHalfNotBetween(Byte value1, Byte value2) {
            addCriterion("guestCornerHalf not between", value1, value2, "guestCornerHalf");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}