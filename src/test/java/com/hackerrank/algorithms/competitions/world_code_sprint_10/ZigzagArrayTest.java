package com.hackerrank.algorithms.competitions.world_code_sprint_10;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class ZigzagArrayTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream printStream = new PrintStream(outContent);

    @Before
    public void before() {
        System.setOut(printStream);
    }

    @Test
    public void init() {

        ByteArrayInputStream in = new ByteArrayInputStream("6\n4 2 6 3 10 1".getBytes());
        System.setIn(in);

        ZigzagArray.main(null);

        assertThat(outContent.toString(), is("0\n"));

    }

    @Test
    public void init2() {

        ByteArrayInputStream in = new ByteArrayInputStream("5\n5 2 3 6 1".getBytes());
        System.setIn(in);

        ZigzagArray.main(null);

        assertThat(outContent.toString(), is("1\n"));

    }


    @Test
    public void test1() {

        ByteArrayInputStream in = new ByteArrayInputStream("5\n6 5 4 9 1".getBytes());
        System.setIn(in);

        ZigzagArray.main(null);

        assertThat(outContent.toString(), is("1\n"));

    }

    @Test
    public void test2() {

        ByteArrayInputStream in = new ByteArrayInputStream("6\n9 5 7 8 2 1".getBytes());
        System.setIn(in);

        ZigzagArray.main(null);

        assertThat(outContent.toString(), is("2\n"));

    }


    @Test
    public void test3() {

        ByteArrayInputStream in = new ByteArrayInputStream("2\n4 9".getBytes());
        System.setIn(in);

        ZigzagArray.main(null);

        assertThat(outContent.toString(), is("0\n"));

    }

    @Test
    public void test4() {

        ByteArrayInputStream in = new ByteArrayInputStream("4\n1 2 3 4".getBytes());
        System.setIn(in);

        ZigzagArray.main(null);

        assertThat(outContent.toString(), is("2\n"));

    }


}