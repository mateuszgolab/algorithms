package com.google.codejam._2019.q;

import org.junit.Test;

import java.util.Collections;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertNotEquals;


public class Solution2Test {

    @Test
    public void testYouCanGoYourOwnWay1(){

        String input = "SE";
        String output = Solution2.youCanGoYourOwnWay(2, input);

        assertThat(input.length(), is(output.length()));

        for(int i = 0; i < output.length(); i++){
            assertNotEquals(input.charAt(i), output.charAt(i));
        }
    }

    @Test
    public void testYouCanGoYourOwnWay2(){

        String input = "EESSSESE";
        String output = Solution2.youCanGoYourOwnWay(2, input);

        assertThat(input.length(), is(output.length()));

        for(int i = 0; i < output.length(); i++){
            assertNotEquals(input.charAt(i), output.charAt(i));
        }
    }


    @Test
    public void testYouCanGoYourOwnWay3(){

        String input = String.join("", Collections.nCopies(200,"EESSSESE"));
        String output = Solution2.youCanGoYourOwnWay(2, input);

        assertThat(input.length(), is(output.length()));

        for(int i = 0; i < output.length(); i++){
            assertNotEquals(input.charAt(i), output.charAt(i));
        }
    }


}