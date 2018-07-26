package com.test.resolve.impl;

import com.test.resolve.IFly;
import com.test.resolve.ISing;
import com.test.resolve.ISwim;
import com.test.resolve.IWalk;

/**
 * @author Malayarasan, Malaisamy
 */
public abstract  class Animal implements ISing, ISwim, IWalk, IFly {


    @Override
    public String fly() {
        return "fly";
    }
    @Override
    public String sing(){
        return "sing";
    }
    @Override
    public String swim(){
        return "swim";
    }
    @Override
    public String walk(){
        return "walk";
    }
}
