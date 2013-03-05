package com.ziroby.jodd.ui.greeting;

import com.ziroby.jodd.engine.Greeter;
import com.ziroby.jodd.engine.domain.Greeting;
import com.ziroby.jodd.database.greeting.GreetingDao;
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

    @PetiteInject
    private GreetingDao greetingDao;

    @Action
    public void view() {
        log.debug("In view() method");

        phrase = greeter.greet(name);

        Greeting greeting = greetingDao.newGreeting();
        greeting.setName(name);
        greeting.setPhrase(phrase);

        greetingDao.save(greeting);
    }
}
