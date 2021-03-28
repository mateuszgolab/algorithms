package com.google.codejam._2020._1b;

import org.junit.Test;

import java.util.List;

import static com.google.codejam._2020._1b.JoinTheRanks.Pair;
import static com.google.codejam._2020._1b.JoinTheRanks.ranks;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class JoinTheRanksTest {


    @Test
    public void testExample1() {

        List<Pair> result = ranks(2,2);
        assertThat(result.get(0).r, is(2));
        assertThat(result.get(0).s, is(1));

    }

    @Test
    public void testExample2() {

        List<Pair> result = ranks(3,2);
        assertThat(result.get(0).r, is(3));
        assertThat(result.get(0).s, is(2));
        assertThat(result.get(1).r, is(2));
        assertThat(result.get(1).s, is(1));

    }


    @Test
    public void testExample3() {

        List<Pair> result = ranks(2,3);
//        assertThat(result.get(0).r, is(2));
//        assertThat(result.get(0).s, is(3));
//        assertThat(result.get(1).r, is(2));
//        assertThat(result.get(1).s, is(2));

        assertThat(result.get(0).r, is(4));
        assertThat(result.get(0).s, is(1));
        assertThat(result.get(1).r, is(3));
        assertThat(result.get(1).s, is(1));


    }

    @Test
    public void testExample4() {

        List<Pair> result = ranks(3,4);
//        assertThat(result.get(0).r, is(2));
//        assertThat(result.get(0).s, is(3));
//        assertThat(result.get(1).r, is(2));
//        assertThat(result.get(1).s, is(2));

        assertThat(result.get(0).r, is(4));
        assertThat(result.get(0).s, is(1));
        assertThat(result.get(1).r, is(3));
        assertThat(result.get(1).s, is(1));


    }





}