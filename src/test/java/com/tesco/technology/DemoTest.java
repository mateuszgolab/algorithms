package com.tesco.technology;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class DemoTest {


    @Test
    public void test1() {

        int[] data = {-1, 3, -4, 5, 1, -6, 2, 1};

        Demo test = new Demo();

        assertThat(test.solution(data), is((1)));

    }


    @Test
    public void test2() {

        int[] data = {0, 3, -3};

        Demo test = new Demo();

        assertThat(test.solution(data), is((0)));

    }

    @Test
    public void test3() {

        int[] data = {1, 2, 3, 4, 1, 2, 3};

        Demo test = new Demo();

        assertThat(test.solution(data), is((3)));

    }

    @Test
    public void test4() {

        int[] data = {1, 2, 3, 4, 5, 2, 3};

        Demo test = new Demo();

        assertThat(test.solution(data), is((-1)));

    }

    @Test
    public void test5() {

        int[] data = {1, 2, 3, -1, -3, -2, 5};

        Demo test = new Demo();

        assertThat(test.solution(data), is((6)));

    }


}