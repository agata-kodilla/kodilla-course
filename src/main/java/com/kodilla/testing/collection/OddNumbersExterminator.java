package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {
    
    public List<Integer> exterminate(List<Integer> list){
        ArrayList<Integer> integers = new ArrayList<>(list);
        integers.removeIf(i -> i % 2 != 0);
        list = integers;
        return list;
    }
}
