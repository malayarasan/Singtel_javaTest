package com.test.resolve.impl;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Malayarasan, Malaisamy
 */
public class ClownFishTest {

    @Test
    public void testClownFishModel() {
        Fish shark = new ClownFish("small", "orange", "make jokes");
        assertThat(shark).isNotNull();
        assertThat(shark.sing()).isEqualTo("I can't sing");
        assertThat(shark.swim()).isEqualTo("I can swim");
        assertThat(shark.walk()).isEqualTo("I can't walk");
        assertThat(shark.getSize()).isEqualTo("small");
        assertThat(shark.getColor()).isEqualTo("orange");
        assertThat(shark.getBehaviour()).isEqualTo("make jokes");
    }
}