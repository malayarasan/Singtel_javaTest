package com.test.resolve.impl;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Malayarasan, Malaisamy
 */
public class SharkTest {

    @Test
    public void testSharkModel() {
        Fish shark = new Shark("large", "grey", "eat other fish");
        assertThat(shark).isNotNull();
        assertThat(shark.sing()).isEqualTo("I can't sing");
        assertThat(shark.swim()).isEqualTo("I can swim");
        assertThat(shark.walk()).isEqualTo("I can't walk");
        assertThat(shark.getSize()).isEqualTo("large");
        assertThat(shark.getColor()).isEqualTo("grey");
        assertThat(shark.getBehaviour()).isEqualTo("eat other fish");
    }

}