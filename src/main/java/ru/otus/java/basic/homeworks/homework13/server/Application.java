package ru.otus.java.basic.homeworks.homework13.server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Application {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(1234)) {
            System.out.println("Сервер запущен. Порт: 1234");
                Socket client = serverSocket.accept();
                System.out.println("Подключен клиент: " + client);

                DataInputStream input = new DataInputStream(client.getInputStream());
                DataOutputStream output = new DataOutputStream(client.getOutputStream());

                output.writeUTF("Доступные операции: +, -, *, /");

                String command = input.readUTF();
                System.out.println(command);
                double num1 = input.readDouble();
                System.out.println(num1);
                double num2 = input.readDouble();
                System.out.println(num2);
                double result = 0;
                if (command.equals("+")){
                    result = num1 + num2;
                    System.out.println("Выполнена операция: сложение");
                    output.writeUTF("Результат: " + result);
                }
                else if (command.equals("-")){
                    result = num1 - num2;
                    System.out.println("Выполнена операция: вычитание");
                    output.writeUTF("Результат: " + result);
                }
                else if (command.equals("*")){
                    result = num1 * num2;
                    System.out.println("Выполнена операция: умножение");
                    output.writeUTF("Результат: " + result);
                }
                 else if (command.equals("/") && num2 != 0){
                    result = num1 / num2;
                    System.out.println("Выполнена операция: деление");
                    output.writeUTF("Результат: " + result);
                } else {
                    System.out.println("Ошибка: деление на ноль или введена неверная операция");
                    output.writeUTF("Ошибка: деление на ноль или введена неверная операция");
                }
                client.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
