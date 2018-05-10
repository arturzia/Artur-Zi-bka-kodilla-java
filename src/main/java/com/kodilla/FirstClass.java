package com.kodilla;

import java.util.*;


class ArrayDequeSplit {


    public static void main(String[] args) {

        ArrayDeque<String> arrayToSplit = new ArrayDeque<>();
        Random theGen = new Random();

        for(int i = 0; i<50; i++){
            String stringChar = "";
            int generator = theGen.nextInt(50)+1;

            for (int k = 0; k < generator; k++){
                stringChar += "a";

            }
            arrayToSplit.offer(stringChar);
        }
        System.out.println("ArrayDeque: "+ arrayToSplit);
        SplitArray theSplitArray = new SplitArray();
        theSplitArray.splitDeque(arrayToSplit);

    }

}

class SplitArray{


    public void splitDeque(ArrayDeque<String> theSplit){

        ArrayList<String> theEven = new ArrayList<>();
        ArrayList<String> theOdd = new ArrayList<>();

        for(String theS: theSplit ){

            int temporaryValue = theS.length();
            //checking if an element is even or odd
            if (temporaryValue % 2 == 0){
                theEven.add(theS);

            }else{

                theOdd.add(theS);
            }
        }

        System.out.println("Even:"+theEven);
        System.out.println("Odd: "+theOdd);
    }
}
