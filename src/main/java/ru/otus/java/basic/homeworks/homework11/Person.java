package ru.otus.java.basic.homeworks.homework11;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Person {
    private final String name;
    private final Position position;
    private final long id;

    public Person(Long id, String name, Position position) {
        this.name = name;
        this.position = position;
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public Position getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", position=" + position +
                ", id=" + id +
                '}';
    }
}

