package com.test.resolve.impl;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Malayarasan, Malaisamy
 */
public class DuckTest {

    @Test
    public void duckShouldSingsQuack() {
        Animal duck = new Duck();
        assertThat(duck).isNotNull();
        assertThat(duck.sing()).isEqualTo("Quack, quack");
    }

    @Test
    public void duckShouldSwim() {
        Animal duck = new Duck();
        assertThat(duck).isNotNull();
        assertThat(duck.swim()).isEqualTo("I can swim");
    }

}