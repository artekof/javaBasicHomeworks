package ru.otus.java.basic.homeworks.homework9;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        //createArrayList(1,15);
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            arrayList.add(i);
        }
        sumElements(arrayList);


    }

//    Реализуйте метод, принимающий в качестве аргументов числа min и max,
//    и возвращающий ArrayList с набором последовательных значений в указанном диапазоне
//    (min и max включительно, шаг - 1);

    public static List<Integer> createArrayList(int min, int max){
        List<Integer> arrayList = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            arrayList.add(i);
        }
        System.out.println(arrayList);
        return arrayList;
    }


//    Реализуйте метод, принимающий в качестве аргумента список целых чисел, суммирующий все элементы,
//    значение которых больше 5, и возвращающий сумму;

    public static int sumElements(ArrayList<Integer> arrayList){
        int sum = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (i > 5) {
                sum += i;
            }
        }
        System.out.println(sum);
        return sum;
    }


//    Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на список,
//    метод должен переписать каждую заполненную ячейку списка указанным числом;


//    Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на список,
//    увеличивающий каждый элемент списка на указанное число;

}
