package com.kodilla.testing.stream.array;

import com.kodilla.stream.array.ArrayOperations;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.Random;

import static com.kodilla.stream.array.ArrayOperations.getAverage;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage(){
        //given
        int[] array = {1,2,3};
        //when
        OptionalDouble average = getAverage(array);
        //then
        Assert.assertEquals(1.5,average.getAsDouble(),0);
    }
}
