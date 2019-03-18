package com.hackerrank.algorithms.greedy;

import org.junit.Test;

import static com.hackerrank.algorithms.greedy.GreedyEasy.*;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GreedyEasyTest {

    @Test
    public void testMinimumAbsoluteDifference() {

        assertThat(minimumAbsoluteDifference(new int[]{-1, 2, 4}), is(2));
        assertThat(minimumAbsoluteDifference(new int[]{3, -7, 0}), is(3));
        assertThat(minimumAbsoluteDifference(new int[]{-59, -36, -13, 1, -53, -92, -2, -96, -54, 75}), is(1));
        assertThat(minimumAbsoluteDifference(new int[]{1, -3, 71, 68, 17}), is(3));

    }

    @Test
    public void testMarcsCakeWalk() {

        assertThat(marcsCakewalk(new int[]{5, 10, 7}), is(44L));
        assertThat(marcsCakewalk(new int[]{1, 3, 2}), is(11L));
        assertThat(marcsCakewalk(new int[]{7, 4, 9, 6}), is(79L));
        assertThat(marcsCakewalk(new int[]{1}), is(1L));
        assertThat(marcsCakewalk(new int[]{1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000,
                        1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000}),
                is(68719476735000L));

    }

    @Test
    public void testGridChallenge() {

        assertThat(gridChallenge(new String[]{"abc", "ade", "efg"}), is("YES"));
        assertThat(gridChallenge(new String[]{"ebacd", "fghij", "olmkn", "trpqs", "xywuv"}), is("YES"));
        assertThat(gridChallenge(new String[]{"xyz", "ade", "efg"}), is("NO"));

    }

    @Test
    public void testLuckBalance() {

        assertThat(luckBalance(2, new int[][]{new int[]{5, 1}, new int[]{1, 1}, new int[]{4, 0}}), is(10));
        assertThat(luckBalance(1, new int[][]{new int[]{5, 1}, new int[]{1, 1}, new int[]{4, 0}}), is(8));
        assertThat(luckBalance(3, new int[][]{new int[]{5, 1}, new int[]{2, 1}, new int[]{1, 1}, new int[]{8, 1}, new int[]{10, 0}, new int[]{5, 0}}), is(29));

    }

    @Test
    public void testMaximumPerimiter() {

        assertThat(maximumPerimeterTriangle(new int[]{1,2,3,4,5,10}), is(new int[]{3,4,5}));
        assertThat(maximumPerimeterTriangle(new int[]{1,1,1,3,3}), is(new int[]{1,3,3}));
        assertThat(maximumPerimeterTriangle(new int[]{1,2,3}), is(new int[]{-1}));
        assertThat(maximumPerimeterTriangle(new int[]{1,2,3}), is(new int[]{-1}));
        assertThat(maximumPerimeterTriangle(new int[]{1,1,1,2,3,5}), is(new int[]{1,1,1}));
        assertThat(maximumPerimeterTriangle(new int[]{2,2,3}), is(new int[]{2,2,3}));
        assertThat(maximumPerimeterTriangle(new int[]{2,3,3,3,3,4}), is(new int[]{3,3,4}));
        assertThat(maximumPerimeterTriangle(new int[]{10, 10, 9}), is(new int[]{9, 10, 10}));
        assertThat(maximumPerimeterTriangle(new int[]{1000000000, 1000000000, 900000000}), is(new int[]{900000000, 1000000000, 1000000000}));

    }

    @Test
    public void testBeautifulPairs() {

        assertThat(beautifulPairs(new int []{1,2,3,4}, new int[]{1,2,3,3}), is(4));
        assertThat(beautifulPairs(new int []{3,5,7,11,5,8}, new int[]{5,7,11,10,5,8}), is(6));
        assertThat(beautifulPairs(new int []{10,11,12,5,14}, new int[]{8,9,11,11,5}), is(3));
        assertThat(beautifulPairs(new int []{10,11,12,5,14}, new int[]{8,9,11,11,11}), is(2));
        assertThat(beautifulPairs(new int []{1,1}, new int[]{1,1}), is(1));
        assertThat(beautifulPairs(new int []{1}, new int[]{1}), is(0));
        assertThat(beautifulPairs(new int []{1,1,2}, new int[]{1,2,2}), is(3));
        assertThat(beautifulPairs(new int []{1,1,2}, new int[]{2,2,2}), is(2));
        assertThat(beautifulPairs(new int []{1,2,3}, new int[]{4,5,6}), is(1));
        assertThat(beautifulPairs(new int []{1,2,3}, new int[]{1,2,3}), is(2));

    }

    @Test
    public void testSherlockAndTheBeast() {

        assertThat(decentNumber(1), is("-1"));
        assertThat(decentNumber(2), is("-1"));
        assertThat(decentNumber(3), is("555"));
        assertThat(decentNumber(4), is("-1"));
        assertThat(decentNumber(5), is("33333"));
        assertThat(decentNumber(6), is("555555"));
        assertThat(decentNumber(7), is("-1"));
        assertThat(decentNumber(8), is("55533333"));
        assertThat(decentNumber(9), is("555555555"));
        assertThat(decentNumber(10), is("3333333333"));
        assertThat(decentNumber(19), is("5555555553333333333"));


    }

    @Test
    public void testPriyankaAndToys() {

        assertThat(toys(new int[]{1,2,3,4,5,10,11,12,13}), is(2));
        assertThat(toys(new int[]{1,2,3,21,7,12,14,21}), is(4));
        assertThat(toys(new int[]{1}), is(1));
        assertThat(toys(new int[]{1,1,1,1,1,1}), is(1));
        assertThat(toys(new int[]{1,1,1,1,1,1,1,1,1,1}), is(1));
        assertThat(toys(new int[]{1,1,1,1,1,1,1,1,1,1,1}), is(1));
        assertThat(toys(new int[]{1,10,20}), is(3));

    }

    @Test
    public void testLargestPermutation(){

        assertThat(largestPermutation(1,new int[]{1,2,3,4}), is(new int[]{4,2,3,1}));
        assertThat(largestPermutation(1,new int[]{4,2,3,5,1}), is(new int[]{5,2,3,4,1}));
        assertThat(largestPermutation(1,new int[]{2,1,3}), is(new int[]{3,1,2}));
        assertThat(largestPermutation(1,new int[]{2,1}), is(new int[]{2,1}));
        assertThat(largestPermutation(1,new int[]{2}), is(new int[]{2}));
        assertThat(largestPermutation(1,new int[]{2}), is(new int[]{2}));
        assertThat(largestPermutation(2,new int[]{4,5,7,2,3}), is(new int[]{7,5,4,3,2}));

    }

}