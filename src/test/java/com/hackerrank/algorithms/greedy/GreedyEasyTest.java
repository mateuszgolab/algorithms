package com.hackerrank.algorithms.greedy;

import org.junit.Test;

import static com.hackerrank.algorithms.greedy.GreedyEasy.minimumAbsoluteDifference;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GreedyEasyTest {

    @Test
    public void testMinimumAbsoluteDifference() {

        assertThat(minimumAbsoluteDifference(new int[]{-1, 2, 4}), is(2));
        assertThat(minimumAbsoluteDifference(new int[]{3, -7, 0}), is(3));
        assertThat(minimumAbsoluteDifference(new int[]{-59, -36, -13, 1, -53, -92, -2, -96, -54, 75}), is(1));
        assertThat(minimumAbsoluteDifference(new int[]{1, -3, 71, 68, 17}), is(3));

    }


}