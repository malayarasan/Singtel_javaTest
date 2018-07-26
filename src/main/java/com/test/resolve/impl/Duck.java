package com.test.resolve.impl;

/**
 * @author Malayarasan, Malaisamy
 */
public class Duck extends Bird {

    @Override
    public String sing() {
        return "Quack, quack";
    }

    @Override
    public String swim() {
        return "I can swim";
    }
}
