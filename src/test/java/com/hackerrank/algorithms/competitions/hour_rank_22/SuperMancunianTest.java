package com.hackerrank.algorithms.competitions.hour_rank_22;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class SuperMancunianTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream printStream = new PrintStream(outContent);

    @Before
    public void before() {
        System.setOut(printStream);
    }

    @Test
    public void init() {

        ByteArrayInputStream in = new ByteArrayInputStream(("4 6\n" +
                "1 2 1\n" +
                "1 3 3\n" +
                "1 4 7\n" +
                "2 3 2\n" +
                "2 4 3\n" +
                "3 4 3").getBytes());
        System.setIn(in);

        SuperMancunian.main(null);

        assertThat(outContent.toString(), is("3 3\n"));

    }


}