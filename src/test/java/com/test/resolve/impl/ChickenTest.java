package com.test.resolve.impl;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Malayarasan, Malaisamy
 */
public class ChickenTest {

    @Test
    public void chickenShouldSingsCluck() {
        Animal chicken = new Chicken();
        assertThat(chicken).isNotNull();
        assertThat(chicken.sing()).isEqualTo("Cluck, cluck");
    }

    @Test
    public void chickenShouldNtFly() {
        Bird chicken = new Chicken();
        assertThat(chicken).isNotNull();
        assertThat(chicken.fly()).isEqualTo("I can't fly");
    }
}