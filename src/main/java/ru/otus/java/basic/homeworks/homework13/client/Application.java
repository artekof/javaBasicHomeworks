package ru.otus.java.basic.homeworks.homework13.client;

import java.io.*;
import java.net.Socket;

public class Application {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 1234);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        DataInputStream input = new DataInputStream(socket.getInputStream());
        DataOutputStream output = new DataOutputStream(socket.getOutputStream()))

        {

            System.out.println(input.readUTF());

            System.out.print("Введите операцию +, -, *, /: ");
            String command = reader.readLine();
            output.writeUTF(command);

            System.out.print("Введите первое число: ");
            output.writeDouble(Double.parseDouble(reader.readLine()));

            System.out.print("Введите второе число: ");
            output.writeDouble(Double.parseDouble(reader.readLine()));

            System.out.println(input.readUTF());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
