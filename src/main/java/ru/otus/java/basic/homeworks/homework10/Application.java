package ru.otus.java.basic.homeworks.homework10;


import java.util.Map;

public class Application {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        for (int i = 0; i < 10; i++) {
            phoneBook.add("Иванов Иван Иванович"+i, "321321"+i);
        }
        phoneBook.add("Иванов Иван Иванович", "321312");
        phoneBook.add("Иванов Иван Иванович", "123213");
        phoneBook.find("Иванов Иван Иванович");
        phoneBook.containsPhoneNumber("123213");
        phoneBook.containsPhoneNumber("3213218");
        phoneBook.containsPhoneNumber("312312");
        System.out.println(phoneBook);
        phoneBook.find("as");
    }
}
