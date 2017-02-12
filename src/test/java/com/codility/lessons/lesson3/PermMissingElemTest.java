package com.codility.lessons.lesson3;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class PermMissingElemTest {

    private PermMissingElem elem = new PermMissingElem();

    @Test
    public void testInit() {

        assertThat(elem.solution(new int[]{2,3,1,5}), is(4));

    }

    @Test
    public void testLowBound() {

        assertThat(elem.solution(new int[]{}), is(1));

    }

    @Test
    public void testLowBound2() {

        assertThat(elem.solution(new int[]{2}), is(1));
        assertThat(elem.solution(new int[]{1}), is(2));

    }

    @Test
    public void testUpperBound() {

        int[] array = new int[100000];
        for(int i = 1; i <= 100000; i++) {
            array[i - 1] = i;
        }

        assertThat(elem.solution(array), is(100001));

    }

    @Test
    public void testUpperBound2() {

        int[] array = new int[100000];
        for(int i = 2; i <= 100001; i++) {
            array[i - 2] = i;
        }

        assertThat(elem.solution(array), is(1));

    }

    @Test
    public void testUpperBound3() {

        int[] array = new int[100000];
        for(int i = 100001, j = 0; i > 1 ; i--, j++) {
            array[j] = i;
        }

        assertThat(elem.solution(array), is(1));

    }



}