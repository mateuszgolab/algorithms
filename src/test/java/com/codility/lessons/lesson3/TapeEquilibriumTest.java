package com.codility.lessons.lesson3;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class TapeEquilibriumTest {

    private TapeEquilibrium tapeEquilibrium = new TapeEquilibrium();

    @Test
    public void testInit() {

        assertThat(tapeEquilibrium.solution(new int[]{3,1,2,4,3}), is(1));

    }

    @Test
    public void testMin() {

        assertThat(tapeEquilibrium.solution(new int[]{1,2}), is(1));

    }

    @Test
    public void testMax() {

        int[] array = new int[100000];

        for(int i = 0; i < 100000; i++) {
            array[i] = 1000;
        }

        assertThat(tapeEquilibrium.solution(array), is(0));

    }

    @Test
    public void testMax2() {

        int[] array = new int[100000];

        for(int i = 0; i < 50000; i++) {
            array[i] = -1000;
        }

        for(int i = 50000; i < 100000; i++) {
            array[i] = 1000;
        }

        assertThat(tapeEquilibrium.solution(array), is(2000));

    }

    @Test
    public void testDouble() {

        assertThat(tapeEquilibrium.solution(new int[]{-1000,1000}), is(2000));

    }

}