package com.hackerrank.algorithms.dynamic_programming;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class EqualTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream printStream = new PrintStream(outContent);

    @Before
    public void before() {
        System.setOut(printStream);
    }

    @Test
    public void init() {

        ByteArrayInputStream in = new ByteArrayInputStream("1\n4\n2 2 3 7".getBytes());
        System.setIn(in);

        Equal.main(null);

        assertThat(outContent.toString(), is("2\n"));

    }

    @Test
    public void sorted() {

        ByteArrayInputStream in = new ByteArrayInputStream("1\n5\n1 2 3 4 5".getBytes());
        System.setIn(in);

        Equal.main(null);

        assertThat(outContent.toString(), is("6\n"));

    }

    @Test
    public void unSorted() {

        ByteArrayInputStream in = new ByteArrayInputStream("1\n5\n5 4 3 2 1".getBytes());
        System.setIn(in);

        Equal.main(null);

        assertThat(outContent.toString(), is("6\n"));

    }

    @Test
    public void all() {

        ByteArrayInputStream in = new ByteArrayInputStream("2\n5\n1 2 3 4 5\n4\n2 2 3 7".getBytes());
        System.setIn(in);

        Equal.main(null);

        assertThat(outContent.toString(), is("6\n2\n"));

    }

    @Test
    public void same() {

        ByteArrayInputStream in = new ByteArrayInputStream("1\n5\n1 1 1 1 1".getBytes());
        System.setIn(in);

        Equal.main(null);

        assertThat(outContent.toString(), is("0\n"));

    }

    @Test
    public void single() {

        ByteArrayInputStream in = new ByteArrayInputStream("1\n1\n1".getBytes());
        System.setIn(in);

        Equal.main(null);

        assertThat(outContent.toString(), is("0\n"));

    }

    @Test
    public void two() {

        ByteArrayInputStream in = new ByteArrayInputStream("1\n2\n1 7".getBytes());
        System.setIn(in);

        Equal.main(null);

        assertThat(outContent.toString(), is("2\n"));

    }

    @Test
    public void two2() {

        ByteArrayInputStream in = new ByteArrayInputStream("1\n2\n1 9".getBytes());
        System.setIn(in);

        Equal.main(null);

        assertThat(outContent.toString(), is("3\n"));

    }

    @Test
    public void test3() {

        ByteArrayInputStream in = new ByteArrayInputStream("1\n3\n1 5 11".getBytes());
        System.setIn(in);

        Equal.main(null);

        assertThat(outContent.toString(), is("4\n"));

    }

    @Test
    public void test4() {

        ByteArrayInputStream in = new ByteArrayInputStream("1\n5\n1 2 3 4 4".getBytes());
        System.setIn(in);

        Equal.main(null);

        assertThat(outContent.toString(), is("6\n"));

    }

    @Test
    public void test5() {

        ByteArrayInputStream in = new ByteArrayInputStream("1\n5\n1 6 7 7 7".getBytes());
        System.setIn(in);

        Equal.main(null);

        assertThat(outContent.toString(), is("7\n"));

    }

    @Test
    public void full() {

        StringBuilder input = new StringBuilder("1\n10000\n");
        for (int i = 0; i < 10000; i++) {
            input.append(i % 1000).append(1).append(" ");
        }

        ByteArrayInputStream in = new ByteArrayInputStream(input.toString().getBytes());
        System.setIn(in);

        Equal.main(null);

        assertThat(outContent.toString(), is("1007000\n"));

    }

    @Test
    public void fullRange() {

        ByteArrayInputStream in = new ByteArrayInputStream("1\n2\n1 10000".getBytes());
        System.setIn(in);

        Equal.main(null);

        assertThat(outContent.toString(), is("2001\n"));

    }

    @Test
    public void repeat() {

        ByteArrayInputStream in = new ByteArrayInputStream("1\n5\n1 3 3 3 3".getBytes());
        System.setIn(in);

        Equal.main(null);

        assertThat(outContent.toString(), is("4\n"));

    }

    @Test
    public void optimal() {

        ByteArrayInputStream in = new ByteArrayInputStream("1\n5\n2 4 5 10 10".getBytes());
        System.setIn(in);

        Equal.main(null);

        assertThat(outContent.toString(), is("8\n"));

    }

    @Test
    public void optimal2() {

        ByteArrayInputStream in = new ByteArrayInputStream("1\n3\n3 7 7".getBytes());
        System.setIn(in);

        Equal.main(null);

        assertThat(outContent.toString(), is("3\n"));

    }


}