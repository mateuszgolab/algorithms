package com.hackerrank.algorithms.implementation;

import com.utils.FileLoader;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class AppleAndOrangeTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream printStream = new PrintStream(outContent);

    @Before
    public void before() {
        System.setOut(printStream);
    }

    @Test
    public void init() {

        ByteArrayInputStream in = new ByteArrayInputStream(FileLoader.get("hackerrank/algorithms/implementation/init.in").getBytes());
        System.setIn(in);

        AppleAndOrange.main(null);

        assertThat(outContent.toString(), is(FileLoader.get("hackerrank/algorithms/implementation/init.out")));

    }

}