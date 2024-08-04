package ru.otus.java.basic.homeworks.homework4;

import org.w3c.dom.ls.LSOutput;

import java.time.Year;
import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        //Задание 1
//        User[] users = {
//                new User("Иванов", "Иван", "Иванович", 1950, "ivan@mail.ru"), //1
//                new User("Сидоров", "Пётр", "Николаевич", 1960, "petya@mail.ru"), //2
//                new User("Петров", "Николай", "Иванович", 1970, "nik@mail.ru"), //3
//                new User("Петров", "Евгений", "Николаевич", 1980, "zhenya@mail.ru"), //4
//                new User("Сидоров", "Леонид", "Иванович", 1990, "lyonya@mail.ru"), //5
//                new User("Петров", "Артур", "Николаевич", 2000, "art@mail.ru"), //6
//                new User("Иванов", "Игорь", "Иванович", 1965, "igor@mail.ru"), //7
//                new User("Иванов", "Андрей", "Николаевич", 1991, "andrew@mail.ru"), //8
//                new User("Сидоров", "Данил", "Иванович", 2005, "danil@mail.ru"), //9
//                new User("Петров", "Максим", "Николаевич", 1955, "max@mail.ru"), //10
//        };
//        int curYear = Year.now().getValue(); //текущий год
//
//        for (int i = 0; i < users.length; i++) {
//            if (curYear - users[i].getYearOfBirth() > 40) {
//                users[i].info();
//            }
//        }

        //Задание 2
        String item = "Ball";
        Box box = new Box(20,20,20, "Red", false);
        box.info();
        box.setIsOpened(true);
        box.add(item);
        box.add(item);
        box.remove(item);
        box.setIsOpened(false);
        box.add(item);
        box.remove(item);
        box.setIsOpened(true);
        box.add(item);
        //box.remove(item);
        box.info();
    }
}