package ru.otus.java.basic.homeworks.homework7.transport;

import ru.otus.java.basic.homeworks.homework7.*;

public class Rover implements Transport {
    private int gasolineConsumption = 1; // Расход 1 л на 100 м
    private int levelGasoline = 100; //Объем бензобака в л



    public Rover() {

    }

    @Override
    public String toString() {
        return "Rover";
    }

    @Override
    public boolean move(int distance, TypeOfTerrain terrain){
        levelGasoline -= (gasolineConsumption * distance) / 100;
        if (levelGasoline >= 0){
            System.out.println("Вездеход преодолел весь путь. Уровень топлива упал до " + levelGasoline + "л");
            return true;
        }
        levelGasoline = 0;
        System.out.println("Не хватает топлива " + levelGasoline + "л");
        return false;
    }
}
