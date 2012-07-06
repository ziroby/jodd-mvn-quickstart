package com.github.austincodedojo.jodd;

import jodd.madvoc.meta.MadvocAction;
import jodd.madvoc.meta.Action;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@MadvocAction
public class IndexAction {
    Logger log = LoggerFactory.getLogger(IndexAction.class);

    @Action
    public void view() {
    }
}
