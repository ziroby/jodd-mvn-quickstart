package com.ziroby.jodd.ui;

import com.ziroby.jodd.engine.Greeter;
import jodd.madvoc.meta.In;
import jodd.madvoc.meta.MadvocAction;
import jodd.madvoc.meta.Action;
import jodd.madvoc.meta.Out;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@MadvocAction
public class GreetAction {
    Logger log = LoggerFactory.getLogger(GreetAction.class);

    @In
    private String name;

    @Out
    private String greeting;

    @Action
    public void view() {
        log.debug("In view() method");

        Greeter greeter = new Greeter();

        greeting = greeter.greet(name);
    }
}
