package com.publiccms.entities.sys;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;

// Generated 2016-5-16 18:15:59 by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.sanluan.common.source.entity.MyColumn;

/**
 * SysConfig generated by hbm2java
 */
@Entity
@Table(name = "sys_config_data")
public class SysConfigData implements java.io.Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    @MyColumn(title = "ID")
    private SysConfigDataId id;
    @MyColumn(title = "值")
    private String data;

    public SysConfigData() {
    }

    public SysConfigData(SysConfigDataId id, String data) {
        this.id = id;
        this.data = data;
    }

    @EmbeddedId
    @AttributeOverrides({ @AttributeOverride(name = "siteId", column = @Column(name = "site_id", nullable = false)),
            @AttributeOverride(name = "code", column = @Column(name = "code", nullable = false, length = 50)),
            @AttributeOverride(name = "subcode", column = @Column(name = "subcode", nullable = false, length = 50)) })
    public SysConfigDataId getId() {
        return this.id;
    }

    public void setId(SysConfigDataId id) {
        this.id = id;
    }

    @Column(name = "data", nullable = false)
    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }

}
