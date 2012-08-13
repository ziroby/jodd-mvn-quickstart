package com.ziroby.jodd.engine.domain;

import jodd.db.oom.meta.DbColumn;
import jodd.db.oom.meta.DbTable;

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
