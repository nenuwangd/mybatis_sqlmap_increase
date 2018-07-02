package com.wangdi.bean.ad;

import java.io.Serializable;

public class Position implements Serializable {
    /**
     * ���λ��ID
     */
    private Long id;

    /**
     * ��λ��ID=0ʱ��������Ƕ������λ��
     */
    private Long parentId;

    /**
     * ���λ������
     */
    private String name;

    /**
     * ������ţ���ʾͬ����Ŀ��չ�ִ�������ֵ��������ƴ������С�ȡֵ��Χ:�����������
     */
    private Integer sort;

    /**
     * ��λ���Ƿ�Ϊ����1Ϊtrue��0Ϊfalse
     */
    private Boolean isParent;

    /**
     * �Ƿ����� 0�� 1��
     */
    private Boolean isEnable;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Boolean getIsParent() {
        return isParent;
    }

    public void setIsParent(Boolean isParent) {
        this.isParent = isParent;
    }

    public Boolean getIsEnable() {
        return isEnable;
    }

    public void setIsEnable(Boolean isEnable) {
        this.isEnable = isEnable;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", parentId=").append(parentId);
        sb.append(", name=").append(name);
        sb.append(", sort=").append(sort);
        sb.append(", isParent=").append(isParent);
        sb.append(", isEnable=").append(isEnable);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}