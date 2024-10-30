package ru.otus.java.basic.homeworks.homework18;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.CsvSources;

class ApplicationTest {
    private Application application;

    @BeforeEach
    void init(){
        application = new Application();
    }

    @Test
    @DisplayName("Проверка исходного массива на наличие 1 и создание нового массива, который содержит элементы исходного массива, идущие после последней единицы")
    void checkAndCreateNewArray() {
        Assertions.assertArrayEquals(new int[]{2,2,2}, application.checkAndCreateNewArray(new int[]{1,2,1,1,1,2,1,2,2,2}));
    }

    @Test
    @DisplayName("Проверка входного массива на наличие чисел только 1 и 2")
    void checkContainNumOneAndTwo() {
        Assertions.assertTrue(application.checkContainNumOneAndTwo(new int[]{1,2}));
    }
}