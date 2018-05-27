package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {
        //Given
        int [] numbers = {4, 6, 8, 9, 18, 23, 11, 10, 43, 2};
        ArrayAverage arrayAverage = new ArrayAverage();

        //When
        double average = arrayAverage.getAverage(numbers);

        //Then
        System.out.println(average);
        Assert.assertEquals(13.4, average, 0.001);

    }
}
