package com.test.resolve.impl;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Malayarasan, Malaisamy
 */
public class ButterFlyTest {

    @Test
    public void testButterFlyModel() {
        Animal butterFly = new ButterFly();
        assertThat(butterFly).isNotNull();
        assertThat(((ButterFly) butterFly).fly()).isEqualTo("I can fly");
    }
}