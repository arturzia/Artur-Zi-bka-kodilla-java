package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers){

        ArrayList<Integer> evenNumbers = new ArrayList<>();

        for (Integer k: numbers) {

            if (k%2 == 0) {
                evenNumbers.add(k);
            }
        }

        return evenNumbers;
    }
}
