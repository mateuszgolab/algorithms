package com.hackerrank.algorithms.search;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static com.hackerrank.algorithms.search.SearchEasy.*;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class SearchEasyTest {

    @Test
    public void testIceCreamParlor() {

        assertThat(icecreamParlor(4, new int[]{1, 4, 5, 3, 2}), is(new int[]{1, 4}));
        assertThat(icecreamParlor(4, new int[]{2, 2, 4, 3}), is(new int[]{1, 2}));
        assertThat(icecreamParlor(1, new int[]{2, 2, 4, 3}), is(new int[]{}));
        assertThat(icecreamParlor(10, new int[]{2, 2, 4, 3}), is(new int[]{}));
        assertThat(icecreamParlor(4, new int[]{2, 2, 2, 2}), is(new int[]{1, 2}));
        assertThat(icecreamParlor(4, new int[]{2, 3, 5}), is(new int[]{}));

    }

    @Test
    public void testMissingNumbers() {

        assertThat(missingNumbers(new int[]{7, 2, 5, 3, 5, 3}, new int[]{7, 2, 5, 4, 6, 3, 5, 3}), is(new int[]{4, 6}));
        assertThat(missingNumbers(new int[]{203, 204, 205, 206, 207, 208, 203, 204, 205, 206}, new int[]{203, 204, 204, 205, 206, 207, 205, 208, 203, 206, 205, 206, 204}), is(new int[]{204, 205, 206}));
        assertThat(missingNumbers(new int[]{203}, new int[]{203}), is(new int[]{}));
        assertThat(missingNumbers(new int[]{203}, new int[]{204}), is(new int[]{204}));

    }

    @Test
    public void testSherlockAndArray() {

        assertThat(balancedSums(Arrays.asList(1,2,3)), is("NO"));
        assertThat(balancedSums(Arrays.asList(1,2,3,3)), is("YES"));
        assertThat(balancedSums(Collections.singletonList(1)), is("YES"));
        assertThat(balancedSums(Arrays.asList(1,1,4,1,1)), is("YES"));
        assertThat(balancedSums(Arrays.asList(2,0,0,0)), is("YES"));
        assertThat(balancedSums(Arrays.asList(0,0,2,0)), is("YES"));
        assertThat(balancedSums(Arrays.asList(0,4,2,0)), is("NO"));

    }

}