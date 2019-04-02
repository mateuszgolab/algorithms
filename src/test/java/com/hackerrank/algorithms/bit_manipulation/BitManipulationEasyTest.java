package com.hackerrank.algorithms.bit_manipulation;

import org.junit.Test;

import static com.hackerrank.algorithms.bit_manipulation.BitManipulationEasy.lonelyinteger;
import static com.hackerrank.algorithms.bit_manipulation.BitManipulationEasy.maximizingXor;
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

}