package ru.otus.java.basic.homeworks.homework7;

import ru.otus.java.basic.homeworks.homework7.transport.Bicycle;
import ru.otus.java.basic.homeworks.homework7.transport.Car;
import ru.otus.java.basic.homeworks.homework7.transport.Horse;
import ru.otus.java.basic.homeworks.homework7.transport.Rover;

public class Application {
    public static void main(String[] args) {
        Human human = new Human("Jack");
        Rover rover = new Rover();
        Car car = new Car();
        Horse horse = new Horse();
        Bicycle bicycle = new Bicycle();


        human.info();
        human.move(1000,TypeOfTerrain.SWAMP, rover);
        human.exitTransport(rover);
        human.move(1000, TypeOfTerrain.FIELD, car);
        human.exitTransport(car);
        human.move(100,TypeOfTerrain.FIELD, bicycle);
        human.enterTransport(car);
        human.move(1000,TypeOfTerrain.SWAMP,horse);
        human.info();
        human.move(100,TypeOfTerrain.SWAMP,null);
        human.move(1000,TypeOfTerrain.SWAMP,horse);



    }
}
