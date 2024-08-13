package ru.otus.java.basic.homeworks.homework7;

public enum TypeOfTerrain {
    DEEPFOREST("Густой лес"), FIELD("Равнина"), SWAMP("Болото");

    public String terrain;

    public String getTerrain() {
        return terrain;
    }

    TypeOfTerrain(String terrain) {
        this.terrain = terrain;
    }
}
