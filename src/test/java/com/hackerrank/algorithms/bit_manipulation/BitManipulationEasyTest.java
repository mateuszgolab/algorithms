package com.hackerrank.algorithms.bit_manipulation;

import org.junit.Test;

import static com.hackerrank.algorithms.bit_manipulation.BitManipulationEasy.*;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BitManipulationEasyTest {

    @Test
    public void testLonelyInteger() {

        assertThat(lonelyinteger(new int[]{1}), is(1));
        assertThat(lonelyinteger(new int[]{1,1,2}), is(2));
        assertThat(lonelyinteger(new int[]{0,0,1,2,1}), is(2));

    }


    @Test
    public void testMaximizingXor() {

        assertThat(maximizingXor(11,12), is(7));
        assertThat(maximizingXor(10,15), is(7));
        assertThat(maximizingXor(11,100), is(127));

    }

    @Test
    public void testSumVsXor() {

        assertThat(sumXor(4), is(4L));
        assertThat(sumXor(5), is(2L));
        assertThat(sumXor(10), is(4L));
        assertThat(sumXor(0), is(1L));
        assertThat(sumXor(1), is(1L));
        assertThat(sumXor(2), is(2L));
        assertThat(sumXor(8), is(8L));
        assertThat(sumXor(128), is(128L));

    }

}