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

    @Test
    public void testFlippingBits() {

        assertThat(flippingBits(9), is(4294967286L));
        assertThat(flippingBits(2147483647), is(2147483648L));
        assertThat(flippingBits(1), is(4294967294L));
        assertThat(flippingBits(4), is(4294967291L));
        assertThat(flippingBits(123456), is(4294843839L));
        assertThat(flippingBits(0), is(4294967295L));
        assertThat(flippingBits(802743475), is(3492223820L));
        assertThat(flippingBits(35601423), is(4259365872L));

    }


}