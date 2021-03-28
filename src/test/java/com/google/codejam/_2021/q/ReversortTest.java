package com.google.codejam._2021.q;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ReversortTest {

    @Test
    public void testExample() {

        assertThat(Reversort.reversort(new int[]{4, 2, 1, 3}), is(6));
        assertThat(Reversort.reversort(new int[]{1, 2}), is(1));
        assertThat(Reversort.reversort(new int[]{7, 6, 5, 4, 3, 2, 1}), is(12));
        assertThat(Reversort.reversort(new int[]{1, 2}), is(1));
        assertThat(Reversort.reversort(new int[]{2, 1}), is(2));
        assertThat(Reversort.reversort(new int[]{7, 2, 5, 3, 4, 6, 1}), is(18));
        assertThat(Reversort.reversort(new int[]{7, 2, 5, 4, 3, 6, 1}), is(18));
        assertThat(Reversort.reversort(new int[]{4, 2, 3, 1}), is(7));
        assertThat(Reversort.reversort(new int[]{1, 2, 3, 4}), is(3));
        assertThat(Reversort.reversort(new int[]{4, 3, 2, 1}), is(6));
        assertThat(Reversort.reversort(new int[]{7, 4, 5, 6, 3, 2, 1}), is(14));
        assertThat(Reversort.reversort(new int[]{4, 3, 2, 1}), is(6));
        assertThat(Reversort.reversort(new int[]{3, 2, 1, 4}), is(5));
        assertThat(Reversort.reversort(new int[]{3, 2, 1, 4}), is(5));
        assertThat(Reversort.reversort(new int[]{1, 3, 5, 6, 2, 7, 4}), is(16));
        assertThat(Reversort.reversort(new int[]{7, 2, 3, 4, 5, 6, 1}), is(16));
        assertThat(Reversort.reversort(new int[]{7 ,4 ,5 ,1, 6, 2, 3}), is(19));
        assertThat(Reversort.reversort(new int[]{7, 2, 4, 3, 5, 6, 1}), is(17));
        assertThat(Reversort.reversort(new int[]{6, 4, 1, 3, 7, 5, 2}), is(19));
        assertThat(Reversort.reversort(new int[]{7, 2, 3, 6, 5, 1, 4}), is(19));
        assertThat(Reversort.reversort(new int[]{5, 7, 3, 4, 1, 6, 2}), is(22));
        assertThat(Reversort.reversort(new int[]{2, 4, 6, 7, 5, 3, 1}), is(27));

    }


}