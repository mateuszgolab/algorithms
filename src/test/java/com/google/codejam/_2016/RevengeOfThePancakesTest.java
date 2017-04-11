package com.google.codejam._2016;

import com.google.codejam._2016.q.RevengeOfThePancakes;
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

public class RevengeOfThePancakesTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream printStream = new PrintStream(outContent);

    @Before
    public void before() {
        System.setOut(printStream);
    }

    @Test
    public void init() {

        ByteArrayInputStream in = new ByteArrayInputStream(FileLoader.get("google/codejam/_2016/b/init.in") .getBytes());
        System.setIn(in);

        RevengeOfThePancakes.main(null);

        assertThat(outContent.toString(), is(FileLoader.get("google/codejam/_2016/b/init.out")));

    }

    @Test
    public void small() {

        ByteArrayInputStream in = new ByteArrayInputStream(FileLoader.get("google/codejam/_2016/b/B-small-practice.in") .getBytes());
        System.setIn(in);

        RevengeOfThePancakes.main(null);

        Assert.assertTrue(OutputLoader.output(outContent.toString(), "google/codejam/_2016/b/B-small-practice.out"));


    }

    @Test
    public void large() {

        ByteArrayInputStream in = new ByteArrayInputStream(FileLoader.get("google/codejam/_2016/b/B-large-practice.in") .getBytes());
        System.setIn(in);

        RevengeOfThePancakes.main(null);

        Assert.assertTrue(OutputLoader.output(outContent.toString(), "google/codejam/_2016/b/B-large-practice.out"));

    }

}