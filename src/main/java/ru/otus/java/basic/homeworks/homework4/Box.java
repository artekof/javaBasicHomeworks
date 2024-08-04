package ru.otus.java.basic.homeworks.homework4;

import java.util.Arrays;

public class Box {
    private int length;
    private int width;
    private int height;
    private String color;
    private boolean isOpened;
    private String[] items;

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

    public void setIsOpened(boolean isOpened) {
        this.isOpened = isOpened;
        if (isOpened == true) {
            System.out.println("Коробка открыта");
        } else {
            System.out.println("Коробока закрыта");
        }
    }

    public String[] getItems() {
        return items;
    }

    public Box(int length, int width, int height, String color, boolean isOpened) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.color = color;
        this.isOpened = isOpened;
    }

    public void info() {
        System.out.println("Коробока имеет " + color + " цвет, длину равную " + length + " ширину равную " + width + " высоту равную " + height + ".\nВ ней лежит: " + Arrays.toString(items));
    }

    public void add(String item) {
        if (items == null && isOpened == true) {
            items = new String[]{item};
            System.out.println("Коробка пустая и открыта, в нее добавлен предмет " + item);
        } else if (isOpened != true) {
            System.out.println("Коробока закрыта, положить в нее предмет невозможно!");
        } else if (items != null && isOpened == true) {
            System.out.println("В коробке лежит " + item + ", положить в нее предмет невозможно!");
        }
    }

    public void remove(String item) {
        if (items != null && isOpened == true) {
            items = null;
            System.out.println("Предмет " + item + " удален из коробки");
        } else if (isOpened != true) {
            System.out.println("Коробока закрыта, достать из нее предмет невозможно!");
        } else if (items == null) {
            System.out.println("Коробка пустая, удалять нечего");
        }
    }
}

