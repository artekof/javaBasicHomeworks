package ru.otus.java.basic.homeworks.homework4;

import java.util.Arrays;

public class Box {
    private int length;
    private int width;
    private int height;
    private String color;
    private boolean isOpened;
    private String[] items = new String[2];

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
        System.out.println("У коробки изменен цвет на " + color);
    }

    public boolean getIsOpened() {
        return isOpened;
    }

    public String[] getItems() {
        return items;
    }

    public Box(int length, int width, int height, String color, boolean isOpened) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.color = color;
        this.isOpened = false;

    }

    public void info() {
        System.out.println("Коробока имеет " + color + " цвет, длину равную " + length + " ширину равную " + width + " высоту равную " + height + ".\nВ ней лежит: " + Arrays.toString(items));
    }

    public void add(String item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null && isOpened == true) {
                items[i] = item;
                System.out.println("Коробка открыта, в нее добавлен предмет " + item);
                return;
            } else if (isOpened != true) {
                System.out.println("Коробока закрыта, положить в нее предмет невозможно!");
                return;
            }
        }
        System.out.println("В коробке нет места!");
    }

    public void remove(String item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i].equals(item) && isOpened == true) {
                items[i] = null;
                System.out.println("Предмет " + item + " удален из коробки");
                return;
            } else if (isOpened != true) {
                System.out.println("Коробока закрыта, достать из нее предмет невозможно!");
                return;
            } else if (items == null) {
                System.out.println("Коробка пустая, удалять нечего");
                return;
            }
        }
        System.out.println("Убрать из коробки предмет " + item + " невозможно, т.к. его там нет!");
    }

    public void open(){
        isOpened = true;
        System.out.println("Коробка открыта!");
    }

    public void close(){
        isOpened = false;
        System.out.println("Коробка закрыта!");
    }
}

