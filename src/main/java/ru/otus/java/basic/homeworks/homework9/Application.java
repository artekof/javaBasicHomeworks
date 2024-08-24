package ru.otus.java.basic.homeworks.homework9;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
//        createArrayList(1,15);//1
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        for (int i = 0; i < 15; i++) {
//            arrayList.add(i);
//        }
//        System.out.println(arrayList);
//        sumElements(arrayList);//2
//        overwriteList(5,arrayList);
//        increaseValueList(5,arrayList);
        List<Employees> employees = new ArrayList<Employees>();
        for (int i = 0; i < 10; i++) {
            employees.add(i, new Employees("Name"+ i, 20+i));
        }

//        employees.add(new Employees("das", 10));
//        getAllNameEmployees(employees);
//        getNameEmployeesByAge(employees,25);
//        checkNameEmployeesByAvgAge(employees, 20);
        getLinkYoungestEmployee(employees);
//        System.out.println(employees);
    }

//    Реализуйте метод, принимающий в качестве
//    аргумента список сотрудников, и возвращающий список их имен;
    public static List<String> getAllNameEmployees(List<Employees> employees){
        List<String> names = new ArrayList<>();
        for (Employees e: employees) {
            names.add(e.getName());
        }
        System.out.println(names);
        return names;
    }

//    Реализуйте метод, принимающий в качестве аргумента список сотрудников и минимальный возраст,
//    и возвращающий список сотрудников, возраст которых больше либо равен указанному аргументу;

    public static List<String> getNameEmployeesByAge(List<Employees> employees, int minAge){
        List<String> namesByAge = new ArrayList<>();
        for (Employees e: employees) {
            if(e.getAge() >= minAge){
                namesByAge.add(e.getName() + " " + e.getAge());
            }
        }
        System.out.println(namesByAge);
        return namesByAge;
    }

//    Реализуйте метод, принимающий в качестве аргумента список сотрудников и минимальный средний возраст,
//    и проверяющий что средний возраст сотрудников превышает указанный аргумент;

    public static boolean checkNameEmployeesByAvgAge(List<Employees> employees, int minAvgAge){
        List<String> namesByAvgAge = new ArrayList<>();
        int sumAge = 0;
        int count = 0;
        for (Employees e: employees) {
            sumAge += e.getAge();
            count++;
        }
        int avgAge = sumAge/count;
        if (avgAge < minAvgAge){
            System.out.println(-1);
            return false;
        }
        System.out.println(avgAge);
        return true;
    }

//    Реализуйте метод, принимающий в качестве
//    аргумента список сотрудников, и возвращающий ссылку на самого молодого сотрудника.

    public static int getLinkYoungestEmployee(List<Employees> employees){
        int min = employees.get(0).getAge();
        int link = 0;
        for (Employees e: employees) {
            if (e.getAge() < min){
                min = e.getAge();
            }
        }
        for (Employees e: employees) {
            link++;
            if (e.getAge() == min){
                break;
            }
        }
        System.out.println(min);
        System.out.println(link-1);
        return link-1;
    }


/////////////////////////////////////////////////////////////////////////////////////////

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

    public static void overwriteList(int figure, ArrayList<Integer> arrayList){
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.set(i,figure);
        }
        System.out.println(arrayList);
    }

//    Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на список,
//    увеличивающий каждый элемент списка на указанное число;

    public static void increaseValueList(int figure, ArrayList<Integer> arrayList){
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.set(i, figure + i);
        }
        System.out.println(arrayList);
    }
}
