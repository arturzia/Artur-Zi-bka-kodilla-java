package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;


public class CollectionTestSuite {

    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }

    @After
    public void after(){
        System.out.println("Test Case: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList (){
        //given
        ArrayList<Integer> myList = new ArrayList<>();
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

        //when
        ArrayList<Integer> result = oddNumbersExterminator.exterminate(myList);

        //then
        Assert.assertEquals(myList, result);


    }


    @Test
    public void testOddNumbersExterminatorNormalList (){
        //given
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(23);
        myList.add(13);
        myList.add(10);
        myList.add(6);
        myList.add(34);
        myList.add(25);
        myList.add(12);

        ArrayList<Integer> myEvenList = new ArrayList<>();
        myEvenList.add(10);
        myEvenList.add(6);
        myEvenList.add(34);
        myEvenList.add(12);


        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

        //when
        ArrayList<Integer> result = oddNumbersExterminator.exterminate(myList);

        //then
        Assert.assertEquals(myEvenList, result);

    }

}
