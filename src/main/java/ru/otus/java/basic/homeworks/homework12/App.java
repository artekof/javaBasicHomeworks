package ru.otus.java.basic.homeworks.homework12;

//        Реализуйте приложение, позволяющее работать с текстовыми файлами
//        При старте приложения, в консоль выводится список текстовых файлов из корневого каталоге проекта
//        Далее программа запрашивает имя файла, с которым хочет работать пользователь
//        Содержимое файла выводится в консоль
//        Затем любую введенную пользователем строку необходимо записывать в указанный файл


import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        File dir = new File("C:\\Users\\Артём\\javaBasicHomeworks"); //корневой каталог
        //При старте приложения, в консоль выводится список текстовых файлов из корневого каталоге проекта
        String[] list = dir.list();
        List<String> files = new ArrayList<String>();
        for (int i = 0; i < list.length; i++) {
            if (list[i].matches(".+.txt")){
                files.add(list[i]);
            }
        }
        if (files.size() == 0){
            System.out.println("В корневом каталоге нет текстовых файлов!");
        }else {
            System.out.println("В корневом каталоге проекта содержатся текстовые файлы:" + files);
            //Далее программа запрашивает имя файла, с которым хочет работать пользователь
            System.out.println("Введите имя файла, с которым желаете поработать:");
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            for (String file : files){
                if (str.equals(file)){
                    System.out.println("Выбран файл: " + str);
                    //Содержимое файла выводится в консоль
                    try (InputStreamReader in = new InputStreamReader(new FileInputStream(str))) {
                        int input = in.read();
                        System.out.println("Содержимое файла: ");
                        while (input != -1) {
                            System.out.print((char)input);
                            input = in.read();
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    //Затем любую введенную пользователем строку необходимо записывать в указанный файл
                    System.out.println();
                    String data = sc.nextLine();
                    try (BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(str))) {
                        byte[] dataOut = data.getBytes(StandardCharsets.UTF_8);
                        for (int i = 0; i < dataOut.length; i++) {
                            out.write(dataOut[i]);
                        }
                        System.out.println("Строка '" + data + "' записана в файл " + str);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                } else {
                    System.out.println("Файл с указанным вами именем отсутствует!");
                }
            }
        }
    }
}
