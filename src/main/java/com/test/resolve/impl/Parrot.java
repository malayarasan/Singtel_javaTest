package com.test.resolve.impl;

import com.test.resolve.ISing;

/**
 * @author Malayarasan, Malaisamy
 */
public class Parrot extends Animal {

    Animal animal;

    public Parrot(){

    }

    public Parrot(Animal animal){
        this.animal=animal;
    }

    /*@Override
    public String sing() {
        return "I can sing";
    }*/

    @Override
    public String fly() {
        return "I can fly";
    }
}
