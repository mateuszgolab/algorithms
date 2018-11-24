package com.hackerrank.algorithms.implementation;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static com.hackerrank.algorithms.implementation.Easy.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;

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

        assertThat(pickingNumbers(Arrays.asList(4, 6, 5, 3, 3, 1)), is(3));
        assertThat(pickingNumbers(Arrays.asList(1, 2, 2, 3, 1, 2)), is(5));
        assertThat(pickingNumbers(Arrays.asList(1, 2, 2, 3, 3, 5)), is(4));

    }

    @Test
    public void theHurdleRaceTest() {

        assertThat(hurdleRace(4, new int[]{1, 6, 3, 5, 2}), is(2));
        assertThat(hurdleRace(7, new int[]{2, 5, 4, 5, 2}), is(0));

    }

    @Test
    public void designPDFViewerTest() {

        assertThat(designerPdfViewer(new int[]{1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5}, "abc"), is(9));
        assertThat(designerPdfViewer(new int[]{1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 7}, "zaba"), is(28));

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

        assertThat(angryProfessor(3, new int[]{-1, -3, 4, 2}), is("YES"));
        assertThat(angryProfessor(2, new int[]{0, -1, 2, 1}), is("NO"));

    }

    @Test
    public void beautifulDaysAtTheMoviesTest() {

        assertThat(beautifulDays(20, 23, 6), is(2));
    }

    @Test
    public void testReverseInt() {

        assertThat(reverseInt(210), is(12));
        assertThat(reverseInt(123), is(321));

    }

    @Test
    public void testViralAdvertising() {

        assertThat(viralAdvertising(3), is(9));
        assertThat(viralAdvertising(5), is(24));
        assertThat(viralAdvertising(1), is(2));

    }

    @Test
    public void testSaveThePrisoner() {

        assertThat(saveThePrisoner(5, 2, 1), is(2));
        assertThat(saveThePrisoner(5, 2, 2), is(3));
        assertThat(saveThePrisoner(7, 19, 2), is(6));
        assertThat(saveThePrisoner(3, 7, 3), is(3));
        assertThat(saveThePrisoner(3, 7, 1), is(1));
        assertThat(saveThePrisoner(7, 3, 7), is(2));
        assertThat(saveThePrisoner(3, 1, 1), is(1));
        assertThat(saveThePrisoner(3, 3, 1), is(3));

    }

    @Test
    public void testCircularArrayRotation() {

        assertThat(circularArrayRotation(new int[]{1, 2, 3}, 2, new int[]{0, 1, 2}), is(new int[]{2, 3, 1}));
        assertThat(circularArrayRotation(new int[]{1, 2, 3}, 1, new int[]{0, 1, 2}), is(new int[]{3, 1, 2}));
        assertThat(circularArrayRotation(new int[]{1, 2, 3}, 3, new int[]{0, 1, 2}), is(new int[]{1, 2, 3}));
    }

    @Test
    public void testSequenceEquation() {

        assertThat(permutationEquation(new int[]{2, 3, 1}), is(new int[]{2, 3, 1}));
        assertThat(permutationEquation(new int[]{4, 3, 5, 1, 2}), is(new int[]{1, 3, 5, 4, 2}));

    }

    @Test
    public void testJumpingOnTheCloudsRevisited() {

        assertThat(jumpingOnClouds(new int[]{0, 0, 1, 0, 0, 1, 1, 0}, 2), is(92));
        assertThat(jumpingOnClouds(new int[]{0, 0, 1, 0, 0, 1, 1, 0, 1}, 3), is(95));

    }

    @Test
    public void testFindDigits() {

        assertThat(findDigits(12), is(2));
        assertThat(findDigits(1012), is(3));
        assertThat(findDigits(111), is(3));
        assertThat(findDigits(12345678), is(4));

    }

    @Test
    public void testAppendAndDelete() {

        assertThat(appendAndDelete("hackerhappy", "hackerrank", 9), is("Yes"));
        assertThat(appendAndDelete("aba", "aba", 7), is("Yes"));
        assertThat(appendAndDelete("aba", "aba", 5), is("No"));
        assertThat(appendAndDelete("abade", "aba", 7), is("No"));
        assertThat(appendAndDelete("aba", "aba", 1), is("No"));
        assertThat(appendAndDelete("aba", "aba", 2), is("Yes"));
        assertThat(appendAndDelete("aba", "aba", 4), is("Yes"));
        assertThat(appendAndDelete("abaab", "aba", 4), is("Yes"));
        assertThat(appendAndDelete("ashley", "ash", 2), is("No"));
        assertThat(appendAndDelete("ashley", "ashl", 2), is("Yes"));
        assertThat(appendAndDelete("as", "ashley", 2), is("No"));
        assertThat(appendAndDelete("as", "ashley", 4), is("Yes"));
        assertThat(appendAndDelete("123456789", "1", 5), is("No"));
        assertThat(appendAndDelete("123456789", "1", 8), is("Yes"));
        assertThat(appendAndDelete("010101", "01010", 2), is("No"));
        assertThat(appendAndDelete("010101", "01010", 6), is("No"));
        assertThat(appendAndDelete("010101", "010101", 1), is("No"));
        assertThat(appendAndDelete("010101", "010101", 3), is("No"));
        assertThat(appendAndDelete("1", "101", 5), is("Yes"));
        assertThat(appendAndDelete("11", "101", 5), is("Yes"));
        assertThat(appendAndDelete("111", "101", 5), is("No"));
        assertThat(appendAndDelete("abc", "abc", 1), is("No"));
        assertThat(appendAndDelete("peek", "seeker", 3), is("No"));
        assertThat(appendAndDelete("abcd", "abce", 2), is("Yes"));
        assertThat(appendAndDelete("abcd", "abce", 3), is("No"));
        assertThat(appendAndDelete("abcd", "abce", 4), is("Yes"));
        assertThat(appendAndDelete("ab", "abce", 7), is("Yes"));

    }

    @Test
    public void testScherlockAndSquares() {

        assertThat(squares(3, 9), is(2));
        assertThat(squares(17, 24), is(0));
        assertThat(squares(1, 100), is(10));

    }

    @Test
    public void testLibraryFine() {

        assertThat(libraryFine(9, 6, 2015, 6, 6, 2015), is(45));
        assertThat(libraryFine(9, 6, 2015, 5, 2, 2015), is(2000));
        assertThat(libraryFine(9, 6, 2015, 5, 6, 2012), is(10000));
        assertThat(libraryFine(9, 6, 2015, 19, 6, 2015), is(0));
        assertThat(libraryFine(15, 2, 2015, 31, 1, 2015), is(500));
        assertThat(libraryFine(1, 3, 2015, 28, 2, 2015), is(500));
        assertThat(libraryFine(31, 3, 2015, 1, 3, 2015), is(450));
        assertThat(libraryFine(28, 3, 2015, 28, 2, 2015), is(500));
    }

    @Test
    public void testCutTheSticks() {

        assertThat(cutTheSticks(new int[]{5, 4, 4, 2, 2, 8}), is(new int[]{6, 4, 2, 1}));
        assertThat(cutTheSticks(new int[]{1, 2, 3, 4, 3, 3, 2, 1}), is(new int[]{8, 6, 4, 1}));

    }

    @Test
    public void testRepeatedString() {

        assertThat(repeatedString("abcac", 10), is(4L));
        assertThat(repeatedString("aba", 10), is(7L));
        assertThat(repeatedString("a", 1000000000000L), is(1000000000000L));
        assertThat(repeatedString("ab", 1000000000000L), is(500000000000L));
        assertThat(repeatedString("ababababab", 1000000000000L), is(500000000000L));
        assertThat(repeatedString("bcbcb", 1000000000000L), is(0L));
        assertThat(repeatedString("abababab", 4), is(2L));

    }

    @Test
    public void testJumpingOnTheClouds2() {

        assertThat(jumpingOnClouds(new int[]{0, 0, 0, 0, 1, 0}), is(3));
        assertThat(jumpingOnClouds(new int[]{0, 1, 0, 0, 0, 1, 0}), is(3));
        assertThat(jumpingOnClouds(new int[]{0, 1, 0, 1, 0, 1, 0}), is(3));
        assertThat(jumpingOnClouds(new int[]{0, 1, 0, 0, 1, 0, 0}), is(4));
        assertThat(jumpingOnClouds(new int[]{0, 0, 1, 0, 1, 0, 0}), is(4));

    }

    @Test
    public void testEqualityInArray() {

        assertThat(equalizeArray(new int[]{3, 3, 2, 1, 3}), is(2));
        assertThat(equalizeArray(new int[]{3, 2, 2, 1, 3}), is(3));
        assertThat(equalizeArray(new int[]{3, 3, 3, 3, 3}), is(0));
        assertThat(equalizeArray(new int[]{1, 2, 3, 4, 5}), is(4));

    }

    @Test
    public void testAcmIcpcTeam() {

        assertThat(acmTeam(new String[]{"10101", "11100", "11010", "00101"}), is(new int[]{5, 2}));

    }

    @Test
    public void testTaumAndBday() {

        assertThat(taumBday(10, 10, 1, 1, 1), is(20));
        assertThat(taumBday(5, 9, 2, 3, 4), is(37));
        assertThat(taumBday(3, 6, 9, 1, 1), is(12));
        assertThat(taumBday(7, 7, 4, 2, 1), is(35));
        assertThat(taumBday(3, 3, 1, 9, 2), is(12));
        assertThat(taumBday(1000000000, 1, 1000000000, 1, 1), is(2000000001));
        assertThat(taumBday(3, 3, 0, 1, 1), is(3));
        assertThat(taumBday(0, 0, 50, 50, 10), is(0));

    }

    @Test
    public void testKaprekarNumbers() {

        assertEquals(kaprekarNumbers(1, 100), Arrays.asList(1L, 9L, 45L, 55L, 99L));
        assertEquals(kaprekarNumbers(2, 8), Collections.emptyList());
        assertEquals(kaprekarNumbers(95000, 100000), Arrays.asList(95121L, 99999L));

    }

    @Test
    public void testBeautifulTriplets() {

        assertThat(beautifulTriplets(1, new int[]{2, 2, 3, 4, 5}), is(3));
        assertThat(beautifulTriplets(3, new int[]{1, 2, 4, 5, 7, 8, 10}), is(3));

    }

    @Test
    public void testMinimumDistances() {

        assertThat(minimumDistances(new int[]{3, 2, 1, 2, 3}), is(2));
        assertThat(minimumDistances(new int[]{7, 1, 3, 4, 1, 7}), is(3));
        assertThat(minimumDistances(new int[]{1, 1, 1, 1, 1, 1}), is(1));
        assertThat(minimumDistances(new int[]{1, 2, 3, 4}), is(-1));
        assertThat(minimumDistances(new int[]{1, 2, 3, 4, 1}), is(4));
        assertThat(minimumDistances(new int[]{1}), is(-1));

    }

    @Test
    public void testHalloweenSale() {

        assertThat(howManyGames(20, 3, 6, 100), is(10));
        assertThat(howManyGames(20, 3, 6, 80), is(6));
        assertThat(howManyGames(20, 3, 6, 19), is(0));
        assertThat(howManyGames(20, 3, 6, 24), is(1));
        assertThat(howManyGames(20, 3, 6, 38), is(2));
        assertThat(howManyGames(20, 3, 6, 30), is(1));
        assertThat(howManyGames(20, 3, 6, 55), is(3));

    }

    @Test
    public void testChocolateFeast() {

        assertThat(chocolateFeast(15, 3, 2), is(9));
        assertThat(chocolateFeast(10, 2, 5), is(6));
        assertThat(chocolateFeast(12, 4, 4), is(3));
        assertThat(chocolateFeast(6, 2, 2), is(5));

    }

    @Test
    public void testServiceLane() {

        assertThat(serviceLane(new int[]{2, 3, 1, 2, 3, 2, 3, 3}, new int[][]{{0, 3}, {4, 6}, {6, 7}, {3, 5}, {0, 7}}), is(new int[]{1, 2, 3, 2, 1}));
        assertThat(serviceLane(new int[]{1, 2, 2, 2, 1}, new int[][]{{2, 3}, {1, 4}, {2, 4}, {2, 4}, {2, 3}}), is(new int[]{2, 1, 1, 1, 2}));

    }

    @Test
    public void testLisaWorkbook() {

        assertThat(workbook(5,3, new int[]{4,2,6,1,10}), is(4));
        assertThat(workbook(5,5, new int[]{4,2,6,1,10}), is(4));
        assertThat(workbook(5,1, new int[]{4,2,6,1,10}), is(4));
        assertThat(workbook(5,10, new int[]{4,2,6,1,10}), is(4));
        assertThat(workbook(10,5, new int[]{3,8,15,11,14,1,9,2,24,31}), is(8));

    }

}