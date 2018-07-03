package com.offcn.common.domain.course;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CoursePriceLinkQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public CoursePriceLinkQuery() {
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

    public void setPageNo(Integer pageNo) {
        this.pageNo=pageNo;
        this.startRow = (pageNo-1)*this.pageSize;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setStartRow(Integer startRow) {
        this.startRow=startRow;
    }

    public Integer getStartRow() {
        return startRow;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize=pageSize;
        this.startRow = (pageNo-1)*this.pageSize;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setFields(String fields) {
        this.fields=fields;
    }

    public String getFields() {
        return fields;
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

        public Criteria andCourseIdIsNull() {
            addCriterion("course_id is null");
            return (Criteria) this;
        }

        public Criteria andCourseIdIsNotNull() {
            addCriterion("course_id is not null");
            return (Criteria) this;
        }

        public Criteria andCourseIdEqualTo(Integer value) {
            addCriterion("course_id =", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotEqualTo(Integer value) {
            addCriterion("course_id <>", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdGreaterThan(Integer value) {
            addCriterion("course_id >", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("course_id >=", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLessThan(Integer value) {
            addCriterion("course_id <", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLessThanOrEqualTo(Integer value) {
            addCriterion("course_id <=", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdIn(List<Integer> values) {
            addCriterion("course_id in", values, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotIn(List<Integer> values) {
            addCriterion("course_id not in", values, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdBetween(Integer value1, Integer value2) {
            addCriterion("course_id between", value1, value2, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("course_id not between", value1, value2, "courseId");
            return (Criteria) this;
        }

        public Criteria andAgreementIsNull() {
            addCriterion("agreement is null");
            return (Criteria) this;
        }

        public Criteria andAgreementIsNotNull() {
            addCriterion("agreement is not null");
            return (Criteria) this;
        }

        public Criteria andAgreementEqualTo(String value) {
            addCriterion("agreement =", value, "agreement");
            return (Criteria) this;
        }

        public Criteria andAgreementNotEqualTo(String value) {
            addCriterion("agreement <>", value, "agreement");
            return (Criteria) this;
        }

        public Criteria andAgreementGreaterThan(String value) {
            addCriterion("agreement >", value, "agreement");
            return (Criteria) this;
        }

        public Criteria andAgreementGreaterThanOrEqualTo(String value) {
            addCriterion("agreement >=", value, "agreement");
            return (Criteria) this;
        }

        public Criteria andAgreementLessThan(String value) {
            addCriterion("agreement <", value, "agreement");
            return (Criteria) this;
        }

        public Criteria andAgreementLessThanOrEqualTo(String value) {
            addCriterion("agreement <=", value, "agreement");
            return (Criteria) this;
        }

        public Criteria andAgreementLike(String value) {
            addCriterion("agreement like", value, "agreement");
            return (Criteria) this;
        }

        public Criteria andAgreementNotLike(String value) {
            addCriterion("agreement not like", value, "agreement");
            return (Criteria) this;
        }

        public Criteria andAgreementIn(List<String> values) {
            addCriterion("agreement in", values, "agreement");
            return (Criteria) this;
        }

        public Criteria andAgreementNotIn(List<String> values) {
            addCriterion("agreement not in", values, "agreement");
            return (Criteria) this;
        }

        public Criteria andAgreementBetween(String value1, String value2) {
            addCriterion("agreement between", value1, value2, "agreement");
            return (Criteria) this;
        }

        public Criteria andAgreementNotBetween(String value1, String value2) {
            addCriterion("agreement not between", value1, value2, "agreement");
            return (Criteria) this;
        }

        public Criteria andStayIsNull() {
            addCriterion("stay is null");
            return (Criteria) this;
        }

        public Criteria andStayIsNotNull() {
            addCriterion("stay is not null");
            return (Criteria) this;
        }

        public Criteria andStayEqualTo(String value) {
            addCriterion("stay =", value, "stay");
            return (Criteria) this;
        }

        public Criteria andStayNotEqualTo(String value) {
            addCriterion("stay <>", value, "stay");
            return (Criteria) this;
        }

        public Criteria andStayGreaterThan(String value) {
            addCriterion("stay >", value, "stay");
            return (Criteria) this;
        }

        public Criteria andStayGreaterThanOrEqualTo(String value) {
            addCriterion("stay >=", value, "stay");
            return (Criteria) this;
        }

        public Criteria andStayLessThan(String value) {
            addCriterion("stay <", value, "stay");
            return (Criteria) this;
        }

        public Criteria andStayLessThanOrEqualTo(String value) {
            addCriterion("stay <=", value, "stay");
            return (Criteria) this;
        }

        public Criteria andStayLike(String value) {
            addCriterion("stay like", value, "stay");
            return (Criteria) this;
        }

        public Criteria andStayNotLike(String value) {
            addCriterion("stay not like", value, "stay");
            return (Criteria) this;
        }

        public Criteria andStayIn(List<String> values) {
            addCriterion("stay in", values, "stay");
            return (Criteria) this;
        }

        public Criteria andStayNotIn(List<String> values) {
            addCriterion("stay not in", values, "stay");
            return (Criteria) this;
        }

        public Criteria andStayBetween(String value1, String value2) {
            addCriterion("stay between", value1, value2, "stay");
            return (Criteria) this;
        }

        public Criteria andStayNotBetween(String value1, String value2) {
            addCriterion("stay not between", value1, value2, "stay");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andWrittenTfIsNull() {
            addCriterion("written_tf is null");
            return (Criteria) this;
        }

        public Criteria andWrittenTfIsNotNull() {
            addCriterion("written_tf is not null");
            return (Criteria) this;
        }

        public Criteria andWrittenTfEqualTo(BigDecimal value) {
            addCriterion("written_tf =", value, "writtenTf");
            return (Criteria) this;
        }

        public Criteria andWrittenTfNotEqualTo(BigDecimal value) {
            addCriterion("written_tf <>", value, "writtenTf");
            return (Criteria) this;
        }

        public Criteria andWrittenTfGreaterThan(BigDecimal value) {
            addCriterion("written_tf >", value, "writtenTf");
            return (Criteria) this;
        }

        public Criteria andWrittenTfGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("written_tf >=", value, "writtenTf");
            return (Criteria) this;
        }

        public Criteria andWrittenTfLessThan(BigDecimal value) {
            addCriterion("written_tf <", value, "writtenTf");
            return (Criteria) this;
        }

        public Criteria andWrittenTfLessThanOrEqualTo(BigDecimal value) {
            addCriterion("written_tf <=", value, "writtenTf");
            return (Criteria) this;
        }

        public Criteria andWrittenTfIn(List<BigDecimal> values) {
            addCriterion("written_tf in", values, "writtenTf");
            return (Criteria) this;
        }

        public Criteria andWrittenTfNotIn(List<BigDecimal> values) {
            addCriterion("written_tf not in", values, "writtenTf");
            return (Criteria) this;
        }

        public Criteria andWrittenTfBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("written_tf between", value1, value2, "writtenTf");
            return (Criteria) this;
        }

        public Criteria andWrittenTfNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("written_tf not between", value1, value2, "writtenTf");
            return (Criteria) this;
        }

        public Criteria andInterviewTfIsNull() {
            addCriterion("interview_tf is null");
            return (Criteria) this;
        }

        public Criteria andInterviewTfIsNotNull() {
            addCriterion("interview_tf is not null");
            return (Criteria) this;
        }

        public Criteria andInterviewTfEqualTo(BigDecimal value) {
            addCriterion("interview_tf =", value, "interviewTf");
            return (Criteria) this;
        }

        public Criteria andInterviewTfNotEqualTo(BigDecimal value) {
            addCriterion("interview_tf <>", value, "interviewTf");
            return (Criteria) this;
        }

        public Criteria andInterviewTfGreaterThan(BigDecimal value) {
            addCriterion("interview_tf >", value, "interviewTf");
            return (Criteria) this;
        }

        public Criteria andInterviewTfGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("interview_tf >=", value, "interviewTf");
            return (Criteria) this;
        }

        public Criteria andInterviewTfLessThan(BigDecimal value) {
            addCriterion("interview_tf <", value, "interviewTf");
            return (Criteria) this;
        }

        public Criteria andInterviewTfLessThanOrEqualTo(BigDecimal value) {
            addCriterion("interview_tf <=", value, "interviewTf");
            return (Criteria) this;
        }

        public Criteria andInterviewTfIn(List<BigDecimal> values) {
            addCriterion("interview_tf in", values, "interviewTf");
            return (Criteria) this;
        }

        public Criteria andInterviewTfNotIn(List<BigDecimal> values) {
            addCriterion("interview_tf not in", values, "interviewTf");
            return (Criteria) this;
        }

        public Criteria andInterviewTfBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("interview_tf between", value1, value2, "interviewTf");
            return (Criteria) this;
        }

        public Criteria andInterviewTfNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("interview_tf not between", value1, value2, "interviewTf");
            return (Criteria) this;
        }

        public Criteria andMarkIsNull() {
            addCriterion("mark is null");
            return (Criteria) this;
        }

        public Criteria andMarkIsNotNull() {
            addCriterion("mark is not null");
            return (Criteria) this;
        }

        public Criteria andMarkEqualTo(String value) {
            addCriterion("mark =", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotEqualTo(String value) {
            addCriterion("mark <>", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkGreaterThan(String value) {
            addCriterion("mark >", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkGreaterThanOrEqualTo(String value) {
            addCriterion("mark >=", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkLessThan(String value) {
            addCriterion("mark <", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkLessThanOrEqualTo(String value) {
            addCriterion("mark <=", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkLike(String value) {
            addCriterion("mark like", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotLike(String value) {
            addCriterion("mark not like", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkIn(List<String> values) {
            addCriterion("mark in", values, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotIn(List<String> values) {
            addCriterion("mark not in", values, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkBetween(String value1, String value2) {
            addCriterion("mark between", value1, value2, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotBetween(String value1, String value2) {
            addCriterion("mark not between", value1, value2, "mark");
            return (Criteria) this;
        }

        public Criteria andIsClosedIsNull() {
            addCriterion("is_closed is null");
            return (Criteria) this;
        }

        public Criteria andIsClosedIsNotNull() {
            addCriterion("is_closed is not null");
            return (Criteria) this;
        }

        public Criteria andIsClosedEqualTo(Integer value) {
            addCriterion("is_closed =", value, "isClosed");
            return (Criteria) this;
        }

        public Criteria andIsClosedNotEqualTo(Integer value) {
            addCriterion("is_closed <>", value, "isClosed");
            return (Criteria) this;
        }

        public Criteria andIsClosedGreaterThan(Integer value) {
            addCriterion("is_closed >", value, "isClosed");
            return (Criteria) this;
        }

        public Criteria andIsClosedGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_closed >=", value, "isClosed");
            return (Criteria) this;
        }

        public Criteria andIsClosedLessThan(Integer value) {
            addCriterion("is_closed <", value, "isClosed");
            return (Criteria) this;
        }

        public Criteria andIsClosedLessThanOrEqualTo(Integer value) {
            addCriterion("is_closed <=", value, "isClosed");
            return (Criteria) this;
        }

        public Criteria andIsClosedIn(List<Integer> values) {
            addCriterion("is_closed in", values, "isClosed");
            return (Criteria) this;
        }

        public Criteria andIsClosedNotIn(List<Integer> values) {
            addCriterion("is_closed not in", values, "isClosed");
            return (Criteria) this;
        }

        public Criteria andIsClosedBetween(Integer value1, Integer value2) {
            addCriterion("is_closed between", value1, value2, "isClosed");
            return (Criteria) this;
        }

        public Criteria andIsClosedNotBetween(Integer value1, Integer value2) {
            addCriterion("is_closed not between", value1, value2, "isClosed");
            return (Criteria) this;
        }

        public Criteria andCourseSuffixIsNull() {
            addCriterion("course_suffix is null");
            return (Criteria) this;
        }

        public Criteria andCourseSuffixIsNotNull() {
            addCriterion("course_suffix is not null");
            return (Criteria) this;
        }

        public Criteria andCourseSuffixEqualTo(String value) {
            addCriterion("course_suffix =", value, "courseSuffix");
            return (Criteria) this;
        }

        public Criteria andCourseSuffixNotEqualTo(String value) {
            addCriterion("course_suffix <>", value, "courseSuffix");
            return (Criteria) this;
        }

        public Criteria andCourseSuffixGreaterThan(String value) {
            addCriterion("course_suffix >", value, "courseSuffix");
            return (Criteria) this;
        }

        public Criteria andCourseSuffixGreaterThanOrEqualTo(String value) {
            addCriterion("course_suffix >=", value, "courseSuffix");
            return (Criteria) this;
        }

        public Criteria andCourseSuffixLessThan(String value) {
            addCriterion("course_suffix <", value, "courseSuffix");
            return (Criteria) this;
        }

        public Criteria andCourseSuffixLessThanOrEqualTo(String value) {
            addCriterion("course_suffix <=", value, "courseSuffix");
            return (Criteria) this;
        }

        public Criteria andCourseSuffixLike(String value) {
            addCriterion("course_suffix like", value, "courseSuffix");
            return (Criteria) this;
        }

        public Criteria andCourseSuffixNotLike(String value) {
            addCriterion("course_suffix not like", value, "courseSuffix");
            return (Criteria) this;
        }

        public Criteria andCourseSuffixIn(List<String> values) {
            addCriterion("course_suffix in", values, "courseSuffix");
            return (Criteria) this;
        }

        public Criteria andCourseSuffixNotIn(List<String> values) {
            addCriterion("course_suffix not in", values, "courseSuffix");
            return (Criteria) this;
        }

        public Criteria andCourseSuffixBetween(String value1, String value2) {
            addCriterion("course_suffix between", value1, value2, "courseSuffix");
            return (Criteria) this;
        }

        public Criteria andCourseSuffixNotBetween(String value1, String value2) {
            addCriterion("course_suffix not between", value1, value2, "courseSuffix");
            return (Criteria) this;
        }

        public Criteria andTfMarkIsNull() {
            addCriterion("tf_mark is null");
            return (Criteria) this;
        }

        public Criteria andTfMarkIsNotNull() {
            addCriterion("tf_mark is not null");
            return (Criteria) this;
        }

        public Criteria andTfMarkEqualTo(String value) {
            addCriterion("tf_mark =", value, "tfMark");
            return (Criteria) this;
        }

        public Criteria andTfMarkNotEqualTo(String value) {
            addCriterion("tf_mark <>", value, "tfMark");
            return (Criteria) this;
        }

        public Criteria andTfMarkGreaterThan(String value) {
            addCriterion("tf_mark >", value, "tfMark");
            return (Criteria) this;
        }

        public Criteria andTfMarkGreaterThanOrEqualTo(String value) {
            addCriterion("tf_mark >=", value, "tfMark");
            return (Criteria) this;
        }

        public Criteria andTfMarkLessThan(String value) {
            addCriterion("tf_mark <", value, "tfMark");
            return (Criteria) this;
        }

        public Criteria andTfMarkLessThanOrEqualTo(String value) {
            addCriterion("tf_mark <=", value, "tfMark");
            return (Criteria) this;
        }

        public Criteria andTfMarkLike(String value) {
            addCriterion("tf_mark like", value, "tfMark");
            return (Criteria) this;
        }

        public Criteria andTfMarkNotLike(String value) {
            addCriterion("tf_mark not like", value, "tfMark");
            return (Criteria) this;
        }

        public Criteria andTfMarkIn(List<String> values) {
            addCriterion("tf_mark in", values, "tfMark");
            return (Criteria) this;
        }

        public Criteria andTfMarkNotIn(List<String> values) {
            addCriterion("tf_mark not in", values, "tfMark");
            return (Criteria) this;
        }

        public Criteria andTfMarkBetween(String value1, String value2) {
            addCriterion("tf_mark between", value1, value2, "tfMark");
            return (Criteria) this;
        }

        public Criteria andTfMarkNotBetween(String value1, String value2) {
            addCriterion("tf_mark not between", value1, value2, "tfMark");
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