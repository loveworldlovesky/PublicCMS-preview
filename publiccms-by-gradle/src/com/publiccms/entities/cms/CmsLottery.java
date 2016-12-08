package com.publiccms.entities.cms;

// Generated 2016-3-1 16:21:35 by Hibernate Tools 4.3.1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.publiccms.common.spi.Static;
import com.sanluan.common.source.entity.MyColumn;

/**
 * CmsLottery generated by hbm2java
 */
@Entity
@Table(name = "cms_lottery")
public class CmsLottery implements java.io.Serializable , Static {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    @MyColumn(title = "ID")
    private Integer id;
    @MyColumn(title = "站点", condition = true)
    @JsonIgnore
    private int siteId;
    @MyColumn(title = "开始日期", condition = true, order = true)
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date startDate;
    @MyColumn(title = "结束日期", condition = true, order = true)
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date endDate;
    @MyColumn(title = "时间间隔")
    private int intervalHour;
    @MyColumn(title = "每天发放数量")
    private int gift;
    @MyColumn(title = "奖品总数")
    private int totalGift;
    @MyColumn(title = "剩余数量")
    private int lastGift;
    @MyColumn(title = "抽奖次数")
    private int lotteryCount;
    @MyColumn(title = "概率分子")
    private int fractions;
    @MyColumn(title = "概率分母")
    private int numerator;
    @MyColumn(title = "地址")
    private String url;
    @MyColumn(title = "标题")
    private String title;
    @MyColumn(title = "描述")
    private String description;
    @MyColumn(title = "已禁用", condition = true)
    private boolean disabled;
    @MyColumn(title = "扩展ID")
    private Integer extendId;

    public CmsLottery() {
    }

    public CmsLottery(int siteId, Date startDate, Date endDate, int intervalHour, int gift, int totalGift, int lastGift,
            int lotteryCount, int fractions, int numerator, String title, boolean disabled) {
        this.siteId = siteId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.intervalHour = intervalHour;
        this.gift = gift;
        this.totalGift = totalGift;
        this.lastGift = lastGift;
        this.lotteryCount = lotteryCount;
        this.fractions = fractions;
        this.numerator = numerator;
        this.title = title;
        this.disabled = disabled;
    }

    public CmsLottery(int siteId, Date startDate, Date endDate, int intervalHour, int gift, int totalGift, int lastGift,
            int lotteryCount, int fractions, int numerator, String url, String title, String description, boolean disabled,
            Integer extendId) {
        this.siteId = siteId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.intervalHour = intervalHour;
        this.gift = gift;
        this.totalGift = totalGift;
        this.lastGift = lastGift;
        this.lotteryCount = lotteryCount;
        this.fractions = fractions;
        this.numerator = numerator;
        this.url = url;
        this.title = title;
        this.description = description;
        this.disabled = disabled;
        this.extendId = extendId;
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

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "start_date", nullable = false, length = 19)
    public Date getStartDate() {
        return this.startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "end_date", nullable = false, length = 19)
    public Date getEndDate() {
        return this.endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Column(name = "interval_hour", nullable = false)
    public int getIntervalHour() {
        return this.intervalHour;
    }

    public void setIntervalHour(int intervalHour) {
        this.intervalHour = intervalHour;
    }

    @Column(name = "gift", nullable = false)
    public int getGift() {
        return this.gift;
    }

    public void setGift(int gift) {
        this.gift = gift;
    }

    @Column(name = "total_gift", nullable = false)
    public int getTotalGift() {
        return this.totalGift;
    }

    public void setTotalGift(int totalGift) {
        this.totalGift = totalGift;
    }

    @Column(name = "last_gift", nullable = false)
    public int getLastGift() {
        return this.lastGift;
    }

    public void setLastGift(int lastGift) {
        this.lastGift = lastGift;
    }

    @Column(name = "lottery_count", nullable = false)
    public int getLotteryCount() {
        return this.lotteryCount;
    }

    public void setLotteryCount(int lotteryCount) {
        this.lotteryCount = lotteryCount;
    }

    @Column(name = "fractions", nullable = false)
    public int getFractions() {
        return this.fractions;
    }

    public void setFractions(int fractions) {
        this.fractions = fractions;
    }

    @Column(name = "numerator", nullable = false)
    public int getNumerator() {
        return this.numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    @Column(name = "url", length = 2048)
    public String getUrl() {
        return this.url;
    }

    @Override
    public void setUrl(String url) {
        this.url = url;
    }

    @Column(name = "title", nullable = false, length = 100)
    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name = "description", length = 300)
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name = "disabled", nullable = false)
    public boolean isDisabled() {
        return this.disabled;
    }

    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
    }

    @Column(name = "extend_id")
    public Integer getExtendId() {
        return this.extendId;
    }

    public void setExtendId(Integer extendId) {
        this.extendId = extendId;
    }

}
