package com.example.spinwheel.base.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TotalScoreDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TotalScoreDetailExample() {
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

        public Criteria andIDIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIDIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIDEqualTo(Integer value) {
            addCriterion("ID =", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDGreaterThan(Integer value) {
            addCriterion("ID >", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDLessThan(Integer value) {
            addCriterion("ID <", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDIn(List<Integer> values) {
            addCriterion("ID in", values, "ID");
            return (Criteria) this;
        }

        public Criteria andIDNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "ID");
            return (Criteria) this;
        }

        public Criteria andIDBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "ID");
            return (Criteria) this;
        }

        public Criteria andIDNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "ID");
            return (Criteria) this;
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
            addCriterion("ModifyTime is null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNotNull() {
            addCriterion("ModifyTime is not null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeEqualTo(Date value) {
            addCriterion("ModifyTime =", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotEqualTo(Date value) {
            addCriterion("ModifyTime <>", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThan(Date value) {
            addCriterion("ModifyTime >", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ModifyTime >=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThan(Date value) {
            addCriterion("ModifyTime <", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("ModifyTime <=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIn(List<Date> values) {
            addCriterion("ModifyTime in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotIn(List<Date> values) {
            addCriterion("ModifyTime not in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeBetween(Date value1, Date value2) {
            addCriterion("ModifyTime between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("ModifyTime not between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andIsEarlyIsNull() {
            addCriterion("isEarly is null");
            return (Criteria) this;
        }

        public Criteria andIsEarlyIsNotNull() {
            addCriterion("isEarly is not null");
            return (Criteria) this;
        }

        public Criteria andIsEarlyEqualTo(Boolean value) {
            addCriterion("isEarly =", value, "isEarly");
            return (Criteria) this;
        }

        public Criteria andIsEarlyNotEqualTo(Boolean value) {
            addCriterion("isEarly <>", value, "isEarly");
            return (Criteria) this;
        }

        public Criteria andIsEarlyGreaterThan(Boolean value) {
            addCriterion("isEarly >", value, "isEarly");
            return (Criteria) this;
        }

        public Criteria andIsEarlyGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isEarly >=", value, "isEarly");
            return (Criteria) this;
        }

        public Criteria andIsEarlyLessThan(Boolean value) {
            addCriterion("isEarly <", value, "isEarly");
            return (Criteria) this;
        }

        public Criteria andIsEarlyLessThanOrEqualTo(Boolean value) {
            addCriterion("isEarly <=", value, "isEarly");
            return (Criteria) this;
        }

        public Criteria andIsEarlyIn(List<Boolean> values) {
            addCriterion("isEarly in", values, "isEarly");
            return (Criteria) this;
        }

        public Criteria andIsEarlyNotIn(List<Boolean> values) {
            addCriterion("isEarly not in", values, "isEarly");
            return (Criteria) this;
        }

        public Criteria andIsEarlyBetween(Boolean value1, Boolean value2) {
            addCriterion("isEarly between", value1, value2, "isEarly");
            return (Criteria) this;
        }

        public Criteria andIsEarlyNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isEarly not between", value1, value2, "isEarly");
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