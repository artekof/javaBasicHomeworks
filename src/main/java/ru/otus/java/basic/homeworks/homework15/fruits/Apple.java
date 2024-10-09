package ru.otus.java.basic.homeworks.homework15.fruits;


public class Apple extends Fruit {
    public Apple() {
        this.weight = 0.1f;
    }

    @Override
    public String toString() {
        return "Apple, " +
                "weight=" + weight;
    }
}
