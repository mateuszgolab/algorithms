package com.santander.isban;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class CompletingADnaStrandTest {


    @Test
    public void test1() {

        String out = CompletingADnaStrand.dnaComplement("GTCA");
        assertThat(out, is("TGAC"));

    }

    @Test
    public void test2() {

        String out = CompletingADnaStrand.dnaComplement("ACCGGGTTTT");
        assertThat(out, is("AAAACCCGGT"));

    }

    @Test
    public void test3() {

        String out = CompletingADnaStrand.dnaComplement("A");
        assertThat(out, is("T"));

    }



}