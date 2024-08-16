package ru.otus.java.basic.homeworks.homework7.transport;

import ru.otus.java.basic.homeworks.homework7.Human;
import ru.otus.java.basic.homeworks.homework7.Transport;
import ru.otus.java.basic.homeworks.homework7.TypeOfTerrain;

public class Horse implements Transport {
    private int energyConsumption = 2; //2 ед энергии на 100 м
    private int maxEnergy = 100;


    public Horse() {

    }

    @Override
    public String toString() {
        return "Horse";
    }

    @Override
    public boolean move(int distance, TypeOfTerrain terrain) {
        if (terrain == TypeOfTerrain.SWAMP) {
            System.out.println("Лошадь не может перемещаться по данной местности");
            return false;
        }
        System.out.println("Лошадь преодолела весь путь.");
        return true;
    }
}
