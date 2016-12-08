package com.publiccms.entities.cms;

// Generated 2016-1-19 11:28:06 by Hibernate Tools 4.3.1

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.hibernate.search.annotations.Analyze;
import org.hibernate.search.annotations.Analyzer;
import org.hibernate.search.annotations.ClassBridge;
import org.hibernate.search.annotations.DateBridge;
import org.hibernate.search.annotations.Facet;
import org.hibernate.search.annotations.FacetEncodingType;
import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.FieldBridge;
import org.hibernate.search.annotations.FullTextFilterDef;
import org.hibernate.search.annotations.FullTextFilterDefs;
import org.hibernate.search.annotations.Indexed;
import org.hibernate.search.annotations.Resolution;
import org.hibernate.search.bridge.builtin.IntegerBridge;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.publiccms.common.index.CmsContentBridge;
import com.publiccms.common.index.CmsContentInterceptor;
import com.publiccms.common.index.PublishDateFilterFactory;
import com.publiccms.common.index.SiteIdFilterFactory;
import com.publiccms.common.spi.Static;
import com.sanluan.common.source.entity.MyColumn;

/**
 * CmsContent generated by hbm2java
 */
@Entity
@Table(name = "cms_content")
@Analyzer(impl = StandardAnalyzer.class)
@ClassBridge(impl = CmsContentBridge.class)
@FullTextFilterDefs({ @FullTextFilterDef(name = "publishDate", impl = PublishDateFilterFactory.class),
        @FullTextFilterDef(name = "siteId", impl = SiteIdFilterFactory.class) })
@Indexed(interceptor = CmsContentInterceptor.class)
public class CmsContent implements java.io.Serializable, Static {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    @MyColumn(title = "ID")
    private Long id;
    @MyColumn(title = "站点", condition = true)
    @Field(analyze = Analyze.NO)
    @JsonIgnore
    private int siteId;
    @MyColumn(title = "标题", condition = true, like = true, or = true)
    @Field
    private String title;
    @MyColumn(title = "发布用户", condition = true)
    private long userId;
    @MyColumn(title = "审核用户", condition = true)
    private Long checkUserId;
    @MyColumn(title = "分类", condition = true)
    @Field(analyze = Analyze.NO)
    @FieldBridge(impl = IntegerBridge.class)
    @Facet(encoding = FacetEncodingType.STRING)
    private int categoryId;
    @MyColumn(title = "模型", condition = true)
    @Field(analyze = Analyze.NO)
    @Facet(encoding = FacetEncodingType.STRING)
    private int modelId;
    @MyColumn(title = "父内容", condition = true)
    private Long parentId;
    @MyColumn(title = "是否转载")
    private boolean copied;
    @MyColumn(title = "作者")
    @Field(analyze = Analyze.NO)
    private String author;
    @MyColumn(title = "编辑")
    @Field
    private String editor;
    @Field(analyze = Analyze.NO)
    @MyColumn(title = "外链")
    private boolean onlyUrl;
    @MyColumn(title = "有图片列表", condition = true)
    private boolean hasImages;
    @MyColumn(title = "有附件列表", condition = true)
    private boolean hasFiles;
    @MyColumn(title = "有静态化")
    private boolean hasStatic;
    @MyColumn(title = "地址")
    private String url;
    @MyColumn(title = "描述")
    @Field
    private String description;
    @MyColumn(title = "标签")
    @Field
    private String tagIds;
    @MyColumn(title = "封面")
    private String cover;
    @MyColumn(title = "子内容数")
    private int childs;
    @MyColumn(title = "分数", order = true)
    private int scores;
    @MyColumn(title = "评论数", order = true)
    private int comments;
    @MyColumn(title = "点击数", order = true)
    private int clicks;
    @MyColumn(title = "发布日期", condition = true, order = true)
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Field(analyze = Analyze.NO)
    @DateBridge(resolution = Resolution.MILLISECOND)
    private Date publishDate;
    @MyColumn(title = "创建日期")
    private Date createDate;
    @MyColumn(title = "状态", condition = true)
    private int status;
    @MyColumn(title = "已删除", condition = true)
    private boolean disabled;

    public CmsContent() {
    }

    public CmsContent(int siteId, String title, long userId, int categoryId, int modelId, boolean copied, boolean onlyUrl,
            boolean hasImages, boolean hasFiles, boolean hasStatic, int childs, int scores, int comments, int clicks,
            Date publishDate, Date createDate, int status, boolean disabled) {
        this.siteId = siteId;
        this.title = title;
        this.userId = userId;
        this.categoryId = categoryId;
        this.modelId = modelId;
        this.copied = copied;
        this.onlyUrl = onlyUrl;
        this.hasImages = hasImages;
        this.hasFiles = hasFiles;
        this.hasStatic = hasStatic;
        this.childs = childs;
        this.scores = scores;
        this.comments = comments;
        this.clicks = clicks;
        this.publishDate = publishDate;
        this.createDate = createDate;
        this.status = status;
        this.disabled = disabled;
    }

    public CmsContent(int siteId, String title, long userId, Long checkUserId, int categoryId, int modelId, Long parentId,
            boolean copied, String author, String editor, boolean onlyUrl, boolean hasImages, boolean hasFiles,
            boolean hasStatic, String url, String description, String tagIds, String cover, int childs, int scores, int comments,
            int clicks, Date publishDate, Date createDate, int status, boolean disabled) {
        this.siteId = siteId;
        this.title = title;
        this.userId = userId;
        this.checkUserId = checkUserId;
        this.categoryId = categoryId;
        this.modelId = modelId;
        this.parentId = parentId;
        this.copied = copied;
        this.author = author;
        this.editor = editor;
        this.onlyUrl = onlyUrl;
        this.hasImages = hasImages;
        this.hasFiles = hasFiles;
        this.hasStatic = hasStatic;
        this.url = url;
        this.description = description;
        this.tagIds = tagIds;
        this.cover = cover;
        this.childs = childs;
        this.scores = scores;
        this.comments = comments;
        this.clicks = clicks;
        this.publishDate = publishDate;
        this.createDate = createDate;
        this.status = status;
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

    @Column(name = "check_user_id")
    public Long getCheckUserId() {
        return this.checkUserId;
    }

    public void setCheckUserId(Long checkUserId) {
        this.checkUserId = checkUserId;
    }

    @Column(name = "category_id", nullable = false)
    public int getCategoryId() {
        return this.categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    @Column(name = "model_id", nullable = false)
    public int getModelId() {
        return this.modelId;
    }

    public void setModelId(int modelId) {
        this.modelId = modelId;
    }

    @Column(name = "parent_id")
    public Long getParentId() {
        return this.parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    @Column(name = "copied", nullable = false)
    public boolean isCopied() {
        return this.copied;
    }

    public void setCopied(boolean copied) {
        this.copied = copied;
    }

    @Column(name = "author", length = 50)
    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Column(name = "editor", length = 50)
    public String getEditor() {
        return this.editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    @Column(name = "only_url", nullable = false)
    public boolean isOnlyUrl() {
        return this.onlyUrl;
    }

    public void setOnlyUrl(boolean onlyUrl) {
        this.onlyUrl = onlyUrl;
    }

    @Column(name = "has_images", nullable = false)
    public boolean isHasImages() {
        return this.hasImages;
    }

    public void setHasImages(boolean hasImages) {
        this.hasImages = hasImages;
    }

    @Column(name = "has_files", nullable = false)
    public boolean isHasFiles() {
        return this.hasFiles;
    }

    public void setHasFiles(boolean hasFiles) {
        this.hasFiles = hasFiles;
    }

    @Column(name = "has_static", nullable = false)
    public boolean isHasStatic() {
        return this.hasStatic;
    }

    public void setHasStatic(boolean hasStatic) {
        this.hasStatic = hasStatic;
    }

    @Column(name = "url", length = 2048)
    public String getUrl() {
        return this.url;
    }

    @Override
    public void setUrl(String url) {
        this.url = url;
    }

    @Column(name = "description", length = 300)
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name = "tag_ids", length = 65535)
    public String getTagIds() {
        return this.tagIds;
    }

    public void setTagIds(String tagIds) {
        this.tagIds = tagIds;
    }

    @Column(name = "cover")
    public String getCover() {
        return this.cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    @Column(name = "childs", nullable = false)
    public int getChilds() {
        return this.childs;
    }

    public void setChilds(int childs) {
        this.childs = childs;
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
    @Column(name = "publish_date", nullable = false, length = 19)
    public Date getPublishDate() {
        return this.publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "create_date", nullable = false, length = 19)
    public Date getCreateDate() {
        return this.createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Column(name = "status", nullable = false)
    public int getStatus() {
        return this.status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Column(name = "disabled", nullable = false)
    public boolean isDisabled() {
        return this.disabled;
    }

    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
    }

}
