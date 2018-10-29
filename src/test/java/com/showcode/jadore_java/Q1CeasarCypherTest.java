package com.showcode.jadore_java;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q1CeasarCypherTest {


    @Test
    public void Test1() {
        assertEquals(Q1CeasarCypher.CeasarCypher("Zwddg ogjdv!", 8), "Hello world!");
    }

    @Test
    public void Test2() {
        assertEquals(Q1CeasarCypher.CeasarCypher("./!@,.?abuvwABUV", 5), "./!@,.?fgzabFGZA");
    }

}