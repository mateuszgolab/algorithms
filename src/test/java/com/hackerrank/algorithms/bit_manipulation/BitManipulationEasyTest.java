package com.hackerrank.algorithms.bit_manipulation;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BitManipulationEasyTest {

    @Test
    public void testLonelyInteger() {

        assertThat(BitManipulationEasy.lonelyinteger(new int[]{1}), is(1));
        assertThat(BitManipulationEasy.lonelyinteger(new int[]{1,1,2}), is(2));
        assertThat(BitManipulationEasy.lonelyinteger(new int[]{0,0,1,2,1}), is(2));

    }


}