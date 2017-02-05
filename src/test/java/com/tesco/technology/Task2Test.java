package com.tesco.technology;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class Task2Test {

    private Task2 task2 = new Task2();

    @Test
    public void test1() {

        assertThat(task2.solution("A2Le", "2pL1"), is(true));

    }

    @Test
    public void test2() {

        assertThat(task2.solution("a10", "10a"), is(true));


    }

    @Test
    public void test3() {

        assertThat(task2.solution("ba1", "1Ad"), is(false));

    }

    @Test
    public void test4() {

        assertThat(task2.solution("3x2x", "8"), is(false));

    }

    @Test
    public void test5() {

        assertThat(task2.solution("AAA", "aaa"), is(false));

    }


}

