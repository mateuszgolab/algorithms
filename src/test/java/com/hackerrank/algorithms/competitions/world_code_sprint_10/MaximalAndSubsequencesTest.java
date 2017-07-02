package com.hackerrank.algorithms.competitions.world_code_sprint_10;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class MaximalAndSubsequencesTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream printStream = new PrintStream(outContent);

    @Before
    public void before() {
        System.setOut(printStream);
    }

    @Test
    public void init() {

        ByteArrayInputStream in = new ByteArrayInputStream("3 2\n3\n5\n6\n".getBytes());
        System.setIn(in);

        MaximalAndSubsequences.main(null);

        assertThat(outContent.toString(), is("4\n1\n"));

    }

    @Test
    public void init2() {

        ByteArrayInputStream in = new ByteArrayInputStream("4 2\n21\n19\n22\n20\n".getBytes());
        System.setIn(in);

        MaximalAndSubsequences.main(null);

        assertThat(outContent.toString(), is("20\n3\n"));

    }

    @Test
    public void init3() {

        ByteArrayInputStream in = new ByteArrayInputStream("4 3\n9\n15\n27\n14\n".getBytes());
        System.setIn(in);

        MaximalAndSubsequences.main(null);

        assertThat(outContent.toString(), is("10\n1\n"));

    }

    @Test
    public void test1() {

        ByteArrayInputStream in = new ByteArrayInputStream("3 2\n12\n14\n17\n".getBytes());
        System.setIn(in);

        MaximalAndSubsequences.main(null);

        assertThat(outContent.toString(), is("12\n1\n"));

    }

    @Test
    public void test2() {

        ByteArrayInputStream in = new ByteArrayInputStream("3 2\n1000000000000000000\n100000000000000000\n100000000000000000\n".getBytes());
        System.setIn(in);

        MaximalAndSubsequences.main(null);

        assertThat(outContent.toString(), is("100000000000000000\n1\n"));

    }

    @Test
    public void test3() {

        StringBuilder stringBuilder = new StringBuilder("100000 100000\n");

        for(int i = 0; i < 100000; i++) {
            stringBuilder.append("1000000000000000000\n");
        }

        ByteArrayInputStream in = new ByteArrayInputStream(stringBuilder.toString().getBytes());
        System.setIn(in);

        MaximalAndSubsequences.main(null);

        assertThat(outContent.toString(), is("1000000000000000000\n1\n"));

    }

    @Test
    public void test4() {

        StringBuilder stringBuilder = new StringBuilder("100000 1000\n");

        for(int i = 0; i < 100000; i++) {
            stringBuilder.append("1000000000000000000\n");
        }

        ByteArrayInputStream in = new ByteArrayInputStream(stringBuilder.toString().getBytes());
        System.setIn(in);

        MaximalAndSubsequences.main(null);

        assertThat(outContent.toString(), is("1000000000000000000\n680835847\n"));

    }

    @Test
    public void test5() {

        ByteArrayInputStream in = new ByteArrayInputStream("2 2\n3\n5\n".getBytes());
        System.setIn(in);

        MaximalAndSubsequences.main(null);

        assertThat(outContent.toString(), is("1\n1\n"));

    }

    @Test
    public void test6() {

        ByteArrayInputStream in = new ByteArrayInputStream("2 2\n6\n9\n".getBytes());
        System.setIn(in);

        MaximalAndSubsequences.main(null);

        assertThat(outContent.toString(), is("0\n1\n"));

    }

    @Test
    public void test7() {

        ByteArrayInputStream in = new ByteArrayInputStream("2 2\n11\n13\n".getBytes());
        System.setIn(in);

        MaximalAndSubsequences.main(null);

        assertThat(outContent.toString(), is("9\n1\n"));

    }

    @Test
    public void test8() {

        ByteArrayInputStream in = new ByteArrayInputStream("3 2\n11\n13\n8\n".getBytes());
        System.setIn(in);

        MaximalAndSubsequences.main(null);

        assertThat(outContent.toString(), is("9\n1\n"));

    }

    @Test
    public void test9() {

        ByteArrayInputStream in = new ByteArrayInputStream("4 2\n6\n9\n16\n32\n".getBytes());
        System.setIn(in);

        MaximalAndSubsequences.main(null);

        assertThat(outContent.toString(), is("0\n6\n"));

    }

    @Test
    public void test10() {

        ByteArrayInputStream in = new ByteArrayInputStream("4 2\n6\n9\n16\n0\n".getBytes());
        System.setIn(in);

        MaximalAndSubsequences.main(null);

        assertThat(outContent.toString(), is("0\n6\n"));

    }

    @Test
    public void test11() {

        ByteArrayInputStream in = new ByteArrayInputStream("2 2\n0\n0\n".getBytes());
        System.setIn(in);

        MaximalAndSubsequences.main(null);

        assertThat(outContent.toString(), is("0\n1\n"));

    }

    @Test
    public void test12() {

        ByteArrayInputStream in = new ByteArrayInputStream("2 2\n0\n10000\n".getBytes());
        System.setIn(in);

        MaximalAndSubsequences.main(null);

        assertThat(outContent.toString(), is("0\n1\n"));

    }


}