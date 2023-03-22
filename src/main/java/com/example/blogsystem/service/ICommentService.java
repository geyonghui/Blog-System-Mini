package com.example.blogsystem.service;

import com.example.blogsystem.model.domain.Comment;
import com.github.pagehelper.PageInfo;

public interface ICommentService {
    // 获取文章下的评论
    public PageInfo<Comment> getComments(Integer aid, int page, int count);

    // 用户发表评论
    public void pushComment(Comment comment);

}

