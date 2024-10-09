package ru.otus.java.basic.homeworks.homework15.fruits;

public class Orange extends Fruit{
    public Orange() {
        this.weight = 0.2f;
    }

    @Override
    public String toString() {
        return "Orange, " +
                "weight=" + weight;
    }
}
