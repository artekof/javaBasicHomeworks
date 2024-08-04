package ru.otus.java.basic.homeworks.homework5;

import ru.otus.java.basic.homeworks.homework5.animals.Cat;
import ru.otus.java.basic.homeworks.homework5.animals.Dog;
import ru.otus.java.basic.homeworks.homework5.animals.Horse;

public class MainApp {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 1);
        Dog dog = new Dog("Sharik", 2, 1);
        Horse horse = new Horse("Demon", 3, 2);
        cat.run(50);
        cat.run(20);
        cat.swim(10);
        cat.info();
        dog.swim(10);
        dog.run(10);
        dog.info();
        horse.swim(20);
        horse.run(100);
        horse.info();
    }
}
