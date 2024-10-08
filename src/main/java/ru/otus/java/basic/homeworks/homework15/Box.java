package ru.otus.java.basic.homeworks.homework15;

import ru.otus.java.basic.homeworks.homework15.fruits.Fruit;

import java.util.ArrayList;
import java.util.List;

public class Box <O extends Fruit>{
    private List<O> box;

    public Box() {
        this.box = new ArrayList<>();
    }

    public void add(O fruit){
        box.add(fruit);
        System.out.println("В коробку добавлен " + fruit.toString());
    }

    public float weight(){
        float weightBox = 0.0f;
        for (O fruit : box){
            weightBox += fruit.getWeight();
        }

        return weightBox;
    }

    public boolean compare(Box<?> otherBox){
        if(this.weight() == otherBox.weight()){
            System.out.println("Коробки равны по массе");
            return true;
        }
        System.out.println("Коробки разные по массе");
        return false;
    }

    public void moveFruitsToMixBox(Box<? super O> otherBox){
        otherBox.box.addAll(this.box);
        this.box.clear();
        System.out.println("Содержимое коробки перемещено в коробку со смешанными фруктами");
        System.out.println("Вес пересыпаемой коробки равен " + this.weight());
        System.out.println("Вес коробки со смешанными фруктами равен " + otherBox.weight());

    }
}
