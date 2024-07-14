package ru.otus.java.basic.homeworks.homework1;

import java.util.Scanner;

public class ApplicationHomework1 {
    public static void main(String[] args) {
        //greetings();
        //checkSign();
        //selectColor();
    }


//    (1) Реализуйте метод greetings(), который при вызове должен отпечатать в столбец 4 слова:
//    Hello, World, from, Java;
    public static void greetings(){
        System.out.println("Hello\nWorld\nfrom\nJava");
    }

//    (2) Реализуйте метод checkSign(..), принимающий в качестве аргументов 3 int переменные a, b и c.
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

//    (3) Реализуйте метод selectColor() в теле которого задайте int переменную data с любым начальным значением.
//    Если data меньше 10 включительно, то в консоль должно быть выведено сообщение “Красный”,
//    если от 10 до 20 включительно, то “Желтый”, если больше 20 - “Зеленый”;

    public static void selectColor(){
        int data = 21;
        if (data <= 10){
            System.out.println("Красный");
        } else if (data > 10 && data <= 20) {
            System.out.println("Желтый");
        } else if (data > 20) {
            System.out.println("Зеленый");
        }
    }

}
