package com.hackerrank.algorithms.graphs;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class RoadsAndLibrariesTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream printStream = new PrintStream(outContent);

    @Before
    public void before() {
        System.setOut(printStream);
    }

    @Test
    public void init() {

        ByteArrayInputStream in = new ByteArrayInputStream("2\n3 3 2 1\n1 2\n3 1\n2 3\n6 6 2 5\n1 3\n3 4\n2 4\n1 2\n2 3\n5 6".getBytes());
        System.setIn(in);

        RoadsAndLibraries.main(null);

        assertThat(outContent.toString(), is("4\n12\n"));

    }

    @Test
    public void mix() {

        ByteArrayInputStream in = new ByteArrayInputStream("1\n4 4 4 1\n1 2\n2 4\n4 3\n3 1".getBytes());
        System.setIn(in);

        RoadsAndLibraries.main(null);

        assertThat(outContent.toString(), is("7\n"));

    }

    @Test
    public void fourMostConnected() {

        ByteArrayInputStream in = new ByteArrayInputStream("2\n6 5 4 1\n1 2\n2 4\n4 3\n5 4\n4 6\n6 5 2 1\n1 2\n2 4\n4 3\n5 4\n4 6".getBytes());
        System.setIn(in);

        RoadsAndLibraries.main(null);

        assertThat(outContent.toString(), is("9\n7\n"));

    }

    @Test
    public void fourMostConnectedForest() {

        ByteArrayInputStream in = new ByteArrayInputStream("1\n8 6 2 1\n1 2\n2 4\n4 3\n5 4\n4 6\n7 8".getBytes());
        System.setIn(in);

        RoadsAndLibraries.main(null);

        assertThat(outContent.toString(), is("10\n"));

    }

    @Test
    public void disconnected() {

        ByteArrayInputStream in = new ByteArrayInputStream("1\n2 0 5 1\n".getBytes());
        System.setIn(in);

        RoadsAndLibraries.main(null);

        assertThat(outContent.toString(), is("10\n"));

    }

    @Test
    public void bigNumbers() {

        StringBuilder input = new StringBuilder("1\n100000 99999 100000 99999\n");
        for(int i = 1; i < 100000; i++) {
            input.append(i).append(" ").append(i + 1).append("\n");
        }

        ByteArrayInputStream in = new ByteArrayInputStream(input.toString().getBytes());
        System.setIn(in);

        RoadsAndLibraries.main(null);

        assertThat(outContent.toString(), is("9999900001\n"));

    }

    @Test
    public void bigNumbers2() {

        ByteArrayInputStream in = new ByteArrayInputStream("1\n100000 0 100000 100000\n".getBytes());
        System.setIn(in);

        RoadsAndLibraries.main(null);

        assertThat(outContent.toString(), is("10000000000\n"));

    }

}