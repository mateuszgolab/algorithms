package com.google.codejam._2020._1b;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ExpogoTest {


    @Test
    public void testExample(){

        assertThat(Expogo.expogo(2,3), is("SEN"));
        assertThat(Expogo.expogo(-2,-3), is("NWS"));
        assertThat(Expogo.expogo(3,0), is("EE"));
        assertThat(Expogo.expogo(-1,1), is("IMPOSSIBLE"));
        assertThat(Expogo.expogo(-4,4), is("IMPOSSIBLE"));
        assertThat(Expogo.expogo(4,3), is("NNE"));
        assertThat(Expogo.expogo(3,4), is("EEN"));
        assertThat(Expogo.expogo(0,4), is("IMPOSSIBLE"));
        assertThat(Expogo.expogo(2,4), is("IMPOSSIBLE"));

    }

    @Test
    public void testMin(){

        assertThat(Expogo.expogo(1,0), is("E"));
        assertThat(Expogo.expogo(-1,0), is("W"));
        assertThat(Expogo.expogo(0,1), is("N"));
        assertThat(Expogo.expogo(0,-1), is("S"));

    }

    @Test
    public void test2(){

        assertThat(Expogo.expogo(1,2), is("EN"));

    }

}