package com.google.codejam._2018._1b;

import com.google.codejam._2017._1b.B1b;
import com.utils.FileLoader;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class RoundingErrorTest {


    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream printStream = new PrintStream(outContent);

    @Before
    public void before() {
        System.setOut(printStream);
    }

    @Test
    public void init() {

        ByteArrayInputStream in = new ByteArrayInputStream(FileLoader.get("google/codejam/_2018/q/_1b/init.in").getBytes());
        System.setIn(in);

        RoundingError.main(null);

        assertThat(outContent.toString(), is(FileLoader.get("google/codejam/_2018/q/_1b/init.out")));

    }

    @Test
    public void test1() {

        ByteArrayInputStream in = new ByteArrayInputStream(FileLoader.get("google/codejam/_2018/q/_1b/test.in").getBytes());
        System.setIn(in);

        RoundingError.main(null);

        assertThat(outContent.toString(), is(FileLoader.get("google/codejam/_2018/q/_1b/test.out")));

    }
}