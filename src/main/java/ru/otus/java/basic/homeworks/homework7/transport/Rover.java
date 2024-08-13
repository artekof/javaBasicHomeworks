package ru.otus.java.basic.homeworks.homework7.transport;

import ru.otus.java.basic.homeworks.homework7.*;

public class Rover implements Transport {
    private int gasolineConsumption = 1; // Расход 1 л на 100 м
    private int maxLevelGasoline = 100; //Объем бензобака в л



    public Rover() {

    }

    @Override
    public String toString() {
        return "Rover";
    }

    @Override
    public boolean move(int distance, TypeOfTerrain terrain){
        maxLevelGasoline -= (gasolineConsumption * distance) / 100;
        if (maxLevelGasoline >= 0){
            System.out.println("Вездеход преодолел весь путь. Уровень топлива упал до " + maxLevelGasoline + "л");
            return true;
        }
        maxLevelGasoline = 0;
        System.out.println("Не хватает топлива " + maxLevelGasoline + "л");
        return false;
    }
}
