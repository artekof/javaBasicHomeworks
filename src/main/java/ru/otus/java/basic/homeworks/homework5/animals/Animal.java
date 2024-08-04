package ru.otus.java.basic.homeworks.homework5.animals;

public abstract class Animal {
    protected String name;
    protected int speedRun; // Единица измерения м/с
    protected int speedSwim; // Единица измерения м/с
    protected int endurance = 100;// Единица измерения ед.

    protected int time;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeedRun() {
        return speedRun;
    }

    public void setSpeedRun(int speedRun) {
        this.speedRun = speedRun;
    }

    public int getSpeedSwim() {
        return speedSwim;
    }

    public void setSpeedSwim(int  speedSwim) {
        this.speedSwim = speedSwim;
    }

    public int getEndurance() {
        return endurance;
    }

    public void setEndurance(int endurance) {
        this.endurance = endurance;
    }

    public int run(int distance){
        time = 0;
        int consumptionOnRun = 1;//Все животные на 1 метр бега тратят 1 ед выносливости
        if (endurance - consumptionOnRun * distance < 0){
            System.out.println("У " + name + " появилось состояние усталости");
            return -1;
        }
        else {
            time = distance / speedRun;
            endurance = endurance - consumptionOnRun * distance;
            System.out.println(name + " пробежал расстояние " + distance + " метров за " + time + " секунд. Выносливость " + name + " равна " + endurance);
        }
        return time;
    }

    public abstract int swim(int distance);

    public void info(){
        System.out.println("Выносливость животного по имени " + name + " равна " + endurance);
    }

}
