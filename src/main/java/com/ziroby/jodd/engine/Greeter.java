package com.ziroby.jodd.engine;

import jodd.petite.meta.PetiteBean;

@PetiteBean
public class Greeter {
    public String greet(String object) {
        return "Hello " + object + "!";
    }
}
