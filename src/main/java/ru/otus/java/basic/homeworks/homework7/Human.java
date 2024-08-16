package ru.otus.java.basic.homeworks.homework7;

public class Human {
    private String name;
    private Transport currentTransport;

    public Human(String name) {
        this.name = name;
        this.currentTransport = currentTransport;
    }

    public void info(){
        if (currentTransport == null){
            System.out.println(name + " не использует транспорт");
            return;
        }
        System.out.println(name + " находится в транспорте: " + currentTransport);
    }

    public boolean move(int distance, TypeOfTerrain terrain, Transport transport){
        if (transport == null) {
            currentTransport = null;
            System.out.println("Человек прошел пешком");
            return true;
        } else if ((currentTransport == null || currentTransport == transport) && transport.move(distance, terrain) == true) {
            currentTransport = transport;
            return true;
        } else if (currentTransport != transport && currentTransport != null){
            System.out.println("Человек использует другой транспорт, сначала необходимо из него выйти!");
            return false;
        }
        return false;
    }

    public void enterTransport(Transport transport){
        if (currentTransport != transport && currentTransport != null){
            System.out.println(name + " не может пользоваться " + transport + ", тк находится в " + currentTransport);
            return;
        } else if (currentTransport == transport){
            System.out.println(name + " уже сидит в транспортe " + currentTransport);
            return;
        }
        currentTransport = transport;
        System.out.println(name + " сел в транспорт " + currentTransport);
    }

    public void exitTransport(Transport transport){
        if (currentTransport != null){
            System.out.println(name + " покинул " + transport);
            currentTransport = null;
            return;
        }
        System.out.println(name + " пешеход");
    }
}
