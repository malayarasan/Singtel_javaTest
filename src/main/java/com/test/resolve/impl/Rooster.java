package com.test.resolve.impl;

/**
 * @author Malayarasan, Malaisamy
 */
public class Rooster extends Chicken {

    Chicken chicken;

    public Rooster() {

    }

    public Rooster(Chicken chicken) {
        this.chicken = chicken;
    }

    @Override
    public String sing() {
        return "Cock-a-doodle-doo";
    }
}
