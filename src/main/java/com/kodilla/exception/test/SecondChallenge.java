package com.kodilla.exception.test;

public class SecondChallenge {
   public String probablyIWillThrowException(double x, double y) {

       try{
           if(x >= 2 || x < 1 || y == 1.5) {
               throw new ExceptionHandling("Exception!!!!!");
           }
       }
       catch (ExceptionHandling e){
           e.printStackTrace();
       }
       finally {
           System.out.println("x="+x +", y="+y);
       }
       return "Done!";
   }

    public static void main(String[] args) {

        SecondChallenge secondChallenge = new SecondChallenge();

        String result = secondChallenge.probablyIWillThrowException(3, 0);

        System.out.println(result);

    }
}