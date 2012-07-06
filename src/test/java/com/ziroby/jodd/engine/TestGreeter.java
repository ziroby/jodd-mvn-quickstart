package com.ziroby.jodd.engine;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: ziroby
 * Date: 7/6/12
 * Time: 7:07 AM
 * To change this template use File | Settings | File Templates.
 */
public class TestGreeter {
    @Test
    public void testSimple() {
        assertThat(2 + 2, is(4));
    }

    @Test
    public void testGreeterBasics() {
        Greeter greeter = new Greeter();

        String greeting = greeter.greet("World");

        assertThat(greeting, is(notNullValue()));
        assertThat(greeting, is("Hello World!"));
    }

    @Test
    public void testGreeterWithObject() {
        Greeter greeter = new Greeter();

        String greeting = greeter.greet("People");

        assertThat(greeting, is("Hello People!"));
    }
    }
