package com.test.resolve.impl;

/**
 * @author Malayarasan, Malaisamy
 */
public class Fish extends Animal {

    private String size;

    private String color;

    private String behaviour;

    public Fish() {

    }


    public Fish(String size, String color, String behaviour) {
        this.size = size;
        this.color = color;
        this.behaviour = behaviour;
    }

    @Override
    public String swim() {
        return "I can swim";
    }

    @Override
    public String sing(){
        return "I can't sing";
    }

    @Override
    public String walk(){
        return "I can't walk";
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public String getBehaviour() {
        return behaviour;
    }
}
