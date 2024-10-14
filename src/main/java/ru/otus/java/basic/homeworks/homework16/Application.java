package ru.otus.java.basic.homeworks.homework16;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

//        Реализуйте метод, который подсчитывает сколько раз в текстовом файле
//        (с кодировкой UTF-8) встречается указанная последовательность символов с учетом регистра;
//        При запуске приложения пользователь вводит имя файла и искомую последовательность символов,
//        программа должна выполнить расчет и напечатать результат в консоль.
public class Application {
    public static void main(String[] args) {
        System.out.println("Введите имя файла и искомую последовательность символов через пробел:\nНапример: test.txt ABCD");
        Scanner sc = new Scanner(System.in);
        try {
            String[] elements = sc.nextLine().split(" ");
            String filename = elements[0].trim();
            String sequence = elements[1].trim();
            search(filename,sequence);
        } catch (ArrayIndexOutOfBoundsException a) {
            System.out.println(a.getMessage());
            System.out.println("Неправильный формат ввода!\nВведите по примеру: test.txt ABCD");
        }
    }


    public static void search(String filename, String sequence) {
        try (FileInputStream fileInputStream = new FileInputStream(filename)) {
            byte[] buffer = new byte[1024];
            int length;
            int count = 0;
            String data = null;
            while ((length = fileInputStream.read(buffer)) != -1) {
                data = new String(buffer, 0, length, StandardCharsets.UTF_8);
            }
            for (int index = data.indexOf(sequence);index != -1;index = data.indexOf(sequence, index + 1)) {
                count++;
            }
            System.out.println("Количество вхождений искомой последовательности символов '" + sequence + "' в файле: " + count);
        } catch (IOException e) {
            System.out.println(e.getMessage());
            }
        }
    }

