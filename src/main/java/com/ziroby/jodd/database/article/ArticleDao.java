package com.ziroby.jodd.database.article;

import com.ziroby.jodd.engine.domain.Article;

import java.util.Collection;

/**
 * Created with IntelliJ IDEA.
 * User: ziroby
 * Date: 7/6/12
 * Time: 8:26 AM
 * To change this template use File | Settings | File Templates.
 */
public interface ArticleDao {
    Article newArticle();

    void save(Article article);

    Collection<Article> findAllArticles();
}
