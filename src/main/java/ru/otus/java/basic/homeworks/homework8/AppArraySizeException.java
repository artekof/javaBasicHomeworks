package ru.otus.java.basic.homeworks.homework8;

public class AppArraySizeException extends RuntimeException{
    public AppArraySizeException(String[][] arr){
        super(String.format("Передан массив другого размера, передайте массив размером 4х4!"));
    }
}
