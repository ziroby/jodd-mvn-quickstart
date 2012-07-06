package com.ziroby.jodd.ui;

import com.ziroby.jodd.engine.Greeter;
import jodd.madvoc.meta.Action;
import jodd.madvoc.meta.In;
import jodd.madvoc.meta.MadvocAction;
import jodd.madvoc.meta.Out;
import jodd.petite.meta.PetiteInject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@MadvocAction
public class GreetAction {
    Logger log = LoggerFactory.getLogger(GreetAction.class);

    @In
    private String name;

    @Out
    private String phrase;

    @PetiteInject
    private Greeter greeter;

    @Action
    public void view() {
        log.debug("In view() method");

        phrase = greeter.greet(name);
    }
}
