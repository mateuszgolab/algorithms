package com.codility.lessons.lesson1;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;


public class BinaryGapTest {

    private BinaryGap solution = new BinaryGap();

    @Test
    public void test9() {
        assertThat(solution.solution(9), is(2));
    }

    @Test
    public void test529() {
        assertThat(solution.solution(529), is(4));
    }

    @Test
    public void test20() {
        assertThat(solution.solution(20), is(1));
    }

    @Test
    public void test1041() {
        assertThat(solution.solution(1041), is(5));
    }

    @Test
    public void test15() {
        assertThat(solution.solution(15), is(0));
    }

    @Test
    public void testMaxInt() {
        assertThat(solution.solution(2147483647), is(0));
    }

    @Test
    public void testMin() {
        assertThat(solution.solution(1), is(0));
    }

    @Test
    public void test3() {
        assertThat(solution.solution(3), is(0));
    }

    @Test
    public void testLongestGap() {
        assertThat(solution.solution(1073741825), is(29));
    }


    @Test
    public void test6() {
        assertThat(solution.solution(6), is(0));
    }

    @Test
    public void test328() {
        assertThat(solution.solution(328), is(2));
    }

    @Test
    public void test1162() {
        assertThat(solution.solution(1162), is(3));
    }

    @Test
    public void testNotResetting1() {
        assertThat(solution.solution(51712), is(2));
        assertThat(solution.solution(66561), is(9));
        assertThat(solution.solution(6291457), is(20));
        assertThat(solution.solution(805306373), is(25));
    }

}
