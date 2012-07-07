package com.ziroby.jodd.ui;

import com.ziroby.jodd.engine.domain.Greeting;
import com.ziroby.jodd.database.GreetingDao;
import jodd.madvoc.meta.Action;
import jodd.madvoc.meta.MadvocAction;
import jodd.madvoc.meta.Out;
import jodd.petite.meta.PetiteInject;

import java.util.Collection;

@MadvocAction
public class AllGreetingsAction {

    @Out
    private Collection<Greeting> allGreetings;

    @PetiteInject
    private GreetingDao greetingDao;

    @Action
    public void view() {
        allGreetings = greetingDao.findAllGreetings();
    }
}
