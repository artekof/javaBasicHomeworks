package ru.otus.java.basic.homeworks.homework1;

import java.util.Scanner;

public class ApplicationHomework1 {
    public static void main(String[] args) {
        //greetings();
        checkSign();
    }


//    (1) Реализуйте метод greetings(), который при вызове должен отпечатать в столбец 4 слова:
//    Hello, World, from, Java;
    public static void greetings(){
        System.out.println("Hello\nWorld\nfrom\nJava");
    }
//(2) Реализуйте метод checkSign(..), принимающий в качестве аргументов 3 int переменные a, b и c.
//    Метод должен посчитать их сумму, и если она больше или равна 0, то вывести в консоль сообщение
//    “Сумма положительная”, в противном случае - “Сумма отрицательная”;

    public static void checkSign(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число a:");
        int a = sc.nextInt();
        System.out.println("Введите число b:");
        int b = sc.nextInt();
        System.out.println("Введите число c:");
        int c = sc.nextInt();
        int resultSum = a + b + c;
        if (resultSum >= 0){
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

}
