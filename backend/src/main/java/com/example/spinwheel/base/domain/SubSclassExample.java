package com.example.spinwheel.base.domain;

import java.util.ArrayList;
import java.util.List;

public class SubSclassExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SubSclassExample() {
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

        public Criteria andSclassidIsNull() {
            addCriterion("sclassid is null");
            return (Criteria) this;
        }

        public Criteria andSclassidIsNotNull() {
            addCriterion("sclassid is not null");
            return (Criteria) this;
        }

        public Criteria andSclassidEqualTo(Integer value) {
            addCriterion("sclassid =", value, "sclassid");
            return (Criteria) this;
        }

        public Criteria andSclassidNotEqualTo(Integer value) {
            addCriterion("sclassid <>", value, "sclassid");
            return (Criteria) this;
        }

        public Criteria andSclassidGreaterThan(Integer value) {
            addCriterion("sclassid >", value, "sclassid");
            return (Criteria) this;
        }

        public Criteria andSclassidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sclassid >=", value, "sclassid");
            return (Criteria) this;
        }

        public Criteria andSclassidLessThan(Integer value) {
            addCriterion("sclassid <", value, "sclassid");
            return (Criteria) this;
        }

        public Criteria andSclassidLessThanOrEqualTo(Integer value) {
            addCriterion("sclassid <=", value, "sclassid");
            return (Criteria) this;
        }

        public Criteria andSclassidIn(List<Integer> values) {
            addCriterion("sclassid in", values, "sclassid");
            return (Criteria) this;
        }

        public Criteria andSclassidNotIn(List<Integer> values) {
            addCriterion("sclassid not in", values, "sclassid");
            return (Criteria) this;
        }

        public Criteria andSclassidBetween(Integer value1, Integer value2) {
            addCriterion("sclassid between", value1, value2, "sclassid");
            return (Criteria) this;
        }

        public Criteria andSclassidNotBetween(Integer value1, Integer value2) {
            addCriterion("sclassid not between", value1, value2, "sclassid");
            return (Criteria) this;
        }

        public Criteria andIsHaveScoreIsNull() {
            addCriterion("IsHaveScore is null");
            return (Criteria) this;
        }

        public Criteria andIsHaveScoreIsNotNull() {
            addCriterion("IsHaveScore is not null");
            return (Criteria) this;
        }

        public Criteria andIsHaveScoreEqualTo(Boolean value) {
            addCriterion("IsHaveScore =", value, "isHaveScore");
            return (Criteria) this;
        }

        public Criteria andIsHaveScoreNotEqualTo(Boolean value) {
            addCriterion("IsHaveScore <>", value, "isHaveScore");
            return (Criteria) this;
        }

        public Criteria andIsHaveScoreGreaterThan(Boolean value) {
            addCriterion("IsHaveScore >", value, "isHaveScore");
            return (Criteria) this;
        }

        public Criteria andIsHaveScoreGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsHaveScore >=", value, "isHaveScore");
            return (Criteria) this;
        }

        public Criteria andIsHaveScoreLessThan(Boolean value) {
            addCriterion("IsHaveScore <", value, "isHaveScore");
            return (Criteria) this;
        }

        public Criteria andIsHaveScoreLessThanOrEqualTo(Boolean value) {
            addCriterion("IsHaveScore <=", value, "isHaveScore");
            return (Criteria) this;
        }

        public Criteria andIsHaveScoreIn(List<Boolean> values) {
            addCriterion("IsHaveScore in", values, "isHaveScore");
            return (Criteria) this;
        }

        public Criteria andIsHaveScoreNotIn(List<Boolean> values) {
            addCriterion("IsHaveScore not in", values, "isHaveScore");
            return (Criteria) this;
        }

        public Criteria andIsHaveScoreBetween(Boolean value1, Boolean value2) {
            addCriterion("IsHaveScore between", value1, value2, "isHaveScore");
            return (Criteria) this;
        }

        public Criteria andIsHaveScoreNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsHaveScore not between", value1, value2, "isHaveScore");
            return (Criteria) this;
        }

        public Criteria andSortNumberIsNull() {
            addCriterion("sortNumber is null");
            return (Criteria) this;
        }

        public Criteria andSortNumberIsNotNull() {
            addCriterion("sortNumber is not null");
            return (Criteria) this;
        }

        public Criteria andSortNumberEqualTo(Integer value) {
            addCriterion("sortNumber =", value, "sortNumber");
            return (Criteria) this;
        }

        public Criteria andSortNumberNotEqualTo(Integer value) {
            addCriterion("sortNumber <>", value, "sortNumber");
            return (Criteria) this;
        }

        public Criteria andSortNumberGreaterThan(Integer value) {
            addCriterion("sortNumber >", value, "sortNumber");
            return (Criteria) this;
        }

        public Criteria andSortNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("sortNumber >=", value, "sortNumber");
            return (Criteria) this;
        }

        public Criteria andSortNumberLessThan(Integer value) {
            addCriterion("sortNumber <", value, "sortNumber");
            return (Criteria) this;
        }

        public Criteria andSortNumberLessThanOrEqualTo(Integer value) {
            addCriterion("sortNumber <=", value, "sortNumber");
            return (Criteria) this;
        }

        public Criteria andSortNumberIn(List<Integer> values) {
            addCriterion("sortNumber in", values, "sortNumber");
            return (Criteria) this;
        }

        public Criteria andSortNumberNotIn(List<Integer> values) {
            addCriterion("sortNumber not in", values, "sortNumber");
            return (Criteria) this;
        }

        public Criteria andSortNumberBetween(Integer value1, Integer value2) {
            addCriterion("sortNumber between", value1, value2, "sortNumber");
            return (Criteria) this;
        }

        public Criteria andSortNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("sortNumber not between", value1, value2, "sortNumber");
            return (Criteria) this;
        }

        public Criteria andCurr_roundIsNull() {
            addCriterion("curr_round is null");
            return (Criteria) this;
        }

        public Criteria andCurr_roundIsNotNull() {
            addCriterion("curr_round is not null");
            return (Criteria) this;
        }

        public Criteria andCurr_roundEqualTo(Integer value) {
            addCriterion("curr_round =", value, "curr_round");
            return (Criteria) this;
        }

        public Criteria andCurr_roundNotEqualTo(Integer value) {
            addCriterion("curr_round <>", value, "curr_round");
            return (Criteria) this;
        }

        public Criteria andCurr_roundGreaterThan(Integer value) {
            addCriterion("curr_round >", value, "curr_round");
            return (Criteria) this;
        }

        public Criteria andCurr_roundGreaterThanOrEqualTo(Integer value) {
            addCriterion("curr_round >=", value, "curr_round");
            return (Criteria) this;
        }

        public Criteria andCurr_roundLessThan(Integer value) {
            addCriterion("curr_round <", value, "curr_round");
            return (Criteria) this;
        }

        public Criteria andCurr_roundLessThanOrEqualTo(Integer value) {
            addCriterion("curr_round <=", value, "curr_round");
            return (Criteria) this;
        }

        public Criteria andCurr_roundIn(List<Integer> values) {
            addCriterion("curr_round in", values, "curr_round");
            return (Criteria) this;
        }

        public Criteria andCurr_roundNotIn(List<Integer> values) {
            addCriterion("curr_round not in", values, "curr_round");
            return (Criteria) this;
        }

        public Criteria andCurr_roundBetween(Integer value1, Integer value2) {
            addCriterion("curr_round between", value1, value2, "curr_round");
            return (Criteria) this;
        }

        public Criteria andCurr_roundNotBetween(Integer value1, Integer value2) {
            addCriterion("curr_round not between", value1, value2, "curr_round");
            return (Criteria) this;
        }

        public Criteria andCount_roundIsNull() {
            addCriterion("count_round is null");
            return (Criteria) this;
        }

        public Criteria andCount_roundIsNotNull() {
            addCriterion("count_round is not null");
            return (Criteria) this;
        }

        public Criteria andCount_roundEqualTo(Integer value) {
            addCriterion("count_round =", value, "count_round");
            return (Criteria) this;
        }

        public Criteria andCount_roundNotEqualTo(Integer value) {
            addCriterion("count_round <>", value, "count_round");
            return (Criteria) this;
        }

        public Criteria andCount_roundGreaterThan(Integer value) {
            addCriterion("count_round >", value, "count_round");
            return (Criteria) this;
        }

        public Criteria andCount_roundGreaterThanOrEqualTo(Integer value) {
            addCriterion("count_round >=", value, "count_round");
            return (Criteria) this;
        }

        public Criteria andCount_roundLessThan(Integer value) {
            addCriterion("count_round <", value, "count_round");
            return (Criteria) this;
        }

        public Criteria andCount_roundLessThanOrEqualTo(Integer value) {
            addCriterion("count_round <=", value, "count_round");
            return (Criteria) this;
        }

        public Criteria andCount_roundIn(List<Integer> values) {
            addCriterion("count_round in", values, "count_round");
            return (Criteria) this;
        }

        public Criteria andCount_roundNotIn(List<Integer> values) {
            addCriterion("count_round not in", values, "count_round");
            return (Criteria) this;
        }

        public Criteria andCount_roundBetween(Integer value1, Integer value2) {
            addCriterion("count_round between", value1, value2, "count_round");
            return (Criteria) this;
        }

        public Criteria andCount_roundNotBetween(Integer value1, Integer value2) {
            addCriterion("count_round not between", value1, value2, "count_round");
            return (Criteria) this;
        }

        public Criteria andIsCurrentSclassIsNull() {
            addCriterion("IsCurrentSclass is null");
            return (Criteria) this;
        }

        public Criteria andIsCurrentSclassIsNotNull() {
            addCriterion("IsCurrentSclass is not null");
            return (Criteria) this;
        }

        public Criteria andIsCurrentSclassEqualTo(Boolean value) {
            addCriterion("IsCurrentSclass =", value, "isCurrentSclass");
            return (Criteria) this;
        }

        public Criteria andIsCurrentSclassNotEqualTo(Boolean value) {
            addCriterion("IsCurrentSclass <>", value, "isCurrentSclass");
            return (Criteria) this;
        }

        public Criteria andIsCurrentSclassGreaterThan(Boolean value) {
            addCriterion("IsCurrentSclass >", value, "isCurrentSclass");
            return (Criteria) this;
        }

        public Criteria andIsCurrentSclassGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsCurrentSclass >=", value, "isCurrentSclass");
            return (Criteria) this;
        }

        public Criteria andIsCurrentSclassLessThan(Boolean value) {
            addCriterion("IsCurrentSclass <", value, "isCurrentSclass");
            return (Criteria) this;
        }

        public Criteria andIsCurrentSclassLessThanOrEqualTo(Boolean value) {
            addCriterion("IsCurrentSclass <=", value, "isCurrentSclass");
            return (Criteria) this;
        }

        public Criteria andIsCurrentSclassIn(List<Boolean> values) {
            addCriterion("IsCurrentSclass in", values, "isCurrentSclass");
            return (Criteria) this;
        }

        public Criteria andIsCurrentSclassNotIn(List<Boolean> values) {
            addCriterion("IsCurrentSclass not in", values, "isCurrentSclass");
            return (Criteria) this;
        }

        public Criteria andIsCurrentSclassBetween(Boolean value1, Boolean value2) {
            addCriterion("IsCurrentSclass between", value1, value2, "isCurrentSclass");
            return (Criteria) this;
        }

        public Criteria andIsCurrentSclassNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsCurrentSclass not between", value1, value2, "isCurrentSclass");
            return (Criteria) this;
        }

        public Criteria andSubSclassNameIsNull() {
            addCriterion("subSclassName is null");
            return (Criteria) this;
        }

        public Criteria andSubSclassNameIsNotNull() {
            addCriterion("subSclassName is not null");
            return (Criteria) this;
        }

        public Criteria andSubSclassNameEqualTo(String value) {
            addCriterion("subSclassName =", value, "subSclassName");
            return (Criteria) this;
        }

        public Criteria andSubSclassNameNotEqualTo(String value) {
            addCriterion("subSclassName <>", value, "subSclassName");
            return (Criteria) this;
        }

        public Criteria andSubSclassNameGreaterThan(String value) {
            addCriterion("subSclassName >", value, "subSclassName");
            return (Criteria) this;
        }

        public Criteria andSubSclassNameGreaterThanOrEqualTo(String value) {
            addCriterion("subSclassName >=", value, "subSclassName");
            return (Criteria) this;
        }

        public Criteria andSubSclassNameLessThan(String value) {
            addCriterion("subSclassName <", value, "subSclassName");
            return (Criteria) this;
        }

        public Criteria andSubSclassNameLessThanOrEqualTo(String value) {
            addCriterion("subSclassName <=", value, "subSclassName");
            return (Criteria) this;
        }

        public Criteria andSubSclassNameLike(String value) {
            addCriterion("subSclassName like", value, "subSclassName");
            return (Criteria) this;
        }

        public Criteria andSubSclassNameNotLike(String value) {
            addCriterion("subSclassName not like", value, "subSclassName");
            return (Criteria) this;
        }

        public Criteria andSubSclassNameIn(List<String> values) {
            addCriterion("subSclassName in", values, "subSclassName");
            return (Criteria) this;
        }

        public Criteria andSubSclassNameNotIn(List<String> values) {
            addCriterion("subSclassName not in", values, "subSclassName");
            return (Criteria) this;
        }

        public Criteria andSubSclassNameBetween(String value1, String value2) {
            addCriterion("subSclassName between", value1, value2, "subSclassName");
            return (Criteria) this;
        }

        public Criteria andSubSclassNameNotBetween(String value1, String value2) {
            addCriterion("subSclassName not between", value1, value2, "subSclassName");
            return (Criteria) this;
        }

        public Criteria andSubName_JsIsNull() {
            addCriterion("subName_Js is null");
            return (Criteria) this;
        }

        public Criteria andSubName_JsIsNotNull() {
            addCriterion("subName_Js is not null");
            return (Criteria) this;
        }

        public Criteria andSubName_JsEqualTo(String value) {
            addCriterion("subName_Js =", value, "subName_Js");
            return (Criteria) this;
        }

        public Criteria andSubName_JsNotEqualTo(String value) {
            addCriterion("subName_Js <>", value, "subName_Js");
            return (Criteria) this;
        }

        public Criteria andSubName_JsGreaterThan(String value) {
            addCriterion("subName_Js >", value, "subName_Js");
            return (Criteria) this;
        }

        public Criteria andSubName_JsGreaterThanOrEqualTo(String value) {
            addCriterion("subName_Js >=", value, "subName_Js");
            return (Criteria) this;
        }

        public Criteria andSubName_JsLessThan(String value) {
            addCriterion("subName_Js <", value, "subName_Js");
            return (Criteria) this;
        }

        public Criteria andSubName_JsLessThanOrEqualTo(String value) {
            addCriterion("subName_Js <=", value, "subName_Js");
            return (Criteria) this;
        }

        public Criteria andSubName_JsLike(String value) {
            addCriterion("subName_Js like", value, "subName_Js");
            return (Criteria) this;
        }

        public Criteria andSubName_JsNotLike(String value) {
            addCriterion("subName_Js not like", value, "subName_Js");
            return (Criteria) this;
        }

        public Criteria andSubName_JsIn(List<String> values) {
            addCriterion("subName_Js in", values, "subName_Js");
            return (Criteria) this;
        }

        public Criteria andSubName_JsNotIn(List<String> values) {
            addCriterion("subName_Js not in", values, "subName_Js");
            return (Criteria) this;
        }

        public Criteria andSubName_JsBetween(String value1, String value2) {
            addCriterion("subName_Js between", value1, value2, "subName_Js");
            return (Criteria) this;
        }

        public Criteria andSubName_JsNotBetween(String value1, String value2) {
            addCriterion("subName_Js not between", value1, value2, "subName_Js");
            return (Criteria) this;
        }

        public Criteria andIncludeSeasonIsNull() {
            addCriterion("IncludeSeason is null");
            return (Criteria) this;
        }

        public Criteria andIncludeSeasonIsNotNull() {
            addCriterion("IncludeSeason is not null");
            return (Criteria) this;
        }

        public Criteria andIncludeSeasonEqualTo(String value) {
            addCriterion("IncludeSeason =", value, "includeSeason");
            return (Criteria) this;
        }

        public Criteria andIncludeSeasonNotEqualTo(String value) {
            addCriterion("IncludeSeason <>", value, "includeSeason");
            return (Criteria) this;
        }

        public Criteria andIncludeSeasonGreaterThan(String value) {
            addCriterion("IncludeSeason >", value, "includeSeason");
            return (Criteria) this;
        }

        public Criteria andIncludeSeasonGreaterThanOrEqualTo(String value) {
            addCriterion("IncludeSeason >=", value, "includeSeason");
            return (Criteria) this;
        }

        public Criteria andIncludeSeasonLessThan(String value) {
            addCriterion("IncludeSeason <", value, "includeSeason");
            return (Criteria) this;
        }

        public Criteria andIncludeSeasonLessThanOrEqualTo(String value) {
            addCriterion("IncludeSeason <=", value, "includeSeason");
            return (Criteria) this;
        }

        public Criteria andIncludeSeasonLike(String value) {
            addCriterion("IncludeSeason like", value, "includeSeason");
            return (Criteria) this;
        }

        public Criteria andIncludeSeasonNotLike(String value) {
            addCriterion("IncludeSeason not like", value, "includeSeason");
            return (Criteria) this;
        }

        public Criteria andIncludeSeasonIn(List<String> values) {
            addCriterion("IncludeSeason in", values, "includeSeason");
            return (Criteria) this;
        }

        public Criteria andIncludeSeasonNotIn(List<String> values) {
            addCriterion("IncludeSeason not in", values, "includeSeason");
            return (Criteria) this;
        }

        public Criteria andIncludeSeasonBetween(String value1, String value2) {
            addCriterion("IncludeSeason between", value1, value2, "includeSeason");
            return (Criteria) this;
        }

        public Criteria andIncludeSeasonNotBetween(String value1, String value2) {
            addCriterion("IncludeSeason not between", value1, value2, "includeSeason");
            return (Criteria) this;
        }

        public Criteria andIsAnalyScoreIsNull() {
            addCriterion("IsAnalyScore is null");
            return (Criteria) this;
        }

        public Criteria andIsAnalyScoreIsNotNull() {
            addCriterion("IsAnalyScore is not null");
            return (Criteria) this;
        }

        public Criteria andIsAnalyScoreEqualTo(Boolean value) {
            addCriterion("IsAnalyScore =", value, "isAnalyScore");
            return (Criteria) this;
        }

        public Criteria andIsAnalyScoreNotEqualTo(Boolean value) {
            addCriterion("IsAnalyScore <>", value, "isAnalyScore");
            return (Criteria) this;
        }

        public Criteria andIsAnalyScoreGreaterThan(Boolean value) {
            addCriterion("IsAnalyScore >", value, "isAnalyScore");
            return (Criteria) this;
        }

        public Criteria andIsAnalyScoreGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsAnalyScore >=", value, "isAnalyScore");
            return (Criteria) this;
        }

        public Criteria andIsAnalyScoreLessThan(Boolean value) {
            addCriterion("IsAnalyScore <", value, "isAnalyScore");
            return (Criteria) this;
        }

        public Criteria andIsAnalyScoreLessThanOrEqualTo(Boolean value) {
            addCriterion("IsAnalyScore <=", value, "isAnalyScore");
            return (Criteria) this;
        }

        public Criteria andIsAnalyScoreIn(List<Boolean> values) {
            addCriterion("IsAnalyScore in", values, "isAnalyScore");
            return (Criteria) this;
        }

        public Criteria andIsAnalyScoreNotIn(List<Boolean> values) {
            addCriterion("IsAnalyScore not in", values, "isAnalyScore");
            return (Criteria) this;
        }

        public Criteria andIsAnalyScoreBetween(Boolean value1, Boolean value2) {
            addCriterion("IsAnalyScore between", value1, value2, "isAnalyScore");
            return (Criteria) this;
        }

        public Criteria andIsAnalyScoreNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsAnalyScore not between", value1, value2, "isAnalyScore");
            return (Criteria) this;
        }

        public Criteria andIsZuIsNull() {
            addCriterion("IsZu is null");
            return (Criteria) this;
        }

        public Criteria andIsZuIsNotNull() {
            addCriterion("IsZu is not null");
            return (Criteria) this;
        }

        public Criteria andIsZuEqualTo(Boolean value) {
            addCriterion("IsZu =", value, "isZu");
            return (Criteria) this;
        }

        public Criteria andIsZuNotEqualTo(Boolean value) {
            addCriterion("IsZu <>", value, "isZu");
            return (Criteria) this;
        }

        public Criteria andIsZuGreaterThan(Boolean value) {
            addCriterion("IsZu >", value, "isZu");
            return (Criteria) this;
        }

        public Criteria andIsZuGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsZu >=", value, "isZu");
            return (Criteria) this;
        }

        public Criteria andIsZuLessThan(Boolean value) {
            addCriterion("IsZu <", value, "isZu");
            return (Criteria) this;
        }

        public Criteria andIsZuLessThanOrEqualTo(Boolean value) {
            addCriterion("IsZu <=", value, "isZu");
            return (Criteria) this;
        }

        public Criteria andIsZuIn(List<Boolean> values) {
            addCriterion("IsZu in", values, "isZu");
            return (Criteria) this;
        }

        public Criteria andIsZuNotIn(List<Boolean> values) {
            addCriterion("IsZu not in", values, "isZu");
            return (Criteria) this;
        }

        public Criteria andIsZuBetween(Boolean value1, Boolean value2) {
            addCriterion("IsZu between", value1, value2, "isZu");
            return (Criteria) this;
        }

        public Criteria andIsZuNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsZu not between", value1, value2, "isZu");
            return (Criteria) this;
        }

        public Criteria andCurrentSeasonIsNull() {
            addCriterion("CurrentSeason is null");
            return (Criteria) this;
        }

        public Criteria andCurrentSeasonIsNotNull() {
            addCriterion("CurrentSeason is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentSeasonEqualTo(String value) {
            addCriterion("CurrentSeason =", value, "currentSeason");
            return (Criteria) this;
        }

        public Criteria andCurrentSeasonNotEqualTo(String value) {
            addCriterion("CurrentSeason <>", value, "currentSeason");
            return (Criteria) this;
        }

        public Criteria andCurrentSeasonGreaterThan(String value) {
            addCriterion("CurrentSeason >", value, "currentSeason");
            return (Criteria) this;
        }

        public Criteria andCurrentSeasonGreaterThanOrEqualTo(String value) {
            addCriterion("CurrentSeason >=", value, "currentSeason");
            return (Criteria) this;
        }

        public Criteria andCurrentSeasonLessThan(String value) {
            addCriterion("CurrentSeason <", value, "currentSeason");
            return (Criteria) this;
        }

        public Criteria andCurrentSeasonLessThanOrEqualTo(String value) {
            addCriterion("CurrentSeason <=", value, "currentSeason");
            return (Criteria) this;
        }

        public Criteria andCurrentSeasonLike(String value) {
            addCriterion("CurrentSeason like", value, "currentSeason");
            return (Criteria) this;
        }

        public Criteria andCurrentSeasonNotLike(String value) {
            addCriterion("CurrentSeason not like", value, "currentSeason");
            return (Criteria) this;
        }

        public Criteria andCurrentSeasonIn(List<String> values) {
            addCriterion("CurrentSeason in", values, "currentSeason");
            return (Criteria) this;
        }

        public Criteria andCurrentSeasonNotIn(List<String> values) {
            addCriterion("CurrentSeason not in", values, "currentSeason");
            return (Criteria) this;
        }

        public Criteria andCurrentSeasonBetween(String value1, String value2) {
            addCriterion("CurrentSeason between", value1, value2, "currentSeason");
            return (Criteria) this;
        }

        public Criteria andCurrentSeasonNotBetween(String value1, String value2) {
            addCriterion("CurrentSeason not between", value1, value2, "currentSeason");
            return (Criteria) this;
        }

        public Criteria andRef_orderSeasonIsNull() {
            addCriterion("ref_orderSeason is null");
            return (Criteria) this;
        }

        public Criteria andRef_orderSeasonIsNotNull() {
            addCriterion("ref_orderSeason is not null");
            return (Criteria) this;
        }

        public Criteria andRef_orderSeasonEqualTo(String value) {
            addCriterion("ref_orderSeason =", value, "ref_orderSeason");
            return (Criteria) this;
        }

        public Criteria andRef_orderSeasonNotEqualTo(String value) {
            addCriterion("ref_orderSeason <>", value, "ref_orderSeason");
            return (Criteria) this;
        }

        public Criteria andRef_orderSeasonGreaterThan(String value) {
            addCriterion("ref_orderSeason >", value, "ref_orderSeason");
            return (Criteria) this;
        }

        public Criteria andRef_orderSeasonGreaterThanOrEqualTo(String value) {
            addCriterion("ref_orderSeason >=", value, "ref_orderSeason");
            return (Criteria) this;
        }

        public Criteria andRef_orderSeasonLessThan(String value) {
            addCriterion("ref_orderSeason <", value, "ref_orderSeason");
            return (Criteria) this;
        }

        public Criteria andRef_orderSeasonLessThanOrEqualTo(String value) {
            addCriterion("ref_orderSeason <=", value, "ref_orderSeason");
            return (Criteria) this;
        }

        public Criteria andRef_orderSeasonLike(String value) {
            addCriterion("ref_orderSeason like", value, "ref_orderSeason");
            return (Criteria) this;
        }

        public Criteria andRef_orderSeasonNotLike(String value) {
            addCriterion("ref_orderSeason not like", value, "ref_orderSeason");
            return (Criteria) this;
        }

        public Criteria andRef_orderSeasonIn(List<String> values) {
            addCriterion("ref_orderSeason in", values, "ref_orderSeason");
            return (Criteria) this;
        }

        public Criteria andRef_orderSeasonNotIn(List<String> values) {
            addCriterion("ref_orderSeason not in", values, "ref_orderSeason");
            return (Criteria) this;
        }

        public Criteria andRef_orderSeasonBetween(String value1, String value2) {
            addCriterion("ref_orderSeason between", value1, value2, "ref_orderSeason");
            return (Criteria) this;
        }

        public Criteria andRef_orderSeasonNotBetween(String value1, String value2) {
            addCriterion("ref_orderSeason not between", value1, value2, "ref_orderSeason");
            return (Criteria) this;
        }

        public Criteria andRef_orderSubIdIsNull() {
            addCriterion("ref_orderSubId is null");
            return (Criteria) this;
        }

        public Criteria andRef_orderSubIdIsNotNull() {
            addCriterion("ref_orderSubId is not null");
            return (Criteria) this;
        }

        public Criteria andRef_orderSubIdEqualTo(Integer value) {
            addCriterion("ref_orderSubId =", value, "ref_orderSubId");
            return (Criteria) this;
        }

        public Criteria andRef_orderSubIdNotEqualTo(Integer value) {
            addCriterion("ref_orderSubId <>", value, "ref_orderSubId");
            return (Criteria) this;
        }

        public Criteria andRef_orderSubIdGreaterThan(Integer value) {
            addCriterion("ref_orderSubId >", value, "ref_orderSubId");
            return (Criteria) this;
        }

        public Criteria andRef_orderSubIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ref_orderSubId >=", value, "ref_orderSubId");
            return (Criteria) this;
        }

        public Criteria andRef_orderSubIdLessThan(Integer value) {
            addCriterion("ref_orderSubId <", value, "ref_orderSubId");
            return (Criteria) this;
        }

        public Criteria andRef_orderSubIdLessThanOrEqualTo(Integer value) {
            addCriterion("ref_orderSubId <=", value, "ref_orderSubId");
            return (Criteria) this;
        }

        public Criteria andRef_orderSubIdIn(List<Integer> values) {
            addCriterion("ref_orderSubId in", values, "ref_orderSubId");
            return (Criteria) this;
        }

        public Criteria andRef_orderSubIdNotIn(List<Integer> values) {
            addCriterion("ref_orderSubId not in", values, "ref_orderSubId");
            return (Criteria) this;
        }

        public Criteria andRef_orderSubIdBetween(Integer value1, Integer value2) {
            addCriterion("ref_orderSubId between", value1, value2, "ref_orderSubId");
            return (Criteria) this;
        }

        public Criteria andRef_orderSubIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ref_orderSubId not between", value1, value2, "ref_orderSubId");
            return (Criteria) this;
        }

        public Criteria andIsPrimaryIsNull() {
            addCriterion("isPrimary is null");
            return (Criteria) this;
        }

        public Criteria andIsPrimaryIsNotNull() {
            addCriterion("isPrimary is not null");
            return (Criteria) this;
        }

        public Criteria andIsPrimaryEqualTo(Boolean value) {
            addCriterion("isPrimary =", value, "isPrimary");
            return (Criteria) this;
        }

        public Criteria andIsPrimaryNotEqualTo(Boolean value) {
            addCriterion("isPrimary <>", value, "isPrimary");
            return (Criteria) this;
        }

        public Criteria andIsPrimaryGreaterThan(Boolean value) {
            addCriterion("isPrimary >", value, "isPrimary");
            return (Criteria) this;
        }

        public Criteria andIsPrimaryGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isPrimary >=", value, "isPrimary");
            return (Criteria) this;
        }

        public Criteria andIsPrimaryLessThan(Boolean value) {
            addCriterion("isPrimary <", value, "isPrimary");
            return (Criteria) this;
        }

        public Criteria andIsPrimaryLessThanOrEqualTo(Boolean value) {
            addCriterion("isPrimary <=", value, "isPrimary");
            return (Criteria) this;
        }

        public Criteria andIsPrimaryIn(List<Boolean> values) {
            addCriterion("isPrimary in", values, "isPrimary");
            return (Criteria) this;
        }

        public Criteria andIsPrimaryNotIn(List<Boolean> values) {
            addCriterion("isPrimary not in", values, "isPrimary");
            return (Criteria) this;
        }

        public Criteria andIsPrimaryBetween(Boolean value1, Boolean value2) {
            addCriterion("isPrimary between", value1, value2, "isPrimary");
            return (Criteria) this;
        }

        public Criteria andIsPrimaryNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isPrimary not between", value1, value2, "isPrimary");
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