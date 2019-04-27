package com.example.spinwheel.base.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TotalScoreExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TotalScoreExample() {
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

        public Criteria andOddsIDIsNull() {
            addCriterion("OddsID is null");
            return (Criteria) this;
        }

        public Criteria andOddsIDIsNotNull() {
            addCriterion("OddsID is not null");
            return (Criteria) this;
        }

        public Criteria andOddsIDEqualTo(Integer value) {
            addCriterion("OddsID =", value, "oddsID");
            return (Criteria) this;
        }

        public Criteria andOddsIDNotEqualTo(Integer value) {
            addCriterion("OddsID <>", value, "oddsID");
            return (Criteria) this;
        }

        public Criteria andOddsIDGreaterThan(Integer value) {
            addCriterion("OddsID >", value, "oddsID");
            return (Criteria) this;
        }

        public Criteria andOddsIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("OddsID >=", value, "oddsID");
            return (Criteria) this;
        }

        public Criteria andOddsIDLessThan(Integer value) {
            addCriterion("OddsID <", value, "oddsID");
            return (Criteria) this;
        }

        public Criteria andOddsIDLessThanOrEqualTo(Integer value) {
            addCriterion("OddsID <=", value, "oddsID");
            return (Criteria) this;
        }

        public Criteria andOddsIDIn(List<Integer> values) {
            addCriterion("OddsID in", values, "oddsID");
            return (Criteria) this;
        }

        public Criteria andOddsIDNotIn(List<Integer> values) {
            addCriterion("OddsID not in", values, "oddsID");
            return (Criteria) this;
        }

        public Criteria andOddsIDBetween(Integer value1, Integer value2) {
            addCriterion("OddsID between", value1, value2, "oddsID");
            return (Criteria) this;
        }

        public Criteria andOddsIDNotBetween(Integer value1, Integer value2) {
            addCriterion("OddsID not between", value1, value2, "oddsID");
            return (Criteria) this;
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

        public Criteria andFirstGoalIsNull() {
            addCriterion("FirstGoal is null");
            return (Criteria) this;
        }

        public Criteria andFirstGoalIsNotNull() {
            addCriterion("FirstGoal is not null");
            return (Criteria) this;
        }

        public Criteria andFirstGoalEqualTo(Float value) {
            addCriterion("FirstGoal =", value, "firstGoal");
            return (Criteria) this;
        }

        public Criteria andFirstGoalNotEqualTo(Float value) {
            addCriterion("FirstGoal <>", value, "firstGoal");
            return (Criteria) this;
        }

        public Criteria andFirstGoalGreaterThan(Float value) {
            addCriterion("FirstGoal >", value, "firstGoal");
            return (Criteria) this;
        }

        public Criteria andFirstGoalGreaterThanOrEqualTo(Float value) {
            addCriterion("FirstGoal >=", value, "firstGoal");
            return (Criteria) this;
        }

        public Criteria andFirstGoalLessThan(Float value) {
            addCriterion("FirstGoal <", value, "firstGoal");
            return (Criteria) this;
        }

        public Criteria andFirstGoalLessThanOrEqualTo(Float value) {
            addCriterion("FirstGoal <=", value, "firstGoal");
            return (Criteria) this;
        }

        public Criteria andFirstGoalIn(List<Float> values) {
            addCriterion("FirstGoal in", values, "firstGoal");
            return (Criteria) this;
        }

        public Criteria andFirstGoalNotIn(List<Float> values) {
            addCriterion("FirstGoal not in", values, "firstGoal");
            return (Criteria) this;
        }

        public Criteria andFirstGoalBetween(Float value1, Float value2) {
            addCriterion("FirstGoal between", value1, value2, "firstGoal");
            return (Criteria) this;
        }

        public Criteria andFirstGoalNotBetween(Float value1, Float value2) {
            addCriterion("FirstGoal not between", value1, value2, "firstGoal");
            return (Criteria) this;
        }

        public Criteria andFirstUpoddsIsNull() {
            addCriterion("FirstUpodds is null");
            return (Criteria) this;
        }

        public Criteria andFirstUpoddsIsNotNull() {
            addCriterion("FirstUpodds is not null");
            return (Criteria) this;
        }

        public Criteria andFirstUpoddsEqualTo(Float value) {
            addCriterion("FirstUpodds =", value, "firstUpodds");
            return (Criteria) this;
        }

        public Criteria andFirstUpoddsNotEqualTo(Float value) {
            addCriterion("FirstUpodds <>", value, "firstUpodds");
            return (Criteria) this;
        }

        public Criteria andFirstUpoddsGreaterThan(Float value) {
            addCriterion("FirstUpodds >", value, "firstUpodds");
            return (Criteria) this;
        }

        public Criteria andFirstUpoddsGreaterThanOrEqualTo(Float value) {
            addCriterion("FirstUpodds >=", value, "firstUpodds");
            return (Criteria) this;
        }

        public Criteria andFirstUpoddsLessThan(Float value) {
            addCriterion("FirstUpodds <", value, "firstUpodds");
            return (Criteria) this;
        }

        public Criteria andFirstUpoddsLessThanOrEqualTo(Float value) {
            addCriterion("FirstUpodds <=", value, "firstUpodds");
            return (Criteria) this;
        }

        public Criteria andFirstUpoddsIn(List<Float> values) {
            addCriterion("FirstUpodds in", values, "firstUpodds");
            return (Criteria) this;
        }

        public Criteria andFirstUpoddsNotIn(List<Float> values) {
            addCriterion("FirstUpodds not in", values, "firstUpodds");
            return (Criteria) this;
        }

        public Criteria andFirstUpoddsBetween(Float value1, Float value2) {
            addCriterion("FirstUpodds between", value1, value2, "firstUpodds");
            return (Criteria) this;
        }

        public Criteria andFirstUpoddsNotBetween(Float value1, Float value2) {
            addCriterion("FirstUpodds not between", value1, value2, "firstUpodds");
            return (Criteria) this;
        }

        public Criteria andFirstDownoddsIsNull() {
            addCriterion("FirstDownodds is null");
            return (Criteria) this;
        }

        public Criteria andFirstDownoddsIsNotNull() {
            addCriterion("FirstDownodds is not null");
            return (Criteria) this;
        }

        public Criteria andFirstDownoddsEqualTo(Float value) {
            addCriterion("FirstDownodds =", value, "firstDownodds");
            return (Criteria) this;
        }

        public Criteria andFirstDownoddsNotEqualTo(Float value) {
            addCriterion("FirstDownodds <>", value, "firstDownodds");
            return (Criteria) this;
        }

        public Criteria andFirstDownoddsGreaterThan(Float value) {
            addCriterion("FirstDownodds >", value, "firstDownodds");
            return (Criteria) this;
        }

        public Criteria andFirstDownoddsGreaterThanOrEqualTo(Float value) {
            addCriterion("FirstDownodds >=", value, "firstDownodds");
            return (Criteria) this;
        }

        public Criteria andFirstDownoddsLessThan(Float value) {
            addCriterion("FirstDownodds <", value, "firstDownodds");
            return (Criteria) this;
        }

        public Criteria andFirstDownoddsLessThanOrEqualTo(Float value) {
            addCriterion("FirstDownodds <=", value, "firstDownodds");
            return (Criteria) this;
        }

        public Criteria andFirstDownoddsIn(List<Float> values) {
            addCriterion("FirstDownodds in", values, "firstDownodds");
            return (Criteria) this;
        }

        public Criteria andFirstDownoddsNotIn(List<Float> values) {
            addCriterion("FirstDownodds not in", values, "firstDownodds");
            return (Criteria) this;
        }

        public Criteria andFirstDownoddsBetween(Float value1, Float value2) {
            addCriterion("FirstDownodds between", value1, value2, "firstDownodds");
            return (Criteria) this;
        }

        public Criteria andFirstDownoddsNotBetween(Float value1, Float value2) {
            addCriterion("FirstDownodds not between", value1, value2, "firstDownodds");
            return (Criteria) this;
        }

        public Criteria andGoalIsNull() {
            addCriterion("Goal is null");
            return (Criteria) this;
        }

        public Criteria andGoalIsNotNull() {
            addCriterion("Goal is not null");
            return (Criteria) this;
        }

        public Criteria andGoalEqualTo(Float value) {
            addCriterion("Goal =", value, "goal");
            return (Criteria) this;
        }

        public Criteria andGoalNotEqualTo(Float value) {
            addCriterion("Goal <>", value, "goal");
            return (Criteria) this;
        }

        public Criteria andGoalGreaterThan(Float value) {
            addCriterion("Goal >", value, "goal");
            return (Criteria) this;
        }

        public Criteria andGoalGreaterThanOrEqualTo(Float value) {
            addCriterion("Goal >=", value, "goal");
            return (Criteria) this;
        }

        public Criteria andGoalLessThan(Float value) {
            addCriterion("Goal <", value, "goal");
            return (Criteria) this;
        }

        public Criteria andGoalLessThanOrEqualTo(Float value) {
            addCriterion("Goal <=", value, "goal");
            return (Criteria) this;
        }

        public Criteria andGoalIn(List<Float> values) {
            addCriterion("Goal in", values, "goal");
            return (Criteria) this;
        }

        public Criteria andGoalNotIn(List<Float> values) {
            addCriterion("Goal not in", values, "goal");
            return (Criteria) this;
        }

        public Criteria andGoalBetween(Float value1, Float value2) {
            addCriterion("Goal between", value1, value2, "goal");
            return (Criteria) this;
        }

        public Criteria andGoalNotBetween(Float value1, Float value2) {
            addCriterion("Goal not between", value1, value2, "goal");
            return (Criteria) this;
        }

        public Criteria andUpOddsIsNull() {
            addCriterion("UpOdds is null");
            return (Criteria) this;
        }

        public Criteria andUpOddsIsNotNull() {
            addCriterion("UpOdds is not null");
            return (Criteria) this;
        }

        public Criteria andUpOddsEqualTo(Float value) {
            addCriterion("UpOdds =", value, "upOdds");
            return (Criteria) this;
        }

        public Criteria andUpOddsNotEqualTo(Float value) {
            addCriterion("UpOdds <>", value, "upOdds");
            return (Criteria) this;
        }

        public Criteria andUpOddsGreaterThan(Float value) {
            addCriterion("UpOdds >", value, "upOdds");
            return (Criteria) this;
        }

        public Criteria andUpOddsGreaterThanOrEqualTo(Float value) {
            addCriterion("UpOdds >=", value, "upOdds");
            return (Criteria) this;
        }

        public Criteria andUpOddsLessThan(Float value) {
            addCriterion("UpOdds <", value, "upOdds");
            return (Criteria) this;
        }

        public Criteria andUpOddsLessThanOrEqualTo(Float value) {
            addCriterion("UpOdds <=", value, "upOdds");
            return (Criteria) this;
        }

        public Criteria andUpOddsIn(List<Float> values) {
            addCriterion("UpOdds in", values, "upOdds");
            return (Criteria) this;
        }

        public Criteria andUpOddsNotIn(List<Float> values) {
            addCriterion("UpOdds not in", values, "upOdds");
            return (Criteria) this;
        }

        public Criteria andUpOddsBetween(Float value1, Float value2) {
            addCriterion("UpOdds between", value1, value2, "upOdds");
            return (Criteria) this;
        }

        public Criteria andUpOddsNotBetween(Float value1, Float value2) {
            addCriterion("UpOdds not between", value1, value2, "upOdds");
            return (Criteria) this;
        }

        public Criteria andDownOddsIsNull() {
            addCriterion("DownOdds is null");
            return (Criteria) this;
        }

        public Criteria andDownOddsIsNotNull() {
            addCriterion("DownOdds is not null");
            return (Criteria) this;
        }

        public Criteria andDownOddsEqualTo(Float value) {
            addCriterion("DownOdds =", value, "downOdds");
            return (Criteria) this;
        }

        public Criteria andDownOddsNotEqualTo(Float value) {
            addCriterion("DownOdds <>", value, "downOdds");
            return (Criteria) this;
        }

        public Criteria andDownOddsGreaterThan(Float value) {
            addCriterion("DownOdds >", value, "downOdds");
            return (Criteria) this;
        }

        public Criteria andDownOddsGreaterThanOrEqualTo(Float value) {
            addCriterion("DownOdds >=", value, "downOdds");
            return (Criteria) this;
        }

        public Criteria andDownOddsLessThan(Float value) {
            addCriterion("DownOdds <", value, "downOdds");
            return (Criteria) this;
        }

        public Criteria andDownOddsLessThanOrEqualTo(Float value) {
            addCriterion("DownOdds <=", value, "downOdds");
            return (Criteria) this;
        }

        public Criteria andDownOddsIn(List<Float> values) {
            addCriterion("DownOdds in", values, "downOdds");
            return (Criteria) this;
        }

        public Criteria andDownOddsNotIn(List<Float> values) {
            addCriterion("DownOdds not in", values, "downOdds");
            return (Criteria) this;
        }

        public Criteria andDownOddsBetween(Float value1, Float value2) {
            addCriterion("DownOdds between", value1, value2, "downOdds");
            return (Criteria) this;
        }

        public Criteria andDownOddsNotBetween(Float value1, Float value2) {
            addCriterion("DownOdds not between", value1, value2, "downOdds");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNull() {
            addCriterion("modifyTime is null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNotNull() {
            addCriterion("modifyTime is not null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeEqualTo(Date value) {
            addCriterion("modifyTime =", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotEqualTo(Date value) {
            addCriterion("modifyTime <>", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThan(Date value) {
            addCriterion("modifyTime >", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("modifyTime >=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThan(Date value) {
            addCriterion("modifyTime <", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("modifyTime <=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIn(List<Date> values) {
            addCriterion("modifyTime in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotIn(List<Date> values) {
            addCriterion("modifyTime not in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeBetween(Date value1, Date value2) {
            addCriterion("modifyTime between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("modifyTime not between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andResultIsNull() {
            addCriterion("Result is null");
            return (Criteria) this;
        }

        public Criteria andResultIsNotNull() {
            addCriterion("Result is not null");
            return (Criteria) this;
        }

        public Criteria andResultEqualTo(Byte value) {
            addCriterion("Result =", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotEqualTo(Byte value) {
            addCriterion("Result <>", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThan(Byte value) {
            addCriterion("Result >", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThanOrEqualTo(Byte value) {
            addCriterion("Result >=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThan(Byte value) {
            addCriterion("Result <", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThanOrEqualTo(Byte value) {
            addCriterion("Result <=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultIn(List<Byte> values) {
            addCriterion("Result in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotIn(List<Byte> values) {
            addCriterion("Result not in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultBetween(Byte value1, Byte value2) {
            addCriterion("Result between", value1, value2, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotBetween(Byte value1, Byte value2) {
            addCriterion("Result not between", value1, value2, "result");
            return (Criteria) this;
        }

        public Criteria andClosePanIsNull() {
            addCriterion("ClosePan is null");
            return (Criteria) this;
        }

        public Criteria andClosePanIsNotNull() {
            addCriterion("ClosePan is not null");
            return (Criteria) this;
        }

        public Criteria andClosePanEqualTo(Boolean value) {
            addCriterion("ClosePan =", value, "closePan");
            return (Criteria) this;
        }

        public Criteria andClosePanNotEqualTo(Boolean value) {
            addCriterion("ClosePan <>", value, "closePan");
            return (Criteria) this;
        }

        public Criteria andClosePanGreaterThan(Boolean value) {
            addCriterion("ClosePan >", value, "closePan");
            return (Criteria) this;
        }

        public Criteria andClosePanGreaterThanOrEqualTo(Boolean value) {
            addCriterion("ClosePan >=", value, "closePan");
            return (Criteria) this;
        }

        public Criteria andClosePanLessThan(Boolean value) {
            addCriterion("ClosePan <", value, "closePan");
            return (Criteria) this;
        }

        public Criteria andClosePanLessThanOrEqualTo(Boolean value) {
            addCriterion("ClosePan <=", value, "closePan");
            return (Criteria) this;
        }

        public Criteria andClosePanIn(List<Boolean> values) {
            addCriterion("ClosePan in", values, "closePan");
            return (Criteria) this;
        }

        public Criteria andClosePanNotIn(List<Boolean> values) {
            addCriterion("ClosePan not in", values, "closePan");
            return (Criteria) this;
        }

        public Criteria andClosePanBetween(Boolean value1, Boolean value2) {
            addCriterion("ClosePan between", value1, value2, "closePan");
            return (Criteria) this;
        }

        public Criteria andClosePanNotBetween(Boolean value1, Boolean value2) {
            addCriterion("ClosePan not between", value1, value2, "closePan");
            return (Criteria) this;
        }

        public Criteria andZoudiIsNull() {
            addCriterion("Zoudi is null");
            return (Criteria) this;
        }

        public Criteria andZoudiIsNotNull() {
            addCriterion("Zoudi is not null");
            return (Criteria) this;
        }

        public Criteria andZoudiEqualTo(Boolean value) {
            addCriterion("Zoudi =", value, "zoudi");
            return (Criteria) this;
        }

        public Criteria andZoudiNotEqualTo(Boolean value) {
            addCriterion("Zoudi <>", value, "zoudi");
            return (Criteria) this;
        }

        public Criteria andZoudiGreaterThan(Boolean value) {
            addCriterion("Zoudi >", value, "zoudi");
            return (Criteria) this;
        }

        public Criteria andZoudiGreaterThanOrEqualTo(Boolean value) {
            addCriterion("Zoudi >=", value, "zoudi");
            return (Criteria) this;
        }

        public Criteria andZoudiLessThan(Boolean value) {
            addCriterion("Zoudi <", value, "zoudi");
            return (Criteria) this;
        }

        public Criteria andZoudiLessThanOrEqualTo(Boolean value) {
            addCriterion("Zoudi <=", value, "zoudi");
            return (Criteria) this;
        }

        public Criteria andZoudiIn(List<Boolean> values) {
            addCriterion("Zoudi in", values, "zoudi");
            return (Criteria) this;
        }

        public Criteria andZoudiNotIn(List<Boolean> values) {
            addCriterion("Zoudi not in", values, "zoudi");
            return (Criteria) this;
        }

        public Criteria andZoudiBetween(Boolean value1, Boolean value2) {
            addCriterion("Zoudi between", value1, value2, "zoudi");
            return (Criteria) this;
        }

        public Criteria andZoudiNotBetween(Boolean value1, Boolean value2) {
            addCriterion("Zoudi not between", value1, value2, "zoudi");
            return (Criteria) this;
        }

        public Criteria andGoal_realIsNull() {
            addCriterion("Goal_real is null");
            return (Criteria) this;
        }

        public Criteria andGoal_realIsNotNull() {
            addCriterion("Goal_real is not null");
            return (Criteria) this;
        }

        public Criteria andGoal_realEqualTo(Float value) {
            addCriterion("Goal_real =", value, "goal_real");
            return (Criteria) this;
        }

        public Criteria andGoal_realNotEqualTo(Float value) {
            addCriterion("Goal_real <>", value, "goal_real");
            return (Criteria) this;
        }

        public Criteria andGoal_realGreaterThan(Float value) {
            addCriterion("Goal_real >", value, "goal_real");
            return (Criteria) this;
        }

        public Criteria andGoal_realGreaterThanOrEqualTo(Float value) {
            addCriterion("Goal_real >=", value, "goal_real");
            return (Criteria) this;
        }

        public Criteria andGoal_realLessThan(Float value) {
            addCriterion("Goal_real <", value, "goal_real");
            return (Criteria) this;
        }

        public Criteria andGoal_realLessThanOrEqualTo(Float value) {
            addCriterion("Goal_real <=", value, "goal_real");
            return (Criteria) this;
        }

        public Criteria andGoal_realIn(List<Float> values) {
            addCriterion("Goal_real in", values, "goal_real");
            return (Criteria) this;
        }

        public Criteria andGoal_realNotIn(List<Float> values) {
            addCriterion("Goal_real not in", values, "goal_real");
            return (Criteria) this;
        }

        public Criteria andGoal_realBetween(Float value1, Float value2) {
            addCriterion("Goal_real between", value1, value2, "goal_real");
            return (Criteria) this;
        }

        public Criteria andGoal_realNotBetween(Float value1, Float value2) {
            addCriterion("Goal_real not between", value1, value2, "goal_real");
            return (Criteria) this;
        }

        public Criteria andUpOdds_realIsNull() {
            addCriterion("UpOdds_real is null");
            return (Criteria) this;
        }

        public Criteria andUpOdds_realIsNotNull() {
            addCriterion("UpOdds_real is not null");
            return (Criteria) this;
        }

        public Criteria andUpOdds_realEqualTo(Float value) {
            addCriterion("UpOdds_real =", value, "upOdds_real");
            return (Criteria) this;
        }

        public Criteria andUpOdds_realNotEqualTo(Float value) {
            addCriterion("UpOdds_real <>", value, "upOdds_real");
            return (Criteria) this;
        }

        public Criteria andUpOdds_realGreaterThan(Float value) {
            addCriterion("UpOdds_real >", value, "upOdds_real");
            return (Criteria) this;
        }

        public Criteria andUpOdds_realGreaterThanOrEqualTo(Float value) {
            addCriterion("UpOdds_real >=", value, "upOdds_real");
            return (Criteria) this;
        }

        public Criteria andUpOdds_realLessThan(Float value) {
            addCriterion("UpOdds_real <", value, "upOdds_real");
            return (Criteria) this;
        }

        public Criteria andUpOdds_realLessThanOrEqualTo(Float value) {
            addCriterion("UpOdds_real <=", value, "upOdds_real");
            return (Criteria) this;
        }

        public Criteria andUpOdds_realIn(List<Float> values) {
            addCriterion("UpOdds_real in", values, "upOdds_real");
            return (Criteria) this;
        }

        public Criteria andUpOdds_realNotIn(List<Float> values) {
            addCriterion("UpOdds_real not in", values, "upOdds_real");
            return (Criteria) this;
        }

        public Criteria andUpOdds_realBetween(Float value1, Float value2) {
            addCriterion("UpOdds_real between", value1, value2, "upOdds_real");
            return (Criteria) this;
        }

        public Criteria andUpOdds_realNotBetween(Float value1, Float value2) {
            addCriterion("UpOdds_real not between", value1, value2, "upOdds_real");
            return (Criteria) this;
        }

        public Criteria andDownOdds_realIsNull() {
            addCriterion("DownOdds_real is null");
            return (Criteria) this;
        }

        public Criteria andDownOdds_realIsNotNull() {
            addCriterion("DownOdds_real is not null");
            return (Criteria) this;
        }

        public Criteria andDownOdds_realEqualTo(Float value) {
            addCriterion("DownOdds_real =", value, "downOdds_real");
            return (Criteria) this;
        }

        public Criteria andDownOdds_realNotEqualTo(Float value) {
            addCriterion("DownOdds_real <>", value, "downOdds_real");
            return (Criteria) this;
        }

        public Criteria andDownOdds_realGreaterThan(Float value) {
            addCriterion("DownOdds_real >", value, "downOdds_real");
            return (Criteria) this;
        }

        public Criteria andDownOdds_realGreaterThanOrEqualTo(Float value) {
            addCriterion("DownOdds_real >=", value, "downOdds_real");
            return (Criteria) this;
        }

        public Criteria andDownOdds_realLessThan(Float value) {
            addCriterion("DownOdds_real <", value, "downOdds_real");
            return (Criteria) this;
        }

        public Criteria andDownOdds_realLessThanOrEqualTo(Float value) {
            addCriterion("DownOdds_real <=", value, "downOdds_real");
            return (Criteria) this;
        }

        public Criteria andDownOdds_realIn(List<Float> values) {
            addCriterion("DownOdds_real in", values, "downOdds_real");
            return (Criteria) this;
        }

        public Criteria andDownOdds_realNotIn(List<Float> values) {
            addCriterion("DownOdds_real not in", values, "downOdds_real");
            return (Criteria) this;
        }

        public Criteria andDownOdds_realBetween(Float value1, Float value2) {
            addCriterion("DownOdds_real between", value1, value2, "downOdds_real");
            return (Criteria) this;
        }

        public Criteria andDownOdds_realNotBetween(Float value1, Float value2) {
            addCriterion("DownOdds_real not between", value1, value2, "downOdds_real");
            return (Criteria) this;
        }

        public Criteria andIsStopLiveIsNull() {
            addCriterion("isStopLive is null");
            return (Criteria) this;
        }

        public Criteria andIsStopLiveIsNotNull() {
            addCriterion("isStopLive is not null");
            return (Criteria) this;
        }

        public Criteria andIsStopLiveEqualTo(Boolean value) {
            addCriterion("isStopLive =", value, "isStopLive");
            return (Criteria) this;
        }

        public Criteria andIsStopLiveNotEqualTo(Boolean value) {
            addCriterion("isStopLive <>", value, "isStopLive");
            return (Criteria) this;
        }

        public Criteria andIsStopLiveGreaterThan(Boolean value) {
            addCriterion("isStopLive >", value, "isStopLive");
            return (Criteria) this;
        }

        public Criteria andIsStopLiveGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isStopLive >=", value, "isStopLive");
            return (Criteria) this;
        }

        public Criteria andIsStopLiveLessThan(Boolean value) {
            addCriterion("isStopLive <", value, "isStopLive");
            return (Criteria) this;
        }

        public Criteria andIsStopLiveLessThanOrEqualTo(Boolean value) {
            addCriterion("isStopLive <=", value, "isStopLive");
            return (Criteria) this;
        }

        public Criteria andIsStopLiveIn(List<Boolean> values) {
            addCriterion("isStopLive in", values, "isStopLive");
            return (Criteria) this;
        }

        public Criteria andIsStopLiveNotIn(List<Boolean> values) {
            addCriterion("isStopLive not in", values, "isStopLive");
            return (Criteria) this;
        }

        public Criteria andIsStopLiveBetween(Boolean value1, Boolean value2) {
            addCriterion("isStopLive between", value1, value2, "isStopLive");
            return (Criteria) this;
        }

        public Criteria andIsStopLiveNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isStopLive not between", value1, value2, "isStopLive");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("StartTime is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("StartTime is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("StartTime =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("StartTime <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("StartTime >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("StartTime >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("StartTime <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("StartTime <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("StartTime in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("StartTime not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("StartTime between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("StartTime not between", value1, value2, "startTime");
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