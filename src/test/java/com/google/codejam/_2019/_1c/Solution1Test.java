package com.google.codejam._2019._1c;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class Solution1Test {


    @Test
    public void test1() {

        assertThat(Solution1.robotProgrammingStrategy(Arrays.asList("RS", "SR", "RS")), is("RR"));
        assertThat(Solution1.robotProgrammingStrategy(Arrays.asList("RS", "SR", "RR")), is("RRP"));
        assertThat(Solution1.robotProgrammingStrategy(Collections.singletonList("RS")), is("P"));
        assertThat(Solution1.robotProgrammingStrategy(Arrays.asList("R", "P", "S")), is("IMPOSSIBLE"));
        assertThat(Solution1.robotProgrammingStrategy(Arrays.asList("RS", "RS", "RS", "RS", "RS", "RS", "RS", "RS")), is("P"));
        assertThat(Solution1.robotProgrammingStrategy(Arrays.asList("RSP", "RSP", "RSP")), is("P"));
        assertThat(Solution1.robotProgrammingStrategy(Arrays.asList("RRS", "RSR", "SRR")), is("RRR"));

    }


}