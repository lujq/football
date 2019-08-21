package com.example.spinwheel.base.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CmbUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CmbUserExample() {
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

        public Criteria andIDEqualTo(Long value) {
            addCriterion("ID =", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDNotEqualTo(Long value) {
            addCriterion("ID <>", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDGreaterThan(Long value) {
            addCriterion("ID >", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDLessThan(Long value) {
            addCriterion("ID <", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDIn(List<Long> values) {
            addCriterion("ID in", values, "ID");
            return (Criteria) this;
        }

        public Criteria andIDNotIn(List<Long> values) {
            addCriterion("ID not in", values, "ID");
            return (Criteria) this;
        }

        public Criteria andIDBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "ID");
            return (Criteria) this;
        }

        public Criteria andIDNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "ID");
            return (Criteria) this;
        }

        public Criteria andUserIDIsNull() {
            addCriterion("UserID is null");
            return (Criteria) this;
        }

        public Criteria andUserIDIsNotNull() {
            addCriterion("UserID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIDEqualTo(String value) {
            addCriterion("UserID =", value, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDNotEqualTo(String value) {
            addCriterion("UserID <>", value, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDGreaterThan(String value) {
            addCriterion("UserID >", value, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDGreaterThanOrEqualTo(String value) {
            addCriterion("UserID >=", value, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDLessThan(String value) {
            addCriterion("UserID <", value, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDLessThanOrEqualTo(String value) {
            addCriterion("UserID <=", value, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDLike(String value) {
            addCriterion("UserID like", value, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDNotLike(String value) {
            addCriterion("UserID not like", value, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDIn(List<String> values) {
            addCriterion("UserID in", values, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDNotIn(List<String> values) {
            addCriterion("UserID not in", values, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDBetween(String value1, String value2) {
            addCriterion("UserID between", value1, value2, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDNotBetween(String value1, String value2) {
            addCriterion("UserID not between", value1, value2, "userID");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("Password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("Password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("Password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("Password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("Password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("Password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("Password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("Password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("Password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("Password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("Password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("Password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("Password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("Password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("Mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("Mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("Mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("Mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("Mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("Mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("Mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("Mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("Mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("Mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("Mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("Mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("Mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("Mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("Email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("Email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("Email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("Email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("Email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("Email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("Email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("Email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("Email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("Email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("Email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("Email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("Email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("Email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andLoginNameIsNull() {
            addCriterion("LoginName is null");
            return (Criteria) this;
        }

        public Criteria andLoginNameIsNotNull() {
            addCriterion("LoginName is not null");
            return (Criteria) this;
        }

        public Criteria andLoginNameEqualTo(String value) {
            addCriterion("LoginName =", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotEqualTo(String value) {
            addCriterion("LoginName <>", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameGreaterThan(String value) {
            addCriterion("LoginName >", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameGreaterThanOrEqualTo(String value) {
            addCriterion("LoginName >=", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLessThan(String value) {
            addCriterion("LoginName <", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLessThanOrEqualTo(String value) {
            addCriterion("LoginName <=", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLike(String value) {
            addCriterion("LoginName like", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotLike(String value) {
            addCriterion("LoginName not like", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameIn(List<String> values) {
            addCriterion("LoginName in", values, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotIn(List<String> values) {
            addCriterion("LoginName not in", values, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameBetween(String value1, String value2) {
            addCriterion("LoginName between", value1, value2, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotBetween(String value1, String value2) {
            addCriterion("LoginName not between", value1, value2, "loginName");
            return (Criteria) this;
        }

        public Criteria andNickNameIsNull() {
            addCriterion("NickName is null");
            return (Criteria) this;
        }

        public Criteria andNickNameIsNotNull() {
            addCriterion("NickName is not null");
            return (Criteria) this;
        }

        public Criteria andNickNameEqualTo(String value) {
            addCriterion("NickName =", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotEqualTo(String value) {
            addCriterion("NickName <>", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThan(String value) {
            addCriterion("NickName >", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThanOrEqualTo(String value) {
            addCriterion("NickName >=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThan(String value) {
            addCriterion("NickName <", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThanOrEqualTo(String value) {
            addCriterion("NickName <=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLike(String value) {
            addCriterion("NickName like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotLike(String value) {
            addCriterion("NickName not like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameIn(List<String> values) {
            addCriterion("NickName in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotIn(List<String> values) {
            addCriterion("NickName not in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameBetween(String value1, String value2) {
            addCriterion("NickName between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotBetween(String value1, String value2) {
            addCriterion("NickName not between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andRealNameIsNull() {
            addCriterion("RealName is null");
            return (Criteria) this;
        }

        public Criteria andRealNameIsNotNull() {
            addCriterion("RealName is not null");
            return (Criteria) this;
        }

        public Criteria andRealNameEqualTo(String value) {
            addCriterion("RealName =", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotEqualTo(String value) {
            addCriterion("RealName <>", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThan(String value) {
            addCriterion("RealName >", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("RealName >=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThan(String value) {
            addCriterion("RealName <", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThanOrEqualTo(String value) {
            addCriterion("RealName <=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLike(String value) {
            addCriterion("RealName like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotLike(String value) {
            addCriterion("RealName not like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameIn(List<String> values) {
            addCriterion("RealName in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotIn(List<String> values) {
            addCriterion("RealName not in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameBetween(String value1, String value2) {
            addCriterion("RealName between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotBetween(String value1, String value2) {
            addCriterion("RealName not between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andIDNoIsNull() {
            addCriterion("IDNo is null");
            return (Criteria) this;
        }

        public Criteria andIDNoIsNotNull() {
            addCriterion("IDNo is not null");
            return (Criteria) this;
        }

        public Criteria andIDNoEqualTo(String value) {
            addCriterion("IDNo =", value, "IDNo");
            return (Criteria) this;
        }

        public Criteria andIDNoNotEqualTo(String value) {
            addCriterion("IDNo <>", value, "IDNo");
            return (Criteria) this;
        }

        public Criteria andIDNoGreaterThan(String value) {
            addCriterion("IDNo >", value, "IDNo");
            return (Criteria) this;
        }

        public Criteria andIDNoGreaterThanOrEqualTo(String value) {
            addCriterion("IDNo >=", value, "IDNo");
            return (Criteria) this;
        }

        public Criteria andIDNoLessThan(String value) {
            addCriterion("IDNo <", value, "IDNo");
            return (Criteria) this;
        }

        public Criteria andIDNoLessThanOrEqualTo(String value) {
            addCriterion("IDNo <=", value, "IDNo");
            return (Criteria) this;
        }

        public Criteria andIDNoLike(String value) {
            addCriterion("IDNo like", value, "IDNo");
            return (Criteria) this;
        }

        public Criteria andIDNoNotLike(String value) {
            addCriterion("IDNo not like", value, "IDNo");
            return (Criteria) this;
        }

        public Criteria andIDNoIn(List<String> values) {
            addCriterion("IDNo in", values, "IDNo");
            return (Criteria) this;
        }

        public Criteria andIDNoNotIn(List<String> values) {
            addCriterion("IDNo not in", values, "IDNo");
            return (Criteria) this;
        }

        public Criteria andIDNoBetween(String value1, String value2) {
            addCriterion("IDNo between", value1, value2, "IDNo");
            return (Criteria) this;
        }

        public Criteria andIDNoNotBetween(String value1, String value2) {
            addCriterion("IDNo not between", value1, value2, "IDNo");
            return (Criteria) this;
        }

        public Criteria andIDTypeIsNull() {
            addCriterion("IDType is null");
            return (Criteria) this;
        }

        public Criteria andIDTypeIsNotNull() {
            addCriterion("IDType is not null");
            return (Criteria) this;
        }

        public Criteria andIDTypeEqualTo(String value) {
            addCriterion("IDType =", value, "IDType");
            return (Criteria) this;
        }

        public Criteria andIDTypeNotEqualTo(String value) {
            addCriterion("IDType <>", value, "IDType");
            return (Criteria) this;
        }

        public Criteria andIDTypeGreaterThan(String value) {
            addCriterion("IDType >", value, "IDType");
            return (Criteria) this;
        }

        public Criteria andIDTypeGreaterThanOrEqualTo(String value) {
            addCriterion("IDType >=", value, "IDType");
            return (Criteria) this;
        }

        public Criteria andIDTypeLessThan(String value) {
            addCriterion("IDType <", value, "IDType");
            return (Criteria) this;
        }

        public Criteria andIDTypeLessThanOrEqualTo(String value) {
            addCriterion("IDType <=", value, "IDType");
            return (Criteria) this;
        }

        public Criteria andIDTypeLike(String value) {
            addCriterion("IDType like", value, "IDType");
            return (Criteria) this;
        }

        public Criteria andIDTypeNotLike(String value) {
            addCriterion("IDType not like", value, "IDType");
            return (Criteria) this;
        }

        public Criteria andIDTypeIn(List<String> values) {
            addCriterion("IDType in", values, "IDType");
            return (Criteria) this;
        }

        public Criteria andIDTypeNotIn(List<String> values) {
            addCriterion("IDType not in", values, "IDType");
            return (Criteria) this;
        }

        public Criteria andIDTypeBetween(String value1, String value2) {
            addCriterion("IDType between", value1, value2, "IDType");
            return (Criteria) this;
        }

        public Criteria andIDTypeNotBetween(String value1, String value2) {
            addCriterion("IDType not between", value1, value2, "IDType");
            return (Criteria) this;
        }

        public Criteria andChnTypeIsNull() {
            addCriterion("ChnType is null");
            return (Criteria) this;
        }

        public Criteria andChnTypeIsNotNull() {
            addCriterion("ChnType is not null");
            return (Criteria) this;
        }

        public Criteria andChnTypeEqualTo(String value) {
            addCriterion("ChnType =", value, "chnType");
            return (Criteria) this;
        }

        public Criteria andChnTypeNotEqualTo(String value) {
            addCriterion("ChnType <>", value, "chnType");
            return (Criteria) this;
        }

        public Criteria andChnTypeGreaterThan(String value) {
            addCriterion("ChnType >", value, "chnType");
            return (Criteria) this;
        }

        public Criteria andChnTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ChnType >=", value, "chnType");
            return (Criteria) this;
        }

        public Criteria andChnTypeLessThan(String value) {
            addCriterion("ChnType <", value, "chnType");
            return (Criteria) this;
        }

        public Criteria andChnTypeLessThanOrEqualTo(String value) {
            addCriterion("ChnType <=", value, "chnType");
            return (Criteria) this;
        }

        public Criteria andChnTypeLike(String value) {
            addCriterion("ChnType like", value, "chnType");
            return (Criteria) this;
        }

        public Criteria andChnTypeNotLike(String value) {
            addCriterion("ChnType not like", value, "chnType");
            return (Criteria) this;
        }

        public Criteria andChnTypeIn(List<String> values) {
            addCriterion("ChnType in", values, "chnType");
            return (Criteria) this;
        }

        public Criteria andChnTypeNotIn(List<String> values) {
            addCriterion("ChnType not in", values, "chnType");
            return (Criteria) this;
        }

        public Criteria andChnTypeBetween(String value1, String value2) {
            addCriterion("ChnType between", value1, value2, "chnType");
            return (Criteria) this;
        }

        public Criteria andChnTypeNotBetween(String value1, String value2) {
            addCriterion("ChnType not between", value1, value2, "chnType");
            return (Criteria) this;
        }

        public Criteria andFlagIsNull() {
            addCriterion("Flag is null");
            return (Criteria) this;
        }

        public Criteria andFlagIsNotNull() {
            addCriterion("Flag is not null");
            return (Criteria) this;
        }

        public Criteria andFlagEqualTo(String value) {
            addCriterion("Flag =", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotEqualTo(String value) {
            addCriterion("Flag <>", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThan(String value) {
            addCriterion("Flag >", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThanOrEqualTo(String value) {
            addCriterion("Flag >=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThan(String value) {
            addCriterion("Flag <", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThanOrEqualTo(String value) {
            addCriterion("Flag <=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLike(String value) {
            addCriterion("Flag like", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotLike(String value) {
            addCriterion("Flag not like", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagIn(List<String> values) {
            addCriterion("Flag in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotIn(List<String> values) {
            addCriterion("Flag not in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagBetween(String value1, String value2) {
            addCriterion("Flag between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotBetween(String value1, String value2) {
            addCriterion("Flag not between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("Remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("Remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("Remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("Remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("Remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("Remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("Remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("Remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("Remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("Remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("Remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("Remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("Remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("Remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andDeviceIsNull() {
            addCriterion("Device is null");
            return (Criteria) this;
        }

        public Criteria andDeviceIsNotNull() {
            addCriterion("Device is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceEqualTo(String value) {
            addCriterion("Device =", value, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceNotEqualTo(String value) {
            addCriterion("Device <>", value, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceGreaterThan(String value) {
            addCriterion("Device >", value, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceGreaterThanOrEqualTo(String value) {
            addCriterion("Device >=", value, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceLessThan(String value) {
            addCriterion("Device <", value, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceLessThanOrEqualTo(String value) {
            addCriterion("Device <=", value, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceLike(String value) {
            addCriterion("Device like", value, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceNotLike(String value) {
            addCriterion("Device not like", value, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceIn(List<String> values) {
            addCriterion("Device in", values, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceNotIn(List<String> values) {
            addCriterion("Device not in", values, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceBetween(String value1, String value2) {
            addCriterion("Device between", value1, value2, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceNotBetween(String value1, String value2) {
            addCriterion("Device not between", value1, value2, "device");
            return (Criteria) this;
        }

        public Criteria andIPIsNull() {
            addCriterion("IP is null");
            return (Criteria) this;
        }

        public Criteria andIPIsNotNull() {
            addCriterion("IP is not null");
            return (Criteria) this;
        }

        public Criteria andIPEqualTo(String value) {
            addCriterion("IP =", value, "IP");
            return (Criteria) this;
        }

        public Criteria andIPNotEqualTo(String value) {
            addCriterion("IP <>", value, "IP");
            return (Criteria) this;
        }

        public Criteria andIPGreaterThan(String value) {
            addCriterion("IP >", value, "IP");
            return (Criteria) this;
        }

        public Criteria andIPGreaterThanOrEqualTo(String value) {
            addCriterion("IP >=", value, "IP");
            return (Criteria) this;
        }

        public Criteria andIPLessThan(String value) {
            addCriterion("IP <", value, "IP");
            return (Criteria) this;
        }

        public Criteria andIPLessThanOrEqualTo(String value) {
            addCriterion("IP <=", value, "IP");
            return (Criteria) this;
        }

        public Criteria andIPLike(String value) {
            addCriterion("IP like", value, "IP");
            return (Criteria) this;
        }

        public Criteria andIPNotLike(String value) {
            addCriterion("IP not like", value, "IP");
            return (Criteria) this;
        }

        public Criteria andIPIn(List<String> values) {
            addCriterion("IP in", values, "IP");
            return (Criteria) this;
        }

        public Criteria andIPNotIn(List<String> values) {
            addCriterion("IP not in", values, "IP");
            return (Criteria) this;
        }

        public Criteria andIPBetween(String value1, String value2) {
            addCriterion("IP between", value1, value2, "IP");
            return (Criteria) this;
        }

        public Criteria andIPNotBetween(String value1, String value2) {
            addCriterion("IP not between", value1, value2, "IP");
            return (Criteria) this;
        }

        public Criteria andLatIsNull() {
            addCriterion("Lat is null");
            return (Criteria) this;
        }

        public Criteria andLatIsNotNull() {
            addCriterion("Lat is not null");
            return (Criteria) this;
        }

        public Criteria andLatEqualTo(String value) {
            addCriterion("Lat =", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotEqualTo(String value) {
            addCriterion("Lat <>", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatGreaterThan(String value) {
            addCriterion("Lat >", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatGreaterThanOrEqualTo(String value) {
            addCriterion("Lat >=", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatLessThan(String value) {
            addCriterion("Lat <", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatLessThanOrEqualTo(String value) {
            addCriterion("Lat <=", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatLike(String value) {
            addCriterion("Lat like", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotLike(String value) {
            addCriterion("Lat not like", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatIn(List<String> values) {
            addCriterion("Lat in", values, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotIn(List<String> values) {
            addCriterion("Lat not in", values, "lat");
            return (Criteria) this;
        }

        public Criteria andLatBetween(String value1, String value2) {
            addCriterion("Lat between", value1, value2, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotBetween(String value1, String value2) {
            addCriterion("Lat not between", value1, value2, "lat");
            return (Criteria) this;
        }

        public Criteria andAppIDIsNull() {
            addCriterion("AppID is null");
            return (Criteria) this;
        }

        public Criteria andAppIDIsNotNull() {
            addCriterion("AppID is not null");
            return (Criteria) this;
        }

        public Criteria andAppIDEqualTo(String value) {
            addCriterion("AppID =", value, "appID");
            return (Criteria) this;
        }

        public Criteria andAppIDNotEqualTo(String value) {
            addCriterion("AppID <>", value, "appID");
            return (Criteria) this;
        }

        public Criteria andAppIDGreaterThan(String value) {
            addCriterion("AppID >", value, "appID");
            return (Criteria) this;
        }

        public Criteria andAppIDGreaterThanOrEqualTo(String value) {
            addCriterion("AppID >=", value, "appID");
            return (Criteria) this;
        }

        public Criteria andAppIDLessThan(String value) {
            addCriterion("AppID <", value, "appID");
            return (Criteria) this;
        }

        public Criteria andAppIDLessThanOrEqualTo(String value) {
            addCriterion("AppID <=", value, "appID");
            return (Criteria) this;
        }

        public Criteria andAppIDLike(String value) {
            addCriterion("AppID like", value, "appID");
            return (Criteria) this;
        }

        public Criteria andAppIDNotLike(String value) {
            addCriterion("AppID not like", value, "appID");
            return (Criteria) this;
        }

        public Criteria andAppIDIn(List<String> values) {
            addCriterion("AppID in", values, "appID");
            return (Criteria) this;
        }

        public Criteria andAppIDNotIn(List<String> values) {
            addCriterion("AppID not in", values, "appID");
            return (Criteria) this;
        }

        public Criteria andAppIDBetween(String value1, String value2) {
            addCriterion("AppID between", value1, value2, "appID");
            return (Criteria) this;
        }

        public Criteria andAppIDNotBetween(String value1, String value2) {
            addCriterion("AppID not between", value1, value2, "appID");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CreateTime is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CreateTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CreateTime =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CreateTime <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CreateTime >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CreateTime >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CreateTime <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CreateTime <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CreateTime in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CreateTime not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CreateTime between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CreateTime not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andApproverIsNull() {
            addCriterion("Approver is null");
            return (Criteria) this;
        }

        public Criteria andApproverIsNotNull() {
            addCriterion("Approver is not null");
            return (Criteria) this;
        }

        public Criteria andApproverEqualTo(String value) {
            addCriterion("Approver =", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverNotEqualTo(String value) {
            addCriterion("Approver <>", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverGreaterThan(String value) {
            addCriterion("Approver >", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverGreaterThanOrEqualTo(String value) {
            addCriterion("Approver >=", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverLessThan(String value) {
            addCriterion("Approver <", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverLessThanOrEqualTo(String value) {
            addCriterion("Approver <=", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverLike(String value) {
            addCriterion("Approver like", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverNotLike(String value) {
            addCriterion("Approver not like", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverIn(List<String> values) {
            addCriterion("Approver in", values, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverNotIn(List<String> values) {
            addCriterion("Approver not in", values, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverBetween(String value1, String value2) {
            addCriterion("Approver between", value1, value2, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverNotBetween(String value1, String value2) {
            addCriterion("Approver not between", value1, value2, "approver");
            return (Criteria) this;
        }

        public Criteria andApprovalTimeIsNull() {
            addCriterion("ApprovalTime is null");
            return (Criteria) this;
        }

        public Criteria andApprovalTimeIsNotNull() {
            addCriterion("ApprovalTime is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalTimeEqualTo(Date value) {
            addCriterion("ApprovalTime =", value, "approvalTime");
            return (Criteria) this;
        }

        public Criteria andApprovalTimeNotEqualTo(Date value) {
            addCriterion("ApprovalTime <>", value, "approvalTime");
            return (Criteria) this;
        }

        public Criteria andApprovalTimeGreaterThan(Date value) {
            addCriterion("ApprovalTime >", value, "approvalTime");
            return (Criteria) this;
        }

        public Criteria andApprovalTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ApprovalTime >=", value, "approvalTime");
            return (Criteria) this;
        }

        public Criteria andApprovalTimeLessThan(Date value) {
            addCriterion("ApprovalTime <", value, "approvalTime");
            return (Criteria) this;
        }

        public Criteria andApprovalTimeLessThanOrEqualTo(Date value) {
            addCriterion("ApprovalTime <=", value, "approvalTime");
            return (Criteria) this;
        }

        public Criteria andApprovalTimeIn(List<Date> values) {
            addCriterion("ApprovalTime in", values, "approvalTime");
            return (Criteria) this;
        }

        public Criteria andApprovalTimeNotIn(List<Date> values) {
            addCriterion("ApprovalTime not in", values, "approvalTime");
            return (Criteria) this;
        }

        public Criteria andApprovalTimeBetween(Date value1, Date value2) {
            addCriterion("ApprovalTime between", value1, value2, "approvalTime");
            return (Criteria) this;
        }

        public Criteria andApprovalTimeNotBetween(Date value1, Date value2) {
            addCriterion("ApprovalTime not between", value1, value2, "approvalTime");
            return (Criteria) this;
        }

        public Criteria andIsHotIsNull() {
            addCriterion("IsHot is null");
            return (Criteria) this;
        }

        public Criteria andIsHotIsNotNull() {
            addCriterion("IsHot is not null");
            return (Criteria) this;
        }

        public Criteria andIsHotEqualTo(String value) {
            addCriterion("IsHot =", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotNotEqualTo(String value) {
            addCriterion("IsHot <>", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotGreaterThan(String value) {
            addCriterion("IsHot >", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotGreaterThanOrEqualTo(String value) {
            addCriterion("IsHot >=", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotLessThan(String value) {
            addCriterion("IsHot <", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotLessThanOrEqualTo(String value) {
            addCriterion("IsHot <=", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotLike(String value) {
            addCriterion("IsHot like", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotNotLike(String value) {
            addCriterion("IsHot not like", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotIn(List<String> values) {
            addCriterion("IsHot in", values, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotNotIn(List<String> values) {
            addCriterion("IsHot not in", values, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotBetween(String value1, String value2) {
            addCriterion("IsHot between", value1, value2, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotNotBetween(String value1, String value2) {
            addCriterion("IsHot not between", value1, value2, "isHot");
            return (Criteria) this;
        }

        public Criteria andNewsTypeIDIsNull() {
            addCriterion("NewsTypeID is null");
            return (Criteria) this;
        }

        public Criteria andNewsTypeIDIsNotNull() {
            addCriterion("NewsTypeID is not null");
            return (Criteria) this;
        }

        public Criteria andNewsTypeIDEqualTo(String value) {
            addCriterion("NewsTypeID =", value, "newsTypeID");
            return (Criteria) this;
        }

        public Criteria andNewsTypeIDNotEqualTo(String value) {
            addCriterion("NewsTypeID <>", value, "newsTypeID");
            return (Criteria) this;
        }

        public Criteria andNewsTypeIDGreaterThan(String value) {
            addCriterion("NewsTypeID >", value, "newsTypeID");
            return (Criteria) this;
        }

        public Criteria andNewsTypeIDGreaterThanOrEqualTo(String value) {
            addCriterion("NewsTypeID >=", value, "newsTypeID");
            return (Criteria) this;
        }

        public Criteria andNewsTypeIDLessThan(String value) {
            addCriterion("NewsTypeID <", value, "newsTypeID");
            return (Criteria) this;
        }

        public Criteria andNewsTypeIDLessThanOrEqualTo(String value) {
            addCriterion("NewsTypeID <=", value, "newsTypeID");
            return (Criteria) this;
        }

        public Criteria andNewsTypeIDLike(String value) {
            addCriterion("NewsTypeID like", value, "newsTypeID");
            return (Criteria) this;
        }

        public Criteria andNewsTypeIDNotLike(String value) {
            addCriterion("NewsTypeID not like", value, "newsTypeID");
            return (Criteria) this;
        }

        public Criteria andNewsTypeIDIn(List<String> values) {
            addCriterion("NewsTypeID in", values, "newsTypeID");
            return (Criteria) this;
        }

        public Criteria andNewsTypeIDNotIn(List<String> values) {
            addCriterion("NewsTypeID not in", values, "newsTypeID");
            return (Criteria) this;
        }

        public Criteria andNewsTypeIDBetween(String value1, String value2) {
            addCriterion("NewsTypeID between", value1, value2, "newsTypeID");
            return (Criteria) this;
        }

        public Criteria andNewsTypeIDNotBetween(String value1, String value2) {
            addCriterion("NewsTypeID not between", value1, value2, "newsTypeID");
            return (Criteria) this;
        }

        public Criteria andAutoWellChoseFlagIsNull() {
            addCriterion("AutoWellChoseFlag is null");
            return (Criteria) this;
        }

        public Criteria andAutoWellChoseFlagIsNotNull() {
            addCriterion("AutoWellChoseFlag is not null");
            return (Criteria) this;
        }

        public Criteria andAutoWellChoseFlagEqualTo(String value) {
            addCriterion("AutoWellChoseFlag =", value, "autoWellChoseFlag");
            return (Criteria) this;
        }

        public Criteria andAutoWellChoseFlagNotEqualTo(String value) {
            addCriterion("AutoWellChoseFlag <>", value, "autoWellChoseFlag");
            return (Criteria) this;
        }

        public Criteria andAutoWellChoseFlagGreaterThan(String value) {
            addCriterion("AutoWellChoseFlag >", value, "autoWellChoseFlag");
            return (Criteria) this;
        }

        public Criteria andAutoWellChoseFlagGreaterThanOrEqualTo(String value) {
            addCriterion("AutoWellChoseFlag >=", value, "autoWellChoseFlag");
            return (Criteria) this;
        }

        public Criteria andAutoWellChoseFlagLessThan(String value) {
            addCriterion("AutoWellChoseFlag <", value, "autoWellChoseFlag");
            return (Criteria) this;
        }

        public Criteria andAutoWellChoseFlagLessThanOrEqualTo(String value) {
            addCriterion("AutoWellChoseFlag <=", value, "autoWellChoseFlag");
            return (Criteria) this;
        }

        public Criteria andAutoWellChoseFlagLike(String value) {
            addCriterion("AutoWellChoseFlag like", value, "autoWellChoseFlag");
            return (Criteria) this;
        }

        public Criteria andAutoWellChoseFlagNotLike(String value) {
            addCriterion("AutoWellChoseFlag not like", value, "autoWellChoseFlag");
            return (Criteria) this;
        }

        public Criteria andAutoWellChoseFlagIn(List<String> values) {
            addCriterion("AutoWellChoseFlag in", values, "autoWellChoseFlag");
            return (Criteria) this;
        }

        public Criteria andAutoWellChoseFlagNotIn(List<String> values) {
            addCriterion("AutoWellChoseFlag not in", values, "autoWellChoseFlag");
            return (Criteria) this;
        }

        public Criteria andAutoWellChoseFlagBetween(String value1, String value2) {
            addCriterion("AutoWellChoseFlag between", value1, value2, "autoWellChoseFlag");
            return (Criteria) this;
        }

        public Criteria andAutoWellChoseFlagNotBetween(String value1, String value2) {
            addCriterion("AutoWellChoseFlag not between", value1, value2, "autoWellChoseFlag");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNull() {
            addCriterion("UserType is null");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNotNull() {
            addCriterion("UserType is not null");
            return (Criteria) this;
        }

        public Criteria andUserTypeEqualTo(String value) {
            addCriterion("UserType =", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotEqualTo(String value) {
            addCriterion("UserType <>", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThan(String value) {
            addCriterion("UserType >", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThanOrEqualTo(String value) {
            addCriterion("UserType >=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThan(String value) {
            addCriterion("UserType <", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThanOrEqualTo(String value) {
            addCriterion("UserType <=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLike(String value) {
            addCriterion("UserType like", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotLike(String value) {
            addCriterion("UserType not like", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeIn(List<String> values) {
            addCriterion("UserType in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotIn(List<String> values) {
            addCriterion("UserType not in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeBetween(String value1, String value2) {
            addCriterion("UserType between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotBetween(String value1, String value2) {
            addCriterion("UserType not between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andRelateProductFlagIsNull() {
            addCriterion("RelateProductFlag is null");
            return (Criteria) this;
        }

        public Criteria andRelateProductFlagIsNotNull() {
            addCriterion("RelateProductFlag is not null");
            return (Criteria) this;
        }

        public Criteria andRelateProductFlagEqualTo(String value) {
            addCriterion("RelateProductFlag =", value, "relateProductFlag");
            return (Criteria) this;
        }

        public Criteria andRelateProductFlagNotEqualTo(String value) {
            addCriterion("RelateProductFlag <>", value, "relateProductFlag");
            return (Criteria) this;
        }

        public Criteria andRelateProductFlagGreaterThan(String value) {
            addCriterion("RelateProductFlag >", value, "relateProductFlag");
            return (Criteria) this;
        }

        public Criteria andRelateProductFlagGreaterThanOrEqualTo(String value) {
            addCriterion("RelateProductFlag >=", value, "relateProductFlag");
            return (Criteria) this;
        }

        public Criteria andRelateProductFlagLessThan(String value) {
            addCriterion("RelateProductFlag <", value, "relateProductFlag");
            return (Criteria) this;
        }

        public Criteria andRelateProductFlagLessThanOrEqualTo(String value) {
            addCriterion("RelateProductFlag <=", value, "relateProductFlag");
            return (Criteria) this;
        }

        public Criteria andRelateProductFlagLike(String value) {
            addCriterion("RelateProductFlag like", value, "relateProductFlag");
            return (Criteria) this;
        }

        public Criteria andRelateProductFlagNotLike(String value) {
            addCriterion("RelateProductFlag not like", value, "relateProductFlag");
            return (Criteria) this;
        }

        public Criteria andRelateProductFlagIn(List<String> values) {
            addCriterion("RelateProductFlag in", values, "relateProductFlag");
            return (Criteria) this;
        }

        public Criteria andRelateProductFlagNotIn(List<String> values) {
            addCriterion("RelateProductFlag not in", values, "relateProductFlag");
            return (Criteria) this;
        }

        public Criteria andRelateProductFlagBetween(String value1, String value2) {
            addCriterion("RelateProductFlag between", value1, value2, "relateProductFlag");
            return (Criteria) this;
        }

        public Criteria andRelateProductFlagNotBetween(String value1, String value2) {
            addCriterion("RelateProductFlag not between", value1, value2, "relateProductFlag");
            return (Criteria) this;
        }

        public Criteria andProFlagIsNull() {
            addCriterion("ProFlag is null");
            return (Criteria) this;
        }

        public Criteria andProFlagIsNotNull() {
            addCriterion("ProFlag is not null");
            return (Criteria) this;
        }

        public Criteria andProFlagEqualTo(String value) {
            addCriterion("ProFlag =", value, "proFlag");
            return (Criteria) this;
        }

        public Criteria andProFlagNotEqualTo(String value) {
            addCriterion("ProFlag <>", value, "proFlag");
            return (Criteria) this;
        }

        public Criteria andProFlagGreaterThan(String value) {
            addCriterion("ProFlag >", value, "proFlag");
            return (Criteria) this;
        }

        public Criteria andProFlagGreaterThanOrEqualTo(String value) {
            addCriterion("ProFlag >=", value, "proFlag");
            return (Criteria) this;
        }

        public Criteria andProFlagLessThan(String value) {
            addCriterion("ProFlag <", value, "proFlag");
            return (Criteria) this;
        }

        public Criteria andProFlagLessThanOrEqualTo(String value) {
            addCriterion("ProFlag <=", value, "proFlag");
            return (Criteria) this;
        }

        public Criteria andProFlagLike(String value) {
            addCriterion("ProFlag like", value, "proFlag");
            return (Criteria) this;
        }

        public Criteria andProFlagNotLike(String value) {
            addCriterion("ProFlag not like", value, "proFlag");
            return (Criteria) this;
        }

        public Criteria andProFlagIn(List<String> values) {
            addCriterion("ProFlag in", values, "proFlag");
            return (Criteria) this;
        }

        public Criteria andProFlagNotIn(List<String> values) {
            addCriterion("ProFlag not in", values, "proFlag");
            return (Criteria) this;
        }

        public Criteria andProFlagBetween(String value1, String value2) {
            addCriterion("ProFlag between", value1, value2, "proFlag");
            return (Criteria) this;
        }

        public Criteria andProFlagNotBetween(String value1, String value2) {
            addCriterion("ProFlag not between", value1, value2, "proFlag");
            return (Criteria) this;
        }

        public Criteria andProTimeIsNull() {
            addCriterion("ProTime is null");
            return (Criteria) this;
        }

        public Criteria andProTimeIsNotNull() {
            addCriterion("ProTime is not null");
            return (Criteria) this;
        }

        public Criteria andProTimeEqualTo(Date value) {
            addCriterion("ProTime =", value, "proTime");
            return (Criteria) this;
        }

        public Criteria andProTimeNotEqualTo(Date value) {
            addCriterion("ProTime <>", value, "proTime");
            return (Criteria) this;
        }

        public Criteria andProTimeGreaterThan(Date value) {
            addCriterion("ProTime >", value, "proTime");
            return (Criteria) this;
        }

        public Criteria andProTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ProTime >=", value, "proTime");
            return (Criteria) this;
        }

        public Criteria andProTimeLessThan(Date value) {
            addCriterion("ProTime <", value, "proTime");
            return (Criteria) this;
        }

        public Criteria andProTimeLessThanOrEqualTo(Date value) {
            addCriterion("ProTime <=", value, "proTime");
            return (Criteria) this;
        }

        public Criteria andProTimeIn(List<Date> values) {
            addCriterion("ProTime in", values, "proTime");
            return (Criteria) this;
        }

        public Criteria andProTimeNotIn(List<Date> values) {
            addCriterion("ProTime not in", values, "proTime");
            return (Criteria) this;
        }

        public Criteria andProTimeBetween(Date value1, Date value2) {
            addCriterion("ProTime between", value1, value2, "proTime");
            return (Criteria) this;
        }

        public Criteria andProTimeNotBetween(Date value1, Date value2) {
            addCriterion("ProTime not between", value1, value2, "proTime");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeIsNull() {
            addCriterion("CertificateType is null");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeIsNotNull() {
            addCriterion("CertificateType is not null");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeEqualTo(Integer value) {
            addCriterion("CertificateType =", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeNotEqualTo(Integer value) {
            addCriterion("CertificateType <>", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeGreaterThan(Integer value) {
            addCriterion("CertificateType >", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("CertificateType >=", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeLessThan(Integer value) {
            addCriterion("CertificateType <", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeLessThanOrEqualTo(Integer value) {
            addCriterion("CertificateType <=", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeIn(List<Integer> values) {
            addCriterion("CertificateType in", values, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeNotIn(List<Integer> values) {
            addCriterion("CertificateType not in", values, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeBetween(Integer value1, Integer value2) {
            addCriterion("CertificateType between", value1, value2, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("CertificateType not between", value1, value2, "certificateType");
            return (Criteria) this;
        }

        public Criteria andDisplayTypeIsNull() {
            addCriterion("DisplayType is null");
            return (Criteria) this;
        }

        public Criteria andDisplayTypeIsNotNull() {
            addCriterion("DisplayType is not null");
            return (Criteria) this;
        }

        public Criteria andDisplayTypeEqualTo(Integer value) {
            addCriterion("DisplayType =", value, "displayType");
            return (Criteria) this;
        }

        public Criteria andDisplayTypeNotEqualTo(Integer value) {
            addCriterion("DisplayType <>", value, "displayType");
            return (Criteria) this;
        }

        public Criteria andDisplayTypeGreaterThan(Integer value) {
            addCriterion("DisplayType >", value, "displayType");
            return (Criteria) this;
        }

        public Criteria andDisplayTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("DisplayType >=", value, "displayType");
            return (Criteria) this;
        }

        public Criteria andDisplayTypeLessThan(Integer value) {
            addCriterion("DisplayType <", value, "displayType");
            return (Criteria) this;
        }

        public Criteria andDisplayTypeLessThanOrEqualTo(Integer value) {
            addCriterion("DisplayType <=", value, "displayType");
            return (Criteria) this;
        }

        public Criteria andDisplayTypeIn(List<Integer> values) {
            addCriterion("DisplayType in", values, "displayType");
            return (Criteria) this;
        }

        public Criteria andDisplayTypeNotIn(List<Integer> values) {
            addCriterion("DisplayType not in", values, "displayType");
            return (Criteria) this;
        }

        public Criteria andDisplayTypeBetween(Integer value1, Integer value2) {
            addCriterion("DisplayType between", value1, value2, "displayType");
            return (Criteria) this;
        }

        public Criteria andDisplayTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("DisplayType not between", value1, value2, "displayType");
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