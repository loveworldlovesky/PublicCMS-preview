package com.publiccms.entities.sys;

// Generated 2016-1-19 11:28:06 by Hibernate Tools 4.3.1

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sanluan.common.source.entity.MyColumn;

/**
 * SystemDept generated by hbm2java
 */
@Entity
@Table(name = "sys_dept")
public class SysDept implements java.io.Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    @MyColumn(title = "ID")
    private Integer id;
    @MyColumn(title = "站点", condition = true)
    @JsonIgnore
    private int siteId;
    @MyColumn(title = "名称", condition = true, like = true)
    private String name;
    @MyColumn(title = "父部门", condition = true)
    private Integer parentId;
    @MyColumn(title = "描述")
    private String description;
    @MyColumn(title = "负责人", condition = true)
    private Long userId;
    @MyColumn(title = "拥有全部分类")
    private boolean ownsAllCategory;
    @MyColumn(title = "拥有全部页面")
    private boolean ownsAllPage;

    public SysDept() {
    }

    public SysDept(int siteId, String name, boolean ownsAllCategory, boolean ownsAllPage) {
        this.siteId = siteId;
        this.name = name;
        this.ownsAllCategory = ownsAllCategory;
        this.ownsAllPage = ownsAllPage;
    }

    public SysDept(int siteId, String name, Integer parentId, String description, Long userId, boolean ownsAllCategory,
            boolean ownsAllPage) {
        this.siteId = siteId;
        this.name = name;
        this.parentId = parentId;
        this.description = description;
        this.userId = userId;
        this.ownsAllCategory = ownsAllCategory;
        this.ownsAllPage = ownsAllPage;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "site_id", nullable = false)
    public int getSiteId() {
        return this.siteId;
    }

    public void setSiteId(int siteId) {
        this.siteId = siteId;
    }

    @Column(name = "name", nullable = false, length = 50)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "parent_id")
    public Integer getParentId() {
        return this.parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    @Column(name = "description", length = 300)
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name = "user_id")
    public Long getUserId() {
        return this.userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Column(name = "owns_all_category", nullable = false)
    public boolean isOwnsAllCategory() {
        return this.ownsAllCategory;
    }

    public void setOwnsAllCategory(boolean ownsAllCategory) {
        this.ownsAllCategory = ownsAllCategory;
    }

    @Column(name = "owns_all_page", nullable = false)
    public boolean isOwnsAllPage() {
        return this.ownsAllPage;
    }

    public void setOwnsAllPage(boolean ownsAllPage) {
        this.ownsAllPage = ownsAllPage;
    }

}
