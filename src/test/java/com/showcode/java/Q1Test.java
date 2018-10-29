package com.showcode.java;

import com.showcode.java.Q1;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q1Test {


    @Test
    public void test1()
    {
        assertEquals(Q1.BalancePoint(new int[] { 2, 7, 4, 5, -3, 8, 9, -1 }), 3);
    }

    @Test
    public void test2()
    {
        assertEquals(Q1.BalancePoint(new int[] { 2, 7, 4, 5, -3, 8, 9}), -1);
    }

    @Test
    public void test3()
    {
        assertEquals(Q1.BalancePoint(new int[] { 2, -4, 4}), 0);
    }

    @Test
    public void test4()
    {
        assertEquals(Q1.BalancePoint(new int[] { 2, -4, 4,-2,8}), 4);
    }


    @Test
    public void test5()
    {
        assertEquals(Q1.BalancePoint(new int[] { 2}), 0);
    }

    @Test
    public void test6()
    {
        assertEquals(Q1.BalancePoint(new int[] { }), -1);
    }


}