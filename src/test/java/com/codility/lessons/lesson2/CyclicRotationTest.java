package com.codility.lessons.lesson2;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class CyclicRotationTest {

    private CyclicRotation solution = new CyclicRotation();

    @Test
    public void testInit() {
        assertThat(solution.solution(new int[]{3, 8, 9, 7, 6}, 1), is(new int[]{6, 3, 8, 9, 7}));
    }

    @Test
    public void testNoRotation() {
        assertThat(solution.solution(new int[]{3, 8, 9, 7, 6}, 0), is(new int[]{3, 8, 9, 7, 6}));
    }

    @Test
    public void testEmpty() {
        assertThat(solution.solution(new int[]{}, 0), is(new int[]{}));
    }

    @Test
    public void testEmptyWithRotation() {
        assertThat(solution.solution(new int[]{}, 10), is(new int[]{}));
    }

    @Test
    public void testFullRotation() {
        assertThat(solution.solution(new int[]{3, 8, 9, 7, 6}, 5), is(new int[]{3, 8, 9, 7, 6}));
    }

    @Test
    public void testDoubleRotation() {
        assertThat(solution.solution(new int[]{3, 8, 9, 7, 6}, 10), is(new int[]{3, 8, 9, 7, 6}));
    }

    @Test
    public void testManyRotation() {
        assertThat(solution.solution(new int[]{3, 8, 9, 7, 6}, 11), is(new int[]{6, 3, 8, 9, 7}));
    }

    @Test
    public void testMaxRotation()
    {
        assertThat(solution.solution(new int[]{3, 8, 9, 7, 6}, 4), is(new int[]{8, 9, 7, 6, 3}));
    }


}