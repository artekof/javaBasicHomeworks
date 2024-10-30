package ru.otus.java.basic.homeworks.homework18;

import java.util.Arrays;

/**
 * Реализовать метод, принимающий в качестве аргумента одномерный целочисленный массив, и возвращающий новый массив,
 * который содержит элементы исходного массива, идущие после последней единицы. Если входной массив не содержит единиц,
 * то должно быть брошено RuntimeException.
 * Примеры:
 * Входной массив: [ 1 2 1 2 2 ] => Результат: [ 2 2 ]
 * Входной массив: [ 2 2 2 2 ] => RuntimeException
 * Реализовать метод, проверяющий входной массив, что он состоит только из чисел 1 и 2. Если в массиве присутствуют
 * числа кроме 1 и 2, или нет хотя бы одной единицы или двойки, то результат должен быть равен false
 * Примеры:
 * [ 1 2 ] => true
 * [ 1 1 ] => false
 * [ 1 3 ] => false
 * [ 1 2 2 1 ] => true
 * Реализовать набор тестов для методов.
 */
public class Application {

    public int[] checkAndCreateNewArray(int[] array) {
        int[] newArray;
        int countNumOne = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                countNumOne = i;
            }
        }
        if (countNumOne == 0) {
            throw new RuntimeException("Входной массив не содержит единиц");
        }
        newArray = Arrays.copyOfRange(array, countNumOne + 1, array.length);
        return newArray;
    }

    public boolean checkContainNumOneAndTwo(int[] array){
        boolean isNumOne = false;
        boolean isNumTwo = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1){
                isNumOne = true;
            } else if (array[i] == 2) {
                isNumTwo = true;
            }
        }
        if (isNumOne == true && isNumTwo == true){
            return true;
        }
    return false;
    }
}
