package com.google.codejam._2020.q;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class NestingDepthTest {

    @Test
    public void testExample(){

        assertThat(NestingDepth.nesting("0000"), is("0000"));
        assertThat(NestingDepth.nesting("101"), is("(1)0(1)"));
        assertThat(NestingDepth.nesting("111000"), is("(111)000"));
        assertThat(NestingDepth.nesting("1"), is("(1)"));
        assertThat(NestingDepth.nesting("021"), is("0((2)1)"));
        assertThat(NestingDepth.nesting("312"), is("(((3))1(2))"));
        assertThat(NestingDepth.nesting("221"), is("((22)1)"));

    }

}