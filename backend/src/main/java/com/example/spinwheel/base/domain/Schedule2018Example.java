package com.example.spinwheel.base.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Schedule2018Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Schedule2018Example() {
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

        public Criteria andOdds_idIsNull() {
            addCriterion("odds_id is null");
            return (Criteria) this;
        }

        public Criteria andOdds_idIsNotNull() {
            addCriterion("odds_id is not null");
            return (Criteria) this;
        }

        public Criteria andOdds_idEqualTo(Integer value) {
            addCriterion("odds_id =", value, "odds_id");
            return (Criteria) this;
        }

        public Criteria andOdds_idNotEqualTo(Integer value) {
            addCriterion("odds_id <>", value, "odds_id");
            return (Criteria) this;
        }

        public Criteria andOdds_idGreaterThan(Integer value) {
            addCriterion("odds_id >", value, "odds_id");
            return (Criteria) this;
        }

        public Criteria andOdds_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("odds_id >=", value, "odds_id");
            return (Criteria) this;
        }

        public Criteria andOdds_idLessThan(Integer value) {
            addCriterion("odds_id <", value, "odds_id");
            return (Criteria) this;
        }

        public Criteria andOdds_idLessThanOrEqualTo(Integer value) {
            addCriterion("odds_id <=", value, "odds_id");
            return (Criteria) this;
        }

        public Criteria andOdds_idIn(List<Integer> values) {
            addCriterion("odds_id in", values, "odds_id");
            return (Criteria) this;
        }

        public Criteria andOdds_idNotIn(List<Integer> values) {
            addCriterion("odds_id not in", values, "odds_id");
            return (Criteria) this;
        }

        public Criteria andOdds_idBetween(Integer value1, Integer value2) {
            addCriterion("odds_id between", value1, value2, "odds_id");
            return (Criteria) this;
        }

        public Criteria andOdds_idNotBetween(Integer value1, Integer value2) {
            addCriterion("odds_id not between", value1, value2, "odds_id");
            return (Criteria) this;
        }

        public Criteria andClass_idIsNull() {
            addCriterion("class_id is null");
            return (Criteria) this;
        }

        public Criteria andClass_idIsNotNull() {
            addCriterion("class_id is not null");
            return (Criteria) this;
        }

        public Criteria andClass_idEqualTo(Integer value) {
            addCriterion("class_id =", value, "class_id");
            return (Criteria) this;
        }

        public Criteria andClass_idNotEqualTo(Integer value) {
            addCriterion("class_id <>", value, "class_id");
            return (Criteria) this;
        }

        public Criteria andClass_idGreaterThan(Integer value) {
            addCriterion("class_id >", value, "class_id");
            return (Criteria) this;
        }

        public Criteria andClass_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("class_id >=", value, "class_id");
            return (Criteria) this;
        }

        public Criteria andClass_idLessThan(Integer value) {
            addCriterion("class_id <", value, "class_id");
            return (Criteria) this;
        }

        public Criteria andClass_idLessThanOrEqualTo(Integer value) {
            addCriterion("class_id <=", value, "class_id");
            return (Criteria) this;
        }

        public Criteria andClass_idIn(List<Integer> values) {
            addCriterion("class_id in", values, "class_id");
            return (Criteria) this;
        }

        public Criteria andClass_idNotIn(List<Integer> values) {
            addCriterion("class_id not in", values, "class_id");
            return (Criteria) this;
        }

        public Criteria andClass_idBetween(Integer value1, Integer value2) {
            addCriterion("class_id between", value1, value2, "class_id");
            return (Criteria) this;
        }

        public Criteria andClass_idNotBetween(Integer value1, Integer value2) {
            addCriterion("class_id not between", value1, value2, "class_id");
            return (Criteria) this;
        }

        public Criteria andMatch_seasonIsNull() {
            addCriterion("match_season is null");
            return (Criteria) this;
        }

        public Criteria andMatch_seasonIsNotNull() {
            addCriterion("match_season is not null");
            return (Criteria) this;
        }

        public Criteria andMatch_seasonEqualTo(String value) {
            addCriterion("match_season =", value, "match_season");
            return (Criteria) this;
        }

        public Criteria andMatch_seasonNotEqualTo(String value) {
            addCriterion("match_season <>", value, "match_season");
            return (Criteria) this;
        }

        public Criteria andMatch_seasonGreaterThan(String value) {
            addCriterion("match_season >", value, "match_season");
            return (Criteria) this;
        }

        public Criteria andMatch_seasonGreaterThanOrEqualTo(String value) {
            addCriterion("match_season >=", value, "match_season");
            return (Criteria) this;
        }

        public Criteria andMatch_seasonLessThan(String value) {
            addCriterion("match_season <", value, "match_season");
            return (Criteria) this;
        }

        public Criteria andMatch_seasonLessThanOrEqualTo(String value) {
            addCriterion("match_season <=", value, "match_season");
            return (Criteria) this;
        }

        public Criteria andMatch_seasonLike(String value) {
            addCriterion("match_season like", value, "match_season");
            return (Criteria) this;
        }

        public Criteria andMatch_seasonNotLike(String value) {
            addCriterion("match_season not like", value, "match_season");
            return (Criteria) this;
        }

        public Criteria andMatch_seasonIn(List<String> values) {
            addCriterion("match_season in", values, "match_season");
            return (Criteria) this;
        }

        public Criteria andMatch_seasonNotIn(List<String> values) {
            addCriterion("match_season not in", values, "match_season");
            return (Criteria) this;
        }

        public Criteria andMatch_seasonBetween(String value1, String value2) {
            addCriterion("match_season between", value1, value2, "match_season");
            return (Criteria) this;
        }

        public Criteria andMatch_seasonNotBetween(String value1, String value2) {
            addCriterion("match_season not between", value1, value2, "match_season");
            return (Criteria) this;
        }

        public Criteria andHome_team_idIsNull() {
            addCriterion("home_team_id is null");
            return (Criteria) this;
        }

        public Criteria andHome_team_idIsNotNull() {
            addCriterion("home_team_id is not null");
            return (Criteria) this;
        }

        public Criteria andHome_team_idEqualTo(Integer value) {
            addCriterion("home_team_id =", value, "home_team_id");
            return (Criteria) this;
        }

        public Criteria andHome_team_idNotEqualTo(Integer value) {
            addCriterion("home_team_id <>", value, "home_team_id");
            return (Criteria) this;
        }

        public Criteria andHome_team_idGreaterThan(Integer value) {
            addCriterion("home_team_id >", value, "home_team_id");
            return (Criteria) this;
        }

        public Criteria andHome_team_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("home_team_id >=", value, "home_team_id");
            return (Criteria) this;
        }

        public Criteria andHome_team_idLessThan(Integer value) {
            addCriterion("home_team_id <", value, "home_team_id");
            return (Criteria) this;
        }

        public Criteria andHome_team_idLessThanOrEqualTo(Integer value) {
            addCriterion("home_team_id <=", value, "home_team_id");
            return (Criteria) this;
        }

        public Criteria andHome_team_idIn(List<Integer> values) {
            addCriterion("home_team_id in", values, "home_team_id");
            return (Criteria) this;
        }

        public Criteria andHome_team_idNotIn(List<Integer> values) {
            addCriterion("home_team_id not in", values, "home_team_id");
            return (Criteria) this;
        }

        public Criteria andHome_team_idBetween(Integer value1, Integer value2) {
            addCriterion("home_team_id between", value1, value2, "home_team_id");
            return (Criteria) this;
        }

        public Criteria andHome_team_idNotBetween(Integer value1, Integer value2) {
            addCriterion("home_team_id not between", value1, value2, "home_team_id");
            return (Criteria) this;
        }

        public Criteria andGuest_team_idIsNull() {
            addCriterion("guest_team_id is null");
            return (Criteria) this;
        }

        public Criteria andGuest_team_idIsNotNull() {
            addCriterion("guest_team_id is not null");
            return (Criteria) this;
        }

        public Criteria andGuest_team_idEqualTo(Integer value) {
            addCriterion("guest_team_id =", value, "guest_team_id");
            return (Criteria) this;
        }

        public Criteria andGuest_team_idNotEqualTo(Integer value) {
            addCriterion("guest_team_id <>", value, "guest_team_id");
            return (Criteria) this;
        }

        public Criteria andGuest_team_idGreaterThan(Integer value) {
            addCriterion("guest_team_id >", value, "guest_team_id");
            return (Criteria) this;
        }

        public Criteria andGuest_team_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("guest_team_id >=", value, "guest_team_id");
            return (Criteria) this;
        }

        public Criteria andGuest_team_idLessThan(Integer value) {
            addCriterion("guest_team_id <", value, "guest_team_id");
            return (Criteria) this;
        }

        public Criteria andGuest_team_idLessThanOrEqualTo(Integer value) {
            addCriterion("guest_team_id <=", value, "guest_team_id");
            return (Criteria) this;
        }

        public Criteria andGuest_team_idIn(List<Integer> values) {
            addCriterion("guest_team_id in", values, "guest_team_id");
            return (Criteria) this;
        }

        public Criteria andGuest_team_idNotIn(List<Integer> values) {
            addCriterion("guest_team_id not in", values, "guest_team_id");
            return (Criteria) this;
        }

        public Criteria andGuest_team_idBetween(Integer value1, Integer value2) {
            addCriterion("guest_team_id between", value1, value2, "guest_team_id");
            return (Criteria) this;
        }

        public Criteria andGuest_team_idNotBetween(Integer value1, Integer value2) {
            addCriterion("guest_team_id not between", value1, value2, "guest_team_id");
            return (Criteria) this;
        }

        public Criteria andHome_teamIsNull() {
            addCriterion("home_team is null");
            return (Criteria) this;
        }

        public Criteria andHome_teamIsNotNull() {
            addCriterion("home_team is not null");
            return (Criteria) this;
        }

        public Criteria andHome_teamEqualTo(String value) {
            addCriterion("home_team =", value, "home_team");
            return (Criteria) this;
        }

        public Criteria andHome_teamNotEqualTo(String value) {
            addCriterion("home_team <>", value, "home_team");
            return (Criteria) this;
        }

        public Criteria andHome_teamGreaterThan(String value) {
            addCriterion("home_team >", value, "home_team");
            return (Criteria) this;
        }

        public Criteria andHome_teamGreaterThanOrEqualTo(String value) {
            addCriterion("home_team >=", value, "home_team");
            return (Criteria) this;
        }

        public Criteria andHome_teamLessThan(String value) {
            addCriterion("home_team <", value, "home_team");
            return (Criteria) this;
        }

        public Criteria andHome_teamLessThanOrEqualTo(String value) {
            addCriterion("home_team <=", value, "home_team");
            return (Criteria) this;
        }

        public Criteria andHome_teamLike(String value) {
            addCriterion("home_team like", value, "home_team");
            return (Criteria) this;
        }

        public Criteria andHome_teamNotLike(String value) {
            addCriterion("home_team not like", value, "home_team");
            return (Criteria) this;
        }

        public Criteria andHome_teamIn(List<String> values) {
            addCriterion("home_team in", values, "home_team");
            return (Criteria) this;
        }

        public Criteria andHome_teamNotIn(List<String> values) {
            addCriterion("home_team not in", values, "home_team");
            return (Criteria) this;
        }

        public Criteria andHome_teamBetween(String value1, String value2) {
            addCriterion("home_team between", value1, value2, "home_team");
            return (Criteria) this;
        }

        public Criteria andHome_teamNotBetween(String value1, String value2) {
            addCriterion("home_team not between", value1, value2, "home_team");
            return (Criteria) this;
        }

        public Criteria andGuest_teamIsNull() {
            addCriterion("guest_team is null");
            return (Criteria) this;
        }

        public Criteria andGuest_teamIsNotNull() {
            addCriterion("guest_team is not null");
            return (Criteria) this;
        }

        public Criteria andGuest_teamEqualTo(String value) {
            addCriterion("guest_team =", value, "guest_team");
            return (Criteria) this;
        }

        public Criteria andGuest_teamNotEqualTo(String value) {
            addCriterion("guest_team <>", value, "guest_team");
            return (Criteria) this;
        }

        public Criteria andGuest_teamGreaterThan(String value) {
            addCriterion("guest_team >", value, "guest_team");
            return (Criteria) this;
        }

        public Criteria andGuest_teamGreaterThanOrEqualTo(String value) {
            addCriterion("guest_team >=", value, "guest_team");
            return (Criteria) this;
        }

        public Criteria andGuest_teamLessThan(String value) {
            addCriterion("guest_team <", value, "guest_team");
            return (Criteria) this;
        }

        public Criteria andGuest_teamLessThanOrEqualTo(String value) {
            addCriterion("guest_team <=", value, "guest_team");
            return (Criteria) this;
        }

        public Criteria andGuest_teamLike(String value) {
            addCriterion("guest_team like", value, "guest_team");
            return (Criteria) this;
        }

        public Criteria andGuest_teamNotLike(String value) {
            addCriterion("guest_team not like", value, "guest_team");
            return (Criteria) this;
        }

        public Criteria andGuest_teamIn(List<String> values) {
            addCriterion("guest_team in", values, "guest_team");
            return (Criteria) this;
        }

        public Criteria andGuest_teamNotIn(List<String> values) {
            addCriterion("guest_team not in", values, "guest_team");
            return (Criteria) this;
        }

        public Criteria andGuest_teamBetween(String value1, String value2) {
            addCriterion("guest_team between", value1, value2, "guest_team");
            return (Criteria) this;
        }

        public Criteria andGuest_teamNotBetween(String value1, String value2) {
            addCriterion("guest_team not between", value1, value2, "guest_team");
            return (Criteria) this;
        }

        public Criteria andMatch_timeIsNull() {
            addCriterion("match_time is null");
            return (Criteria) this;
        }

        public Criteria andMatch_timeIsNotNull() {
            addCriterion("match_time is not null");
            return (Criteria) this;
        }

        public Criteria andMatch_timeEqualTo(Date value) {
            addCriterion("match_time =", value, "match_time");
            return (Criteria) this;
        }

        public Criteria andMatch_timeNotEqualTo(Date value) {
            addCriterion("match_time <>", value, "match_time");
            return (Criteria) this;
        }

        public Criteria andMatch_timeGreaterThan(Date value) {
            addCriterion("match_time >", value, "match_time");
            return (Criteria) this;
        }

        public Criteria andMatch_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("match_time >=", value, "match_time");
            return (Criteria) this;
        }

        public Criteria andMatch_timeLessThan(Date value) {
            addCriterion("match_time <", value, "match_time");
            return (Criteria) this;
        }

        public Criteria andMatch_timeLessThanOrEqualTo(Date value) {
            addCriterion("match_time <=", value, "match_time");
            return (Criteria) this;
        }

        public Criteria andMatch_timeIn(List<Date> values) {
            addCriterion("match_time in", values, "match_time");
            return (Criteria) this;
        }

        public Criteria andMatch_timeNotIn(List<Date> values) {
            addCriterion("match_time not in", values, "match_time");
            return (Criteria) this;
        }

        public Criteria andMatch_timeBetween(Date value1, Date value2) {
            addCriterion("match_time between", value1, value2, "match_time");
            return (Criteria) this;
        }

        public Criteria andMatch_timeNotBetween(Date value1, Date value2) {
            addCriterion("match_time not between", value1, value2, "match_time");
            return (Criteria) this;
        }

        public Criteria andMatch_time2IsNull() {
            addCriterion("match_time2 is null");
            return (Criteria) this;
        }

        public Criteria andMatch_time2IsNotNull() {
            addCriterion("match_time2 is not null");
            return (Criteria) this;
        }

        public Criteria andMatch_time2EqualTo(Date value) {
            addCriterion("match_time2 =", value, "match_time2");
            return (Criteria) this;
        }

        public Criteria andMatch_time2NotEqualTo(Date value) {
            addCriterion("match_time2 <>", value, "match_time2");
            return (Criteria) this;
        }

        public Criteria andMatch_time2GreaterThan(Date value) {
            addCriterion("match_time2 >", value, "match_time2");
            return (Criteria) this;
        }

        public Criteria andMatch_time2GreaterThanOrEqualTo(Date value) {
            addCriterion("match_time2 >=", value, "match_time2");
            return (Criteria) this;
        }

        public Criteria andMatch_time2LessThan(Date value) {
            addCriterion("match_time2 <", value, "match_time2");
            return (Criteria) this;
        }

        public Criteria andMatch_time2LessThanOrEqualTo(Date value) {
            addCriterion("match_time2 <=", value, "match_time2");
            return (Criteria) this;
        }

        public Criteria andMatch_time2In(List<Date> values) {
            addCriterion("match_time2 in", values, "match_time2");
            return (Criteria) this;
        }

        public Criteria andMatch_time2NotIn(List<Date> values) {
            addCriterion("match_time2 not in", values, "match_time2");
            return (Criteria) this;
        }

        public Criteria andMatch_time2Between(Date value1, Date value2) {
            addCriterion("match_time2 between", value1, value2, "match_time2");
            return (Criteria) this;
        }

        public Criteria andMatch_time2NotBetween(Date value1, Date value2) {
            addCriterion("match_time2 not between", value1, value2, "match_time2");
            return (Criteria) this;
        }

        public Criteria andHome_scoreIsNull() {
            addCriterion("home_score is null");
            return (Criteria) this;
        }

        public Criteria andHome_scoreIsNotNull() {
            addCriterion("home_score is not null");
            return (Criteria) this;
        }

        public Criteria andHome_scoreEqualTo(Integer value) {
            addCriterion("home_score =", value, "home_score");
            return (Criteria) this;
        }

        public Criteria andHome_scoreNotEqualTo(Integer value) {
            addCriterion("home_score <>", value, "home_score");
            return (Criteria) this;
        }

        public Criteria andHome_scoreGreaterThan(Integer value) {
            addCriterion("home_score >", value, "home_score");
            return (Criteria) this;
        }

        public Criteria andHome_scoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("home_score >=", value, "home_score");
            return (Criteria) this;
        }

        public Criteria andHome_scoreLessThan(Integer value) {
            addCriterion("home_score <", value, "home_score");
            return (Criteria) this;
        }

        public Criteria andHome_scoreLessThanOrEqualTo(Integer value) {
            addCriterion("home_score <=", value, "home_score");
            return (Criteria) this;
        }

        public Criteria andHome_scoreIn(List<Integer> values) {
            addCriterion("home_score in", values, "home_score");
            return (Criteria) this;
        }

        public Criteria andHome_scoreNotIn(List<Integer> values) {
            addCriterion("home_score not in", values, "home_score");
            return (Criteria) this;
        }

        public Criteria andHome_scoreBetween(Integer value1, Integer value2) {
            addCriterion("home_score between", value1, value2, "home_score");
            return (Criteria) this;
        }

        public Criteria andHome_scoreNotBetween(Integer value1, Integer value2) {
            addCriterion("home_score not between", value1, value2, "home_score");
            return (Criteria) this;
        }

        public Criteria andGuest_scoreIsNull() {
            addCriterion("guest_score is null");
            return (Criteria) this;
        }

        public Criteria andGuest_scoreIsNotNull() {
            addCriterion("guest_score is not null");
            return (Criteria) this;
        }

        public Criteria andGuest_scoreEqualTo(Integer value) {
            addCriterion("guest_score =", value, "guest_score");
            return (Criteria) this;
        }

        public Criteria andGuest_scoreNotEqualTo(Integer value) {
            addCriterion("guest_score <>", value, "guest_score");
            return (Criteria) this;
        }

        public Criteria andGuest_scoreGreaterThan(Integer value) {
            addCriterion("guest_score >", value, "guest_score");
            return (Criteria) this;
        }

        public Criteria andGuest_scoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("guest_score >=", value, "guest_score");
            return (Criteria) this;
        }

        public Criteria andGuest_scoreLessThan(Integer value) {
            addCriterion("guest_score <", value, "guest_score");
            return (Criteria) this;
        }

        public Criteria andGuest_scoreLessThanOrEqualTo(Integer value) {
            addCriterion("guest_score <=", value, "guest_score");
            return (Criteria) this;
        }

        public Criteria andGuest_scoreIn(List<Integer> values) {
            addCriterion("guest_score in", values, "guest_score");
            return (Criteria) this;
        }

        public Criteria andGuest_scoreNotIn(List<Integer> values) {
            addCriterion("guest_score not in", values, "guest_score");
            return (Criteria) this;
        }

        public Criteria andGuest_scoreBetween(Integer value1, Integer value2) {
            addCriterion("guest_score between", value1, value2, "guest_score");
            return (Criteria) this;
        }

        public Criteria andGuest_scoreNotBetween(Integer value1, Integer value2) {
            addCriterion("guest_score not between", value1, value2, "guest_score");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(Integer value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(Integer value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(Integer value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(Integer value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(Integer value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<Integer> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<Integer> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(Integer value1, Integer value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("score not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andHome_half_scoreIsNull() {
            addCriterion("home_half_score is null");
            return (Criteria) this;
        }

        public Criteria andHome_half_scoreIsNotNull() {
            addCriterion("home_half_score is not null");
            return (Criteria) this;
        }

        public Criteria andHome_half_scoreEqualTo(Integer value) {
            addCriterion("home_half_score =", value, "home_half_score");
            return (Criteria) this;
        }

        public Criteria andHome_half_scoreNotEqualTo(Integer value) {
            addCriterion("home_half_score <>", value, "home_half_score");
            return (Criteria) this;
        }

        public Criteria andHome_half_scoreGreaterThan(Integer value) {
            addCriterion("home_half_score >", value, "home_half_score");
            return (Criteria) this;
        }

        public Criteria andHome_half_scoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("home_half_score >=", value, "home_half_score");
            return (Criteria) this;
        }

        public Criteria andHome_half_scoreLessThan(Integer value) {
            addCriterion("home_half_score <", value, "home_half_score");
            return (Criteria) this;
        }

        public Criteria andHome_half_scoreLessThanOrEqualTo(Integer value) {
            addCriterion("home_half_score <=", value, "home_half_score");
            return (Criteria) this;
        }

        public Criteria andHome_half_scoreIn(List<Integer> values) {
            addCriterion("home_half_score in", values, "home_half_score");
            return (Criteria) this;
        }

        public Criteria andHome_half_scoreNotIn(List<Integer> values) {
            addCriterion("home_half_score not in", values, "home_half_score");
            return (Criteria) this;
        }

        public Criteria andHome_half_scoreBetween(Integer value1, Integer value2) {
            addCriterion("home_half_score between", value1, value2, "home_half_score");
            return (Criteria) this;
        }

        public Criteria andHome_half_scoreNotBetween(Integer value1, Integer value2) {
            addCriterion("home_half_score not between", value1, value2, "home_half_score");
            return (Criteria) this;
        }

        public Criteria andGuest_half_scoreIsNull() {
            addCriterion("guest_half_score is null");
            return (Criteria) this;
        }

        public Criteria andGuest_half_scoreIsNotNull() {
            addCriterion("guest_half_score is not null");
            return (Criteria) this;
        }

        public Criteria andGuest_half_scoreEqualTo(Integer value) {
            addCriterion("guest_half_score =", value, "guest_half_score");
            return (Criteria) this;
        }

        public Criteria andGuest_half_scoreNotEqualTo(Integer value) {
            addCriterion("guest_half_score <>", value, "guest_half_score");
            return (Criteria) this;
        }

        public Criteria andGuest_half_scoreGreaterThan(Integer value) {
            addCriterion("guest_half_score >", value, "guest_half_score");
            return (Criteria) this;
        }

        public Criteria andGuest_half_scoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("guest_half_score >=", value, "guest_half_score");
            return (Criteria) this;
        }

        public Criteria andGuest_half_scoreLessThan(Integer value) {
            addCriterion("guest_half_score <", value, "guest_half_score");
            return (Criteria) this;
        }

        public Criteria andGuest_half_scoreLessThanOrEqualTo(Integer value) {
            addCriterion("guest_half_score <=", value, "guest_half_score");
            return (Criteria) this;
        }

        public Criteria andGuest_half_scoreIn(List<Integer> values) {
            addCriterion("guest_half_score in", values, "guest_half_score");
            return (Criteria) this;
        }

        public Criteria andGuest_half_scoreNotIn(List<Integer> values) {
            addCriterion("guest_half_score not in", values, "guest_half_score");
            return (Criteria) this;
        }

        public Criteria andGuest_half_scoreBetween(Integer value1, Integer value2) {
            addCriterion("guest_half_score between", value1, value2, "guest_half_score");
            return (Criteria) this;
        }

        public Criteria andGuest_half_scoreNotBetween(Integer value1, Integer value2) {
            addCriterion("guest_half_score not between", value1, value2, "guest_half_score");
            return (Criteria) this;
        }

        public Criteria andHalf_scoreIsNull() {
            addCriterion("half_score is null");
            return (Criteria) this;
        }

        public Criteria andHalf_scoreIsNotNull() {
            addCriterion("half_score is not null");
            return (Criteria) this;
        }

        public Criteria andHalf_scoreEqualTo(Integer value) {
            addCriterion("half_score =", value, "half_score");
            return (Criteria) this;
        }

        public Criteria andHalf_scoreNotEqualTo(Integer value) {
            addCriterion("half_score <>", value, "half_score");
            return (Criteria) this;
        }

        public Criteria andHalf_scoreGreaterThan(Integer value) {
            addCriterion("half_score >", value, "half_score");
            return (Criteria) this;
        }

        public Criteria andHalf_scoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("half_score >=", value, "half_score");
            return (Criteria) this;
        }

        public Criteria andHalf_scoreLessThan(Integer value) {
            addCriterion("half_score <", value, "half_score");
            return (Criteria) this;
        }

        public Criteria andHalf_scoreLessThanOrEqualTo(Integer value) {
            addCriterion("half_score <=", value, "half_score");
            return (Criteria) this;
        }

        public Criteria andHalf_scoreIn(List<Integer> values) {
            addCriterion("half_score in", values, "half_score");
            return (Criteria) this;
        }

        public Criteria andHalf_scoreNotIn(List<Integer> values) {
            addCriterion("half_score not in", values, "half_score");
            return (Criteria) this;
        }

        public Criteria andHalf_scoreBetween(Integer value1, Integer value2) {
            addCriterion("half_score between", value1, value2, "half_score");
            return (Criteria) this;
        }

        public Criteria andHalf_scoreNotBetween(Integer value1, Integer value2) {
            addCriterion("half_score not between", value1, value2, "half_score");
            return (Criteria) this;
        }

        public Criteria andResultIsNull() {
            addCriterion("result is null");
            return (Criteria) this;
        }

        public Criteria andResultIsNotNull() {
            addCriterion("result is not null");
            return (Criteria) this;
        }

        public Criteria andResultEqualTo(String value) {
            addCriterion("result =", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotEqualTo(String value) {
            addCriterion("result <>", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThan(String value) {
            addCriterion("result >", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThanOrEqualTo(String value) {
            addCriterion("result >=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThan(String value) {
            addCriterion("result <", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThanOrEqualTo(String value) {
            addCriterion("result <=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLike(String value) {
            addCriterion("result like", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotLike(String value) {
            addCriterion("result not like", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultIn(List<String> values) {
            addCriterion("result in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotIn(List<String> values) {
            addCriterion("result not in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultBetween(String value1, String value2) {
            addCriterion("result between", value1, value2, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotBetween(String value1, String value2) {
            addCriterion("result not between", value1, value2, "result");
            return (Criteria) this;
        }

        public Criteria andFirst_goalIsNull() {
            addCriterion("first_goal is null");
            return (Criteria) this;
        }

        public Criteria andFirst_goalIsNotNull() {
            addCriterion("first_goal is not null");
            return (Criteria) this;
        }

        public Criteria andFirst_goalEqualTo(Float value) {
            addCriterion("first_goal =", value, "first_goal");
            return (Criteria) this;
        }

        public Criteria andFirst_goalNotEqualTo(Float value) {
            addCriterion("first_goal <>", value, "first_goal");
            return (Criteria) this;
        }

        public Criteria andFirst_goalGreaterThan(Float value) {
            addCriterion("first_goal >", value, "first_goal");
            return (Criteria) this;
        }

        public Criteria andFirst_goalGreaterThanOrEqualTo(Float value) {
            addCriterion("first_goal >=", value, "first_goal");
            return (Criteria) this;
        }

        public Criteria andFirst_goalLessThan(Float value) {
            addCriterion("first_goal <", value, "first_goal");
            return (Criteria) this;
        }

        public Criteria andFirst_goalLessThanOrEqualTo(Float value) {
            addCriterion("first_goal <=", value, "first_goal");
            return (Criteria) this;
        }

        public Criteria andFirst_goalIn(List<Float> values) {
            addCriterion("first_goal in", values, "first_goal");
            return (Criteria) this;
        }

        public Criteria andFirst_goalNotIn(List<Float> values) {
            addCriterion("first_goal not in", values, "first_goal");
            return (Criteria) this;
        }

        public Criteria andFirst_goalBetween(Float value1, Float value2) {
            addCriterion("first_goal between", value1, value2, "first_goal");
            return (Criteria) this;
        }

        public Criteria andFirst_goalNotBetween(Float value1, Float value2) {
            addCriterion("first_goal not between", value1, value2, "first_goal");
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

        public Criteria andGoalEqualTo(Float value) {
            addCriterion("goal =", value, "goal");
            return (Criteria) this;
        }

        public Criteria andGoalNotEqualTo(Float value) {
            addCriterion("goal <>", value, "goal");
            return (Criteria) this;
        }

        public Criteria andGoalGreaterThan(Float value) {
            addCriterion("goal >", value, "goal");
            return (Criteria) this;
        }

        public Criteria andGoalGreaterThanOrEqualTo(Float value) {
            addCriterion("goal >=", value, "goal");
            return (Criteria) this;
        }

        public Criteria andGoalLessThan(Float value) {
            addCriterion("goal <", value, "goal");
            return (Criteria) this;
        }

        public Criteria andGoalLessThanOrEqualTo(Float value) {
            addCriterion("goal <=", value, "goal");
            return (Criteria) this;
        }

        public Criteria andGoalIn(List<Float> values) {
            addCriterion("goal in", values, "goal");
            return (Criteria) this;
        }

        public Criteria andGoalNotIn(List<Float> values) {
            addCriterion("goal not in", values, "goal");
            return (Criteria) this;
        }

        public Criteria andGoalBetween(Float value1, Float value2) {
            addCriterion("goal between", value1, value2, "goal");
            return (Criteria) this;
        }

        public Criteria andGoalNotBetween(Float value1, Float value2) {
            addCriterion("goal not between", value1, value2, "goal");
            return (Criteria) this;
        }

        public Criteria andFirst_up_oddsIsNull() {
            addCriterion("first_up_odds is null");
            return (Criteria) this;
        }

        public Criteria andFirst_up_oddsIsNotNull() {
            addCriterion("first_up_odds is not null");
            return (Criteria) this;
        }

        public Criteria andFirst_up_oddsEqualTo(Float value) {
            addCriterion("first_up_odds =", value, "first_up_odds");
            return (Criteria) this;
        }

        public Criteria andFirst_up_oddsNotEqualTo(Float value) {
            addCriterion("first_up_odds <>", value, "first_up_odds");
            return (Criteria) this;
        }

        public Criteria andFirst_up_oddsGreaterThan(Float value) {
            addCriterion("first_up_odds >", value, "first_up_odds");
            return (Criteria) this;
        }

        public Criteria andFirst_up_oddsGreaterThanOrEqualTo(Float value) {
            addCriterion("first_up_odds >=", value, "first_up_odds");
            return (Criteria) this;
        }

        public Criteria andFirst_up_oddsLessThan(Float value) {
            addCriterion("first_up_odds <", value, "first_up_odds");
            return (Criteria) this;
        }

        public Criteria andFirst_up_oddsLessThanOrEqualTo(Float value) {
            addCriterion("first_up_odds <=", value, "first_up_odds");
            return (Criteria) this;
        }

        public Criteria andFirst_up_oddsIn(List<Float> values) {
            addCriterion("first_up_odds in", values, "first_up_odds");
            return (Criteria) this;
        }

        public Criteria andFirst_up_oddsNotIn(List<Float> values) {
            addCriterion("first_up_odds not in", values, "first_up_odds");
            return (Criteria) this;
        }

        public Criteria andFirst_up_oddsBetween(Float value1, Float value2) {
            addCriterion("first_up_odds between", value1, value2, "first_up_odds");
            return (Criteria) this;
        }

        public Criteria andFirst_up_oddsNotBetween(Float value1, Float value2) {
            addCriterion("first_up_odds not between", value1, value2, "first_up_odds");
            return (Criteria) this;
        }

        public Criteria andUp_oddsIsNull() {
            addCriterion("up_odds is null");
            return (Criteria) this;
        }

        public Criteria andUp_oddsIsNotNull() {
            addCriterion("up_odds is not null");
            return (Criteria) this;
        }

        public Criteria andUp_oddsEqualTo(Float value) {
            addCriterion("up_odds =", value, "up_odds");
            return (Criteria) this;
        }

        public Criteria andUp_oddsNotEqualTo(Float value) {
            addCriterion("up_odds <>", value, "up_odds");
            return (Criteria) this;
        }

        public Criteria andUp_oddsGreaterThan(Float value) {
            addCriterion("up_odds >", value, "up_odds");
            return (Criteria) this;
        }

        public Criteria andUp_oddsGreaterThanOrEqualTo(Float value) {
            addCriterion("up_odds >=", value, "up_odds");
            return (Criteria) this;
        }

        public Criteria andUp_oddsLessThan(Float value) {
            addCriterion("up_odds <", value, "up_odds");
            return (Criteria) this;
        }

        public Criteria andUp_oddsLessThanOrEqualTo(Float value) {
            addCriterion("up_odds <=", value, "up_odds");
            return (Criteria) this;
        }

        public Criteria andUp_oddsIn(List<Float> values) {
            addCriterion("up_odds in", values, "up_odds");
            return (Criteria) this;
        }

        public Criteria andUp_oddsNotIn(List<Float> values) {
            addCriterion("up_odds not in", values, "up_odds");
            return (Criteria) this;
        }

        public Criteria andUp_oddsBetween(Float value1, Float value2) {
            addCriterion("up_odds between", value1, value2, "up_odds");
            return (Criteria) this;
        }

        public Criteria andUp_oddsNotBetween(Float value1, Float value2) {
            addCriterion("up_odds not between", value1, value2, "up_odds");
            return (Criteria) this;
        }

        public Criteria andFirst_down_oddsIsNull() {
            addCriterion("first_down_odds is null");
            return (Criteria) this;
        }

        public Criteria andFirst_down_oddsIsNotNull() {
            addCriterion("first_down_odds is not null");
            return (Criteria) this;
        }

        public Criteria andFirst_down_oddsEqualTo(Float value) {
            addCriterion("first_down_odds =", value, "first_down_odds");
            return (Criteria) this;
        }

        public Criteria andFirst_down_oddsNotEqualTo(Float value) {
            addCriterion("first_down_odds <>", value, "first_down_odds");
            return (Criteria) this;
        }

        public Criteria andFirst_down_oddsGreaterThan(Float value) {
            addCriterion("first_down_odds >", value, "first_down_odds");
            return (Criteria) this;
        }

        public Criteria andFirst_down_oddsGreaterThanOrEqualTo(Float value) {
            addCriterion("first_down_odds >=", value, "first_down_odds");
            return (Criteria) this;
        }

        public Criteria andFirst_down_oddsLessThan(Float value) {
            addCriterion("first_down_odds <", value, "first_down_odds");
            return (Criteria) this;
        }

        public Criteria andFirst_down_oddsLessThanOrEqualTo(Float value) {
            addCriterion("first_down_odds <=", value, "first_down_odds");
            return (Criteria) this;
        }

        public Criteria andFirst_down_oddsIn(List<Float> values) {
            addCriterion("first_down_odds in", values, "first_down_odds");
            return (Criteria) this;
        }

        public Criteria andFirst_down_oddsNotIn(List<Float> values) {
            addCriterion("first_down_odds not in", values, "first_down_odds");
            return (Criteria) this;
        }

        public Criteria andFirst_down_oddsBetween(Float value1, Float value2) {
            addCriterion("first_down_odds between", value1, value2, "first_down_odds");
            return (Criteria) this;
        }

        public Criteria andFirst_down_oddsNotBetween(Float value1, Float value2) {
            addCriterion("first_down_odds not between", value1, value2, "first_down_odds");
            return (Criteria) this;
        }

        public Criteria andDown_oddsIsNull() {
            addCriterion("down_odds is null");
            return (Criteria) this;
        }

        public Criteria andDown_oddsIsNotNull() {
            addCriterion("down_odds is not null");
            return (Criteria) this;
        }

        public Criteria andDown_oddsEqualTo(Float value) {
            addCriterion("down_odds =", value, "down_odds");
            return (Criteria) this;
        }

        public Criteria andDown_oddsNotEqualTo(Float value) {
            addCriterion("down_odds <>", value, "down_odds");
            return (Criteria) this;
        }

        public Criteria andDown_oddsGreaterThan(Float value) {
            addCriterion("down_odds >", value, "down_odds");
            return (Criteria) this;
        }

        public Criteria andDown_oddsGreaterThanOrEqualTo(Float value) {
            addCriterion("down_odds >=", value, "down_odds");
            return (Criteria) this;
        }

        public Criteria andDown_oddsLessThan(Float value) {
            addCriterion("down_odds <", value, "down_odds");
            return (Criteria) this;
        }

        public Criteria andDown_oddsLessThanOrEqualTo(Float value) {
            addCriterion("down_odds <=", value, "down_odds");
            return (Criteria) this;
        }

        public Criteria andDown_oddsIn(List<Float> values) {
            addCriterion("down_odds in", values, "down_odds");
            return (Criteria) this;
        }

        public Criteria andDown_oddsNotIn(List<Float> values) {
            addCriterion("down_odds not in", values, "down_odds");
            return (Criteria) this;
        }

        public Criteria andDown_oddsBetween(Float value1, Float value2) {
            addCriterion("down_odds between", value1, value2, "down_odds");
            return (Criteria) this;
        }

        public Criteria andDown_oddsNotBetween(Float value1, Float value2) {
            addCriterion("down_odds not between", value1, value2, "down_odds");
            return (Criteria) this;
        }

        public Criteria andSchedule_idIsNull() {
            addCriterion("schedule_id is null");
            return (Criteria) this;
        }

        public Criteria andSchedule_idIsNotNull() {
            addCriterion("schedule_id is not null");
            return (Criteria) this;
        }

        public Criteria andSchedule_idEqualTo(Integer value) {
            addCriterion("schedule_id =", value, "schedule_id");
            return (Criteria) this;
        }

        public Criteria andSchedule_idNotEqualTo(Integer value) {
            addCriterion("schedule_id <>", value, "schedule_id");
            return (Criteria) this;
        }

        public Criteria andSchedule_idGreaterThan(Integer value) {
            addCriterion("schedule_id >", value, "schedule_id");
            return (Criteria) this;
        }

        public Criteria andSchedule_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("schedule_id >=", value, "schedule_id");
            return (Criteria) this;
        }

        public Criteria andSchedule_idLessThan(Integer value) {
            addCriterion("schedule_id <", value, "schedule_id");
            return (Criteria) this;
        }

        public Criteria andSchedule_idLessThanOrEqualTo(Integer value) {
            addCriterion("schedule_id <=", value, "schedule_id");
            return (Criteria) this;
        }

        public Criteria andSchedule_idIn(List<Integer> values) {
            addCriterion("schedule_id in", values, "schedule_id");
            return (Criteria) this;
        }

        public Criteria andSchedule_idNotIn(List<Integer> values) {
            addCriterion("schedule_id not in", values, "schedule_id");
            return (Criteria) this;
        }

        public Criteria andSchedule_idBetween(Integer value1, Integer value2) {
            addCriterion("schedule_id between", value1, value2, "schedule_id");
            return (Criteria) this;
        }

        public Criteria andSchedule_idNotBetween(Integer value1, Integer value2) {
            addCriterion("schedule_id not between", value1, value2, "schedule_id");
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