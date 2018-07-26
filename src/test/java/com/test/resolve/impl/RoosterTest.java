package com.test.resolve.impl;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Malayarasan, Malaisamy
 */
public class RoosterTest {

    @Test
    public void roosterShouldSingsCock() {
        Rooster rooster = new Rooster(new Chicken());
        assertThat(rooster).isNotNull();
        assertThat(rooster.sing()).isEqualTo("Cock-a-doodle-doo");
    }

}