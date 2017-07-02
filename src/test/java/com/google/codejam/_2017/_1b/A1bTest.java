package com.google.codejam._2017._1b;

import com.utils.FileLoader;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class A1bTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream printStream = new PrintStream(outContent);

    @Before
    public void before() {
        System.setOut(printStream);
    }

    @Test
    public void init() {

        ByteArrayInputStream in = new ByteArrayInputStream(FileLoader.get("google/codejam/_2017/_1b/A/init.in").getBytes());
        System.setIn(in);

        A1b.main(null);

        assertThat(outContent.toString(), is(FileLoader.get("google/codejam/_2017/_1b/A/init.out")));

    }


    @Test
    public void small2() {

        ByteArrayInputStream in = new ByteArrayInputStream(FileLoader.get("google/codejam/_2017/_1b/A/A-small-attempt2.in").getBytes());
        System.setIn(in);

        A1b.main(null);

        assertThat(outContent.toString(), is(FileLoader.get("google/codejam/_2017/_1b/A/A-small-attempt2_fixed.out")));


    }


    @Test
    public void small3() {

        ByteArrayInputStream in = new ByteArrayInputStream(FileLoader.get("google/codejam/_2017/_1b/A/A-small-attempt3.in").getBytes());
        System.setIn(in);

        A1b.main(null);

        assertThat(outContent.toString(), is(FileLoader.get("google/codejam/_2017/_1b/A/A-small-attempt3.out")));


    }

//
//    @Test
//    public void large() {
//
//        ByteArrayInputStream in = new ByteArrayInputStream(FileLoader.get("google/codejam/_2017/_1b/A/A-large.in").getBytes());
//        System.setIn(in);
//
//        A1c.main(null);
//
//        Assert.assertTrue(OutputLoader.output(outContent.toString(), "google/codejam/_2017/_1b/A/A-large.out"));
//
//
//    }
//

}