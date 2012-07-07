package com.ziroby.jodd.database;

import com.ziroby.jodd.engine.domain.Greeting;

import java.util.ArrayList;
import java.util.Collection;

//@PetiteBean("greetingDao")
public class DummyGreetingDao implements GreetingDao {
    @Override
    public Greeting newGreeting() {
        return new Greeting();
    }

    @Override
    public void save(Greeting greeting) {
    }

    @Override
    public Collection<Greeting> findAllGreetings() {
        ArrayList<Greeting> greetings = new ArrayList<Greeting>();

        Greeting greeting1 = new Greeting();
        greeting1.setName("Ron");
        greeting1.setPhrase(greeting1.getName());
        greetings.add(greeting1);

        Greeting greeting2 = new Greeting();
        greeting2.setName("Ziroby");
        greeting2.setPhrase(greeting1.getName());
        greetings.add(greeting2);

        return greetings;
    }
}
