package com.google.codejam._2018.q;

import com.utils.FileLoader;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class Solution2Test {


    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream printStream = new PrintStream(outContent);
    private final Random random = new Random();

    @Before
    public void before() {
        System.setOut(printStream);
    }

    @Test
    public void init() {

        ByteArrayInputStream in = new ByteArrayInputStream(FileLoader.get("google/codejam/_2018/q/solution2/init.in").getBytes());
        System.setIn(in);

        Solution2.main(null);

        assertThat(outContent.toString(), is(FileLoader.get("google/codejam/_2018/q/solution2/init.out")));

    }

    @Test
    public void speedTest() {

        int N = 100000;

        StringBuilder builder = new StringBuilder();
        builder.append(1);
        builder.append('\n');
        builder.append(N);
        builder.append('\n');
        for(int i = 0; i < N; i++) {
            builder.append(random.nextInt(1000000001));
            builder.append(" ");
        }

        ByteArrayInputStream in = new ByteArrayInputStream(builder.toString().getBytes());
        System.setIn(in);

        Solution2.main(null);

//        assertThat(outContent.toString(), is("Case #1: OK"));

    }

    @Test
    public void correctnessTest() {

        int N = 10000;

        List<Integer> list = new ArrayList<>(N);

        for(int i = 0; i < N; i++) {
           list.add(random.nextInt(1000000000));
        }

        List<Integer> result1 = Solution2.troubleSort(list);
        List<Integer> result2 = Solution2.troubleSort2(list);

        assertThat(result1.size(), is(result2.size()));

        for(int i = 0; i < result1.size(); i++) {
            assertThat(result1.get(i), is(result2.get(i)));
        }

    }




}