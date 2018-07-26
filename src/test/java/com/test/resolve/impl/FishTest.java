package com.test.resolve.impl;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Malayarasan, Malaisamy
 */
public class FishTest {

    @Test
    public void testFishModel() {
        Animal fish = new Fish("small", "black", "happy");
        assertThat(fish).isNotNull();
        assertThat(fish.sing()).isEqualTo("I can't sing");
        assertThat(fish.swim()).isEqualTo("I can swim");
        assertThat(fish.walk()).isEqualTo("I can't walk");
    }
}