package com.kodilla.testing.collection;

import org.junit.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertTrue;

public class CollectionTestSuite {


    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator(new ArrayList<>());
        //when
        List<Integer> result = oddNumbersExterminator.exterminate();
        //Then
        assertTrue(result.size() == 0);
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Gven
        List<Integer> allList = Arrays.asList(1, 2, 3, 4, 5, 6, 22, 46, 849, 9283, 34, 254, 77, 505, 39, 238, 457, 7, 9696, 347, 6856, 3934, 75, 374, 239, 347, 54, 56);
        List<Integer> evenList = Arrays.asList(2, 4, 6, 22, 46, 34, 254, 238, 9696, 6856, 3934, 374, 54, 56);
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator(allList);
        //When
        List<Integer> result = oddNumbersExterminator.exterminate();
        //Then
        assertThat(result, is(evenList));
    }
}
