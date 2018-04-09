package com.santander.isban;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class LastSubstringTest {


    @Test
    public void test1() {

        String out = LastSubstring.compute("banana");
        assertThat(out, is("nana"));

    }

    @Test
    public void test2() {

        String out = LastSubstring.compute("ab");
        assertThat(out, is("b"));

    }

    @Test
    public void test3() {

        String out = LastSubstring.compute("ba");
        assertThat(out, is("ba"));

    }

    @Test
    public void test4() {

        String out = LastSubstring.compute("bajbsdjabsdasbdoajsbdjbjbsdz");
        assertThat(out, is("z"));

    }

    @Test
    public void test5() {

        String out = LastSubstring.compute("z");
        assertThat(out, is("z"));

    }

    @Test
    public void test6() {

        String out = LastSubstring.compute("dcba");
        assertThat(out, is("dcba"));

    }

    @Test
    public void test7() {

        String out = LastSubstring.compute("abczzzcba");
        assertThat(out, is("zzzcba"));

    }

    @Test
    public void test8() {

        String out = LastSubstring.compute("abczadfdfzz");
        assertThat(out, is("zz"));

    }


}