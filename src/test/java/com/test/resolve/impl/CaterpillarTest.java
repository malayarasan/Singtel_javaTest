package com.test.resolve.impl;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Malayarasan, Malaisamy
 */
public class CaterpillarTest {

    @Test
    public void testBCaterpillarModel() {
        Animal caterpillar = new Caterpillar();
        assertThat(caterpillar).isNotNull();
        assertThat(caterpillar.walk()).isEqualTo("I can walk");
    }
}