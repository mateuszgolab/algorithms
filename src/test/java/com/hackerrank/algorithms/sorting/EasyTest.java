package com.hackerrank.algorithms.sorting;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

import static com.hackerrank.algorithms.sorting.Easy.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class EasyTest {


    @Test
    public void testBigSorting() {

        assertThat(bigSorting(new String[]{"31415926535897932384626433832795", "1", "3", "10", "3", "5"}),
                is(new String[]{"1", "3", "3", "5", "10", "31415926535897932384626433832795"}));

        assertThat(bigSorting(new String[]{"1", "2", "100", "12303479849857341718340192371", "3084193741082937", "3084193741082938", "111", "200"}),
                is(new String[]{"1", "2", "100", "111", "200", "3084193741082937", "3084193741082938", "12303479849857341718340192371"}));


    }

    @Test
    public void testBigSorting2() {

        Random random = new Random();

        String[] input = new String[100000];
        for (int i = 0; i < 100000; i++) {

            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < 10000; j++) {
                sb.append(random.nextInt(10));
            }

            input[i] = sb.toString();
        }

        assertThat(bigSorting(input).length, is(100000));


    }

    @Test
    public void testInsertionSort1() {

        assertThat(insertionSort1(5, new int[]{2, 4, 6, 8, 3}),
                is(Arrays.asList(
                        Arrays.asList(2, 4, 6, 8, 8),
                        Arrays.asList(2, 4, 6, 6, 8),
                        Arrays.asList(2, 4, 4, 6, 8),
                        Arrays.asList(2, 3, 4, 6, 8))));

        assertThat(insertionSort1(1, new int[]{2}),
                is(Collections.singletonList(Collections.singletonList(2))));

        assertThat(insertionSort1(2, new int[]{2, 3}),
                is(Collections.singletonList(Arrays.asList(2, 3))));

        assertThat(insertionSort1(2, new int[]{3, 2}),
                is(Arrays.asList(
                        Arrays.asList(3, 3),
                        Arrays.asList(2, 3))));

    }

    @Test
    public void testInsertionSort2() {

        assertThat(insertionSort2(3, new int[]{4, 3, 1}),
                is(Arrays.asList(
                        Arrays.asList(3, 4, 1),
                        Arrays.asList(1, 3, 4))));


        assertThat(insertionSort2(2, new int[]{4, 1}),
                is(Collections.singletonList(
                        Arrays.asList(1, 4))));

        assertThat(insertionSort2(2, new int[]{1, 4}),
                is(Collections.singletonList(
                        Arrays.asList(1, 4))));

        assertThat(insertionSort2(6, new int[]{1, 4, 3, 5, 6, 2}),
                is(Arrays.asList(
                        Arrays.asList(1, 4, 3, 5, 6, 2),
                        Arrays.asList(1, 3, 4, 5, 6, 2),
                        Arrays.asList(1, 3, 4, 5, 6, 2),
                        Arrays.asList(1, 3, 4, 5, 6, 2),
                        Arrays.asList(1, 2, 3, 4, 5, 6))));


    }

    @Test
    public void testRunningTime() {

        assertThat(runningTime(new int[]{2, 1, 3, 1, 2}), is(4));
        assertThat(runningTime(new int[]{1, 2, 3, 4, 5}), is(0));


    }

}