package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main (String [] args){

        SecondChallenge secondChallenge = new SecondChallenge();
        String secondCh = "";

        try {

            secondCh = secondChallenge.probablyIWillThrowException(2, 1);

        }catch(Exception e){

            System.out.println("X or Y incorrect: "+e);

        }

            System.out.println(secondCh);
    }
}
