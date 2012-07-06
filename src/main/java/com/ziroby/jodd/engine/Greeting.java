package com.ziroby.jodd.engine;

import jodd.db.oom.meta.DbColumn;
import jodd.db.oom.meta.DbTable;

@DbTable
public class Greeting {
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
