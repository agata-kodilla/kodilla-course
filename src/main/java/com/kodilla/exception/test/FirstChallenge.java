package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b) {
        double divide = 0;
        try {
            divide = a / b;
            if (divide == Double.POSITIVE_INFINITY ||
                    divide == Double.NEGATIVE_INFINITY)
                throw new ArithmeticException();
        }
        catch (ArithmeticException e) {
            System.out.println("There is no possibility to divide by 0");
        }
        finally{
            System.out.println("a="+a +", b="+b);
        }
        return divide;
    }

    /**
     * This main can throw an ArithmeticException!!!
     *
     * @param args
     */
    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();

        double result = firstChallenge.divide(3, 0);

        System.out.println(result);

    }
}