package com.ziroby.jodd.engine.domain;

import jodd.db.oom.meta.DbColumn;

/*
create table ARTICLE (
    ID int not null primary key AUTO_INCREMENT,
    TITLE varchar(180),
    SUMMARY longvarchar,
    TEXT longvarchar
);
 */
public class Article extends Entity {

    @DbColumn
    private String title;

    @DbColumn
    private String text;

    @DbColumn
    private String summary;

    /* Autogen methods below */

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }
}
