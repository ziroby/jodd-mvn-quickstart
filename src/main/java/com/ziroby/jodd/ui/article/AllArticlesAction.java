package com.ziroby.jodd.ui.article;

import com.ziroby.jodd.database.article.ArticleDao;
import com.ziroby.jodd.engine.domain.Article;
import jodd.madvoc.meta.Action;
import jodd.madvoc.meta.MadvocAction;
import jodd.madvoc.meta.Out;
import jodd.petite.meta.PetiteInject;

import java.util.Collection;

@MadvocAction
public class AllArticlesAction {

    @Out
    private Collection<Article> allArticles;

    @PetiteInject
    private ArticleDao articleDao;

    @Action
    public void view() {
        allArticles = articleDao.findAllArticles();
    }
}
