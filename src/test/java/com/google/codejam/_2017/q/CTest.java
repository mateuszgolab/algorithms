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

public class CTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream printStream = new PrintStream(outContent);

    @Before
    public void before() {
        System.setOut(printStream);
    }

    @Test
    public void init() {

        ByteArrayInputStream in = new ByteArrayInputStream(InputLoader.getInput("google/codejam/_2017/q/c/init.in").getBytes());
        System.setIn(in);

        C.main(null);

        assertThat(outContent.toString(), is(InputLoader.getInput("google/codejam/_2017/q/c/init.out")));

    }

    @Test
    public void init2() {

        ByteArrayInputStream in = new ByteArrayInputStream(InputLoader.getInput("google/codejam/_2017/q/c/init2.in").getBytes());
        System.setIn(in);

        C.main(null);

        assertThat(outContent.toString(), is(InputLoader.getInput("google/codejam/_2017/q/c/init2.out")));

    }

    @Test
    public void small1() {

        ByteArrayInputStream in = new ByteArrayInputStream(InputLoader.getInput("google/codejam/_2017/q/c/C-small-1-attempt2.in").getBytes());
        System.setIn(in);

        C.main(null);

        assertThat(outContent.toString(), is(InputLoader.getInput("google/codejam/_2017/q/c/C-small-1-attempt2.out")));


    }

    @Test
    public void small2done() {

        ByteArrayInputStream in = new ByteArrayInputStream(InputLoader.getInput("google/codejam/_2017/q/c/C-small-2-attempt0.in").getBytes());
        System.setIn(in);

        C.main(null);

        assertThat(outContent.toString(), is(InputLoader.getInput("google/codejam/_2017/q/c/C-small-2-attempt0.out")));


    }


    @Test
    public void small2() {

        ByteArrayInputStream in = new ByteArrayInputStream(InputLoader.getInput("google/codejam/_2017/q/c/C-small-2-attempt1.in").getBytes());
        System.setIn(in);

        C.main(null);

        Assert.assertTrue(OutputLoader.output(outContent.toString(), "google/codejam/_2017/q/c/C-small-2-attempt1.out"));


    }

    @Test
    public void large() {

        ByteArrayInputStream in = new ByteArrayInputStream(InputLoader.getInput("google/codejam/_2017/q/c/C-large.in").getBytes());
        System.setIn(in);

        C.main(null);

        Assert.assertTrue(OutputLoader.output(outContent.toString(), "google/codejam/_2017/q/c/C-large.out"));


    }

}