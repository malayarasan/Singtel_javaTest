package com.test.resolve;

import com.test.resolve.impl.*;

import java.util.stream.Stream;

/**
 * @author Malayarasan, Malaisamy
 */
public class Solution {

    public static void main(String[] args) {
        Bird bird = new Bird();
        System.out.println(bird.walk());
        System.out.println(bird.sing());
        Solution solution = new Solution();
        System.out.println("Count of animal can fly :" + solution.countOfAnimalsCanFly());
        System.out.println("Count of animal can walk :" + solution.countOfAnimalsCanWalk());
        System.out.println("Count of animal can sing :" + solution.countOfAnimalsCanSing());
        System.out.println("Count of animal can swim :" + solution.countOfAnimalsCanSwim());

    }

    public Animal[] getAllAnimals() {
        return new Animal[]{new Bird(),
                new Duck(),
                new Chicken(),
                new Rooster(),
                new Parrot(),
                new Fish(),
                new Shark(),
                new ClownFish(),
                new Dolphin(),
                new Dog(),
                new ButterFly(),
                new Caterpillar(),
                new Cat()
        };
    }

    public long countOfAnimalsCanFly() {
        return Stream.of(getAllAnimals())
                .map(Animal::fly)
                .filter(fly -> fly.equalsIgnoreCase("I can fly"))
                .count();
    }

    public long countOfAnimalsCanWalk() {
        return Stream.of(getAllAnimals())
                .map(Animal::walk)
                .filter(walk -> walk.equalsIgnoreCase("I can walk"))
                .count();
    }

    public long countOfAnimalsCanSing() {
        return Stream.of(getAllAnimals())
                .map(Animal::sing)
                .filter(sing -> !sing.equalsIgnoreCase("sing"))
                .count();
    }

    public long countOfAnimalsCanSwim() {
        return Stream.of(getAllAnimals())
                .map(Animal::swim)
                .filter(swim -> swim.equalsIgnoreCase("I can swim"))
                .count();
    }
}
