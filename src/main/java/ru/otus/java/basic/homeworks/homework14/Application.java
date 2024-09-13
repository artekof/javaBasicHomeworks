package ru.otus.java.basic.homeworks.homework14;


//          Описание/Пошаговая инструкция выполнения домашнего задания:
//        Необходимо выполнить две реализации задачи заполнения массива

//        Реализация №1
//
//        Реализуйте метод, который создает double массив длиной 100_000_000 элементов
//        Метод должен должен циклом for пройти по каждому элементу и посчитать его значение по формуле:
//        array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
//        Засеките время выполнения цикла и выведите его в консоль.

//        Реализация №2:
//
//        Сделайте то же самое что и в реализации один, только чтобы массив заполняли 4 потока одновременно.
//        То есть первый поток заполняет первую четверть массива, второй - вторую и т.д. И посмотрите насколько быстрее выполнится работа по сравнению с одним потоком.

import java.util.Arrays;

public class Application {
    public static void main(String[] args) throws InterruptedException {

        createArrayOneThread();
        createArrayFourThread();
    }

    public static void createArrayOneThread(){
        long time = System.currentTimeMillis();
        double[] arr = new double[100_000_000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
        }
        System.out.println(System.currentTimeMillis() - time);
    }

    public static void createArrayFourThread() throws InterruptedException {
        long startTime = System.currentTimeMillis();
        double[] arr = new double[100_000_000];
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < arr.length/4; i++) {
                arr[i] = 1.14f * Math.cos(i) * Math.sin(i * 0.2f) * Math.cos(i / 1.2f);
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = arr.length/4; i < arr.length/2; i++) {
                arr[i] = 1.14f * Math.cos(i) * Math.sin(i * 0.2f) * Math.cos(i / 1.2f);
            }
        });
        Thread t3 = new Thread(() -> {
            for (int i = arr.length/2; i < (3 * arr.length)/4; i++) {
                arr[i] = 1.14f * Math.cos(i) * Math.sin(i * 0.2f) * Math.cos(i / 1.2f);
            }
        });
        Thread t4 = new Thread(() -> {
            for (int i = (3 * arr.length)/4; i < arr.length; i++) {
                arr[i] = 1.14f * Math.cos(i) * Math.sin(i * 0.2f) * Math.cos(i / 1.2f);
            }
        });
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t1.join();
        t2.join();
        t3.join();
        t4.join();
        System.out.println(System.currentTimeMillis() - startTime);
    }
}
