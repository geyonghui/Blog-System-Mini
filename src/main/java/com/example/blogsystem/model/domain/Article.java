package com.example.blogsystem.model.domain;

import java.util.Date;

/**
 * 博客文章实体类
 * 1、使用定制的RedisConfig配置类，实现缓存时的JSON序列化机制
 */
public class Article {
    private Integer id;          // 文章id
    private String title;       // 文章标题
    private String content;     // 文章内容
    private Date created;       // 文章创建时间
    private Date modified;      // 文章创建时间
    private String categories; // 文章分类
    private String tags;        // 文章标签
    private Boolean allowComment; // 是否允许评论，默认为true
    private String thumbnail;     // 文章缩略图

    private Integer hits;       // 点击量
    private Integer commentsNum;  // 评论总量


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public Integer getHits() {
        return hits;
    }

    public void setHits(Integer hits) {
        this.hits = hits;
    }

    public Boolean getAllowComment() {
        return allowComment;
    }

    public void setAllowComment(Boolean allowComment) {
        this.allowComment = allowComment;
    }

    public Integer getCommentsNum() {
        return commentsNum;
    }

    public void setCommentsNum(Integer commentsNum) {
        this.commentsNum = commentsNum;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", created=" + created +
                ", modified=" + modified +
                ", categories='" + categories + '\'' +
                ", tags='" + tags + '\'' +
                ", hits=" + hits +
                ", allowComment=" + allowComment +
                ", commentsNum=" + commentsNum +
                ", thumbnail='" + thumbnail + '\'' +
                '}';
    }
}