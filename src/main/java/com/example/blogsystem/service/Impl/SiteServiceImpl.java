package com.example.blogsystem.service.Impl;

import com.example.blogsystem.dao.ArticleMapper;
import com.example.blogsystem.dao.CommentMapper;
import com.example.blogsystem.dao.StatisticMapper;
import com.example.blogsystem.model.ResponseData.StaticticsBo;
import com.example.blogsystem.model.domain.Article;
import com.example.blogsystem.model.domain.Comment;
import com.example.blogsystem.model.domain.Statistic;
import com.example.blogsystem.service.ISiteService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Classname SiteServiceImpl
 * @Description TODO
 * @Date 2019-3-14 10:15
 * @Created by CrazyStone
 */
@Service
@Transactional
public class SiteServiceImpl implements ISiteService {
    @Autowired
    private CommentMapper commentMapper;
    @Autowired
    private ArticleMapper articleMapper;
    @Autowired
    private StatisticMapper statisticMapper;

    @Override
    public void updateStatistics(Article article) {
        Statistic statistic = statisticMapper.selectStatisticWithArticleId(article.getId());
        statistic.setHits(statistic.getHits()+1);
        statisticMapper.updateArticleHitsWithId(statistic);
    }

    @Override
    public List<Comment> recentComments(int limit) {
        PageHelper.startPage(1, limit>10 || limit<1 ? 10:limit);
        List<Comment> byPage = commentMapper.selectNewComment();
        return byPage;
    }

    @Override
    public List<Article> recentArticles(int limit) {
        PageHelper.startPage(1, limit>10 || limit<1 ? 10:limit);
        List<Article> list = articleMapper.selectArticleWithPage();
        // 封装文章统计数据
        for (int i = 0; i < list.size(); i++) {
            Article article = list.get(i);
            Statistic statistic = statisticMapper.selectStatisticWithArticleId(article.getId());
            article.setHits(statistic.getHits());
            article.setCommentsNum(statistic.getCommentsNum());
        }
        return list;
    }

    @Override
    public StaticticsBo getStatistics() {
        StaticticsBo staticticsBo = new StaticticsBo();
        Integer articles = articleMapper.countArticle();
        Integer comments = commentMapper.countComment();
        staticticsBo.setArticles(articles);
        staticticsBo.setComments(comments);
        return staticticsBo;
    }
}

