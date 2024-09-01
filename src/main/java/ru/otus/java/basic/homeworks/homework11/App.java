package ru.otus.java.basic.homeworks.homework11;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        PersonDataBase dataBase = new PersonDataBase();
        dataBase.add(new Person(12321321L, "Василий", Position.DIRECTOR));
        dataBase.add(new Person(12321322L, "Николай", Position.MANAGER));
        dataBase.add(new Person(12321323L, "Евгений", Position.DRIVER));
        dataBase.add(new Person(12321324L, "Егор", Position.ENGINEER));
        dataBase.add(new Person(12321325L, "Иван", Position.SENIOR_MANAGER));
        dataBase.add(new Person(12321326L, "Артур", Position.DEVELOPER));
        dataBase.add(new Person(12321327L, "Антон", Position.QA));
        dataBase.add(new Person(12321328L, "Сергей", Position.JANITOR));
        dataBase.add(new Person(12321329L, "Артур", Position.DEVELOPER));
        dataBase.add(new Person(12321330L, "Антон", Position.QA));
        dataBase.add(new Person(12321331L, "Сергей", Position.JANITOR));
        dataBase.add(new Person(12321332L, "Екатерина", Position.PLUMBER));
        dataBase.add(new Person(12321333L, "Наталья", Position.BRANCH_DIRECTOR));
        dataBase.add(new Person(12321334L, "Мария", Position.JUNIOR_DEVELOPER));
        dataBase.add(new Person(12321335L, "Дарья", Position.JUNIOR_DEVELOPER));

        dataBase.findById(12321321L);
        dataBase.findById(12321333L);
        dataBase.findById(12321339L);
        //System.out.println(dataBase);
        dataBase.isManager(new Person(12321335L, "Дарья", Position.JUNIOR_DEVELOPER));
        dataBase.isManager(new Person(12321325L, "Иван", Position.SENIOR_MANAGER));
        dataBase.isManager(new Person(123213L, "Николай", Position.SENIOR_MANAGER));

        dataBase.isEmployee(12325L);
        dataBase.isEmployee(12321325L);
    }
}

