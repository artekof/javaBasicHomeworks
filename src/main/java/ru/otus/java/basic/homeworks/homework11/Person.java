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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || o.getClass() != this.getClass()) {
            return false;
        }
        Person persons = (Person) o;
        return this.name.equals(persons.name) &&
                this.id == persons.id &&
                this.position.equals(persons.position);
        }

    @Override
    public int hashCode () {
        int hash = 10;
        hash = 5 * hash + (this.name != null ? this.name.hashCode() : 0);
        hash = 5 * hash + (int)this.id;
        return (int) hash;
        }
    }
