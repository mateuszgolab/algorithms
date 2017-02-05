package com.tesco.technology;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class Task1Test {

    @Test
    public void test1() {


        Task1 task = new Task1();

        assertThat(task.solution("011100"), is(7));
        assertThat(task.solution("0111001"), is(9));
        assertThat(task.solution("10001"), is(6));
        assertThat(task.solution("10101"), is(7));
        assertThat(task.solution("00000"), is(0));
        assertThat(task.solution("1000000"), is(7));
        assertThat(task.solution("11110100001001000000"), is(26));
        assertThat(task.solution("100000000000000000000000000000000"), is(33));
        assertThat(task.solution("111111111111111111111111111111111"), is(65));
        assertThat(task.solution("1"), is(1));

    }

    @Test
    public void test2() {


        Task1 task = new Task1();

        assertThat(task.solution("11111"), is(9));

    }

}