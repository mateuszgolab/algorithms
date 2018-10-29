package com.showcode.java;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class Q3Test {

    @Test
    public void Test1()
    {
        Q3 Q3 = new Q3();

        assertEquals(Q3.SplitArray(new int[] { 1, 3, 3, 4, 5 }), true);
    }

    @Test
    public void Test2()
    {
        Q3 Q3 = new Q3();

        assertEquals(Q3.SplitArray(new int[] { 2, 4, 5, 6 }), false);
    }

    @Test
    public void Test3()
    {
        Q3 Q3 = new Q3();

        assertEquals(Q3.SplitArray(new int[] { 2, 4, 5, 6, 5 }), true);
    }

    @Test
    public void Test4()
    {
        Q3 Q3 = new Q3();

        assertEquals(Q3.SplitArray(new int[] { 1, 3, 2, 8 }), false);
    }

    @Test
    public void Test5()
    {
        Q3 Q3 = new Q3();

        assertEquals(Q3.SplitArray(new int[] { 1, 2, 7, 8 }), true);
    }

    @Test
    public void Test6()
    {
        Q3 Q3 = new Q3();
        Random random = new Random();

        int x = 100000000;

        int[] input = new int[x];
        for(int i = 0; i < x; i++) {
            input[i] = random.nextInt(1000);
        }

        assertEquals(Q3.SplitArray(input), true);
    }
    
}