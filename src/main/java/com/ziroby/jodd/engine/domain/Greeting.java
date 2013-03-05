package com.ziroby.jodd.engine.domain;

import jodd.db.oom.meta.DbColumn;
import jodd.db.oom.meta.DbTable;

/*
create table jodd_test.Greeting (
    ID int not null primary key AUTO_INCREMENT,
    NAME varchar(80) ,
    PHRASE varchar(80)
);
 */
@DbTable("Greeting")
public class Greeting extends Entity {

    @DbColumn
    private String name;

    @DbColumn
    private String phrase;

    /* Autogen methods below */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhrase() {
        return phrase;
    }

    public void setPhrase(String greeting) {
        this.phrase = greeting;
    }
}
