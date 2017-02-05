package com.codility.lessons.lesson3;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class FrogJmpTest {

    private FrogJmp frogJmp = new FrogJmp();

    @Test
    public void testExample() {
        assertThat(frogJmp.solution(10, 85, 30), is(3));
    }

    @Test
    public void testExactD() {
        assertThat(frogJmp.solution(10, 90, 10), is(8));
    }

    @Test
    public void testNoJump() {
        assertThat(frogJmp.solution(10, 10, 10), is(0));
    }

    @Test
    public void testBigN() {
        assertThat(frogJmp.solution(1, 1000000000, 999999999), is(1));
        assertThat(frogJmp.solution(1, 1000000000, 99999999), is(11));
    }

}