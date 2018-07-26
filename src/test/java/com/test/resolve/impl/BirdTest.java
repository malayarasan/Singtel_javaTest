package com.test.resolve.impl;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Malayarasan, Malaisamy
 */
public class BirdTest {

    @Test
    public void checkIfBirdCanSing() {
        Bird bird = new Bird();
        String result = bird.sing();
        assertThat(result).isNotNull();
        assertThat(result).isEqualTo("I am singing");
    }

}