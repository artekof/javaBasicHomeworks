package ru.otus.java.basic.homeworks.homework5.animals;

public class Cat extends Animal{
    public Cat(String name, int speedRun){
        this.name = name;
        this.speedRun = speedRun;
    }

    @Override
    public int swim(int distance){
        System.out.println("Кот не умеет плавать!");
        return distance;
    }

}
