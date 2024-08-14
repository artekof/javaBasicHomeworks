package ru.otus.java.basic.homeworks.homework7.transport;

import ru.otus.java.basic.homeworks.homework7.Human;
import ru.otus.java.basic.homeworks.homework7.Transport;
import ru.otus.java.basic.homeworks.homework7.TypeOfTerrain;

public class Car implements Transport {
    private int gasolineConsumption = 1; // Расход 1 л на 100 м
    private int maxLevelGasoline = 50; //Объем бензобака в л

    public Car() {

    }

    @Override
    public String toString() {
        return "Car";
    }

    @Override
    public boolean move(int distance, TypeOfTerrain terrain){
        maxLevelGasoline -= (gasolineConsumption * distance) / 100;
        if (maxLevelGasoline >= 0 && terrain == TypeOfTerrain.FIELD){
            System.out.println("Машина преодолела весь путь. Уровень топлива упал до " + maxLevelGasoline + "л");
            return true;
        }
        else if (terrain != TypeOfTerrain.FIELD){
            System.out.println("Машина не может перемещаться по данной местности!");
            return false;
        } else {
            maxLevelGasoline = 0;
            System.out.println("Не хватает топлива " + maxLevelGasoline + "л");
            return false;
        }
    }
}
