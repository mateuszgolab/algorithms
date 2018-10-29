package com.hackerrank.algorithms.implementation;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class BonApetitTest {

    @Test
    public void test1() {


        assertThat(BonApetit.bonAppetit(Arrays.asList(3,10,2,9), 1, 7), is(0));
        assertThat(BonApetit.bonAppetit(Arrays.asList(3,10,2,9), 1, 12), is(5));


    }

}