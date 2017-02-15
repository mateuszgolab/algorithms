package com.codility.lessons.lesson4;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class MissingIntegerTest {

    private MissingInteger missingInteger = new MissingInteger();

    @Test
    public void testInit() {

        assertThat(missingInteger.solution(new int[]{3,1,2,4,3}), is(5));

    }

    @Test
    public void testMin() {

        assertThat(missingInteger.solution(new int[]{1}), is(2));

    }

    @Test
    public void testMax() {

        int[] array = new int[100000];

        for(int i = 0; i < 100000; i++) {
            array[i] = i+1;
        }

        assertThat(missingInteger.solution(array), is(100001));

    }

    @Test
    public void testMaxInts() {

        int[] array = new int[10];

        for(int i = 0; i < 10; i++) {
            array[i] = Integer.MAX_VALUE;
        }

        assertThat(missingInteger.solution(array), is(1));

    }

    @Test
    public void testMaxNegative() {

        int[] array = new int[10];

        for(int i = 0; i < 10; i++) {
            array[i] = Integer.MIN_VALUE;
        }

        assertThat(missingInteger.solution(array), is(1));

    }

}