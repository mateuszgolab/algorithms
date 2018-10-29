package com.hackerrank.algorithms.implementation;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class DayOfTheProgrammerTest {


    @Test
    public void test1() {

        assertThat(DayOfTheProgrammer.dayOfProgrammer(2016), is("12.09.2016"));
        assertThat(DayOfTheProgrammer.dayOfProgrammer(2017), is("13.09.2017"));
        assertThat(DayOfTheProgrammer.dayOfProgrammer(1800), is("12.09.1800"));
        assertThat(DayOfTheProgrammer.dayOfProgrammer(1918), is("26.09.1918"));
        assertThat(DayOfTheProgrammer.dayOfProgrammer(2000), is("12.09.2000"));

    }


}