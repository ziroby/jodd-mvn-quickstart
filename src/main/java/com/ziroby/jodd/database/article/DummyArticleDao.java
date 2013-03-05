package com.ziroby.jodd.database.article;

import com.ziroby.jodd.engine.domain.Article;

import java.util.ArrayList;
import java.util.Collection;

//@PetiteBean("articleDao")
public class DummyArticleDao implements ArticleDao {
    @Override
    public Article newArticle() {
        return new Article();
    }

    @Override
    public void save(Article article) {
    }

    @Override
    public Collection<Article> findAllArticles() {
        ArrayList<Article> articles = new ArrayList<Article>();

        Article article1 = new Article();
        article1.setTitle("Article One");
        article1.setSummary("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent tempor sapien ut leo semper volutpat. Phasellus sed lectus at nulla semper dignissim at sed nibh. Aliquam erat volutpat. Vestibulum tincidunt lobortis faucibus. Nullam facilisis sapien eget mi dictum gravida. Vestibulum posuere feugiat turpis et mattis. Morbi vestibulum ultrices metus, in hendrerit magna pulvinar in. Donec quis dui ut nisi ullamcorper egestas. Pellentesque sodales ullamcorper nisl, vel suscipit leo lacinia id. Phasellus in elit sed ipsum vehicula lacinia. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Ut fringilla varius pellentesque. Aliquam erat volutpat. Phasellus gravida quam vel mauris scelerisque auctor.");
        article1.setText(" Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent tempor sapien ut leo semper volutpat. Phasellus sed lectus at nulla semper dignissim at sed nibh. Aliquam erat volutpat. Vestibulum tincidunt lobortis faucibus. Nullam facilisis sapien eget mi dictum gravida. Vestibulum posuere feugiat turpis et mattis. Morbi vestibulum ultrices metus, in hendrerit magna pulvinar in. Donec quis dui ut nisi ullamcorper egestas. Pellentesque sodales ullamcorper nisl, vel suscipit leo lacinia id. Phasellus in elit sed ipsum vehicula lacinia. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Ut fringilla varius pellentesque. Aliquam erat volutpat. Phasellus gravida quam vel mauris scelerisque auctor.\n" +
                "\n" +
                "Nulla iaculis enim a nulla blandit lacinia. Vivamus eget metus dapibus arcu tincidunt consequat. Sed eget erat mi. Maecenas at purus nunc, sit amet condimentum dolor. Curabitur at enim vitae tellus euismod vestibulum a vitae urna. Fusce pellentesque nunc quis ante varius nec vulputate neque eleifend. In hac habitasse platea dictumst. Vestibulum porta tortor vitae quam porta eu cursus ligula interdum.\n" +
                "\n" +
                "Duis libero diam, ornare ut scelerisque in, ornare quis massa. Praesent suscipit velit id augue rutrum tincidunt a sed nunc. Etiam posuere mattis lorem, vitae bibendum est suscipit nec. Maecenas urna lectus, placerat ut hendrerit et, euismod vel ante. Quisque faucibus quam vitae neque tincidunt ut tristique sem iaculis. Pellentesque posuere consectetur arcu dignissim malesuada. Fusce sit amet nulla sed elit viverra aliquam ac eu nulla. ");
        articles.add(article1);

        article1.setTitle("Article Two");
        article1.setSummary("Two Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent tempor sapien ut leo semper volutpat. Phasellus sed lectus at nulla semper dignissim at sed nibh. Aliquam erat volutpat. Vestibulum tincidunt lobortis faucibus. Nullam facilisis sapien eget mi dictum gravida. Vestibulum posuere feugiat turpis et mattis. Morbi vestibulum ultrices metus, in hendrerit magna pulvinar in. Donec quis dui ut nisi ullamcorper egestas. Pellentesque sodales ullamcorper nisl, vel suscipit leo lacinia id. Phasellus in elit sed ipsum vehicula lacinia. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Ut fringilla varius pellentesque. Aliquam erat volutpat. Phasellus gravida quam vel mauris scelerisque auctor.");
        article1.setText(" Two Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent tempor sapien ut leo semper volutpat. Phasellus sed lectus at nulla semper dignissim at sed nibh. Aliquam erat volutpat. Vestibulum tincidunt lobortis faucibus. Nullam facilisis sapien eget mi dictum gravida. Vestibulum posuere feugiat turpis et mattis. Morbi vestibulum ultrices metus, in hendrerit magna pulvinar in. Donec quis dui ut nisi ullamcorper egestas. Pellentesque sodales ullamcorper nisl, vel suscipit leo lacinia id. Phasellus in elit sed ipsum vehicula lacinia. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Ut fringilla varius pellentesque. Aliquam erat volutpat. Phasellus gravida quam vel mauris scelerisque auctor.\n" +
                "\n" +
                "Two Nulla iaculis enim a nulla blandit lacinia. Vivamus eget metus dapibus arcu tincidunt consequat. Sed eget erat mi. Maecenas at purus nunc, sit amet condimentum dolor. Curabitur at enim vitae tellus euismod vestibulum a vitae urna. Fusce pellentesque nunc quis ante varius nec vulputate neque eleifend. In hac habitasse platea dictumst. Vestibulum porta tortor vitae quam porta eu cursus ligula interdum.\n" +
                "\n" +
                "Two Duis libero diam, ornare ut scelerisque in, ornare quis massa. Praesent suscipit velit id augue rutrum tincidunt a sed nunc. Etiam posuere mattis lorem, vitae bibendum est suscipit nec. Maecenas urna lectus, placerat ut hendrerit et, euismod vel ante. Quisque faucibus quam vitae neque tincidunt ut tristique sem iaculis. Pellentesque posuere consectetur arcu dignissim malesuada. Fusce sit amet nulla sed elit viverra aliquam ac eu nulla. ");
        articles.add(article1);

        return articles;
    }
}
