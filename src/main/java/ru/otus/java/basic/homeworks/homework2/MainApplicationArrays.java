package ru.otus.java.basic.homeworks.homework2;

import java.util.Arrays;

public class MainApplicationArrays {
    public static void main(String[] args) {
        int[] arr = {1, 5, 8, 10, 7, 2, 10, 15};
        //counterStringsOutput(10,"Проверка");
        //sumArgsArray(arr);
        //fillArrays(5, arr);
        //fillAndSumArray(5, arr);
        checkArrays(arr);
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

//    4. Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на целочисленный массив,
//    увеличивающий каждый элемент которого на указанное число.

    public static void fillAndSumArray(int elementArr, int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] += elementArr;
        }
        System.out.println(Arrays.toString(arr));
    }

//    5. Реализуйте метод, принимающий в качестве аргумента целочисленный массив,
//    и печатающий в консоль сумма элементов какой из половин массива больше.

    public static void checkArrays(int[] arr){
        int sumFirstPart = 0;
        int sumSecondPart = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            sumFirstPart += arr[i];
        }
        for (int i = arr.length / 2; i < arr.length; i++) {
            sumSecondPart += arr[i];
        }
        if (sumFirstPart > sumSecondPart) {
            System.out.println("Сумма первой части массива: " + sumFirstPart + " больше второй части: " + sumSecondPart);
        } else if (sumFirstPart < sumSecondPart){
            System.out.println("Сумма второй части массива: " + sumSecondPart + " больше первой части: " + sumFirstPart);
        } else {
            System.out.println("Сумма первой части равна сумме второй части массива");
        }
    }
}
