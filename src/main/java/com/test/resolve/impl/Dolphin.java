package com.test.resolve.impl;

import com.test.resolve.ISwim;

/**
 * @author Malayarasan, Malaisamy
 */
public class Dolphin extends Animal implements ISwim {

    @Override
    public String swim() {
        return "I can swim";
    }
}
