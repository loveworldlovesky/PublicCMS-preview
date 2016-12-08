package com.publiccms.entities.home;
// Generated 2016-11-12 18:33:49 by Hibernate Tools 4.3.1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sanluan.common.source.entity.MyColumn;

/**
 * HomeGroupPost generated by hbm2java
 */
@Entity
@Table(name = "home_group_post")
public class HomeGroupPost implements java.io.Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    @MyColumn(title = "ID")
    private Long id;
    @MyColumn(title = "站点", condition = true)
    @JsonIgnore
    private int siteId;
    @MyColumn(title = "群组", condition = true)
    private Long groupId;
    @MyColumn(title = "标题")
    private String title;
    @MyColumn(title = "用户", condition = true)
    private long userId;
    @MyColumn(title = "分数", order = true)
    private int scores;
    @MyColumn(title = "评论数", order = true)
    private int comments;
    @MyColumn(title = "点击数", order = true)
    private int clicks;
    @MyColumn(title = "创建日期", order = true)
    private Date createDate;
    @MyColumn(title = "已禁用", condition = true)
    private boolean disabled;

    public HomeGroupPost() {
    }

    public HomeGroupPost(int siteId, String title, long userId, int scores, int comments, int clicks, Date createDate,
            boolean disabled) {
        this.siteId = siteId;
        this.title = title;
        this.userId = userId;
        this.scores = scores;
        this.comments = comments;
        this.clicks = clicks;
        this.createDate = createDate;
        this.disabled = disabled;
    }

    public HomeGroupPost(int siteId, Long groupId, String title, long userId, int scores,
            int comments, int clicks, Date createDate, boolean disabled) {
        this.siteId = siteId;
        this.groupId = groupId;
        this.title = title;
        this.userId = userId;
        this.scores = scores;
        this.comments = comments;
        this.clicks = clicks;
        this.createDate = createDate;
        this.disabled = disabled;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)

    @Column(name = "id", unique = true, nullable = false)
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "site_id", nullable = false)
    public int getSiteId() {
        return this.siteId;
    }

    public void setSiteId(int siteId) {
        this.siteId = siteId;
    }

    @Column(name = "group_id")
    public Long getGroupId() {
        return this.groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    @Column(name = "title", nullable = false)
    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name = "user_id", nullable = false)
    public long getUserId() {
        return this.userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    @Column(name = "scores", nullable = false)
    public int getScores() {
        return this.scores;
    }

    public void setScores(int scores) {
        this.scores = scores;
    }

    @Column(name = "comments", nullable = false)
    public int getComments() {
        return this.comments;
    }

    public void setComments(int comments) {
        this.comments = comments;
    }

    @Column(name = "clicks", nullable = false)
    public int getClicks() {
        return this.clicks;
    }

    public void setClicks(int clicks) {
        this.clicks = clicks;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "create_date", nullable = false, length = 19)
    public Date getCreateDate() {
        return this.createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Column(name = "disabled", nullable = false)
    public boolean isDisabled() {
        return this.disabled;
    }

    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
    }

}
