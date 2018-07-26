package com.test.resolve.impl;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Malayarasan, Malaisamy
 */
public class ParrotTest {

    @Test
    public void parrotShouldSingsWoof() {
        Parrot parrot = new Parrot(new Dog());
        assertThat(parrot).isNotNull();
        assertThat(parrot.sing()).isEqualTo("Woof, woof");
    }

    @Test
    public void parrotShouldSingsMeow() {
        Parrot parrot = new Parrot(new Cat());
        assertThat(parrot).isNotNull();
        assertThat(parrot.sing()).isEqualTo("Meow");
    }

    @Test
    public void parrotShouldSingsCock() {
        Parrot parrot = new Parrot(new Rooster(new Chicken()));
        assertThat(parrot).isNotNull();
        assertThat(parrot.sing()).isEqualTo("Cock-a-doodle-doo");
    }

}