package com.google.codejam._2020._1c;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class OverexcitedFanTest {


    @Test
    public void testExample1() {

        String result = OverexcitedFan.path(4, 4, "SSSS");
        assertThat(result, is("4"));

    }


    @Test
    public void testExample2() {

        String result = OverexcitedFan.path(3, 0, "SNSS");
        assertThat(result, is("IMPOSSIBLE"));

    }

    @Test
    public void testExample3() {

        String result = OverexcitedFan.path(2, 10, "NSNNSN");
        assertThat(result, is("IMPOSSIBLE"));

    }


    @Test
    public void testExample4() {

        String result = OverexcitedFan.path(0, 1, "S");
        assertThat(result, is("1"));

    }


    @Test
    public void testExample5() {

        String result = OverexcitedFan.path(2, 7, "SSSSSSSS");
        assertThat(result, is("5"));

    }

    @Test
    public void testExample6() {

        String result = OverexcitedFan.path(3, 2, "SSSW");
        assertThat(result, is("4"));

    }

    @Test
    public void testExample7() {

        String result = OverexcitedFan.path(4, 0, "NESW");
        assertThat(result, is("4"));

    }

    @Test
    public void testExample8() {

        String result = OverexcitedFan.path(400, 0, "EEEEEEE");
        assertThat(result, is("IMPOSSIBLE"));

    }

    @Test
    public void testExample9() {

        String result = OverexcitedFan.path(10, 0, "WWWWW");
        assertThat(result, is("5"));

    }


}