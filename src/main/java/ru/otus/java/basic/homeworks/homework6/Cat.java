package ru.otus.java.basic.homeworks.homework6;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void info(){
        System.out.println("Аппетит у кота по имени " + name + " - " + appetite + ", сытость - " + satiety);
    }

    public boolean eat(Plate plate){
        if (!satiety && plate.reduceFoodAmount(appetite)){
            satiety = true;
            System.out.println(name + " удалось покушать, он сытый");
        }
        else {
            System.out.println(name + " не удалось покушать, так как еды не хватило!");
        }

        return false;
    }

}
