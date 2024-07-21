package ru.otus.java.basic.homeworks.homework2;

import java.util.Arrays;

public class MainApplicationArrays {
    public static void main(String[] args) {
        int[] arr = {1, 5, 8, 10, 7, 2, 10};
        //counterStringsOutput(10,"Проверка");
        //sumArgsArray(arr);
        //fillArrays(5, arr);
    }

//    1. Реализуйте метод, принимающий в качестве аргументов целое число и строку,
//    и печатающий в консоль строку указанное количество раз

    public static void counterStringsOutput(int count, String str){
        for (int i = 0; i < count; i++) {
            System.out.println(str);
        }
    }

//    2. Реализуйте метод, принимающий в качестве аргумента целочисленный массив,
//    суммирующий все элементы, значение которых больше 5, и печатающий полученную сумму в консоль.

    public static void sumArgsArray(int[] arr){
        int sumElement = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 5){
                sumElement += arr[i];
            }
        }
        System.out.println("Сумма элементов массива, значение которых больше 5 = " + sumElement);
    }

//    3. Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на целочисленный массив,
//    метод должен заполниться каждую ячейку массива указанным числом.

    public static void fillArrays(int elementArr, int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = elementArr;
        }
        System.out.println(Arrays.toString(arr));
    }


}
