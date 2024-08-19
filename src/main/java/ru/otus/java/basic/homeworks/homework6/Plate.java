package ru.otus.java.basic.homeworks.homework6;

public class Plate {

        private int maxAmountOfFood;
        private int сurAmountOfFood;
        private int size; //Объём, мл

    public Plate(int size) {
        this.size = size;
        this.maxAmountOfFood = size;
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

    public void addFood(int foodAmount) {
        if (foodAmount > 0) {
            if (сurAmountOfFood == maxAmountOfFood) {
                System.out.println("Тарелка полная! Не удалось добавить еду в тарелку!");
                return;
            }
            if (сurAmountOfFood + foodAmount > maxAmountOfFood) {
                System.out.println("Невозможно добавить такое количество еды, тарелка переполнится!");
                return;
            }
            сurAmountOfFood += foodAmount;
            System.out.println("Еда добавлена в тарелку. В тарелке: " + сurAmountOfFood);
        }
        System.out.println("Количество еды не может быть отрицательным или нулевым!");
    }

    public boolean reduceFoodAmount(int foodAmount){
            if (сurAmountOfFood - foodAmount >= 0 && foodAmount > 0) {
                System.out.println("Расход еды корректен, еды в тарелке достаточно: " + сurAmountOfFood);
                сurAmountOfFood = сurAmountOfFood - foodAmount;
                return true;
            }
            if (foodAmount < 0){
                System.out.println("Количество еды не может быть отрицательным или нулевым!");
                return false;
            }
            System.out.println("Расход еды некорректен, в тарелке нет такого количества еды!");
            return false;
    }
}
