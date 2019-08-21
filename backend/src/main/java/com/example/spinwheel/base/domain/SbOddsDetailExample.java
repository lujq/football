package com.example.spinwheel.base.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SbOddsDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SbOddsDetailExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andScheduleIDIsNull() {
            addCriterion("scheduleID is null");
            return (Criteria) this;
        }

        public Criteria andScheduleIDIsNotNull() {
            addCriterion("scheduleID is not null");
            return (Criteria) this;
        }

        public Criteria andScheduleIDEqualTo(Integer value) {
            addCriterion("scheduleID =", value, "scheduleID");
            return (Criteria) this;
        }

        public Criteria andScheduleIDNotEqualTo(Integer value) {
            addCriterion("scheduleID <>", value, "scheduleID");
            return (Criteria) this;
        }

        public Criteria andScheduleIDGreaterThan(Integer value) {
            addCriterion("scheduleID >", value, "scheduleID");
            return (Criteria) this;
        }

        public Criteria andScheduleIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("scheduleID >=", value, "scheduleID");
            return (Criteria) this;
        }

        public Criteria andScheduleIDLessThan(Integer value) {
            addCriterion("scheduleID <", value, "scheduleID");
            return (Criteria) this;
        }

        public Criteria andScheduleIDLessThanOrEqualTo(Integer value) {
            addCriterion("scheduleID <=", value, "scheduleID");
            return (Criteria) this;
        }

        public Criteria andScheduleIDIn(List<Integer> values) {
            addCriterion("scheduleID in", values, "scheduleID");
            return (Criteria) this;
        }

        public Criteria andScheduleIDNotIn(List<Integer> values) {
            addCriterion("scheduleID not in", values, "scheduleID");
            return (Criteria) this;
        }

        public Criteria andScheduleIDBetween(Integer value1, Integer value2) {
            addCriterion("scheduleID between", value1, value2, "scheduleID");
            return (Criteria) this;
        }

        public Criteria andScheduleIDNotBetween(Integer value1, Integer value2) {
            addCriterion("scheduleID not between", value1, value2, "scheduleID");
            return (Criteria) this;
        }

        public Criteria andHappenTimeIsNull() {
            addCriterion("HappenTime is null");
            return (Criteria) this;
        }

        public Criteria andHappenTimeIsNotNull() {
            addCriterion("HappenTime is not null");
            return (Criteria) this;
        }

        public Criteria andHappenTimeEqualTo(String value) {
            addCriterion("HappenTime =", value, "happenTime");
            return (Criteria) this;
        }

        public Criteria andHappenTimeNotEqualTo(String value) {
            addCriterion("HappenTime <>", value, "happenTime");
            return (Criteria) this;
        }

        public Criteria andHappenTimeGreaterThan(String value) {
            addCriterion("HappenTime >", value, "happenTime");
            return (Criteria) this;
        }

        public Criteria andHappenTimeGreaterThanOrEqualTo(String value) {
            addCriterion("HappenTime >=", value, "happenTime");
            return (Criteria) this;
        }

        public Criteria andHappenTimeLessThan(String value) {
            addCriterion("HappenTime <", value, "happenTime");
            return (Criteria) this;
        }

        public Criteria andHappenTimeLessThanOrEqualTo(String value) {
            addCriterion("HappenTime <=", value, "happenTime");
            return (Criteria) this;
        }

        public Criteria andHappenTimeLike(String value) {
            addCriterion("HappenTime like", value, "happenTime");
            return (Criteria) this;
        }

        public Criteria andHappenTimeNotLike(String value) {
            addCriterion("HappenTime not like", value, "happenTime");
            return (Criteria) this;
        }

        public Criteria andHappenTimeIn(List<String> values) {
            addCriterion("HappenTime in", values, "happenTime");
            return (Criteria) this;
        }

        public Criteria andHappenTimeNotIn(List<String> values) {
            addCriterion("HappenTime not in", values, "happenTime");
            return (Criteria) this;
        }

        public Criteria andHappenTimeBetween(String value1, String value2) {
            addCriterion("HappenTime between", value1, value2, "happenTime");
            return (Criteria) this;
        }

        public Criteria andHappenTimeNotBetween(String value1, String value2) {
            addCriterion("HappenTime not between", value1, value2, "happenTime");
            return (Criteria) this;
        }

        public Criteria andHomeScoreIsNull() {
            addCriterion("homeScore is null");
            return (Criteria) this;
        }

        public Criteria andHomeScoreIsNotNull() {
            addCriterion("homeScore is not null");
            return (Criteria) this;
        }

        public Criteria andHomeScoreEqualTo(Short value) {
            addCriterion("homeScore =", value, "homeScore");
            return (Criteria) this;
        }

        public Criteria andHomeScoreNotEqualTo(Short value) {
            addCriterion("homeScore <>", value, "homeScore");
            return (Criteria) this;
        }

        public Criteria andHomeScoreGreaterThan(Short value) {
            addCriterion("homeScore >", value, "homeScore");
            return (Criteria) this;
        }

        public Criteria andHomeScoreGreaterThanOrEqualTo(Short value) {
            addCriterion("homeScore >=", value, "homeScore");
            return (Criteria) this;
        }

        public Criteria andHomeScoreLessThan(Short value) {
            addCriterion("homeScore <", value, "homeScore");
            return (Criteria) this;
        }

        public Criteria andHomeScoreLessThanOrEqualTo(Short value) {
            addCriterion("homeScore <=", value, "homeScore");
            return (Criteria) this;
        }

        public Criteria andHomeScoreIn(List<Short> values) {
            addCriterion("homeScore in", values, "homeScore");
            return (Criteria) this;
        }

        public Criteria andHomeScoreNotIn(List<Short> values) {
            addCriterion("homeScore not in", values, "homeScore");
            return (Criteria) this;
        }

        public Criteria andHomeScoreBetween(Short value1, Short value2) {
            addCriterion("homeScore between", value1, value2, "homeScore");
            return (Criteria) this;
        }

        public Criteria andHomeScoreNotBetween(Short value1, Short value2) {
            addCriterion("homeScore not between", value1, value2, "homeScore");
            return (Criteria) this;
        }

        public Criteria andGuestScoreIsNull() {
            addCriterion("guestScore is null");
            return (Criteria) this;
        }

        public Criteria andGuestScoreIsNotNull() {
            addCriterion("guestScore is not null");
            return (Criteria) this;
        }

        public Criteria andGuestScoreEqualTo(Short value) {
            addCriterion("guestScore =", value, "guestScore");
            return (Criteria) this;
        }

        public Criteria andGuestScoreNotEqualTo(Short value) {
            addCriterion("guestScore <>", value, "guestScore");
            return (Criteria) this;
        }

        public Criteria andGuestScoreGreaterThan(Short value) {
            addCriterion("guestScore >", value, "guestScore");
            return (Criteria) this;
        }

        public Criteria andGuestScoreGreaterThanOrEqualTo(Short value) {
            addCriterion("guestScore >=", value, "guestScore");
            return (Criteria) this;
        }

        public Criteria andGuestScoreLessThan(Short value) {
            addCriterion("guestScore <", value, "guestScore");
            return (Criteria) this;
        }

        public Criteria andGuestScoreLessThanOrEqualTo(Short value) {
            addCriterion("guestScore <=", value, "guestScore");
            return (Criteria) this;
        }

        public Criteria andGuestScoreIn(List<Short> values) {
            addCriterion("guestScore in", values, "guestScore");
            return (Criteria) this;
        }

        public Criteria andGuestScoreNotIn(List<Short> values) {
            addCriterion("guestScore not in", values, "guestScore");
            return (Criteria) this;
        }

        public Criteria andGuestScoreBetween(Short value1, Short value2) {
            addCriterion("guestScore between", value1, value2, "guestScore");
            return (Criteria) this;
        }

        public Criteria andGuestScoreNotBetween(Short value1, Short value2) {
            addCriterion("guestScore not between", value1, value2, "guestScore");
            return (Criteria) this;
        }

        public Criteria andUpOddsIsNull() {
            addCriterion("upOdds is null");
            return (Criteria) this;
        }

        public Criteria andUpOddsIsNotNull() {
            addCriterion("upOdds is not null");
            return (Criteria) this;
        }

        public Criteria andUpOddsEqualTo(Double value) {
            addCriterion("upOdds =", value, "upOdds");
            return (Criteria) this;
        }

        public Criteria andUpOddsNotEqualTo(Double value) {
            addCriterion("upOdds <>", value, "upOdds");
            return (Criteria) this;
        }

        public Criteria andUpOddsGreaterThan(Double value) {
            addCriterion("upOdds >", value, "upOdds");
            return (Criteria) this;
        }

        public Criteria andUpOddsGreaterThanOrEqualTo(Double value) {
            addCriterion("upOdds >=", value, "upOdds");
            return (Criteria) this;
        }

        public Criteria andUpOddsLessThan(Double value) {
            addCriterion("upOdds <", value, "upOdds");
            return (Criteria) this;
        }

        public Criteria andUpOddsLessThanOrEqualTo(Double value) {
            addCriterion("upOdds <=", value, "upOdds");
            return (Criteria) this;
        }

        public Criteria andUpOddsIn(List<Double> values) {
            addCriterion("upOdds in", values, "upOdds");
            return (Criteria) this;
        }

        public Criteria andUpOddsNotIn(List<Double> values) {
            addCriterion("upOdds not in", values, "upOdds");
            return (Criteria) this;
        }

        public Criteria andUpOddsBetween(Double value1, Double value2) {
            addCriterion("upOdds between", value1, value2, "upOdds");
            return (Criteria) this;
        }

        public Criteria andUpOddsNotBetween(Double value1, Double value2) {
            addCriterion("upOdds not between", value1, value2, "upOdds");
            return (Criteria) this;
        }

        public Criteria andGoalIsNull() {
            addCriterion("goal is null");
            return (Criteria) this;
        }

        public Criteria andGoalIsNotNull() {
            addCriterion("goal is not null");
            return (Criteria) this;
        }

        public Criteria andGoalEqualTo(Double value) {
            addCriterion("goal =", value, "goal");
            return (Criteria) this;
        }

        public Criteria andGoalNotEqualTo(Double value) {
            addCriterion("goal <>", value, "goal");
            return (Criteria) this;
        }

        public Criteria andGoalGreaterThan(Double value) {
            addCriterion("goal >", value, "goal");
            return (Criteria) this;
        }

        public Criteria andGoalGreaterThanOrEqualTo(Double value) {
            addCriterion("goal >=", value, "goal");
            return (Criteria) this;
        }

        public Criteria andGoalLessThan(Double value) {
            addCriterion("goal <", value, "goal");
            return (Criteria) this;
        }

        public Criteria andGoalLessThanOrEqualTo(Double value) {
            addCriterion("goal <=", value, "goal");
            return (Criteria) this;
        }

        public Criteria andGoalIn(List<Double> values) {
            addCriterion("goal in", values, "goal");
            return (Criteria) this;
        }

        public Criteria andGoalNotIn(List<Double> values) {
            addCriterion("goal not in", values, "goal");
            return (Criteria) this;
        }

        public Criteria andGoalBetween(Double value1, Double value2) {
            addCriterion("goal between", value1, value2, "goal");
            return (Criteria) this;
        }

        public Criteria andGoalNotBetween(Double value1, Double value2) {
            addCriterion("goal not between", value1, value2, "goal");
            return (Criteria) this;
        }

        public Criteria andDownOddsIsNull() {
            addCriterion("downOdds is null");
            return (Criteria) this;
        }

        public Criteria andDownOddsIsNotNull() {
            addCriterion("downOdds is not null");
            return (Criteria) this;
        }

        public Criteria andDownOddsEqualTo(Double value) {
            addCriterion("downOdds =", value, "downOdds");
            return (Criteria) this;
        }

        public Criteria andDownOddsNotEqualTo(Double value) {
            addCriterion("downOdds <>", value, "downOdds");
            return (Criteria) this;
        }

        public Criteria andDownOddsGreaterThan(Double value) {
            addCriterion("downOdds >", value, "downOdds");
            return (Criteria) this;
        }

        public Criteria andDownOddsGreaterThanOrEqualTo(Double value) {
            addCriterion("downOdds >=", value, "downOdds");
            return (Criteria) this;
        }

        public Criteria andDownOddsLessThan(Double value) {
            addCriterion("downOdds <", value, "downOdds");
            return (Criteria) this;
        }

        public Criteria andDownOddsLessThanOrEqualTo(Double value) {
            addCriterion("downOdds <=", value, "downOdds");
            return (Criteria) this;
        }

        public Criteria andDownOddsIn(List<Double> values) {
            addCriterion("downOdds in", values, "downOdds");
            return (Criteria) this;
        }

        public Criteria andDownOddsNotIn(List<Double> values) {
            addCriterion("downOdds not in", values, "downOdds");
            return (Criteria) this;
        }

        public Criteria andDownOddsBetween(Double value1, Double value2) {
            addCriterion("downOdds between", value1, value2, "downOdds");
            return (Criteria) this;
        }

        public Criteria andDownOddsNotBetween(Double value1, Double value2) {
            addCriterion("downOdds not between", value1, value2, "downOdds");
            return (Criteria) this;
        }

        public Criteria andHomeRedIsNull() {
            addCriterion("homeRed is null");
            return (Criteria) this;
        }

        public Criteria andHomeRedIsNotNull() {
            addCriterion("homeRed is not null");
            return (Criteria) this;
        }

        public Criteria andHomeRedEqualTo(Integer value) {
            addCriterion("homeRed =", value, "homeRed");
            return (Criteria) this;
        }

        public Criteria andHomeRedNotEqualTo(Integer value) {
            addCriterion("homeRed <>", value, "homeRed");
            return (Criteria) this;
        }

        public Criteria andHomeRedGreaterThan(Integer value) {
            addCriterion("homeRed >", value, "homeRed");
            return (Criteria) this;
        }

        public Criteria andHomeRedGreaterThanOrEqualTo(Integer value) {
            addCriterion("homeRed >=", value, "homeRed");
            return (Criteria) this;
        }

        public Criteria andHomeRedLessThan(Integer value) {
            addCriterion("homeRed <", value, "homeRed");
            return (Criteria) this;
        }

        public Criteria andHomeRedLessThanOrEqualTo(Integer value) {
            addCriterion("homeRed <=", value, "homeRed");
            return (Criteria) this;
        }

        public Criteria andHomeRedIn(List<Integer> values) {
            addCriterion("homeRed in", values, "homeRed");
            return (Criteria) this;
        }

        public Criteria andHomeRedNotIn(List<Integer> values) {
            addCriterion("homeRed not in", values, "homeRed");
            return (Criteria) this;
        }

        public Criteria andHomeRedBetween(Integer value1, Integer value2) {
            addCriterion("homeRed between", value1, value2, "homeRed");
            return (Criteria) this;
        }

        public Criteria andHomeRedNotBetween(Integer value1, Integer value2) {
            addCriterion("homeRed not between", value1, value2, "homeRed");
            return (Criteria) this;
        }

        public Criteria andGuestRedIsNull() {
            addCriterion("guestRed is null");
            return (Criteria) this;
        }

        public Criteria andGuestRedIsNotNull() {
            addCriterion("guestRed is not null");
            return (Criteria) this;
        }

        public Criteria andGuestRedEqualTo(Integer value) {
            addCriterion("guestRed =", value, "guestRed");
            return (Criteria) this;
        }

        public Criteria andGuestRedNotEqualTo(Integer value) {
            addCriterion("guestRed <>", value, "guestRed");
            return (Criteria) this;
        }

        public Criteria andGuestRedGreaterThan(Integer value) {
            addCriterion("guestRed >", value, "guestRed");
            return (Criteria) this;
        }

        public Criteria andGuestRedGreaterThanOrEqualTo(Integer value) {
            addCriterion("guestRed >=", value, "guestRed");
            return (Criteria) this;
        }

        public Criteria andGuestRedLessThan(Integer value) {
            addCriterion("guestRed <", value, "guestRed");
            return (Criteria) this;
        }

        public Criteria andGuestRedLessThanOrEqualTo(Integer value) {
            addCriterion("guestRed <=", value, "guestRed");
            return (Criteria) this;
        }

        public Criteria andGuestRedIn(List<Integer> values) {
            addCriterion("guestRed in", values, "guestRed");
            return (Criteria) this;
        }

        public Criteria andGuestRedNotIn(List<Integer> values) {
            addCriterion("guestRed not in", values, "guestRed");
            return (Criteria) this;
        }

        public Criteria andGuestRedBetween(Integer value1, Integer value2) {
            addCriterion("guestRed between", value1, value2, "guestRed");
            return (Criteria) this;
        }

        public Criteria andGuestRedNotBetween(Integer value1, Integer value2) {
            addCriterion("guestRed not between", value1, value2, "guestRed");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andModifytimeIsNull() {
            addCriterion("modifytime is null");
            return (Criteria) this;
        }

        public Criteria andModifytimeIsNotNull() {
            addCriterion("modifytime is not null");
            return (Criteria) this;
        }

        public Criteria andModifytimeEqualTo(Date value) {
            addCriterion("modifytime =", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeNotEqualTo(Date value) {
            addCriterion("modifytime <>", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeGreaterThan(Date value) {
            addCriterion("modifytime >", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("modifytime >=", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeLessThan(Date value) {
            addCriterion("modifytime <", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeLessThanOrEqualTo(Date value) {
            addCriterion("modifytime <=", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeIn(List<Date> values) {
            addCriterion("modifytime in", values, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeNotIn(List<Date> values) {
            addCriterion("modifytime not in", values, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeBetween(Date value1, Date value2) {
            addCriterion("modifytime between", value1, value2, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeNotBetween(Date value1, Date value2) {
            addCriterion("modifytime not between", value1, value2, "modifytime");
            return (Criteria) this;
        }

        public Criteria andCompanyIDIsNull() {
            addCriterion("CompanyID is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIDIsNotNull() {
            addCriterion("CompanyID is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIDEqualTo(Integer value) {
            addCriterion("CompanyID =", value, "companyID");
            return (Criteria) this;
        }

        public Criteria andCompanyIDNotEqualTo(Integer value) {
            addCriterion("CompanyID <>", value, "companyID");
            return (Criteria) this;
        }

        public Criteria andCompanyIDGreaterThan(Integer value) {
            addCriterion("CompanyID >", value, "companyID");
            return (Criteria) this;
        }

        public Criteria andCompanyIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("CompanyID >=", value, "companyID");
            return (Criteria) this;
        }

        public Criteria andCompanyIDLessThan(Integer value) {
            addCriterion("CompanyID <", value, "companyID");
            return (Criteria) this;
        }

        public Criteria andCompanyIDLessThanOrEqualTo(Integer value) {
            addCriterion("CompanyID <=", value, "companyID");
            return (Criteria) this;
        }

        public Criteria andCompanyIDIn(List<Integer> values) {
            addCriterion("CompanyID in", values, "companyID");
            return (Criteria) this;
        }

        public Criteria andCompanyIDNotIn(List<Integer> values) {
            addCriterion("CompanyID not in", values, "companyID");
            return (Criteria) this;
        }

        public Criteria andCompanyIDBetween(Integer value1, Integer value2) {
            addCriterion("CompanyID between", value1, value2, "companyID");
            return (Criteria) this;
        }

        public Criteria andCompanyIDNotBetween(Integer value1, Integer value2) {
            addCriterion("CompanyID not between", value1, value2, "companyID");
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