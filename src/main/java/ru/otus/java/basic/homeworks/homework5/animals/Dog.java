package ru.otus.java.basic.homeworks.homework5.animals;

public class Dog extends Animal{
    public Dog(String name, int speedRun, int speedSwim){
        this.name = name;
        this.speedRun = speedRun;
        this.speedSwim = speedSwim;
    }

    @Override
    public int swim(int distance){
        time = 0;
        int consumptionOnSwim = 2; // Собаки на 1 метр плавания - 2 ед.
        if (endurance - consumptionOnSwim * distance < 0){
            System.out.println("У " + name + " появилось состояние усталости");
            return -1;
        } else {
            time = distance / speedSwim;
            endurance = endurance - consumptionOnSwim * distance;
            System.out.println(name + " проплыл расстояние " + distance + " метров за " + time + " секунд. Выносливость " + name + " равна " + endurance);
        }
        return time;
    }
}
