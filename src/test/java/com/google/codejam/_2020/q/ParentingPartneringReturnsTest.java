package com.google.codejam._2020.q;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static com.google.codejam._2020.q.ParentingPartneringReturns.Activity;
import static com.google.codejam._2020.q.ParentingPartneringReturns.parenting;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ParentingPartneringReturnsTest {

    @Test
    public void test1() {

        List<Activity> list = new ArrayList<>();
        list.add(new Activity(360,480,0));
        list.add(new Activity(420,540,1));
        list.add(new Activity(600,660,2));

        String output = parenting(list);

        assertThat(output, is("CJC"));

    }

    @Test
    public void test2() {

        List<Activity> list = new ArrayList<>();
        list.add(new Activity(0,1440,0));
        list.add(new Activity(1,3,1));
        list.add(new Activity(2,4,2));

        String output = parenting(list);

        assertThat(output, is("IMPOSSIBLE"));

    }

    @Test
    public void test3() {

        List<Activity> list = new ArrayList<>();
        list.add(new Activity(99,150,0));
        list.add(new Activity(1,100,1));
        list.add(new Activity(100,301,2));
        list.add(new Activity(2,5,3));
        list.add(new Activity(150,250,4));

        String output = parenting(list);

        assertThat(output, is("JCCJJ"));

    }

    @Test
    public void test4() {

        List<Activity> list = new ArrayList<>();
        list.add(new Activity(0,720,0));
        list.add(new Activity(720,1440,1));

        String output = parenting(list);

        assertThat(output, is("CC"));

    }

    @Test
    public void test5() {

        List<Activity> list = new ArrayList<>();
        list.add(new Activity(1,1400,0));
        list.add(new Activity(1399,1440,1));

        String output = parenting(list);

        assertThat(output, is("CJ"));

    }

    @Test
    public void test6() {

        List<Activity> list = new ArrayList<>();
        list.add(new Activity(1,1400,0));
        list.add(new Activity(1399,1440,1));
        list.add(new Activity(1200,1440,1));

        String output = parenting(list);

        assertThat(output, is("IMPOSSIBLE"));

    }


}