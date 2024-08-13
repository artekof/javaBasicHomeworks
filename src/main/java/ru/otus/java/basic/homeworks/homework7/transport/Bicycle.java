package ru.otus.java.basic.homeworks.homework7.transport;

import ru.otus.java.basic.homeworks.homework7.Human;
import ru.otus.java.basic.homeworks.homework7.Transport;
import ru.otus.java.basic.homeworks.homework7.TypeOfTerrain;

public class Bicycle implements Transport {

    public Bicycle() {
    }

    @Override
    public String toString() {
        return "Bicycle";
    }

    @Override
    public boolean move(int distance, TypeOfTerrain terrain) {
        if (terrain == TypeOfTerrain.SWAMP) {
            System.out.println("Велосипед не может перемещаться по данной местности");
            return false;
        }
        System.out.println("Велосипед преодолел весь путь.");
        return true;
    }
}
