package com.showcode.jadore_java;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q2FindTripletsTest {


    @Test
    public void Test1() {
        assertEquals(Q2FindTriplets.FindTriplets(new int[]{5, 5, 5, 5, 5, 5}), 2);
    }

    @Test
    public void Test2() {
        assertEquals(Q2FindTriplets.FindTriplets(new int[]{4, 3, 3, 3, 6, 1, 1, 1}), 2);
    }

    @Test
    public void Test3() {
        assertEquals(Q2FindTriplets.FindTriplets(new int[]{1, 1, 2, 2, 1}), 0);
    }

    @Test
    public void Test4() {
        assertEquals(Q2FindTriplets.FindTriplets(new int[]{3, 7, 2, 2, 2, 5}), 1);
    }

    @Test
    public void Test5() {
        assertEquals(Q2FindTriplets.FindTriplets(new int[]{5, 5, 5, 6, 5, 5, 5}), 2);
    }

    @Test
    public void Test6() {
        assertEquals(Q2FindTriplets.FindTriplets(new int[]{5, 5, 5, 6, 7, 5, 5, 5}), 2);
    }


}