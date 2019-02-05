package com.hackerrank.algorithms.sorting;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

import static com.hackerrank.algorithms.sorting.SortingEasy.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class SortingEasyTest {


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

    @Test
    public void testQuickSort1() {

        assertThat(quickSort(new int[]{4, 5, 3, 7, 2}), is(new int[]{3, 2, 4, 5, 7}));
        assertThat(quickSort(new int[]{4, 5, 13, 17, 20}), is(new int[]{4, 5, 13, 17, 20}));
        assertThat(quickSort(new int[]{40, 35, 33, 27, 20}), is(new int[]{35, 33, 27, 20, 40}));

    }

    @Test
    public void testCountingSort1() {

        assertThat(countingSort(new int[]{63, 25, 73, 1, 98, 73, 56, 84, 86, 57, 16, 83, 8, 25, 81, 56, 9, 53, 98, 67, 99, 12, 83, 89, 80, 91, 39, 86, 76, 85, 74, 39, 25, 90, 59, 10, 94, 32, 44, 3, 89, 30, 27, 79, 46, 96, 27, 32, 18, 21, 92, 69, 81, 40, 40, 34, 68, 78, 24, 87, 42, 69, 23, 41, 78, 22, 6, 90, 99, 89, 50, 30, 20, 1, 43, 3, 70, 95, 33, 46, 44, 9, 69, 48, 33, 60, 65, 16, 82, 67, 61, 32, 21, 79, 75, 75, 13, 87, 70, 33}),
                is(new int[]{0, 2, 0, 2, 0, 0, 1, 0, 1, 2, 1, 0, 1, 1, 0, 0, 2, 0, 1, 0, 1, 2, 1, 1, 1, 3, 0, 2, 0, 0, 2, 0, 3, 3, 1, 0, 0, 0, 0, 2, 2, 1, 1, 1, 2, 0, 2, 0, 1, 0, 1, 0, 0, 1, 0, 0, 2, 1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 2, 1, 3, 2, 0, 0, 2, 1, 2, 1, 0, 2, 2, 1, 2, 1, 2, 1, 1, 2, 2, 0, 3, 2, 1, 1, 0, 1, 1, 1, 0, 2, 2}));

    }


}