package com.google.codejam._2017.q;

import com.utils.InputLoader;
import com.utils.OutputLoader;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class BTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream printStream = new PrintStream(outContent);

    @Before
    public void before() {
        System.setOut(printStream);
    }

    @Test
    public void init() {

        ByteArrayInputStream in = new ByteArrayInputStream(InputLoader.getInput("google/codejam/_2017/q/b/init.in").getBytes());
        System.setIn(in);

        B.main(null);

        assertThat(outContent.toString(), is(InputLoader.getInput("google/codejam/_2017/q/b/init.out")));

    }

    @Test
    public void small() {

        ByteArrayInputStream in = new ByteArrayInputStream(InputLoader.getInput("google/codejam/_2017/q/b/B-small-attempt0.in").getBytes());
        System.setIn(in);

        B.main(null);

        Assert.assertTrue(OutputLoader.output(outContent.toString(), "google/codejam/_2017/q/b/B-small-attempt0.out"));


    }

    @Test
    public void large() {

        ByteArrayInputStream in = new ByteArrayInputStream(InputLoader.getInput("google/codejam/_2017/q/b/B-large.in").getBytes());
        System.setIn(in);

        B.main(null);

        Assert.assertTrue(OutputLoader.output(outContent.toString(), "google/codejam/_2017/q/b/B-large.out"));


    }

}