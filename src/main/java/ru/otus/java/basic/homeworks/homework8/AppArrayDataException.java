package ru.otus.java.basic.homeworks.homework8;

public class AppArrayDataException extends NumberFormatException{

    public AppArrayDataException(String[][] arr, int i, int j) {
        super(String.format("Некорректное значение ячейки '" + arr[i][j]+ "' по адресу " + "[" + i + "][" + j + "]"));


    }
}
