package ru.otus.java.basic.homeworks.homework6;

public class Application {
    public static void main(String[] args) {

        Plate plate1 = new Plate(1000);

        Cat[] cats = {
                new Cat("Barsik", 50),
                new Cat("Murzik", 300),
                new Cat("Persik", 100),
                new Cat("Pupsik", 70)
        };
        plate1.info();
        for (int i = 0; i < cats.length; i++) {
            cats[i].info();
            cats[i].eat(plate1);
            cats[i].info();
        }
        plate1.info();

    }
}
