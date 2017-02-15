package com.codility.lessons.lesson4;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class PermCheckTest {

    private PermCheck permCheck = new PermCheck();

    @Test
    public void testInit() {

        assertThat(permCheck.solution(new int[]{4,1,3,2}), is(1));
        assertThat(permCheck.solution(new int[]{4,1,3}), is(0));

    }

    @Test
    public void testMin() {

        assertThat(permCheck.solution(new int[]{1}), is(1));
        assertThat(permCheck.solution(new int[]{2}), is(0));

    }


    @Test
    public void testSorted() {

        assertThat(permCheck.solution(new int[]{1,2,3,4,5,6}), is(1));
        assertThat(permCheck.solution(new int[]{5,4,3,2,1}), is(1));

    }

    @Test
    public void testRepeated() {

        assertThat(permCheck.solution(new int[]{1,2,3,3,5,6}), is(0));
        assertThat(permCheck.solution(new int[]{1,3,4,5}), is(0));

    }

    @Test
    public void testOver() {

        assertThat(permCheck.solution(new int[]{1000000000,1000000001,1000000002}), is(0));

    }



}