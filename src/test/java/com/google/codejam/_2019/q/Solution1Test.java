package com.google.codejam._2019.q;

import org.junit.Test;

import java.math.BigInteger;

import static com.google.codejam._2019.q.Solution1.foregoneSolution;
import static java.math.BigInteger.valueOf;
import static org.junit.Assert.assertFalse;

public class Solution1Test {


    @Test
    public void testForegoneSolution() {

        assertFalse(foregoneSolution(valueOf(4)).contains("4"));
        assertFalse(foregoneSolution(valueOf(940)).contains("4"));
        assertFalse(foregoneSolution(valueOf(4444)).contains("4"));
        assertFalse(foregoneSolution(valueOf(8884)).contains("4"));
        assertFalse(foregoneSolution(valueOf(123456789)).contains("4"));
        assertFalse(foregoneSolution(valueOf(14)).contains("4"));
        assertFalse(foregoneSolution(valueOf(44444444)).contains("4"));
        assertFalse(foregoneSolution(new BigInteger("4000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000")).contains("4"));
        assertFalse(foregoneSolution(new BigInteger("18641872648726387563845455629856982356087561160394519857207356208375602873567356236702837562735")).contains("4"));

    }


}