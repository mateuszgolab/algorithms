package com.hackerrank.algorithms.implementation;

import org.junit.Test;

import java.util.Arrays;

import static com.hackerrank.algorithms.implementation.Easy.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class EasyTest {

    @Test
    public void countingValleysTest() {

        assertThat(countingValleys(8, "UDDDUDUU"), is(1));
        assertThat(countingValleys(8, "DDUUUUDD"), is(1));
        assertThat(countingValleys(4, "DUDU"), is(2));
        assertThat(countingValleys(8, "DDUUUDDU"), is(2));

    }

    @Test
    public void dayOfTheProgrammerTest() {

        assertThat(dayOfProgrammer(2016), is("12.09.2016"));
        assertThat(dayOfProgrammer(2017), is("13.09.2017"));
        assertThat(dayOfProgrammer(1800), is("12.09.1800"));
        assertThat(dayOfProgrammer(1918), is("26.09.1918"));
        assertThat(dayOfProgrammer(2000), is("12.09.2000"));

    }

    @Test
    public void drawingBookTest() {

        assertThat(pageCount(5, 4), is(0));
        assertThat(pageCount(6, 2), is(1));
        assertThat(pageCount(10, 5), is(2));
        assertThat(pageCount(10, 6), is(2));
        assertThat(pageCount(10, 9), is(1));
        assertThat(pageCount(10, 10), is(0));
        assertThat(pageCount(10, 1), is(0));

    }

    @Test
    public void socketMerchant1() {

        assertThat(sockMerchant(9, new int[]{10, 20, 20, 10, 10, 30, 50, 10, 20}), is(3));

    }

    @Test
    public void electronicShopTest() {

        assertThat(getMoneySpent(new int[]{3, 1}, new int[]{5, 2, 8}, 10), is(9));
        assertThat(getMoneySpent(new int[]{4}, new int[]{5}, 5), is(-1));
        assertThat(getMoneySpent(new int[]{4, 8, 10}, new int[]{5, 10, 20}, 15), is(15));
        assertThat(getMoneySpent(new int[]{4, 8, 10}, new int[]{5, 10, 20}, 24), is(24));
    }

    @Test
    public void catAndAMouseTest() {

        assertThat(catAndMouse(1, 2, 3), is("Cat B"));
        assertThat(catAndMouse(1, 3, 2), is("Mouse C"));
        assertThat(catAndMouse(1, 6, 2), is("Cat A"));

    }

    @Test
    public void pickingNumbersTest() {

        assertThat(pickingNumbers(Arrays.asList(4,6,5,3,3,1)), is(3));
        assertThat(pickingNumbers(Arrays.asList(1,2,2,3,1,2)), is(5));
        assertThat(pickingNumbers(Arrays.asList(1,2,2,3,3,5)), is(4));

    }


    @Test
    public void theHurdleRaceTest() {

        assertThat(hurdleRace(4, new int[]{1,6,3,5,2}), is(2));
        assertThat(hurdleRace(7, new int[]{2,5,4,5,2}), is(0));

    }

    @Test
    public void designPDFViewerTest() {

        assertThat(designerPdfViewer(new int[]{1,3,1,3,1,4,1,3,2,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5}, "abc"), is(9));
        assertThat(designerPdfViewer(new int[]{1,3,1,3,1,4,1,3,2,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,7}, "zaba"), is(28));

    }

    @Test
    public void utopianTreeTest() {

        assertThat(utopianTree(0), is(1));
        assertThat(utopianTree(1), is(2));
        assertThat(utopianTree(4), is(7));
        assertThat(utopianTree(5), is(14));
        assertThat(utopianTree(3), is(6));

    }

    @Test
    public void angryProfessorTest() {

        assertThat(angryProfessor(3, new int[]{-1,-3,4,2}), is("YES"));
        assertThat(angryProfessor(2, new int[]{0,-1,2,1}), is("NO"));

    }

}