package com.test.resolve.impl;

/**
 * @author Malayarasan, Malaisamy
 */
public class Chicken extends Bird {

    @Override
    public String sing() {
        return "Cluck, cluck";
    }

    @Override
    public String fly(){
        return "I can't fly";
    }

    @Override
    public String walk(){
        return "I can walk";
    }
}
