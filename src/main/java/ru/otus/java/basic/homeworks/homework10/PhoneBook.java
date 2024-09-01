package ru.otus.java.basic.homeworks.homework10;

//Реализуйте класс PhoneBook, который хранит в себе список имен (фио) и телефонных номеров;
//Метод add() должен позволять добавлять запись имя-телефон;
//Метод find() выполнять поиск номер(-а, -ов) телефона по имени;
//Под одним именем может быть несколько телефонов (в случае однофамильцев, или наличии у одного человека нескольких номеров),
//тогда при запросе такой фамилии должны выводиться все телефоны;
//Метод containsPhoneNumber должен проверять наличие телефона в справочнике.

import java.util.*;

public class PhoneBook {
    private final Map<String, List<String>> phoneBook;

    public PhoneBook(){
        this.phoneBook = new HashMap<>();
    }

    public void add(String name, String numberPhone){
        if (phoneBook.containsKey(name)) {
            phoneBook.get(name).add(numberPhone);
        }
        else {
            ArrayList<String> list = new ArrayList<String>();
            list.add(numberPhone);
            phoneBook.put(name, list);
        }
        System.out.println("В телефонный справочник добавлен " + name + " с номером телефона " + numberPhone);
    }

    public void find(String name){
            if (phoneBook.containsKey(name)) {
                System.out.println("В телефонном справочнике имени " + name + " соответствуют номера телефона: " + phoneBook.getOrDefault(name, new ArrayList<>(Arrays.asList("Unknown"))));
                phoneBook.getOrDefault(name, new ArrayList<>(Arrays.asList("Unknown")));
            }
            else {
                System.out.println("В телефонном справочнике нет имени " + name);
            }
    }

    public boolean containsPhoneNumber(String numberPhone){
            for (List<String> number: phoneBook.values())
                if (number.contains(numberPhone)){
                    System.out.println("Номер телефона присутствует в справочнике.");
                    return true;
                }
        System.out.println("Номер телефона отсутствует в справочнике.");
        return false;
    }

    @Override
    public String toString() {
        return "PhoneBook{" +
                "phoneBook=" + phoneBook +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhoneBook phoneBook1 = (PhoneBook) o;
        return Objects.equals(phoneBook, phoneBook1.phoneBook);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(phoneBook);
    }
}
