package com.google.codejam._2021.q;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ReversortEngineeringTest {

    @Test
    public void testExample() {

        assertThat(ReversortEngineering.reversortEng(4, 6), is("4 3 2 1"));
        assertThat(ReversortEngineering.reversortEng(2, 1), is("1 2"));

    }

    @Test
    public void testExample2() {

        assertThat(ReversortEngineering.reversortEng(7, 12), is("7 6 5 4 3 2 1"));
        assertThat(ReversortEngineering.reversortEng(7, 2), is("IMPOSSIBLE"));
        assertThat(ReversortEngineering.reversortEng(2, 1000), is("IMPOSSIBLE"));
    }

    @Test
    public void testExample3() {

        assertThat(ReversortEngineering.reversortEng(7, 12), is("7 6 5 4 3 2 1"));
    }

    @Test
    public void testExample4() {

        assertThat(ReversortEngineering.reversortEng(7, 18), is("7 2 5 4 3 6 1"));
//        assertThat(ReversortEngineering.reversortEng(7, 19), is("6 4 1 3 7 5 2"));
        assertThat(ReversortEngineering.reversortEng(5, 15), is("IMPOSSIBLE"));
        assertThat(ReversortEngineering.reversortEng(6, 21), is("IMPOSSIBLE"));
        assertThat(ReversortEngineering.reversortEng(7, 28), is("IMPOSSIBLE"));

    }

}