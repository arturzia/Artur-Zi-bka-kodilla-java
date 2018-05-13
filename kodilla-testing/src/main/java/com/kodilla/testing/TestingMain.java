package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {

        public static void main(String[] args){

            // Testing Calculator class
            Calculator calculator = new Calculator();
            //first method
            int addResult = calculator.add(134, 11);
            if (addResult == 145) {
                System.out.println("Calculator test OK");
            } else {
                System.out.println("Calculator has error!");
            }
            //second method
            int subResult = calculator.subtract(120, 90);
            if (subResult == 30) {
                System.out.println("Calculator test OK");
            } else {
                System.out.println("Calculator has error!");
            }
        }
}

