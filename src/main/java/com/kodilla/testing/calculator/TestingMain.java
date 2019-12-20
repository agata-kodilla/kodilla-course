package com.kodilla.testing.calculator;

public class TestingMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int add = calculator.add(6, 8);
        int substract = calculator.substract(23, 455);

        if(add==14){
            System.out.println("test OK");
        } else {
            System.out.println("Error! for add");
        }
        if(substract==-432){
            System.out.println("test OK");
        } else {
            System.out.println("Error! for substract");
        }
    }
}
