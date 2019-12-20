package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {

    private List<Integer> integerList;

    public OddNumbersExterminator(List<Integer> integerList) {
        this.integerList = integerList;
    }

    public List<Integer> getIntegerList() {
        return integerList;
    }

    public List<Integer> exterminate(){
        ArrayList<Integer> integers = new ArrayList<>(integerList);
        integers.removeIf(i -> i % 2 != 0);
        integerList = integers;
        return integerList;
    }
}
