package com.google.codejam._2017._1b;

import com.utils.FileLoader;
import com.utils.OutputLoader;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class B1bTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream printStream = new PrintStream(outContent);

    @Before
    public void before() {
        System.setOut(printStream);
    }

    @Test
    public void init() {

        ByteArrayInputStream in = new ByteArrayInputStream(FileLoader.get("google/codejam/_2017/_1b/B/init.in").getBytes());
        System.setIn(in);

        B1b.main(null);

        assertThat(outContent.toString(), is(FileLoader.get("google/codejam/_2017/_1b/B/init.out")));

    }

    @Test
    public void small() {

        ByteArrayInputStream in = new ByteArrayInputStream(FileLoader.get("google/codejam/_2017/_1b/B/B-small-attempt0.in").getBytes());
        System.setIn(in);

        B1b.main(null);

        Assert.assertTrue(OutputLoader.output(outContent.toString(), "google/codejam/_2017/_1b/B/B-small-attempt0.out"));


    }


    @Test
    public void large() {

        ByteArrayInputStream in = new ByteArrayInputStream(FileLoader.get("google/codejam/_2017/_1b/B/B-large.in").getBytes());
        System.setIn(in);

        B1b.main(null);

        Assert.assertTrue(OutputLoader.output(outContent.toString(), "google/codejam/_2017/_1b/B/B-large.out"));


    }


}