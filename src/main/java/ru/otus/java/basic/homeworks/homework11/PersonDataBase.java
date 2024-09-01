package ru.otus.java.basic.homeworks.homework11;

import org.jetbrains.annotations.NotNull;

import java.util.*;


//Реализуйте класс PersonDataBase, содержащий список Person, и имеющий методы,
//со следующей
//асимптотической сложностью (методы и конструктор класса Person реализовать
//        самостоятельно)
//
//- Person findById(Long id) - найти Person по id - O(1)
//- void add(Person person) - добавить Person - O(1)
//- isManager(Person person) - O(1) - true если Position : MANAGER, DIRECTOR,
//BRANCH_DIRECTOR или SENIOR_MANAGER
//- isEmployee(Long id) - O(1) - true если Employee имеет любой другой Position


public class PersonDataBase {
    private final Map<Long, Person> personMap;

    public PersonDataBase(){
        this.personMap = new HashMap<Long,Person>();
    }

    public void add(Person person){
        personMap.put(person.getId(), new Person(person.getId(), person.getName(), person.getPosition()));
    }


    public void findById(Long id){
        if(personMap.containsKey(id)){
            personMap.get(id);
            System.out.println("Идентификатор соответствует сотруднику: " + personMap.get(id));
            return;
        }
        System.out.println("Сотрудник с данным идентификатором отсутствует!");
    }

    public boolean isManager(Person person){
        if (personMap.containsKey(person.getId()) &&
                (person.getPosition() == Position.MANAGER
                || person.getPosition() == Position.DIRECTOR
                || person.getPosition() == Position.BRANCH_DIRECTOR
                || person.getPosition() == Position.SENIOR_MANAGER)){
            System.out.println("Сотрудник соответствует позиции менеджера: " + person.getPosition());
            return true;
        }
        System.out.println("Сотрудник не соответствует позиции менеджера или его нет в базе сотрудников!");
        return false;
    }

    public boolean isEmployee(Long id){
        if (personMap.containsKey(id) &&
                ((personMap.get(id).getPosition() != Position.MANAGER)
                        || (personMap.get(id).getPosition() != Position.DIRECTOR)
                        || (personMap.get(id).getPosition() != Position.BRANCH_DIRECTOR)
                        || (!personMap.get(id).getPosition().equals(Position.SENIOR_MANAGER)))){
            System.out.println("Сотрудник соответствует позиции инженера: " + personMap.get(id).getPosition());
            return true;
        }
        System.out.println("Сотрудник соответствует позиции менеджера или его нет в базе сотрудников!");
        return false;
    }

    @Override
    public String toString() {
        return "PersonDataBase{" +
                "personMap=" + personMap +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonDataBase dataBase = (PersonDataBase) o;
        return Objects.equals(personMap, dataBase.personMap) && personMap.containsValue(dataBase) == personMap.containsValue(o);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(personMap);
    }
}


