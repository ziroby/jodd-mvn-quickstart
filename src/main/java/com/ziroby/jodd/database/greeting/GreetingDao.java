package com.ziroby.jodd.database.greeting;

import com.ziroby.jodd.engine.domain.Greeting;

import java.util.Collection;

/**
 * Created with IntelliJ IDEA.
 * User: ziroby
 * Date: 7/6/12
 * Time: 8:26 AM
 * To change this template use File | Settings | File Templates.
 */
public interface GreetingDao {
    Greeting newGreeting();

    void save(Greeting greeting);

    Collection<Greeting> findAllGreetings();
}
