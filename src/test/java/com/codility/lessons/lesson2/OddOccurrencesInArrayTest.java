package com.codility.lessons.lesson2;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class OddOccurrencesInArrayTest {

    private OddOccurrencesInArray solution = new OddOccurrencesInArray();

    @Test
    public void testInit() {
        assertThat(solution.solution(new int[]{9, 3, 9, 3, 9, 7, 9}), is(7));
    }

    @Test
    public void test2() {
        assertThat(solution.solution(new int[]{9, 9, 9, 3, 3, 7, 7}), is(9));
    }

    @Test
    public void testSingle() {
        assertThat(solution.solution(new int[]{9}), is(9));
    }

    @Test
    public void testTheSameValue() {
        assertThat(solution.solution(new int[]{9, 9, 9, 9, 9, 9, 7}), is(7));
    }

}