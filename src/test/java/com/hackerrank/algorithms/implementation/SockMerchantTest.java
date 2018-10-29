package com.hackerrank.algorithms.implementation;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class SockMerchantTest {

    @Test
    public void test1() {

        assertThat(SockMerchant.sockMerchant(9, new int[]{10, 20, 20, 10, 10, 30, 50, 10, 20}), is(3));

    }


}