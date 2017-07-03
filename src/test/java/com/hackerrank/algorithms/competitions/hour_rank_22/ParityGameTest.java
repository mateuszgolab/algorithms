package com.hackerrank.algorithms.competitions.hour_rank_22;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class ParityGameTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream printStream = new PrintStream(outContent);

    @Before
    public void before() {
        System.setOut(printStream);
    }

    @Test
    public void init() {

        ByteArrayInputStream in = new ByteArrayInputStream("5\n1 2 3 4 5".getBytes());
        System.setIn(in);

        ParityGame.main(null);

        assertThat(outContent.toString(), is("1\n"));

    }

    @Test
    public void init2() {
        ByteArrayInputStream in = new ByteArrayInputStream("4\n1 2 3 4".getBytes());
        System.setIn(in);

        ParityGame.main(null);

        assertThat(outContent.toString(), is("0\n"));

    }

    @Test
    public void init3() {
        ByteArrayInputStream in = new ByteArrayInputStream("4\n5 5 5 5".getBytes());
        System.setIn(in);

        ParityGame.main(null);

        assertThat(outContent.toString(), is("0\n"));

    }

    @Test
    public void init4() {
        ByteArrayInputStream in = new ByteArrayInputStream("1\n1".getBytes());
        System.setIn(in);

        ParityGame.main(null);

        assertThat(outContent.toString(), is("-1\n"));

    }


}