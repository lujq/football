package com.example.spinwheel.base.domain;

import java.util.ArrayList;
import java.util.List;

public class CompanyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CompanyExample() {
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

        public Criteria andCompanyIDIsNull() {
            addCriterion("CompanyID is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIDIsNotNull() {
            addCriterion("CompanyID is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIDEqualTo(Short value) {
            addCriterion("CompanyID =", value, "companyID");
            return (Criteria) this;
        }

        public Criteria andCompanyIDNotEqualTo(Short value) {
            addCriterion("CompanyID <>", value, "companyID");
            return (Criteria) this;
        }

        public Criteria andCompanyIDGreaterThan(Short value) {
            addCriterion("CompanyID >", value, "companyID");
            return (Criteria) this;
        }

        public Criteria andCompanyIDGreaterThanOrEqualTo(Short value) {
            addCriterion("CompanyID >=", value, "companyID");
            return (Criteria) this;
        }

        public Criteria andCompanyIDLessThan(Short value) {
            addCriterion("CompanyID <", value, "companyID");
            return (Criteria) this;
        }

        public Criteria andCompanyIDLessThanOrEqualTo(Short value) {
            addCriterion("CompanyID <=", value, "companyID");
            return (Criteria) this;
        }

        public Criteria andCompanyIDIn(List<Short> values) {
            addCriterion("CompanyID in", values, "companyID");
            return (Criteria) this;
        }

        public Criteria andCompanyIDNotIn(List<Short> values) {
            addCriterion("CompanyID not in", values, "companyID");
            return (Criteria) this;
        }

        public Criteria andCompanyIDBetween(Short value1, Short value2) {
            addCriterion("CompanyID between", value1, value2, "companyID");
            return (Criteria) this;
        }

        public Criteria andCompanyIDNotBetween(Short value1, Short value2) {
            addCriterion("CompanyID not between", value1, value2, "companyID");
            return (Criteria) this;
        }

        public Criteria andName_CnIsNull() {
            addCriterion("Name_Cn is null");
            return (Criteria) this;
        }

        public Criteria andName_CnIsNotNull() {
            addCriterion("Name_Cn is not null");
            return (Criteria) this;
        }

        public Criteria andName_CnEqualTo(String value) {
            addCriterion("Name_Cn =", value, "name_Cn");
            return (Criteria) this;
        }

        public Criteria andName_CnNotEqualTo(String value) {
            addCriterion("Name_Cn <>", value, "name_Cn");
            return (Criteria) this;
        }

        public Criteria andName_CnGreaterThan(String value) {
            addCriterion("Name_Cn >", value, "name_Cn");
            return (Criteria) this;
        }

        public Criteria andName_CnGreaterThanOrEqualTo(String value) {
            addCriterion("Name_Cn >=", value, "name_Cn");
            return (Criteria) this;
        }

        public Criteria andName_CnLessThan(String value) {
            addCriterion("Name_Cn <", value, "name_Cn");
            return (Criteria) this;
        }

        public Criteria andName_CnLessThanOrEqualTo(String value) {
            addCriterion("Name_Cn <=", value, "name_Cn");
            return (Criteria) this;
        }

        public Criteria andName_CnLike(String value) {
            addCriterion("Name_Cn like", value, "name_Cn");
            return (Criteria) this;
        }

        public Criteria andName_CnNotLike(String value) {
            addCriterion("Name_Cn not like", value, "name_Cn");
            return (Criteria) this;
        }

        public Criteria andName_CnIn(List<String> values) {
            addCriterion("Name_Cn in", values, "name_Cn");
            return (Criteria) this;
        }

        public Criteria andName_CnNotIn(List<String> values) {
            addCriterion("Name_Cn not in", values, "name_Cn");
            return (Criteria) this;
        }

        public Criteria andName_CnBetween(String value1, String value2) {
            addCriterion("Name_Cn between", value1, value2, "name_Cn");
            return (Criteria) this;
        }

        public Criteria andName_CnNotBetween(String value1, String value2) {
            addCriterion("Name_Cn not between", value1, value2, "name_Cn");
            return (Criteria) this;
        }

        public Criteria andIsLetgoalIsNull() {
            addCriterion("isLetgoal is null");
            return (Criteria) this;
        }

        public Criteria andIsLetgoalIsNotNull() {
            addCriterion("isLetgoal is not null");
            return (Criteria) this;
        }

        public Criteria andIsLetgoalEqualTo(Boolean value) {
            addCriterion("isLetgoal =", value, "isLetgoal");
            return (Criteria) this;
        }

        public Criteria andIsLetgoalNotEqualTo(Boolean value) {
            addCriterion("isLetgoal <>", value, "isLetgoal");
            return (Criteria) this;
        }

        public Criteria andIsLetgoalGreaterThan(Boolean value) {
            addCriterion("isLetgoal >", value, "isLetgoal");
            return (Criteria) this;
        }

        public Criteria andIsLetgoalGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isLetgoal >=", value, "isLetgoal");
            return (Criteria) this;
        }

        public Criteria andIsLetgoalLessThan(Boolean value) {
            addCriterion("isLetgoal <", value, "isLetgoal");
            return (Criteria) this;
        }

        public Criteria andIsLetgoalLessThanOrEqualTo(Boolean value) {
            addCriterion("isLetgoal <=", value, "isLetgoal");
            return (Criteria) this;
        }

        public Criteria andIsLetgoalIn(List<Boolean> values) {
            addCriterion("isLetgoal in", values, "isLetgoal");
            return (Criteria) this;
        }

        public Criteria andIsLetgoalNotIn(List<Boolean> values) {
            addCriterion("isLetgoal not in", values, "isLetgoal");
            return (Criteria) this;
        }

        public Criteria andIsLetgoalBetween(Boolean value1, Boolean value2) {
            addCriterion("isLetgoal between", value1, value2, "isLetgoal");
            return (Criteria) this;
        }

        public Criteria andIsLetgoalNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isLetgoal not between", value1, value2, "isLetgoal");
            return (Criteria) this;
        }

        public Criteria andIsTotalScoreIsNull() {
            addCriterion("isTotalScore is null");
            return (Criteria) this;
        }

        public Criteria andIsTotalScoreIsNotNull() {
            addCriterion("isTotalScore is not null");
            return (Criteria) this;
        }

        public Criteria andIsTotalScoreEqualTo(Boolean value) {
            addCriterion("isTotalScore =", value, "isTotalScore");
            return (Criteria) this;
        }

        public Criteria andIsTotalScoreNotEqualTo(Boolean value) {
            addCriterion("isTotalScore <>", value, "isTotalScore");
            return (Criteria) this;
        }

        public Criteria andIsTotalScoreGreaterThan(Boolean value) {
            addCriterion("isTotalScore >", value, "isTotalScore");
            return (Criteria) this;
        }

        public Criteria andIsTotalScoreGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isTotalScore >=", value, "isTotalScore");
            return (Criteria) this;
        }

        public Criteria andIsTotalScoreLessThan(Boolean value) {
            addCriterion("isTotalScore <", value, "isTotalScore");
            return (Criteria) this;
        }

        public Criteria andIsTotalScoreLessThanOrEqualTo(Boolean value) {
            addCriterion("isTotalScore <=", value, "isTotalScore");
            return (Criteria) this;
        }

        public Criteria andIsTotalScoreIn(List<Boolean> values) {
            addCriterion("isTotalScore in", values, "isTotalScore");
            return (Criteria) this;
        }

        public Criteria andIsTotalScoreNotIn(List<Boolean> values) {
            addCriterion("isTotalScore not in", values, "isTotalScore");
            return (Criteria) this;
        }

        public Criteria andIsTotalScoreBetween(Boolean value1, Boolean value2) {
            addCriterion("isTotalScore between", value1, value2, "isTotalScore");
            return (Criteria) this;
        }

        public Criteria andIsTotalScoreNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isTotalScore not between", value1, value2, "isTotalScore");
            return (Criteria) this;
        }

        public Criteria andIsStandardIsNull() {
            addCriterion("IsStandard is null");
            return (Criteria) this;
        }

        public Criteria andIsStandardIsNotNull() {
            addCriterion("IsStandard is not null");
            return (Criteria) this;
        }

        public Criteria andIsStandardEqualTo(Boolean value) {
            addCriterion("IsStandard =", value, "isStandard");
            return (Criteria) this;
        }

        public Criteria andIsStandardNotEqualTo(Boolean value) {
            addCriterion("IsStandard <>", value, "isStandard");
            return (Criteria) this;
        }

        public Criteria andIsStandardGreaterThan(Boolean value) {
            addCriterion("IsStandard >", value, "isStandard");
            return (Criteria) this;
        }

        public Criteria andIsStandardGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsStandard >=", value, "isStandard");
            return (Criteria) this;
        }

        public Criteria andIsStandardLessThan(Boolean value) {
            addCriterion("IsStandard <", value, "isStandard");
            return (Criteria) this;
        }

        public Criteria andIsStandardLessThanOrEqualTo(Boolean value) {
            addCriterion("IsStandard <=", value, "isStandard");
            return (Criteria) this;
        }

        public Criteria andIsStandardIn(List<Boolean> values) {
            addCriterion("IsStandard in", values, "isStandard");
            return (Criteria) this;
        }

        public Criteria andIsStandardNotIn(List<Boolean> values) {
            addCriterion("IsStandard not in", values, "isStandard");
            return (Criteria) this;
        }

        public Criteria andIsStandardBetween(Boolean value1, Boolean value2) {
            addCriterion("IsStandard between", value1, value2, "isStandard");
            return (Criteria) this;
        }

        public Criteria andIsStandardNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsStandard not between", value1, value2, "isStandard");
            return (Criteria) this;
        }

        public Criteria andAsianOrderIsNull() {
            addCriterion("AsianOrder is null");
            return (Criteria) this;
        }

        public Criteria andAsianOrderIsNotNull() {
            addCriterion("AsianOrder is not null");
            return (Criteria) this;
        }

        public Criteria andAsianOrderEqualTo(Byte value) {
            addCriterion("AsianOrder =", value, "asianOrder");
            return (Criteria) this;
        }

        public Criteria andAsianOrderNotEqualTo(Byte value) {
            addCriterion("AsianOrder <>", value, "asianOrder");
            return (Criteria) this;
        }

        public Criteria andAsianOrderGreaterThan(Byte value) {
            addCriterion("AsianOrder >", value, "asianOrder");
            return (Criteria) this;
        }

        public Criteria andAsianOrderGreaterThanOrEqualTo(Byte value) {
            addCriterion("AsianOrder >=", value, "asianOrder");
            return (Criteria) this;
        }

        public Criteria andAsianOrderLessThan(Byte value) {
            addCriterion("AsianOrder <", value, "asianOrder");
            return (Criteria) this;
        }

        public Criteria andAsianOrderLessThanOrEqualTo(Byte value) {
            addCriterion("AsianOrder <=", value, "asianOrder");
            return (Criteria) this;
        }

        public Criteria andAsianOrderIn(List<Byte> values) {
            addCriterion("AsianOrder in", values, "asianOrder");
            return (Criteria) this;
        }

        public Criteria andAsianOrderNotIn(List<Byte> values) {
            addCriterion("AsianOrder not in", values, "asianOrder");
            return (Criteria) this;
        }

        public Criteria andAsianOrderBetween(Byte value1, Byte value2) {
            addCriterion("AsianOrder between", value1, value2, "asianOrder");
            return (Criteria) this;
        }

        public Criteria andAsianOrderNotBetween(Byte value1, Byte value2) {
            addCriterion("AsianOrder not between", value1, value2, "asianOrder");
            return (Criteria) this;
        }

        public Criteria andOverDownOrderIsNull() {
            addCriterion("OverDownOrder is null");
            return (Criteria) this;
        }

        public Criteria andOverDownOrderIsNotNull() {
            addCriterion("OverDownOrder is not null");
            return (Criteria) this;
        }

        public Criteria andOverDownOrderEqualTo(Byte value) {
            addCriterion("OverDownOrder =", value, "overDownOrder");
            return (Criteria) this;
        }

        public Criteria andOverDownOrderNotEqualTo(Byte value) {
            addCriterion("OverDownOrder <>", value, "overDownOrder");
            return (Criteria) this;
        }

        public Criteria andOverDownOrderGreaterThan(Byte value) {
            addCriterion("OverDownOrder >", value, "overDownOrder");
            return (Criteria) this;
        }

        public Criteria andOverDownOrderGreaterThanOrEqualTo(Byte value) {
            addCriterion("OverDownOrder >=", value, "overDownOrder");
            return (Criteria) this;
        }

        public Criteria andOverDownOrderLessThan(Byte value) {
            addCriterion("OverDownOrder <", value, "overDownOrder");
            return (Criteria) this;
        }

        public Criteria andOverDownOrderLessThanOrEqualTo(Byte value) {
            addCriterion("OverDownOrder <=", value, "overDownOrder");
            return (Criteria) this;
        }

        public Criteria andOverDownOrderIn(List<Byte> values) {
            addCriterion("OverDownOrder in", values, "overDownOrder");
            return (Criteria) this;
        }

        public Criteria andOverDownOrderNotIn(List<Byte> values) {
            addCriterion("OverDownOrder not in", values, "overDownOrder");
            return (Criteria) this;
        }

        public Criteria andOverDownOrderBetween(Byte value1, Byte value2) {
            addCriterion("OverDownOrder between", value1, value2, "overDownOrder");
            return (Criteria) this;
        }

        public Criteria andOverDownOrderNotBetween(Byte value1, Byte value2) {
            addCriterion("OverDownOrder not between", value1, value2, "overDownOrder");
            return (Criteria) this;
        }

        public Criteria andStandardOrderIsNull() {
            addCriterion("StandardOrder is null");
            return (Criteria) this;
        }

        public Criteria andStandardOrderIsNotNull() {
            addCriterion("StandardOrder is not null");
            return (Criteria) this;
        }

        public Criteria andStandardOrderEqualTo(Byte value) {
            addCriterion("StandardOrder =", value, "standardOrder");
            return (Criteria) this;
        }

        public Criteria andStandardOrderNotEqualTo(Byte value) {
            addCriterion("StandardOrder <>", value, "standardOrder");
            return (Criteria) this;
        }

        public Criteria andStandardOrderGreaterThan(Byte value) {
            addCriterion("StandardOrder >", value, "standardOrder");
            return (Criteria) this;
        }

        public Criteria andStandardOrderGreaterThanOrEqualTo(Byte value) {
            addCriterion("StandardOrder >=", value, "standardOrder");
            return (Criteria) this;
        }

        public Criteria andStandardOrderLessThan(Byte value) {
            addCriterion("StandardOrder <", value, "standardOrder");
            return (Criteria) this;
        }

        public Criteria andStandardOrderLessThanOrEqualTo(Byte value) {
            addCriterion("StandardOrder <=", value, "standardOrder");
            return (Criteria) this;
        }

        public Criteria andStandardOrderIn(List<Byte> values) {
            addCriterion("StandardOrder in", values, "standardOrder");
            return (Criteria) this;
        }

        public Criteria andStandardOrderNotIn(List<Byte> values) {
            addCriterion("StandardOrder not in", values, "standardOrder");
            return (Criteria) this;
        }

        public Criteria andStandardOrderBetween(Byte value1, Byte value2) {
            addCriterion("StandardOrder between", value1, value2, "standardOrder");
            return (Criteria) this;
        }

        public Criteria andStandardOrderNotBetween(Byte value1, Byte value2) {
            addCriterion("StandardOrder not between", value1, value2, "standardOrder");
            return (Criteria) this;
        }

        public Criteria andIsHalfIsNull() {
            addCriterion("isHalf is null");
            return (Criteria) this;
        }

        public Criteria andIsHalfIsNotNull() {
            addCriterion("isHalf is not null");
            return (Criteria) this;
        }

        public Criteria andIsHalfEqualTo(Boolean value) {
            addCriterion("isHalf =", value, "isHalf");
            return (Criteria) this;
        }

        public Criteria andIsHalfNotEqualTo(Boolean value) {
            addCriterion("isHalf <>", value, "isHalf");
            return (Criteria) this;
        }

        public Criteria andIsHalfGreaterThan(Boolean value) {
            addCriterion("isHalf >", value, "isHalf");
            return (Criteria) this;
        }

        public Criteria andIsHalfGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isHalf >=", value, "isHalf");
            return (Criteria) this;
        }

        public Criteria andIsHalfLessThan(Boolean value) {
            addCriterion("isHalf <", value, "isHalf");
            return (Criteria) this;
        }

        public Criteria andIsHalfLessThanOrEqualTo(Boolean value) {
            addCriterion("isHalf <=", value, "isHalf");
            return (Criteria) this;
        }

        public Criteria andIsHalfIn(List<Boolean> values) {
            addCriterion("isHalf in", values, "isHalf");
            return (Criteria) this;
        }

        public Criteria andIsHalfNotIn(List<Boolean> values) {
            addCriterion("isHalf not in", values, "isHalf");
            return (Criteria) this;
        }

        public Criteria andIsHalfBetween(Boolean value1, Boolean value2) {
            addCriterion("isHalf between", value1, value2, "isHalf");
            return (Criteria) this;
        }

        public Criteria andIsHalfNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isHalf not between", value1, value2, "isHalf");
            return (Criteria) this;
        }

        public Criteria andIsRunIsNull() {
            addCriterion("IsRun is null");
            return (Criteria) this;
        }

        public Criteria andIsRunIsNotNull() {
            addCriterion("IsRun is not null");
            return (Criteria) this;
        }

        public Criteria andIsRunEqualTo(Integer value) {
            addCriterion("IsRun =", value, "isRun");
            return (Criteria) this;
        }

        public Criteria andIsRunNotEqualTo(Integer value) {
            addCriterion("IsRun <>", value, "isRun");
            return (Criteria) this;
        }

        public Criteria andIsRunGreaterThan(Integer value) {
            addCriterion("IsRun >", value, "isRun");
            return (Criteria) this;
        }

        public Criteria andIsRunGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsRun >=", value, "isRun");
            return (Criteria) this;
        }

        public Criteria andIsRunLessThan(Integer value) {
            addCriterion("IsRun <", value, "isRun");
            return (Criteria) this;
        }

        public Criteria andIsRunLessThanOrEqualTo(Integer value) {
            addCriterion("IsRun <=", value, "isRun");
            return (Criteria) this;
        }

        public Criteria andIsRunIn(List<Integer> values) {
            addCriterion("IsRun in", values, "isRun");
            return (Criteria) this;
        }

        public Criteria andIsRunNotIn(List<Integer> values) {
            addCriterion("IsRun not in", values, "isRun");
            return (Criteria) this;
        }

        public Criteria andIsRunBetween(Integer value1, Integer value2) {
            addCriterion("IsRun between", value1, value2, "isRun");
            return (Criteria) this;
        }

        public Criteria andIsRunNotBetween(Integer value1, Integer value2) {
            addCriterion("IsRun not between", value1, value2, "isRun");
            return (Criteria) this;
        }

        public Criteria andIsSpecialIsNull() {
            addCriterion("IsSpecial is null");
            return (Criteria) this;
        }

        public Criteria andIsSpecialIsNotNull() {
            addCriterion("IsSpecial is not null");
            return (Criteria) this;
        }

        public Criteria andIsSpecialEqualTo(Integer value) {
            addCriterion("IsSpecial =", value, "isSpecial");
            return (Criteria) this;
        }

        public Criteria andIsSpecialNotEqualTo(Integer value) {
            addCriterion("IsSpecial <>", value, "isSpecial");
            return (Criteria) this;
        }

        public Criteria andIsSpecialGreaterThan(Integer value) {
            addCriterion("IsSpecial >", value, "isSpecial");
            return (Criteria) this;
        }

        public Criteria andIsSpecialGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsSpecial >=", value, "isSpecial");
            return (Criteria) this;
        }

        public Criteria andIsSpecialLessThan(Integer value) {
            addCriterion("IsSpecial <", value, "isSpecial");
            return (Criteria) this;
        }

        public Criteria andIsSpecialLessThanOrEqualTo(Integer value) {
            addCriterion("IsSpecial <=", value, "isSpecial");
            return (Criteria) this;
        }

        public Criteria andIsSpecialIn(List<Integer> values) {
            addCriterion("IsSpecial in", values, "isSpecial");
            return (Criteria) this;
        }

        public Criteria andIsSpecialNotIn(List<Integer> values) {
            addCriterion("IsSpecial not in", values, "isSpecial");
            return (Criteria) this;
        }

        public Criteria andIsSpecialBetween(Integer value1, Integer value2) {
            addCriterion("IsSpecial between", value1, value2, "isSpecial");
            return (Criteria) this;
        }

        public Criteria andIsSpecialNotBetween(Integer value1, Integer value2) {
            addCriterion("IsSpecial not between", value1, value2, "isSpecial");
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