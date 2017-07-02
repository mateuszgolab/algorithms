package com.google.codejam._2017._1c;

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

public class A1cTest {


    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream printStream = new PrintStream(outContent);

    @Before
    public void before() {
        System.setOut(printStream);
    }

    @Test
    public void init() {

        ByteArrayInputStream in = new ByteArrayInputStream(FileLoader.get("google/codejam/_2017/_1c/A/init.in").getBytes());
        System.setIn(in);

        A1c.main(null);

        assertThat(outContent.toString(), is(FileLoader.get("google/codejam/_2017/_1c/A/init.out")));

    }

    @Test
    public void init2() {


        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("1\n");
        stringBuilder.append("1000 999\n");

        for(int i = 0; i < 1000;i++) {
            stringBuilder.append(i + " " + i + "\n");
        }

        ByteArrayInputStream in = new ByteArrayInputStream(stringBuilder.toString().getBytes());
        System.setIn(in);

        A1c.main(null);

        Assert.assertTrue(OutputLoader.output(outContent.toString(), "google/codejam/_2017/_1c/A/init2.out"));
//        assertThat(outContent.toString(), is(FileLoader.get("google/codejam/_2017/_1c/A/init2.out")));

    }


    @Test
    public void small() {

        ByteArrayInputStream in = new ByteArrayInputStream(FileLoader.get("google/codejam/_2017/_1c/A/A-small-attempt0.in").getBytes());
        System.setIn(in);

        A1c.main(null);

//        assertThat(outContent.toString(), is(FileLoader.get("google/codejam/_2017/_1c/A/A-small-attempt0.out")));
        Assert.assertTrue(OutputLoader.output(outContent.toString(), "google/codejam/_2017/_1c/A/A-small-attempt0_fixed.out"));


    }


    @Test
    public void small1() {

        ByteArrayInputStream in = new ByteArrayInputStream(FileLoader.get("google/codejam/_2017/_1c/A/A-small-attempt1.in").getBytes());
        System.setIn(in);

        A1c.main(null);

        assertThat(outContent.toString(), is(FileLoader.get("google/codejam/_2017/_1c/A/A-small-attempt1.out")));


    }

    @Test
    public void small2() {

        ByteArrayInputStream in = new ByteArrayInputStream(FileLoader.get("google/codejam/_2017/_1c/A/A-small-attempt2.in").getBytes());
        System.setIn(in);

        A1c.main(null);

//        assertThat(outContent.toString(), is(FileLoader.get("google/codejam/_2017/_1c/A/A-small-attempt0.out")));
        Assert.assertTrue(OutputLoader.output(outContent.toString(), "google/codejam/_2017/_1c/A/A-small-attempt2.out"));


    }


//
//    @Test
//    public void large() {
//
//        ByteArrayInputStream in = new ByteArrayInputStream(FileLoader.get("google/codejam/_2017/_1c/A/A-large.in").getBytes());
//        System.setIn(in);
//
//        A1c.main(null);
//
//        Assert.assertTrue(OutputLoader.output(outContent.toString(), "google/codejam/_2017/_1c/A/A-large.out"));
//
//
//    }
//

}