package com.publiccms.entities.sys;

// Generated 2016-1-20 11:01:19 by Hibernate Tools 4.3.1

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sanluan.common.source.entity.MyColumn;

/**
 * SysSite generated by hbm2java
 */
@Entity
@Table(name = "sys_site")
public class SysSite implements java.io.Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    @MyColumn(title = "ID")
    private Integer id;
    @MyColumn(title = "名称", condition = true, like = true)
    private String name;
    @MyColumn(title = "站点地址")
    private String sitePath;
    @MyColumn(title = "动态站点地址")
    private String dynamicPath;
    @MyColumn(title = "资源站点地址")
    private String resourcePath;
    @MyColumn(title = "禁用", condition = true)
    private boolean disabled;

    public SysSite() {
    }

    public SysSite(String name, String sitePath, String dynamicPath, String resourcePath, boolean disabled) {
        this.name = name;
        this.sitePath = sitePath;
        this.dynamicPath = dynamicPath;
        this.resourcePath = resourcePath;
        this.disabled = disabled;
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

    @Column(name = "name", nullable = false, length = 50)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "site_path", nullable = false)
    public String getSitePath() {
        return this.sitePath;
    }

    public void setSitePath(String sitePath) {
        this.sitePath = sitePath;
    }

    @Column(name = "dynamic_path", nullable = false)
    public String getDynamicPath() {
        return this.dynamicPath;
    }

    public void setDynamicPath(String dynamicPath) {
        this.dynamicPath = dynamicPath;
    }

    @Column(name = "resource_path", nullable = false)
    public String getResourcePath() {
        return this.resourcePath;
    }

    public void setResourcePath(String resourcePath) {
        this.resourcePath = resourcePath;
    }

    @Column(name = "disabled", nullable = false)
    public boolean isDisabled() {
        return this.disabled;
    }

    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
    }

}