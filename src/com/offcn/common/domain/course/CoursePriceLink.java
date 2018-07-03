package com.offcn.common.domain.course;

import java.io.Serializable;
import java.math.BigDecimal;

public class CoursePriceLink implements Serializable {
    /**
     * 课程id
     */
    private Integer id;

    private Integer courseId;

    /**
     * 协议、非协议
     */
    private String agreement;

    /**
     * 住宿地址
     */
    private String stay;

    /**
     * 价格
     */
    private BigDecimal price;

    /**
     * 笔试不过退费
     */
    private BigDecimal writtenTf;

    /**
     * 面试不过退费
     */
    private BigDecimal interviewTf;

    /**
     * 备注
     */
    private String mark;

    /**
     * 是否封闭1封闭 0非封闭
     */
    private Integer isClosed;

    private String courseSuffix;

    private String tfMark;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getAgreement() {
        return agreement;
    }

    public void setAgreement(String agreement) {
        this.agreement = agreement == null ? null : agreement.trim();
    }

    public String getStay() {
        return stay;
    }

    public void setStay(String stay) {
        this.stay = stay == null ? null : stay.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getWrittenTf() {
        return writtenTf;
    }

    public void setWrittenTf(BigDecimal writtenTf) {
        this.writtenTf = writtenTf;
    }

    public BigDecimal getInterviewTf() {
        return interviewTf;
    }

    public void setInterviewTf(BigDecimal interviewTf) {
        this.interviewTf = interviewTf;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark == null ? null : mark.trim();
    }

    public Integer getIsClosed() {
        return isClosed;
    }

    public void setIsClosed(Integer isClosed) {
        this.isClosed = isClosed;
    }

    public String getCourseSuffix() {
        return courseSuffix;
    }

    public void setCourseSuffix(String courseSuffix) {
        this.courseSuffix = courseSuffix == null ? null : courseSuffix.trim();
    }

    public String getTfMark() {
        return tfMark;
    }

    public void setTfMark(String tfMark) {
        this.tfMark = tfMark == null ? null : tfMark.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", courseId=").append(courseId);
        sb.append(", agreement=").append(agreement);
        sb.append(", stay=").append(stay);
        sb.append(", price=").append(price);
        sb.append(", writtenTf=").append(writtenTf);
        sb.append(", interviewTf=").append(interviewTf);
        sb.append(", mark=").append(mark);
        sb.append(", isClosed=").append(isClosed);
        sb.append(", courseSuffix=").append(courseSuffix);
        sb.append(", tfMark=").append(tfMark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}