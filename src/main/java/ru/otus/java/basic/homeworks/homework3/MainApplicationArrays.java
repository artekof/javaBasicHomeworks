package ru.otus.java.basic.homeworks.homework3;

import java.util.Arrays;

public class MainApplicationArrays {
    static final int size = 5;
    static final char starChar = '*';
    static char[][] arrStar;
    static final int[][] arr = {{15, 3, 1},{2,4,7}};

    public static void main(String[] args) {
        //sumOfPositiveElements(arr);
        //createQuad(size);
        //diagIsNull(arr);
        //findMax(arr);
        sumSecondStr(arr);
    }

//    1) Реализовать метод sumOfPositiveElements(..), принимающий в качестве аргумента целочисленный двумерный массив,
//    метод должен посчитать и вернуть сумму всех элементов массива, которые больше 0;

    public static int sumOfPositiveElements(int[][] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > 0){
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }

//    2) Реализовать метод, который принимает в качестве аргумента int size и
//    печатает в консоль квадрат из символов * со сторонами соответствующей длины;

    private static void createQuad(int size){
        arrStar = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arrStar[i][j] = starChar;
                System.out.print(arrStar[i][j]);
            }
            System.out.println();
        }
    }

//    3) Реализовать метод, принимающий в качестве аргумента двумерный целочисленный массив,
//    и зануляющий его диагональные элементы (можете выбрать любую из диагоналей, или занулить обе);

    private static void diagIsNull(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == arr[i][i] && arr[i][j] == arr[j][j]){
                    arr[i][j] = 0;
                }
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

//    4) Реализовать метод findMax(int[][] array) который должен найти и вернуть максимальный элемент массива;

    private static int findMax(int[][] arr){

        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }
        return max;
    }

//    5) Реализуйте метод, который считает сумму элементов второй строки двумерного массива,
//    если второй строки не существует, то в качестве результата необходимо вернуть -1

    private static int sumSecondStr(int[][] arr) {
        int sum = 0;
        if (arr.length < 2){
            System.out.println(-1);
            return -1;
        }
        else {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if (arr[i][j] == arr[1][j]) {
                        sum += arr[1][j];
                    }
                }
            }
        }
        System.out.println(sum);
        return sum;
    }
}
