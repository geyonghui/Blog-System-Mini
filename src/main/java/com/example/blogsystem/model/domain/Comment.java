package com.example.blogsystem.model.domain;

import java.util.Date;

/**
 * 博客评论实体类
 * 1、使用定制的RedisConfig配置类，实现缓存时的JSON序列化机制
 */
public class Comment {
    private Integer id;         // 评论id
    private Integer articleId; // 评论的文章id
    private String content;    // 评论内容
    private Date created;      // 评论日期
    private String author;     // 评论作者名
    private String ip;          // 评论用户登录ip
    private String status;     // 评论状态，默认审核通过approved

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", articleId=" + articleId +
                ", content='" + content + '\'' +
                ", created=" + created +
                ", author='" + author + '\'' +
                ", ip='" + ip + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
