package com.hackerrank.algorithms.search;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class SearchEasyTest {

    @Test
    public void testIceCreamParlor(){

        assertThat(SearchEasy.icecreamParlor(4, new int[]{1,4,5,3,2}), is(new int[]{1,4}));
        assertThat(SearchEasy.icecreamParlor(4, new int[]{2,2,4,3}), is(new int[]{1,2}));
        assertThat(SearchEasy.icecreamParlor(1, new int[]{2,2,4,3}), is(new int[]{}));
        assertThat(SearchEasy.icecreamParlor(10, new int[]{2,2,4,3}), is(new int[]{}));
        assertThat(SearchEasy.icecreamParlor(4, new int[]{2,2,2,2}), is(new int[]{1,2}));
        assertThat(SearchEasy.icecreamParlor(4, new int[]{2,3,5}), is(new int[]{}));

    }

}