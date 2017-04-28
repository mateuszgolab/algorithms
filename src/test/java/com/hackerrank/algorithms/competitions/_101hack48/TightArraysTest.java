package com.hackerrank.algorithms.competitions._101hack48;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class TightArraysTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream printStream = new PrintStream(outContent);

    @Before
    public void before() {
        System.setOut(printStream);
    }

    @Test
    public void init() {

        ByteArrayInputStream in = new ByteArrayInputStream("5 7 11".getBytes());
        System.setIn(in);

        TightArrays.main(null);

        assertThat(outContent.toString(), is("7\n"));

    }

    @Test
    public void init2() {

        ByteArrayInputStream in = new ByteArrayInputStream("3 1 2".getBytes());
        System.setIn(in);

        TightArrays.main(null);

        assertThat(outContent.toString(), is("4\n"));

    }

    @Test
    public void init3() {

        ByteArrayInputStream in = new ByteArrayInputStream("5 7 11".getBytes());
        System.setIn(in);

        TightArrays.main(null);

        assertThat(outContent.toString(), is("7\n"));

    }

    @Test
    public void min() {

        ByteArrayInputStream in = new ByteArrayInputStream("1 1 1".getBytes());
        System.setIn(in);

        TightArrays.main(null);

        assertThat(outContent.toString(), is("1\n"));

    }

    @Test
    public void max() {

        ByteArrayInputStream in = new ByteArrayInputStream("100 1 100".getBytes());
        System.setIn(in);

        TightArrays.main(null);

        assertThat(outContent.toString(), is("199\n"));

    }

}