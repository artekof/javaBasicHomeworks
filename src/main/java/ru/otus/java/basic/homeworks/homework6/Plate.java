package ru.otus.java.basic.homeworks.homework6;

public class Plate {

        private int maxAmountOfFood; //Услованая единица: в 1мл - 0,5 усл.ед.еды
        private int сurAmountOfFood; //Услованая единица: в 1мл - 0,5 усл.ед.еды
        private int size; //Объём, мл

    public Plate(int size) {
        this.size = size;
        this.maxAmountOfFood = size / 2; //В 1мл - 0,5 усл.ед.еды
        this.сurAmountOfFood = maxAmountOfFood;
    }

    public int getMaxAmountOfFood() {
        return maxAmountOfFood;
    }

    public int getСurAmountOfFood() {
        return сurAmountOfFood;
    }

    public int getSize() {
        return size;
    }

    public void info(){
        System.out.println("В тарелке: " + сurAmountOfFood);
    }

    public void addFood(int food) {
        if (сurAmountOfFood == maxAmountOfFood) {
            System.out.println("Тарелка полная! Не удалось добавить еду в тарелку!");
            return;
        }
        if (сurAmountOfFood + food > maxAmountOfFood) {
            System.out.println("Невозможно добавить такое количество еды, тарелка переполнится!");
            return;
        }
        сurAmountOfFood += food;
        System.out.println("Еда добавлена в тарелку. В тарелке: " + сurAmountOfFood);
    }

    public boolean reduceAmountFood(int food){
        if(сurAmountOfFood - food >= 0){
            System.out.println("Расход еды корректен, еды в тарелке достаточно: " + сurAmountOfFood);
            сurAmountOfFood = сurAmountOfFood - food;
            return true;
        }
        System.out.println("Расход еды некорректен, в тарелке нет такого количества еды!");
        return false;
    }
}
