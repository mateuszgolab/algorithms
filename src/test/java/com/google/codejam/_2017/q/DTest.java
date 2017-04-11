package com.google.codejam._2017.q;

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

public class DTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream printStream = new PrintStream(outContent);

    @Before
    public void before() {
        System.setOut(printStream);
    }


    @Test
    public void init0() {

        ByteArrayInputStream in = new ByteArrayInputStream(FileLoader.get("google/codejam/_2017/q/d/init0.in").getBytes());
        System.setIn(in);

        D.main(null);

        assertThat(outContent.toString(), is(FileLoader.get("google/codejam/_2017/q/d/init0.out")));

    }


    @Test
    public void init() {

        ByteArrayInputStream in = new ByteArrayInputStream(FileLoader.get("google/codejam/_2017/q/d/init.in").getBytes());
        System.setIn(in);

        D.main(null);

        assertThat(outContent.toString(), is(FileLoader.get("google/codejam/_2017/q/d/init.out")));

    }

    @Test
    public void small() {

        ByteArrayInputStream in = new ByteArrayInputStream(FileLoader.get("google/codejam/_2017/q/d/D-small-practice.in").getBytes());
        System.setIn(in);

        D.main(null);

        Assert.assertTrue(OutputLoader.output(outContent.toString(), "google/codejam/_2017/q/d/D-small-practice.out"));


    }

    @Test
    public void large() {

        ByteArrayInputStream in = new ByteArrayInputStream(FileLoader.get("google/codejam/_2017/q/d/D-large-practice.in").getBytes());
        System.setIn(in);

        D.main(null);

        Assert.assertTrue(OutputLoader.output(outContent.toString(), "google/codejam/_2017/q/d/D-large-practice.out"));


    }

}