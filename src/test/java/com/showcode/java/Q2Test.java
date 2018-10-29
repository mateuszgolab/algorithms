package com.showcode.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Q2Test {

    @Test
    public void test1961() {
        assertEquals(Q2.ParseRomanNumerals("MCMLXI"), 1961);
    }


    @Test
    public void test2015() {
        assertEquals(Q2.ParseRomanNumerals("MMXV"), 2015);
    }

    @Test
    public void test9() {
        assertEquals(Q2.ParseRomanNumerals("IX"), 9);
    }

    @Test
    public void test1() {
        assertEquals(Q2.ParseRomanNumerals("I"), 1);
    }


    @Test
    public void test1666() {
        assertEquals(Q2.ParseRomanNumerals("MDCLXVI"), 1666);
    }

    @Test
    public void test40() {
        assertEquals(Q2.ParseRomanNumerals("XL"), 40);
    }

    @Test
    public void test60() {
        assertEquals(Q2.ParseRomanNumerals("LX"), 60);
    }

    @Test
    public void test440() {
        assertEquals(Q2.ParseRomanNumerals("CDXL"), 440);
    }


    @Test
    public void test5015() {
        assertEquals(Q2.ParseRomanNumerals("MMMMMXV"), 5015);
    }

    @Test
    public void test38() {
        assertEquals(Q2.ParseRomanNumerals("XXXVIII"), 38);
    }

    @Test
    public void test41() {
        assertEquals(Q2.ParseRomanNumerals("XLI"), 41);
    }

    @Test
    public void test42() {
        assertEquals(Q2.ParseRomanNumerals("XLII"), 42);
    }



}