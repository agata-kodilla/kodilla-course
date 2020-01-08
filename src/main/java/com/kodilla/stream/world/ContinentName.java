package com.kodilla.stream.world;

public enum ContinentName {
    ASIA ("Asia"),
    EUROPE ("Europe"),
    AFRICA ("Africa"),
    SOUTH_AMERICA ("South America"),
    NORTH_AMERICA ("North America");

    private final String name;

    private ContinentName(String s) {
        name = s;
    }

    public boolean equalsName(String otherName) {
        // (otherName == null) check is not needed because name.equals(null) returns false
        return name.equals(otherName);
    }

    public String toString() {
        return this.name;
    }
}
