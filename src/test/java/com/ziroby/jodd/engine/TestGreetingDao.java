package com.ziroby.jodd.engine;

import com.ziroby.jodd.database.greeting.GreetingDao;
import com.ziroby.jodd.engine.domain.Greeting;
import org.junit.Test;

import java.util.Collection;

/**
 * Created with IntelliJ IDEA.
 * User: ziroby
 * Date: 7/6/12
 * Time: 8:26 AM
 * To change this template use File | Settings | File Templates.
 */
public class TestGreetingDao {
    private class TestDao implements GreetingDao {
        @Override
        public Greeting newGreeting() {
            return new Greeting();
        }

        @Override
        public void save(Greeting greeting) {
            //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public Collection<Greeting> findAllGreetings() {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }
    }

    private GreetingDao dao = new TestDao();

    @Test
    public void testGreetingCreation() {
        Greeting greeting = dao.newGreeting();

        greeting.setPhrase("Hello World!");
        greeting.setName("Ziroby");

        dao.save(greeting);
    }

    @Test
    public void testFindAll() {
        Collection<Greeting> greetings = dao.findAllGreetings();
    }

}
