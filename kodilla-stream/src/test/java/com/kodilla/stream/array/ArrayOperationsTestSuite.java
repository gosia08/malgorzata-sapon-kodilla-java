package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        //Given
        int[] numbers = {6,7,10,4,11,12,1};

        //When
        double result = ArrayOperations.getAverage(numbers);

        //Then
        Assert.assertEquals( 7.28571429, result, 0.001);


    }
}