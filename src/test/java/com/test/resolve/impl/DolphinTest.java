package com.test.resolve.impl;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Malayarasan, Malaisamy
 */
public class DolphinTest {

    @Test
    public void testClownFishModel() {
        Dolphin dolphin = new Dolphin();
        assertThat(dolphin).isNotNull();
        assertThat(dolphin.swim()).isEqualTo("I can swim");
    }
}