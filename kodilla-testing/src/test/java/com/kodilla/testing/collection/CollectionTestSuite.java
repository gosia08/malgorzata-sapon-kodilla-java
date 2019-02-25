package com.kodilla.testing.collection;

import org.junit.Before;

    import org.junit.*;
    import java.util.*;


    public class CollectionTestSuite {
        @Before
        public void before(){
            System.out.println("Test case: begin");

    }
        @After
        public void after(){
            System.out.println("Test case: end");
        }
        @Test
        public void testOddNumbersExterminatorEmptyList(){
            //Given
            ArrayList<Integer>emptyList = new ArrayList<Integer>();
            //When
            ArrayList<Integer>listNumbers = OddNumbersExterminator.exterminate(emptyList);
            System.out.println("Testing" + listNumbers);
            //Then
            Assert.assertTrue(emptyList.isEmpty());
        }
        @Test
        public void testOddNumbersExterminatorNormalList(){
            //Given
            ArrayList<Integer>list = new ArrayList<Integer>(Arrays.asList(2,11,35,8,52,3));
            ArrayList<Integer>oddList = new ArrayList<Integer>(Arrays.asList(2,8,52));
            //When
            ArrayList<Integer>listNumbers = OddNumbersExterminator.exterminate(list);
            System.out.println("Testing" + listNumbers);
            //Then
            Assert.assertEquals(oddList,listNumbers );
        }
}
