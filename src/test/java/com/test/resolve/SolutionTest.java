package com.test.resolve;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Malayarasan, Malaisamy
 */
public class SolutionTest {


    @Test
    public void validateCountOfAnimalCanFly() {
        Solution solution = new Solution();
        assertThat(solution.countOfAnimalsCanFly()).isEqualTo(2);
    }

    @Test
    public void validateCountOfAnimalCanSwim() {
        Solution solution = new Solution();
        assertThat(solution.countOfAnimalsCanSwim()).isEqualTo(5);
    }

    @Test
    public void validateCountOfAnimalCanSing() {
        Solution solution = new Solution();
        assertThat(solution.countOfAnimalsCanSing()).isEqualTo(6);
    }

    @Test
    public void validateCountOfAnimalCanWalk() {
        Solution solution = new Solution();
        assertThat(solution.countOfAnimalsCanWalk()).isEqualTo(4);
    }
}