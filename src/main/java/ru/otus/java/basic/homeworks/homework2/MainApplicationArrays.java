package ru.otus.java.basic.homeworks.homework2;

public class MainApplicationArrays {
    public static void main(String[] args) {
        //counterStringsOutput(10,"Проверка");
    }

//    1. Реализуйте метод, принимающий в качестве аргументов целое число и строку,
//    и печатающий в консоль строку указанное количество раз

    public static void counterStringsOutput(int count, String str){
        for (int i = 0; i < count; i++) {
            System.out.println(str);
        }
    }


}
