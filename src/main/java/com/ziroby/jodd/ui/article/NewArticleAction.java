package com.ziroby.jodd.ui.article;

import com.ziroby.jodd.database.article.ArticleDao;
import com.ziroby.jodd.engine.domain.Article;
import jodd.madvoc.meta.Action;
import jodd.madvoc.meta.In;
import jodd.madvoc.meta.MadvocAction;
import jodd.petite.meta.PetiteInject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@MadvocAction
public class NewArticleAction {
    Logger log = LoggerFactory.getLogger(NewArticleAction.class);

    @In
    private String title;

    @In
    private String summary;

    @In
    private String text;

    @PetiteInject
    private ArticleDao articleDao;

    @Action
    public void view() {
        log.debug("In " + getClass().getCanonicalName() + ".view() method");

        Article article = articleDao.newArticle();

        article.setText(title);
        article.setSummary(summary);
        article.setText(text);

        articleDao.save(article);
    }
}
