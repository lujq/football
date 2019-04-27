package com.example.spinwheel.base.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SclassExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SclassExample() {
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

        public Criteria andSclassIDIsNull() {
            addCriterion("sclassID is null");
            return (Criteria) this;
        }

        public Criteria andSclassIDIsNotNull() {
            addCriterion("sclassID is not null");
            return (Criteria) this;
        }

        public Criteria andSclassIDEqualTo(Integer value) {
            addCriterion("sclassID =", value, "sclassID");
            return (Criteria) this;
        }

        public Criteria andSclassIDNotEqualTo(Integer value) {
            addCriterion("sclassID <>", value, "sclassID");
            return (Criteria) this;
        }

        public Criteria andSclassIDGreaterThan(Integer value) {
            addCriterion("sclassID >", value, "sclassID");
            return (Criteria) this;
        }

        public Criteria andSclassIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("sclassID >=", value, "sclassID");
            return (Criteria) this;
        }

        public Criteria andSclassIDLessThan(Integer value) {
            addCriterion("sclassID <", value, "sclassID");
            return (Criteria) this;
        }

        public Criteria andSclassIDLessThanOrEqualTo(Integer value) {
            addCriterion("sclassID <=", value, "sclassID");
            return (Criteria) this;
        }

        public Criteria andSclassIDIn(List<Integer> values) {
            addCriterion("sclassID in", values, "sclassID");
            return (Criteria) this;
        }

        public Criteria andSclassIDNotIn(List<Integer> values) {
            addCriterion("sclassID not in", values, "sclassID");
            return (Criteria) this;
        }

        public Criteria andSclassIDBetween(Integer value1, Integer value2) {
            addCriterion("sclassID between", value1, value2, "sclassID");
            return (Criteria) this;
        }

        public Criteria andSclassIDNotBetween(Integer value1, Integer value2) {
            addCriterion("sclassID not between", value1, value2, "sclassID");
            return (Criteria) this;
        }

        public Criteria andColorIsNull() {
            addCriterion("Color is null");
            return (Criteria) this;
        }

        public Criteria andColorIsNotNull() {
            addCriterion("Color is not null");
            return (Criteria) this;
        }

        public Criteria andColorEqualTo(String value) {
            addCriterion("Color =", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotEqualTo(String value) {
            addCriterion("Color <>", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThan(String value) {
            addCriterion("Color >", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThanOrEqualTo(String value) {
            addCriterion("Color >=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThan(String value) {
            addCriterion("Color <", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThanOrEqualTo(String value) {
            addCriterion("Color <=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLike(String value) {
            addCriterion("Color like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotLike(String value) {
            addCriterion("Color not like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorIn(List<String> values) {
            addCriterion("Color in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotIn(List<String> values) {
            addCriterion("Color not in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorBetween(String value1, String value2) {
            addCriterion("Color between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotBetween(String value1, String value2) {
            addCriterion("Color not between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andName_JIsNull() {
            addCriterion("Name_J is null");
            return (Criteria) this;
        }

        public Criteria andName_JIsNotNull() {
            addCriterion("Name_J is not null");
            return (Criteria) this;
        }

        public Criteria andName_JEqualTo(String value) {
            addCriterion("Name_J =", value, "name_J");
            return (Criteria) this;
        }

        public Criteria andName_JNotEqualTo(String value) {
            addCriterion("Name_J <>", value, "name_J");
            return (Criteria) this;
        }

        public Criteria andName_JGreaterThan(String value) {
            addCriterion("Name_J >", value, "name_J");
            return (Criteria) this;
        }

        public Criteria andName_JGreaterThanOrEqualTo(String value) {
            addCriterion("Name_J >=", value, "name_J");
            return (Criteria) this;
        }

        public Criteria andName_JLessThan(String value) {
            addCriterion("Name_J <", value, "name_J");
            return (Criteria) this;
        }

        public Criteria andName_JLessThanOrEqualTo(String value) {
            addCriterion("Name_J <=", value, "name_J");
            return (Criteria) this;
        }

        public Criteria andName_JLike(String value) {
            addCriterion("Name_J like", value, "name_J");
            return (Criteria) this;
        }

        public Criteria andName_JNotLike(String value) {
            addCriterion("Name_J not like", value, "name_J");
            return (Criteria) this;
        }

        public Criteria andName_JIn(List<String> values) {
            addCriterion("Name_J in", values, "name_J");
            return (Criteria) this;
        }

        public Criteria andName_JNotIn(List<String> values) {
            addCriterion("Name_J not in", values, "name_J");
            return (Criteria) this;
        }

        public Criteria andName_JBetween(String value1, String value2) {
            addCriterion("Name_J between", value1, value2, "name_J");
            return (Criteria) this;
        }

        public Criteria andName_JNotBetween(String value1, String value2) {
            addCriterion("Name_J not between", value1, value2, "name_J");
            return (Criteria) this;
        }

        public Criteria andName_FIsNull() {
            addCriterion("Name_F is null");
            return (Criteria) this;
        }

        public Criteria andName_FIsNotNull() {
            addCriterion("Name_F is not null");
            return (Criteria) this;
        }

        public Criteria andName_FEqualTo(String value) {
            addCriterion("Name_F =", value, "name_F");
            return (Criteria) this;
        }

        public Criteria andName_FNotEqualTo(String value) {
            addCriterion("Name_F <>", value, "name_F");
            return (Criteria) this;
        }

        public Criteria andName_FGreaterThan(String value) {
            addCriterion("Name_F >", value, "name_F");
            return (Criteria) this;
        }

        public Criteria andName_FGreaterThanOrEqualTo(String value) {
            addCriterion("Name_F >=", value, "name_F");
            return (Criteria) this;
        }

        public Criteria andName_FLessThan(String value) {
            addCriterion("Name_F <", value, "name_F");
            return (Criteria) this;
        }

        public Criteria andName_FLessThanOrEqualTo(String value) {
            addCriterion("Name_F <=", value, "name_F");
            return (Criteria) this;
        }

        public Criteria andName_FLike(String value) {
            addCriterion("Name_F like", value, "name_F");
            return (Criteria) this;
        }

        public Criteria andName_FNotLike(String value) {
            addCriterion("Name_F not like", value, "name_F");
            return (Criteria) this;
        }

        public Criteria andName_FIn(List<String> values) {
            addCriterion("Name_F in", values, "name_F");
            return (Criteria) this;
        }

        public Criteria andName_FNotIn(List<String> values) {
            addCriterion("Name_F not in", values, "name_F");
            return (Criteria) this;
        }

        public Criteria andName_FBetween(String value1, String value2) {
            addCriterion("Name_F between", value1, value2, "name_F");
            return (Criteria) this;
        }

        public Criteria andName_FNotBetween(String value1, String value2) {
            addCriterion("Name_F not between", value1, value2, "name_F");
            return (Criteria) this;
        }

        public Criteria andName_EIsNull() {
            addCriterion("Name_E is null");
            return (Criteria) this;
        }

        public Criteria andName_EIsNotNull() {
            addCriterion("Name_E is not null");
            return (Criteria) this;
        }

        public Criteria andName_EEqualTo(String value) {
            addCriterion("Name_E =", value, "name_E");
            return (Criteria) this;
        }

        public Criteria andName_ENotEqualTo(String value) {
            addCriterion("Name_E <>", value, "name_E");
            return (Criteria) this;
        }

        public Criteria andName_EGreaterThan(String value) {
            addCriterion("Name_E >", value, "name_E");
            return (Criteria) this;
        }

        public Criteria andName_EGreaterThanOrEqualTo(String value) {
            addCriterion("Name_E >=", value, "name_E");
            return (Criteria) this;
        }

        public Criteria andName_ELessThan(String value) {
            addCriterion("Name_E <", value, "name_E");
            return (Criteria) this;
        }

        public Criteria andName_ELessThanOrEqualTo(String value) {
            addCriterion("Name_E <=", value, "name_E");
            return (Criteria) this;
        }

        public Criteria andName_ELike(String value) {
            addCriterion("Name_E like", value, "name_E");
            return (Criteria) this;
        }

        public Criteria andName_ENotLike(String value) {
            addCriterion("Name_E not like", value, "name_E");
            return (Criteria) this;
        }

        public Criteria andName_EIn(List<String> values) {
            addCriterion("Name_E in", values, "name_E");
            return (Criteria) this;
        }

        public Criteria andName_ENotIn(List<String> values) {
            addCriterion("Name_E not in", values, "name_E");
            return (Criteria) this;
        }

        public Criteria andName_EBetween(String value1, String value2) {
            addCriterion("Name_E between", value1, value2, "name_E");
            return (Criteria) this;
        }

        public Criteria andName_ENotBetween(String value1, String value2) {
            addCriterion("Name_E not between", value1, value2, "name_E");
            return (Criteria) this;
        }

        public Criteria andName_JSIsNull() {
            addCriterion("Name_JS is null");
            return (Criteria) this;
        }

        public Criteria andName_JSIsNotNull() {
            addCriterion("Name_JS is not null");
            return (Criteria) this;
        }

        public Criteria andName_JSEqualTo(String value) {
            addCriterion("Name_JS =", value, "name_JS");
            return (Criteria) this;
        }

        public Criteria andName_JSNotEqualTo(String value) {
            addCriterion("Name_JS <>", value, "name_JS");
            return (Criteria) this;
        }

        public Criteria andName_JSGreaterThan(String value) {
            addCriterion("Name_JS >", value, "name_JS");
            return (Criteria) this;
        }

        public Criteria andName_JSGreaterThanOrEqualTo(String value) {
            addCriterion("Name_JS >=", value, "name_JS");
            return (Criteria) this;
        }

        public Criteria andName_JSLessThan(String value) {
            addCriterion("Name_JS <", value, "name_JS");
            return (Criteria) this;
        }

        public Criteria andName_JSLessThanOrEqualTo(String value) {
            addCriterion("Name_JS <=", value, "name_JS");
            return (Criteria) this;
        }

        public Criteria andName_JSLike(String value) {
            addCriterion("Name_JS like", value, "name_JS");
            return (Criteria) this;
        }

        public Criteria andName_JSNotLike(String value) {
            addCriterion("Name_JS not like", value, "name_JS");
            return (Criteria) this;
        }

        public Criteria andName_JSIn(List<String> values) {
            addCriterion("Name_JS in", values, "name_JS");
            return (Criteria) this;
        }

        public Criteria andName_JSNotIn(List<String> values) {
            addCriterion("Name_JS not in", values, "name_JS");
            return (Criteria) this;
        }

        public Criteria andName_JSBetween(String value1, String value2) {
            addCriterion("Name_JS between", value1, value2, "name_JS");
            return (Criteria) this;
        }

        public Criteria andName_JSNotBetween(String value1, String value2) {
            addCriterion("Name_JS not between", value1, value2, "name_JS");
            return (Criteria) this;
        }

        public Criteria andName_FSIsNull() {
            addCriterion("Name_FS is null");
            return (Criteria) this;
        }

        public Criteria andName_FSIsNotNull() {
            addCriterion("Name_FS is not null");
            return (Criteria) this;
        }

        public Criteria andName_FSEqualTo(String value) {
            addCriterion("Name_FS =", value, "name_FS");
            return (Criteria) this;
        }

        public Criteria andName_FSNotEqualTo(String value) {
            addCriterion("Name_FS <>", value, "name_FS");
            return (Criteria) this;
        }

        public Criteria andName_FSGreaterThan(String value) {
            addCriterion("Name_FS >", value, "name_FS");
            return (Criteria) this;
        }

        public Criteria andName_FSGreaterThanOrEqualTo(String value) {
            addCriterion("Name_FS >=", value, "name_FS");
            return (Criteria) this;
        }

        public Criteria andName_FSLessThan(String value) {
            addCriterion("Name_FS <", value, "name_FS");
            return (Criteria) this;
        }

        public Criteria andName_FSLessThanOrEqualTo(String value) {
            addCriterion("Name_FS <=", value, "name_FS");
            return (Criteria) this;
        }

        public Criteria andName_FSLike(String value) {
            addCriterion("Name_FS like", value, "name_FS");
            return (Criteria) this;
        }

        public Criteria andName_FSNotLike(String value) {
            addCriterion("Name_FS not like", value, "name_FS");
            return (Criteria) this;
        }

        public Criteria andName_FSIn(List<String> values) {
            addCriterion("Name_FS in", values, "name_FS");
            return (Criteria) this;
        }

        public Criteria andName_FSNotIn(List<String> values) {
            addCriterion("Name_FS not in", values, "name_FS");
            return (Criteria) this;
        }

        public Criteria andName_FSBetween(String value1, String value2) {
            addCriterion("Name_FS between", value1, value2, "name_FS");
            return (Criteria) this;
        }

        public Criteria andName_FSNotBetween(String value1, String value2) {
            addCriterion("Name_FS not between", value1, value2, "name_FS");
            return (Criteria) this;
        }

        public Criteria andName_ESIsNull() {
            addCriterion("Name_ES is null");
            return (Criteria) this;
        }

        public Criteria andName_ESIsNotNull() {
            addCriterion("Name_ES is not null");
            return (Criteria) this;
        }

        public Criteria andName_ESEqualTo(String value) {
            addCriterion("Name_ES =", value, "name_ES");
            return (Criteria) this;
        }

        public Criteria andName_ESNotEqualTo(String value) {
            addCriterion("Name_ES <>", value, "name_ES");
            return (Criteria) this;
        }

        public Criteria andName_ESGreaterThan(String value) {
            addCriterion("Name_ES >", value, "name_ES");
            return (Criteria) this;
        }

        public Criteria andName_ESGreaterThanOrEqualTo(String value) {
            addCriterion("Name_ES >=", value, "name_ES");
            return (Criteria) this;
        }

        public Criteria andName_ESLessThan(String value) {
            addCriterion("Name_ES <", value, "name_ES");
            return (Criteria) this;
        }

        public Criteria andName_ESLessThanOrEqualTo(String value) {
            addCriterion("Name_ES <=", value, "name_ES");
            return (Criteria) this;
        }

        public Criteria andName_ESLike(String value) {
            addCriterion("Name_ES like", value, "name_ES");
            return (Criteria) this;
        }

        public Criteria andName_ESNotLike(String value) {
            addCriterion("Name_ES not like", value, "name_ES");
            return (Criteria) this;
        }

        public Criteria andName_ESIn(List<String> values) {
            addCriterion("Name_ES in", values, "name_ES");
            return (Criteria) this;
        }

        public Criteria andName_ESNotIn(List<String> values) {
            addCriterion("Name_ES not in", values, "name_ES");
            return (Criteria) this;
        }

        public Criteria andName_ESBetween(String value1, String value2) {
            addCriterion("Name_ES between", value1, value2, "name_ES");
            return (Criteria) this;
        }

        public Criteria andName_ESNotBetween(String value1, String value2) {
            addCriterion("Name_ES not between", value1, value2, "name_ES");
            return (Criteria) this;
        }

        public Criteria andName_SIsNull() {
            addCriterion("Name_S is null");
            return (Criteria) this;
        }

        public Criteria andName_SIsNotNull() {
            addCriterion("Name_S is not null");
            return (Criteria) this;
        }

        public Criteria andName_SEqualTo(String value) {
            addCriterion("Name_S =", value, "name_S");
            return (Criteria) this;
        }

        public Criteria andName_SNotEqualTo(String value) {
            addCriterion("Name_S <>", value, "name_S");
            return (Criteria) this;
        }

        public Criteria andName_SGreaterThan(String value) {
            addCriterion("Name_S >", value, "name_S");
            return (Criteria) this;
        }

        public Criteria andName_SGreaterThanOrEqualTo(String value) {
            addCriterion("Name_S >=", value, "name_S");
            return (Criteria) this;
        }

        public Criteria andName_SLessThan(String value) {
            addCriterion("Name_S <", value, "name_S");
            return (Criteria) this;
        }

        public Criteria andName_SLessThanOrEqualTo(String value) {
            addCriterion("Name_S <=", value, "name_S");
            return (Criteria) this;
        }

        public Criteria andName_SLike(String value) {
            addCriterion("Name_S like", value, "name_S");
            return (Criteria) this;
        }

        public Criteria andName_SNotLike(String value) {
            addCriterion("Name_S not like", value, "name_S");
            return (Criteria) this;
        }

        public Criteria andName_SIn(List<String> values) {
            addCriterion("Name_S in", values, "name_S");
            return (Criteria) this;
        }

        public Criteria andName_SNotIn(List<String> values) {
            addCriterion("Name_S not in", values, "name_S");
            return (Criteria) this;
        }

        public Criteria andName_SBetween(String value1, String value2) {
            addCriterion("Name_S between", value1, value2, "name_S");
            return (Criteria) this;
        }

        public Criteria andName_SNotBetween(String value1, String value2) {
            addCriterion("Name_S not between", value1, value2, "name_S");
            return (Criteria) this;
        }

        public Criteria andKindIsNull() {
            addCriterion("Kind is null");
            return (Criteria) this;
        }

        public Criteria andKindIsNotNull() {
            addCriterion("Kind is not null");
            return (Criteria) this;
        }

        public Criteria andKindEqualTo(Short value) {
            addCriterion("Kind =", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindNotEqualTo(Short value) {
            addCriterion("Kind <>", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindGreaterThan(Short value) {
            addCriterion("Kind >", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindGreaterThanOrEqualTo(Short value) {
            addCriterion("Kind >=", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindLessThan(Short value) {
            addCriterion("Kind <", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindLessThanOrEqualTo(Short value) {
            addCriterion("Kind <=", value, "kind");
            return (Criteria) this;
        }

        public Criteria andKindIn(List<Short> values) {
            addCriterion("Kind in", values, "kind");
            return (Criteria) this;
        }

        public Criteria andKindNotIn(List<Short> values) {
            addCriterion("Kind not in", values, "kind");
            return (Criteria) this;
        }

        public Criteria andKindBetween(Short value1, Short value2) {
            addCriterion("Kind between", value1, value2, "kind");
            return (Criteria) this;
        }

        public Criteria andKindNotBetween(Short value1, Short value2) {
            addCriterion("Kind not between", value1, value2, "kind");
            return (Criteria) this;
        }

        public Criteria andModeIsNull() {
            addCriterion("Mode is null");
            return (Criteria) this;
        }

        public Criteria andModeIsNotNull() {
            addCriterion("Mode is not null");
            return (Criteria) this;
        }

        public Criteria andModeEqualTo(Short value) {
            addCriterion("Mode =", value, "mode");
            return (Criteria) this;
        }

        public Criteria andModeNotEqualTo(Short value) {
            addCriterion("Mode <>", value, "mode");
            return (Criteria) this;
        }

        public Criteria andModeGreaterThan(Short value) {
            addCriterion("Mode >", value, "mode");
            return (Criteria) this;
        }

        public Criteria andModeGreaterThanOrEqualTo(Short value) {
            addCriterion("Mode >=", value, "mode");
            return (Criteria) this;
        }

        public Criteria andModeLessThan(Short value) {
            addCriterion("Mode <", value, "mode");
            return (Criteria) this;
        }

        public Criteria andModeLessThanOrEqualTo(Short value) {
            addCriterion("Mode <=", value, "mode");
            return (Criteria) this;
        }

        public Criteria andModeIn(List<Short> values) {
            addCriterion("Mode in", values, "mode");
            return (Criteria) this;
        }

        public Criteria andModeNotIn(List<Short> values) {
            addCriterion("Mode not in", values, "mode");
            return (Criteria) this;
        }

        public Criteria andModeBetween(Short value1, Short value2) {
            addCriterion("Mode between", value1, value2, "mode");
            return (Criteria) this;
        }

        public Criteria andModeNotBetween(Short value1, Short value2) {
            addCriterion("Mode not between", value1, value2, "mode");
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

        public Criteria andCount_roundEqualTo(Short value) {
            addCriterion("count_round =", value, "count_round");
            return (Criteria) this;
        }

        public Criteria andCount_roundNotEqualTo(Short value) {
            addCriterion("count_round <>", value, "count_round");
            return (Criteria) this;
        }

        public Criteria andCount_roundGreaterThan(Short value) {
            addCriterion("count_round >", value, "count_round");
            return (Criteria) this;
        }

        public Criteria andCount_roundGreaterThanOrEqualTo(Short value) {
            addCriterion("count_round >=", value, "count_round");
            return (Criteria) this;
        }

        public Criteria andCount_roundLessThan(Short value) {
            addCriterion("count_round <", value, "count_round");
            return (Criteria) this;
        }

        public Criteria andCount_roundLessThanOrEqualTo(Short value) {
            addCriterion("count_round <=", value, "count_round");
            return (Criteria) this;
        }

        public Criteria andCount_roundIn(List<Short> values) {
            addCriterion("count_round in", values, "count_round");
            return (Criteria) this;
        }

        public Criteria andCount_roundNotIn(List<Short> values) {
            addCriterion("count_round not in", values, "count_round");
            return (Criteria) this;
        }

        public Criteria andCount_roundBetween(Short value1, Short value2) {
            addCriterion("count_round between", value1, value2, "count_round");
            return (Criteria) this;
        }

        public Criteria andCount_roundNotBetween(Short value1, Short value2) {
            addCriterion("count_round not between", value1, value2, "count_round");
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

        public Criteria andCurr_roundEqualTo(Short value) {
            addCriterion("curr_round =", value, "curr_round");
            return (Criteria) this;
        }

        public Criteria andCurr_roundNotEqualTo(Short value) {
            addCriterion("curr_round <>", value, "curr_round");
            return (Criteria) this;
        }

        public Criteria andCurr_roundGreaterThan(Short value) {
            addCriterion("curr_round >", value, "curr_round");
            return (Criteria) this;
        }

        public Criteria andCurr_roundGreaterThanOrEqualTo(Short value) {
            addCriterion("curr_round >=", value, "curr_round");
            return (Criteria) this;
        }

        public Criteria andCurr_roundLessThan(Short value) {
            addCriterion("curr_round <", value, "curr_round");
            return (Criteria) this;
        }

        public Criteria andCurr_roundLessThanOrEqualTo(Short value) {
            addCriterion("curr_round <=", value, "curr_round");
            return (Criteria) this;
        }

        public Criteria andCurr_roundIn(List<Short> values) {
            addCriterion("curr_round in", values, "curr_round");
            return (Criteria) this;
        }

        public Criteria andCurr_roundNotIn(List<Short> values) {
            addCriterion("curr_round not in", values, "curr_round");
            return (Criteria) this;
        }

        public Criteria andCurr_roundBetween(Short value1, Short value2) {
            addCriterion("curr_round between", value1, value2, "curr_round");
            return (Criteria) this;
        }

        public Criteria andCurr_roundNotBetween(Short value1, Short value2) {
            addCriterion("curr_round not between", value1, value2, "curr_round");
            return (Criteria) this;
        }

        public Criteria andCurr_matchSeasonIsNull() {
            addCriterion("Curr_matchSeason is null");
            return (Criteria) this;
        }

        public Criteria andCurr_matchSeasonIsNotNull() {
            addCriterion("Curr_matchSeason is not null");
            return (Criteria) this;
        }

        public Criteria andCurr_matchSeasonEqualTo(String value) {
            addCriterion("Curr_matchSeason =", value, "curr_matchSeason");
            return (Criteria) this;
        }

        public Criteria andCurr_matchSeasonNotEqualTo(String value) {
            addCriterion("Curr_matchSeason <>", value, "curr_matchSeason");
            return (Criteria) this;
        }

        public Criteria andCurr_matchSeasonGreaterThan(String value) {
            addCriterion("Curr_matchSeason >", value, "curr_matchSeason");
            return (Criteria) this;
        }

        public Criteria andCurr_matchSeasonGreaterThanOrEqualTo(String value) {
            addCriterion("Curr_matchSeason >=", value, "curr_matchSeason");
            return (Criteria) this;
        }

        public Criteria andCurr_matchSeasonLessThan(String value) {
            addCriterion("Curr_matchSeason <", value, "curr_matchSeason");
            return (Criteria) this;
        }

        public Criteria andCurr_matchSeasonLessThanOrEqualTo(String value) {
            addCriterion("Curr_matchSeason <=", value, "curr_matchSeason");
            return (Criteria) this;
        }

        public Criteria andCurr_matchSeasonLike(String value) {
            addCriterion("Curr_matchSeason like", value, "curr_matchSeason");
            return (Criteria) this;
        }

        public Criteria andCurr_matchSeasonNotLike(String value) {
            addCriterion("Curr_matchSeason not like", value, "curr_matchSeason");
            return (Criteria) this;
        }

        public Criteria andCurr_matchSeasonIn(List<String> values) {
            addCriterion("Curr_matchSeason in", values, "curr_matchSeason");
            return (Criteria) this;
        }

        public Criteria andCurr_matchSeasonNotIn(List<String> values) {
            addCriterion("Curr_matchSeason not in", values, "curr_matchSeason");
            return (Criteria) this;
        }

        public Criteria andCurr_matchSeasonBetween(String value1, String value2) {
            addCriterion("Curr_matchSeason between", value1, value2, "curr_matchSeason");
            return (Criteria) this;
        }

        public Criteria andCurr_matchSeasonNotBetween(String value1, String value2) {
            addCriterion("Curr_matchSeason not between", value1, value2, "curr_matchSeason");
            return (Criteria) this;
        }

        public Criteria andSclass_picIsNull() {
            addCriterion("Sclass_pic is null");
            return (Criteria) this;
        }

        public Criteria andSclass_picIsNotNull() {
            addCriterion("Sclass_pic is not null");
            return (Criteria) this;
        }

        public Criteria andSclass_picEqualTo(String value) {
            addCriterion("Sclass_pic =", value, "sclass_pic");
            return (Criteria) this;
        }

        public Criteria andSclass_picNotEqualTo(String value) {
            addCriterion("Sclass_pic <>", value, "sclass_pic");
            return (Criteria) this;
        }

        public Criteria andSclass_picGreaterThan(String value) {
            addCriterion("Sclass_pic >", value, "sclass_pic");
            return (Criteria) this;
        }

        public Criteria andSclass_picGreaterThanOrEqualTo(String value) {
            addCriterion("Sclass_pic >=", value, "sclass_pic");
            return (Criteria) this;
        }

        public Criteria andSclass_picLessThan(String value) {
            addCriterion("Sclass_pic <", value, "sclass_pic");
            return (Criteria) this;
        }

        public Criteria andSclass_picLessThanOrEqualTo(String value) {
            addCriterion("Sclass_pic <=", value, "sclass_pic");
            return (Criteria) this;
        }

        public Criteria andSclass_picLike(String value) {
            addCriterion("Sclass_pic like", value, "sclass_pic");
            return (Criteria) this;
        }

        public Criteria andSclass_picNotLike(String value) {
            addCriterion("Sclass_pic not like", value, "sclass_pic");
            return (Criteria) this;
        }

        public Criteria andSclass_picIn(List<String> values) {
            addCriterion("Sclass_pic in", values, "sclass_pic");
            return (Criteria) this;
        }

        public Criteria andSclass_picNotIn(List<String> values) {
            addCriterion("Sclass_pic not in", values, "sclass_pic");
            return (Criteria) this;
        }

        public Criteria andSclass_picBetween(String value1, String value2) {
            addCriterion("Sclass_pic between", value1, value2, "sclass_pic");
            return (Criteria) this;
        }

        public Criteria andSclass_picNotBetween(String value1, String value2) {
            addCriterion("Sclass_pic not between", value1, value2, "sclass_pic");
            return (Criteria) this;
        }

        public Criteria andIfstopIsNull() {
            addCriterion("ifstop is null");
            return (Criteria) this;
        }

        public Criteria andIfstopIsNotNull() {
            addCriterion("ifstop is not null");
            return (Criteria) this;
        }

        public Criteria andIfstopEqualTo(Byte value) {
            addCriterion("ifstop =", value, "ifstop");
            return (Criteria) this;
        }

        public Criteria andIfstopNotEqualTo(Byte value) {
            addCriterion("ifstop <>", value, "ifstop");
            return (Criteria) this;
        }

        public Criteria andIfstopGreaterThan(Byte value) {
            addCriterion("ifstop >", value, "ifstop");
            return (Criteria) this;
        }

        public Criteria andIfstopGreaterThanOrEqualTo(Byte value) {
            addCriterion("ifstop >=", value, "ifstop");
            return (Criteria) this;
        }

        public Criteria andIfstopLessThan(Byte value) {
            addCriterion("ifstop <", value, "ifstop");
            return (Criteria) this;
        }

        public Criteria andIfstopLessThanOrEqualTo(Byte value) {
            addCriterion("ifstop <=", value, "ifstop");
            return (Criteria) this;
        }

        public Criteria andIfstopIn(List<Byte> values) {
            addCriterion("ifstop in", values, "ifstop");
            return (Criteria) this;
        }

        public Criteria andIfstopNotIn(List<Byte> values) {
            addCriterion("ifstop not in", values, "ifstop");
            return (Criteria) this;
        }

        public Criteria andIfstopBetween(Byte value1, Byte value2) {
            addCriterion("ifstop between", value1, value2, "ifstop");
            return (Criteria) this;
        }

        public Criteria andIfstopNotBetween(Byte value1, Byte value2) {
            addCriterion("ifstop not between", value1, value2, "ifstop");
            return (Criteria) this;
        }

        public Criteria andSclass_typeIsNull() {
            addCriterion("Sclass_type is null");
            return (Criteria) this;
        }

        public Criteria andSclass_typeIsNotNull() {
            addCriterion("Sclass_type is not null");
            return (Criteria) this;
        }

        public Criteria andSclass_typeEqualTo(Byte value) {
            addCriterion("Sclass_type =", value, "sclass_type");
            return (Criteria) this;
        }

        public Criteria andSclass_typeNotEqualTo(Byte value) {
            addCriterion("Sclass_type <>", value, "sclass_type");
            return (Criteria) this;
        }

        public Criteria andSclass_typeGreaterThan(Byte value) {
            addCriterion("Sclass_type >", value, "sclass_type");
            return (Criteria) this;
        }

        public Criteria andSclass_typeGreaterThanOrEqualTo(Byte value) {
            addCriterion("Sclass_type >=", value, "sclass_type");
            return (Criteria) this;
        }

        public Criteria andSclass_typeLessThan(Byte value) {
            addCriterion("Sclass_type <", value, "sclass_type");
            return (Criteria) this;
        }

        public Criteria andSclass_typeLessThanOrEqualTo(Byte value) {
            addCriterion("Sclass_type <=", value, "sclass_type");
            return (Criteria) this;
        }

        public Criteria andSclass_typeIn(List<Byte> values) {
            addCriterion("Sclass_type in", values, "sclass_type");
            return (Criteria) this;
        }

        public Criteria andSclass_typeNotIn(List<Byte> values) {
            addCriterion("Sclass_type not in", values, "sclass_type");
            return (Criteria) this;
        }

        public Criteria andSclass_typeBetween(Byte value1, Byte value2) {
            addCriterion("Sclass_type between", value1, value2, "sclass_type");
            return (Criteria) this;
        }

        public Criteria andSclass_typeNotBetween(Byte value1, Byte value2) {
            addCriterion("Sclass_type not between", value1, value2, "sclass_type");
            return (Criteria) this;
        }

        public Criteria andCount_groupIsNull() {
            addCriterion("count_group is null");
            return (Criteria) this;
        }

        public Criteria andCount_groupIsNotNull() {
            addCriterion("count_group is not null");
            return (Criteria) this;
        }

        public Criteria andCount_groupEqualTo(Short value) {
            addCriterion("count_group =", value, "count_group");
            return (Criteria) this;
        }

        public Criteria andCount_groupNotEqualTo(Short value) {
            addCriterion("count_group <>", value, "count_group");
            return (Criteria) this;
        }

        public Criteria andCount_groupGreaterThan(Short value) {
            addCriterion("count_group >", value, "count_group");
            return (Criteria) this;
        }

        public Criteria andCount_groupGreaterThanOrEqualTo(Short value) {
            addCriterion("count_group >=", value, "count_group");
            return (Criteria) this;
        }

        public Criteria andCount_groupLessThan(Short value) {
            addCriterion("count_group <", value, "count_group");
            return (Criteria) this;
        }

        public Criteria andCount_groupLessThanOrEqualTo(Short value) {
            addCriterion("count_group <=", value, "count_group");
            return (Criteria) this;
        }

        public Criteria andCount_groupIn(List<Short> values) {
            addCriterion("count_group in", values, "count_group");
            return (Criteria) this;
        }

        public Criteria andCount_groupNotIn(List<Short> values) {
            addCriterion("count_group not in", values, "count_group");
            return (Criteria) this;
        }

        public Criteria andCount_groupBetween(Short value1, Short value2) {
            addCriterion("count_group between", value1, value2, "count_group");
            return (Criteria) this;
        }

        public Criteria andCount_groupNotBetween(Short value1, Short value2) {
            addCriterion("count_group not between", value1, value2, "count_group");
            return (Criteria) this;
        }

        public Criteria andBf_simply_dispIsNull() {
            addCriterion("Bf_simply_disp is null");
            return (Criteria) this;
        }

        public Criteria andBf_simply_dispIsNotNull() {
            addCriterion("Bf_simply_disp is not null");
            return (Criteria) this;
        }

        public Criteria andBf_simply_dispEqualTo(Byte value) {
            addCriterion("Bf_simply_disp =", value, "bf_simply_disp");
            return (Criteria) this;
        }

        public Criteria andBf_simply_dispNotEqualTo(Byte value) {
            addCriterion("Bf_simply_disp <>", value, "bf_simply_disp");
            return (Criteria) this;
        }

        public Criteria andBf_simply_dispGreaterThan(Byte value) {
            addCriterion("Bf_simply_disp >", value, "bf_simply_disp");
            return (Criteria) this;
        }

        public Criteria andBf_simply_dispGreaterThanOrEqualTo(Byte value) {
            addCriterion("Bf_simply_disp >=", value, "bf_simply_disp");
            return (Criteria) this;
        }

        public Criteria andBf_simply_dispLessThan(Byte value) {
            addCriterion("Bf_simply_disp <", value, "bf_simply_disp");
            return (Criteria) this;
        }

        public Criteria andBf_simply_dispLessThanOrEqualTo(Byte value) {
            addCriterion("Bf_simply_disp <=", value, "bf_simply_disp");
            return (Criteria) this;
        }

        public Criteria andBf_simply_dispIn(List<Byte> values) {
            addCriterion("Bf_simply_disp in", values, "bf_simply_disp");
            return (Criteria) this;
        }

        public Criteria andBf_simply_dispNotIn(List<Byte> values) {
            addCriterion("Bf_simply_disp not in", values, "bf_simply_disp");
            return (Criteria) this;
        }

        public Criteria andBf_simply_dispBetween(Byte value1, Byte value2) {
            addCriterion("Bf_simply_disp between", value1, value2, "bf_simply_disp");
            return (Criteria) this;
        }

        public Criteria andBf_simply_dispNotBetween(Byte value1, Byte value2) {
            addCriterion("Bf_simply_disp not between", value1, value2, "bf_simply_disp");
            return (Criteria) this;
        }

        public Criteria andSclass_sequenceIsNull() {
            addCriterion("sclass_sequence is null");
            return (Criteria) this;
        }

        public Criteria andSclass_sequenceIsNotNull() {
            addCriterion("sclass_sequence is not null");
            return (Criteria) this;
        }

        public Criteria andSclass_sequenceEqualTo(Short value) {
            addCriterion("sclass_sequence =", value, "sclass_sequence");
            return (Criteria) this;
        }

        public Criteria andSclass_sequenceNotEqualTo(Short value) {
            addCriterion("sclass_sequence <>", value, "sclass_sequence");
            return (Criteria) this;
        }

        public Criteria andSclass_sequenceGreaterThan(Short value) {
            addCriterion("sclass_sequence >", value, "sclass_sequence");
            return (Criteria) this;
        }

        public Criteria andSclass_sequenceGreaterThanOrEqualTo(Short value) {
            addCriterion("sclass_sequence >=", value, "sclass_sequence");
            return (Criteria) this;
        }

        public Criteria andSclass_sequenceLessThan(Short value) {
            addCriterion("sclass_sequence <", value, "sclass_sequence");
            return (Criteria) this;
        }

        public Criteria andSclass_sequenceLessThanOrEqualTo(Short value) {
            addCriterion("sclass_sequence <=", value, "sclass_sequence");
            return (Criteria) this;
        }

        public Criteria andSclass_sequenceIn(List<Short> values) {
            addCriterion("sclass_sequence in", values, "sclass_sequence");
            return (Criteria) this;
        }

        public Criteria andSclass_sequenceNotIn(List<Short> values) {
            addCriterion("sclass_sequence not in", values, "sclass_sequence");
            return (Criteria) this;
        }

        public Criteria andSclass_sequenceBetween(Short value1, Short value2) {
            addCriterion("sclass_sequence between", value1, value2, "sclass_sequence");
            return (Criteria) this;
        }

        public Criteria andSclass_sequenceNotBetween(Short value1, Short value2) {
            addCriterion("sclass_sequence not between", value1, value2, "sclass_sequence");
            return (Criteria) this;
        }

        public Criteria andInfoIDIsNull() {
            addCriterion("InfoID is null");
            return (Criteria) this;
        }

        public Criteria andInfoIDIsNotNull() {
            addCriterion("InfoID is not null");
            return (Criteria) this;
        }

        public Criteria andInfoIDEqualTo(Short value) {
            addCriterion("InfoID =", value, "infoID");
            return (Criteria) this;
        }

        public Criteria andInfoIDNotEqualTo(Short value) {
            addCriterion("InfoID <>", value, "infoID");
            return (Criteria) this;
        }

        public Criteria andInfoIDGreaterThan(Short value) {
            addCriterion("InfoID >", value, "infoID");
            return (Criteria) this;
        }

        public Criteria andInfoIDGreaterThanOrEqualTo(Short value) {
            addCriterion("InfoID >=", value, "infoID");
            return (Criteria) this;
        }

        public Criteria andInfoIDLessThan(Short value) {
            addCriterion("InfoID <", value, "infoID");
            return (Criteria) this;
        }

        public Criteria andInfoIDLessThanOrEqualTo(Short value) {
            addCriterion("InfoID <=", value, "infoID");
            return (Criteria) this;
        }

        public Criteria andInfoIDIn(List<Short> values) {
            addCriterion("InfoID in", values, "infoID");
            return (Criteria) this;
        }

        public Criteria andInfoIDNotIn(List<Short> values) {
            addCriterion("InfoID not in", values, "infoID");
            return (Criteria) this;
        }

        public Criteria andInfoIDBetween(Short value1, Short value2) {
            addCriterion("InfoID between", value1, value2, "infoID");
            return (Criteria) this;
        }

        public Criteria andInfoIDNotBetween(Short value1, Short value2) {
            addCriterion("InfoID not between", value1, value2, "infoID");
            return (Criteria) this;
        }

        public Criteria andBf_IfDispIsNull() {
            addCriterion("Bf_IfDisp is null");
            return (Criteria) this;
        }

        public Criteria andBf_IfDispIsNotNull() {
            addCriterion("Bf_IfDisp is not null");
            return (Criteria) this;
        }

        public Criteria andBf_IfDispEqualTo(Byte value) {
            addCriterion("Bf_IfDisp =", value, "bf_IfDisp");
            return (Criteria) this;
        }

        public Criteria andBf_IfDispNotEqualTo(Byte value) {
            addCriterion("Bf_IfDisp <>", value, "bf_IfDisp");
            return (Criteria) this;
        }

        public Criteria andBf_IfDispGreaterThan(Byte value) {
            addCriterion("Bf_IfDisp >", value, "bf_IfDisp");
            return (Criteria) this;
        }

        public Criteria andBf_IfDispGreaterThanOrEqualTo(Byte value) {
            addCriterion("Bf_IfDisp >=", value, "bf_IfDisp");
            return (Criteria) this;
        }

        public Criteria andBf_IfDispLessThan(Byte value) {
            addCriterion("Bf_IfDisp <", value, "bf_IfDisp");
            return (Criteria) this;
        }

        public Criteria andBf_IfDispLessThanOrEqualTo(Byte value) {
            addCriterion("Bf_IfDisp <=", value, "bf_IfDisp");
            return (Criteria) this;
        }

        public Criteria andBf_IfDispIn(List<Byte> values) {
            addCriterion("Bf_IfDisp in", values, "bf_IfDisp");
            return (Criteria) this;
        }

        public Criteria andBf_IfDispNotIn(List<Byte> values) {
            addCriterion("Bf_IfDisp not in", values, "bf_IfDisp");
            return (Criteria) this;
        }

        public Criteria andBf_IfDispBetween(Byte value1, Byte value2) {
            addCriterion("Bf_IfDisp between", value1, value2, "bf_IfDisp");
            return (Criteria) this;
        }

        public Criteria andBf_IfDispNotBetween(Byte value1, Byte value2) {
            addCriterion("Bf_IfDisp not between", value1, value2, "bf_IfDisp");
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

        public Criteria andBeginSeasonIsNull() {
            addCriterion("BeginSeason is null");
            return (Criteria) this;
        }

        public Criteria andBeginSeasonIsNotNull() {
            addCriterion("BeginSeason is not null");
            return (Criteria) this;
        }

        public Criteria andBeginSeasonEqualTo(String value) {
            addCriterion("BeginSeason =", value, "beginSeason");
            return (Criteria) this;
        }

        public Criteria andBeginSeasonNotEqualTo(String value) {
            addCriterion("BeginSeason <>", value, "beginSeason");
            return (Criteria) this;
        }

        public Criteria andBeginSeasonGreaterThan(String value) {
            addCriterion("BeginSeason >", value, "beginSeason");
            return (Criteria) this;
        }

        public Criteria andBeginSeasonGreaterThanOrEqualTo(String value) {
            addCriterion("BeginSeason >=", value, "beginSeason");
            return (Criteria) this;
        }

        public Criteria andBeginSeasonLessThan(String value) {
            addCriterion("BeginSeason <", value, "beginSeason");
            return (Criteria) this;
        }

        public Criteria andBeginSeasonLessThanOrEqualTo(String value) {
            addCriterion("BeginSeason <=", value, "beginSeason");
            return (Criteria) this;
        }

        public Criteria andBeginSeasonLike(String value) {
            addCriterion("BeginSeason like", value, "beginSeason");
            return (Criteria) this;
        }

        public Criteria andBeginSeasonNotLike(String value) {
            addCriterion("BeginSeason not like", value, "beginSeason");
            return (Criteria) this;
        }

        public Criteria andBeginSeasonIn(List<String> values) {
            addCriterion("BeginSeason in", values, "beginSeason");
            return (Criteria) this;
        }

        public Criteria andBeginSeasonNotIn(List<String> values) {
            addCriterion("BeginSeason not in", values, "beginSeason");
            return (Criteria) this;
        }

        public Criteria andBeginSeasonBetween(String value1, String value2) {
            addCriterion("BeginSeason between", value1, value2, "beginSeason");
            return (Criteria) this;
        }

        public Criteria andBeginSeasonNotBetween(String value1, String value2) {
            addCriterion("BeginSeason not between", value1, value2, "beginSeason");
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

        public Criteria andIfHaveSubIsNull() {
            addCriterion("ifHaveSub is null");
            return (Criteria) this;
        }

        public Criteria andIfHaveSubIsNotNull() {
            addCriterion("ifHaveSub is not null");
            return (Criteria) this;
        }

        public Criteria andIfHaveSubEqualTo(Boolean value) {
            addCriterion("ifHaveSub =", value, "ifHaveSub");
            return (Criteria) this;
        }

        public Criteria andIfHaveSubNotEqualTo(Boolean value) {
            addCriterion("ifHaveSub <>", value, "ifHaveSub");
            return (Criteria) this;
        }

        public Criteria andIfHaveSubGreaterThan(Boolean value) {
            addCriterion("ifHaveSub >", value, "ifHaveSub");
            return (Criteria) this;
        }

        public Criteria andIfHaveSubGreaterThanOrEqualTo(Boolean value) {
            addCriterion("ifHaveSub >=", value, "ifHaveSub");
            return (Criteria) this;
        }

        public Criteria andIfHaveSubLessThan(Boolean value) {
            addCriterion("ifHaveSub <", value, "ifHaveSub");
            return (Criteria) this;
        }

        public Criteria andIfHaveSubLessThanOrEqualTo(Boolean value) {
            addCriterion("ifHaveSub <=", value, "ifHaveSub");
            return (Criteria) this;
        }

        public Criteria andIfHaveSubIn(List<Boolean> values) {
            addCriterion("ifHaveSub in", values, "ifHaveSub");
            return (Criteria) this;
        }

        public Criteria andIfHaveSubNotIn(List<Boolean> values) {
            addCriterion("ifHaveSub not in", values, "ifHaveSub");
            return (Criteria) this;
        }

        public Criteria andIfHaveSubBetween(Boolean value1, Boolean value2) {
            addCriterion("ifHaveSub between", value1, value2, "ifHaveSub");
            return (Criteria) this;
        }

        public Criteria andIfHaveSubNotBetween(Boolean value1, Boolean value2) {
            addCriterion("ifHaveSub not between", value1, value2, "ifHaveSub");
            return (Criteria) this;
        }

        public Criteria andIfSortIsNull() {
            addCriterion("ifSort is null");
            return (Criteria) this;
        }

        public Criteria andIfSortIsNotNull() {
            addCriterion("ifSort is not null");
            return (Criteria) this;
        }

        public Criteria andIfSortEqualTo(Boolean value) {
            addCriterion("ifSort =", value, "ifSort");
            return (Criteria) this;
        }

        public Criteria andIfSortNotEqualTo(Boolean value) {
            addCriterion("ifSort <>", value, "ifSort");
            return (Criteria) this;
        }

        public Criteria andIfSortGreaterThan(Boolean value) {
            addCriterion("ifSort >", value, "ifSort");
            return (Criteria) this;
        }

        public Criteria andIfSortGreaterThanOrEqualTo(Boolean value) {
            addCriterion("ifSort >=", value, "ifSort");
            return (Criteria) this;
        }

        public Criteria andIfSortLessThan(Boolean value) {
            addCriterion("ifSort <", value, "ifSort");
            return (Criteria) this;
        }

        public Criteria andIfSortLessThanOrEqualTo(Boolean value) {
            addCriterion("ifSort <=", value, "ifSort");
            return (Criteria) this;
        }

        public Criteria andIfSortIn(List<Boolean> values) {
            addCriterion("ifSort in", values, "ifSort");
            return (Criteria) this;
        }

        public Criteria andIfSortNotIn(List<Boolean> values) {
            addCriterion("ifSort not in", values, "ifSort");
            return (Criteria) this;
        }

        public Criteria andIfSortBetween(Boolean value1, Boolean value2) {
            addCriterion("ifSort between", value1, value2, "ifSort");
            return (Criteria) this;
        }

        public Criteria andIfSortNotBetween(Boolean value1, Boolean value2) {
            addCriterion("ifSort not between", value1, value2, "ifSort");
            return (Criteria) this;
        }

        public Criteria andIfHavePaperIsNull() {
            addCriterion("ifHavePaper is null");
            return (Criteria) this;
        }

        public Criteria andIfHavePaperIsNotNull() {
            addCriterion("ifHavePaper is not null");
            return (Criteria) this;
        }

        public Criteria andIfHavePaperEqualTo(Boolean value) {
            addCriterion("ifHavePaper =", value, "ifHavePaper");
            return (Criteria) this;
        }

        public Criteria andIfHavePaperNotEqualTo(Boolean value) {
            addCriterion("ifHavePaper <>", value, "ifHavePaper");
            return (Criteria) this;
        }

        public Criteria andIfHavePaperGreaterThan(Boolean value) {
            addCriterion("ifHavePaper >", value, "ifHavePaper");
            return (Criteria) this;
        }

        public Criteria andIfHavePaperGreaterThanOrEqualTo(Boolean value) {
            addCriterion("ifHavePaper >=", value, "ifHavePaper");
            return (Criteria) this;
        }

        public Criteria andIfHavePaperLessThan(Boolean value) {
            addCriterion("ifHavePaper <", value, "ifHavePaper");
            return (Criteria) this;
        }

        public Criteria andIfHavePaperLessThanOrEqualTo(Boolean value) {
            addCriterion("ifHavePaper <=", value, "ifHavePaper");
            return (Criteria) this;
        }

        public Criteria andIfHavePaperIn(List<Boolean> values) {
            addCriterion("ifHavePaper in", values, "ifHavePaper");
            return (Criteria) this;
        }

        public Criteria andIfHavePaperNotIn(List<Boolean> values) {
            addCriterion("ifHavePaper not in", values, "ifHavePaper");
            return (Criteria) this;
        }

        public Criteria andIfHavePaperBetween(Boolean value1, Boolean value2) {
            addCriterion("ifHavePaper between", value1, value2, "ifHavePaper");
            return (Criteria) this;
        }

        public Criteria andIfHavePaperNotBetween(Boolean value1, Boolean value2) {
            addCriterion("ifHavePaper not between", value1, value2, "ifHavePaper");
            return (Criteria) this;
        }

        public Criteria andIfShowScoreIsNull() {
            addCriterion("ifShowScore is null");
            return (Criteria) this;
        }

        public Criteria andIfShowScoreIsNotNull() {
            addCriterion("ifShowScore is not null");
            return (Criteria) this;
        }

        public Criteria andIfShowScoreEqualTo(Boolean value) {
            addCriterion("ifShowScore =", value, "ifShowScore");
            return (Criteria) this;
        }

        public Criteria andIfShowScoreNotEqualTo(Boolean value) {
            addCriterion("ifShowScore <>", value, "ifShowScore");
            return (Criteria) this;
        }

        public Criteria andIfShowScoreGreaterThan(Boolean value) {
            addCriterion("ifShowScore >", value, "ifShowScore");
            return (Criteria) this;
        }

        public Criteria andIfShowScoreGreaterThanOrEqualTo(Boolean value) {
            addCriterion("ifShowScore >=", value, "ifShowScore");
            return (Criteria) this;
        }

        public Criteria andIfShowScoreLessThan(Boolean value) {
            addCriterion("ifShowScore <", value, "ifShowScore");
            return (Criteria) this;
        }

        public Criteria andIfShowScoreLessThanOrEqualTo(Boolean value) {
            addCriterion("ifShowScore <=", value, "ifShowScore");
            return (Criteria) this;
        }

        public Criteria andIfShowScoreIn(List<Boolean> values) {
            addCriterion("ifShowScore in", values, "ifShowScore");
            return (Criteria) this;
        }

        public Criteria andIfShowScoreNotIn(List<Boolean> values) {
            addCriterion("ifShowScore not in", values, "ifShowScore");
            return (Criteria) this;
        }

        public Criteria andIfShowScoreBetween(Boolean value1, Boolean value2) {
            addCriterion("ifShowScore between", value1, value2, "ifShowScore");
            return (Criteria) this;
        }

        public Criteria andIfShowScoreNotBetween(Boolean value1, Boolean value2) {
            addCriterion("ifShowScore not between", value1, value2, "ifShowScore");
            return (Criteria) this;
        }

        public Criteria andRank_matchSeasonIsNull() {
            addCriterion("rank_matchSeason is null");
            return (Criteria) this;
        }

        public Criteria andRank_matchSeasonIsNotNull() {
            addCriterion("rank_matchSeason is not null");
            return (Criteria) this;
        }

        public Criteria andRank_matchSeasonEqualTo(String value) {
            addCriterion("rank_matchSeason =", value, "rank_matchSeason");
            return (Criteria) this;
        }

        public Criteria andRank_matchSeasonNotEqualTo(String value) {
            addCriterion("rank_matchSeason <>", value, "rank_matchSeason");
            return (Criteria) this;
        }

        public Criteria andRank_matchSeasonGreaterThan(String value) {
            addCriterion("rank_matchSeason >", value, "rank_matchSeason");
            return (Criteria) this;
        }

        public Criteria andRank_matchSeasonGreaterThanOrEqualTo(String value) {
            addCriterion("rank_matchSeason >=", value, "rank_matchSeason");
            return (Criteria) this;
        }

        public Criteria andRank_matchSeasonLessThan(String value) {
            addCriterion("rank_matchSeason <", value, "rank_matchSeason");
            return (Criteria) this;
        }

        public Criteria andRank_matchSeasonLessThanOrEqualTo(String value) {
            addCriterion("rank_matchSeason <=", value, "rank_matchSeason");
            return (Criteria) this;
        }

        public Criteria andRank_matchSeasonLike(String value) {
            addCriterion("rank_matchSeason like", value, "rank_matchSeason");
            return (Criteria) this;
        }

        public Criteria andRank_matchSeasonNotLike(String value) {
            addCriterion("rank_matchSeason not like", value, "rank_matchSeason");
            return (Criteria) this;
        }

        public Criteria andRank_matchSeasonIn(List<String> values) {
            addCriterion("rank_matchSeason in", values, "rank_matchSeason");
            return (Criteria) this;
        }

        public Criteria andRank_matchSeasonNotIn(List<String> values) {
            addCriterion("rank_matchSeason not in", values, "rank_matchSeason");
            return (Criteria) this;
        }

        public Criteria andRank_matchSeasonBetween(String value1, String value2) {
            addCriterion("rank_matchSeason between", value1, value2, "rank_matchSeason");
            return (Criteria) this;
        }

        public Criteria andRank_matchSeasonNotBetween(String value1, String value2) {
            addCriterion("rank_matchSeason not between", value1, value2, "rank_matchSeason");
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