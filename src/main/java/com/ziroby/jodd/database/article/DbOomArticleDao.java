package com.ziroby.jodd.database.article;

import com.ziroby.jodd.engine.domain.Article;
import jodd.db.DbQuery;
import jodd.db.oom.DbOomQuery;
import jodd.db.oom.sqlgen.DbEntitySql;
import jodd.db.oom.sqlgen.DbSqlBuilder;
import jodd.petite.meta.PetiteBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@PetiteBean("articleDao")
public class DbOomArticleDao implements ArticleDao {
    Logger log = LoggerFactory.getLogger(DbOomArticleDao.class);

    @Override
    public Article newArticle() {
        Article article = new Article();

        article.setId(0L);

        DbQuery dbQuery = DbOomQuery.query(DbEntitySql.insert(article));
        dbQuery.setGeneratedKey();
        dbQuery.executeUpdate();

        long key = dbQuery.getGeneratedKey();
        article.setId(key);

        return article;
    }

    @Override
    public void save(Article article) {
        DbOomQuery.query(DbEntitySql.updateAll(article)).executeUpdateAndClose();
    }

    @Override
    public Collection<Article> findAllArticles() {
        log.debug("Finding all Articles");
        DbSqlBuilder sqlBuilder = DbEntitySql.from(Article.class);
        DbOomQuery query = DbOomQuery.query(sqlBuilder);
        List<Object> result = query.listAndClose(Article.class);
        if (result != null)
            log.debug("Type of result = " + result.getClass() + " value = " + result);

        List<Article> articles = new ArrayList<Article>();
        for (Object article : result ) {
            log.debug("result: " + article);
            articles.add((Article) article);
        }

        return articles;
    }
}
