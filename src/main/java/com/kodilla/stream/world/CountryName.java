package com.kodilla.stream.world;

public enum CountryName {
    POLAND ("Poland"),
    GERMANY("Germany"),
    ITALY ("Italy"),
    FRANCE("France"),
    CHINA("China"),
    INDIA ("India"),
    BRAZIL("Brazil"),
    PAKISTAN("Pakistan"),
    UNITED_STATES("United States"),
    RUSSIA("Russia"),
    NIGERIA("Nigeria"),
    KENYA("Kenya"),
    VENEZUELA("Venezuela"),
    CANADA("Canada"),
    MONACO("Monaco"),
    CONGO("Democratic Republic of the Congo");

    private final String name;

    private CountryName(String s) {
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
