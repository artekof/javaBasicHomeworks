package ru.otus.java.basic.homeworks.homework15;

import ru.otus.java.basic.homeworks.homework15.fruits.Apple;
import ru.otus.java.basic.homeworks.homework15.fruits.Fruit;
import ru.otus.java.basic.homeworks.homework15.fruits.Orange;

public class Application {
    public static void main(String[] args) {
        Box<Orange> box1 = new Box<>();
        Box<Apple> box2 = new Box<>();
        Box<Fruit> box3 = new Box<>();

        //При создании коробок вес равен 0
        box1.weight(); //коробка с апельсинами
        box2.weight(); //коробка с яблоками
        box3.weight(); //коробка с фруктами

        box1.add(new Orange());
        box1.add(new Orange());
        box1.add(new Orange());

        System.out.println("Вес коробки с апельсинами равен " + box1.weight());

        box2.add(new Apple());
        box2.add(new Apple());
        box2.add(new Apple());

        System.out.println("Вес коробки с яблоками равен " + box2.weight());

        box3.add(new Orange());
        box3.add(new Apple());
        box3.add(new Orange());

        System.out.println("Вес коробки со смешанными фруктами равен " + box3.weight());

        box1.compare(box1);
        box2.compare(box3);
        box1.compare(box3);

        box1.moveFruitsToMixBox(box3);
        box1.weight();
        box3.weight();
    }
}
