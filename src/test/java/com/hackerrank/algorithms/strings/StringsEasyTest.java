package com.hackerrank.algorithms.strings;

import org.junit.Test;

import java.util.Random;

import static com.hackerrank.algorithms.strings.StringsEasy.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class StringsEasyTest {



    @Test
    public void testReducedString() {

        assertThat(superReducedString("aaabccddd"), is("abd"));
        assertThat(superReducedString("aa"), is("Empty String"));
        assertThat(superReducedString("baab"), is("Empty String"));
        assertThat(superReducedString("d"), is("d"));

    }

    @Test
    public void testCamelCase() {

        assertThat(camelcase("saveChangesInTheEditor"), is(5));
        assertThat(camelcase("sace"), is(1));
        assertThat(camelcase("saceTrees"), is(2));

    }

    @Test
    public void testStrongPassword() {

        assertThat(minimumNumber(3, "Ab1"), is(3));
        assertThat(minimumNumber(11, "#HackerRank"), is(1));
        assertThat(minimumNumber(5, "aaaaa"), is(3));

    }

    @Test
    public void testReduceString() {

        assertThat(reduceString("abaacdabd"), is("bcdbd"));
        assertThat(reduceString("aabbcc"), is(""));
        assertThat(reduceString("aababc"), is("c"));

    }

    @Test
    public void testTwoCharacters() {

        assertThat(alternate("abaacdabd"), is(4));
        assertThat(alternate("beabeefeab"), is(5));
        assertThat(alternate("abcabc"), is(4));
        assertThat(alternate("abacacab"), is(0));
        assertThat(alternate("abababababababababa"), is(19));
        assertThat(alternate("abbbbbbbbbbbbba"), is(0));
        assertThat(alternate("zxcvzxcvzxcvzxcvzxcvzxcvzxcvzxcvzxcvzxcvzxcvzxcvzxcvzxcvzxcvzxcvzxcv"), is(34));
        assertThat(alternate("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"), is(0));
        assertThat(alternate("a"), is(0));
        assertThat(alternate("abcd"), is(2));
        assertThat(alternate("abcda"), is(3));
        assertThat(alternate(" sdad"), is(3));
        assertThat(alternate("abacacasdfsdfsdfffffffffsdssssssdkjfhsdfjsdnckjsncksnpokdoqwkewnefjnwfjwnfelnwelfznamn" +
                "zbvzmnbvnbviuqiweyrpqrywpgwergsjgnlkbxjgavkuysdqpfepfwlefwjhdfbskdjfhkshdfkjshfdksdfhksdfksjhfkb"), is(4));

    }

    @Test
    public void testTwoCharacters2() {

        assertThat(alternate(" qwertyuiop"), is(2));
        assertThat(alternate(" qwertyuiopq"), is(3));
        assertThat(alternate(" qwertyuiopasdfghjklzxcvbnm"), is(2));
        assertThat(alternate(" qwertyuiopasdfghjklzxcvbnmqwertyuiop"), is(4));

    }

    @Test
    public void testCaesarCipher() {

        assertThat(caesarCipher("middle-Outz", 2), is("okffng-Qwvb"));
        assertThat(caesarCipher("aZz", 2), is("cBb"));
        assertThat(caesarCipher("zZ", 100), is("vV"));
        assertThat(caesarCipher("aAzZ", 0), is("aAzZ"));

    }

    @Test
    public void testMarsExploration() {

        assertThat(marsExploration("SOSSPSSQSSOR"), is(3));
        assertThat(marsExploration("SOSSOSSOS"), is(0));
        assertThat(marsExploration("SOSSOT"), is(1));

    }

    @Test
    public void testHackerrankInAString() {

        assertThat(hackerrankInString("hhaacckkekraraannk"), is("YES"));
        assertThat(hackerrankInString("rhbaasdndfsdskgbfefdbrsdfhuyatrjtcrtyytktjjt"), is("NO"));
        assertThat(hackerrankInString("hackerworld"), is("NO"));
        assertThat(hackerrankInString("hereiamstackerrank"), is("YES"));
        assertThat(hackerrankInString("hackerrank"), is("YES"));
        assertThat(hackerrankInString("hackerrankaasdas"), is("YES"));
        assertThat(hackerrankInString("hackerran"), is("NO"));
        assertThat(hackerrankInString("hackerrann"), is("NO"));

    }

    @Test
    public void testPanagrams() {

        assertThat(pangrams("We promptly judged antique ivory buckles for the next prize"), is("pangram"));
        assertThat(pangrams("We promptly judged antique ivory buckles for the prize"), is("not pangram"));
        assertThat(pangrams("The quick brown fox jumps over the lazy dog"), is("pangram"));

    }

    @Test
    public void testWeightedUniformString() {

        assertThat(weightedUniformStrings("abccddde", new int[]{1, 3, 12, 5, 9, 10}), is(new String[]{"Yes", "Yes", "Yes", "Yes", "No", "No"}));
        assertThat(weightedUniformStrings("aaabbbbcccddd", new int[]{9, 7, 8, 12, 5}), is(new String[]{"Yes", "No", "Yes", "Yes", "No"}));
        assertThat(weightedUniformStrings("a", new int[]{1, 9, 7, 8, 12}), is(new String[]{"Yes", "No", "No", "No", "No"}));

    }

    @Test
    public void testSeparateNumbers() {

        assertThat(separateNumbers("1234"), is(1L));
        assertThat(separateNumbers("91011"), is(9L));
        assertThat(separateNumbers("99100"), is(99L));
        assertThat(separateNumbers("101103"), is(-1L));
        assertThat(separateNumbers("010203"), is(-1L));
        assertThat(separateNumbers("13"), is(-1L));
        assertThat(separateNumbers("1"), is(-1L));
        assertThat(separateNumbers("99910001001"), is(999L));
        assertThat(separateNumbers("99910001001"), is(999L));
        assertThat(separateNumbers("7891011"), is(7L));
        assertThat(separateNumbers("9899100"), is(98L));
        assertThat(separateNumbers("999100010001"), is(-1L));
        assertThat(separateNumbers("10000000000000001000000000000001"), is(1000000000000000L));

    }

    @Test
    public void testFunnyString() {

        assertThat(funnyString("acxz"), is("Funny"));
        assertThat(funnyString("bcxz"), is("Not Funny"));
        assertThat(funnyString("a"), is("Funny"));
        assertThat(funnyString("aaa"), is("Funny"));

    }

    @Test
    public void testGemStones() {

        assertThat(gemstones(new String[]{"abcdde","baccd","eeabg"}), is(2));
        assertThat(gemstones(new String[]{"abc","abc","bc"}), is(2));
        assertThat(gemstones(new String[]{"abc","def","ghj"}), is(0));

    }

    @Test
    public void testAlternatingCharacters() {

        assertThat(alternatingCharacters("AAAA"), is(3));
        assertThat(alternatingCharacters("BBBBB"), is(4));
        assertThat(alternatingCharacters("ABABABAB"), is(0));
        assertThat(alternatingCharacters("BABABA"), is(0));
        assertThat(alternatingCharacters("AAABBB"), is(4));
        assertThat(alternatingCharacters("A"), is(0));

    }

    @Test
    public void testBeautifulBinaryString() {

        assertThat(beautifulBinaryString("0101010"), is(2));
        assertThat(beautifulBinaryString("01100"), is(0));
        assertThat(beautifulBinaryString("0100101010"), is(3));
        assertThat(beautifulBinaryString("1"), is(0));
        assertThat(beautifulBinaryString("0"), is(0));
        assertThat(beautifulBinaryString("010"), is(1));
        assertThat(beautifulBinaryString("010010010"), is(3));
        assertThat(beautifulBinaryString("01010"), is(1));

    }

    @Test
    public void testTheLoveLetterMystery() {

        assertThat(theLoveLetterMystery("abc"), is(2));
        assertThat(theLoveLetterMystery("abcba"), is(0));
        assertThat(theLoveLetterMystery("abcd"), is(4));
        assertThat(theLoveLetterMystery("cba"), is(2));
        assertThat(theLoveLetterMystery("c"), is(0));

    }

    @Test
    public void testPalindromeIndex() {

        assertThat(palindromeIndex("aaab"), is(3));
        assertThat(palindromeIndex("baa"), is(0));
        assertThat(palindromeIndex("aaa"), is(-1));
        assertThat(palindromeIndex("asdsd"), is(-1));

    }

    @Test
    public void testPalindromeIndexBig() {

        String alphabet = "abcdefghijklmnopqrstuwvxyz";
        Random random = new Random();
        int n = 100000;

        StringBuilder sb = new StringBuilder(n);
        for(int i = 0; i < n; i++){
            sb.append(alphabet.charAt(random.nextInt(alphabet.length())));
        }

        assertThat(palindromeIndex(sb.toString()), is(-1));

    }

    @Test
    public void testAnagram() {

        assertThat(anagram("aaabbb"), is(3));
        assertThat(anagram("ab"), is(1));
        assertThat(anagram("abc"), is(-1));
        assertThat(anagram("mnop"), is(2));
        assertThat(anagram("xyyx"), is(0));
        assertThat(anagram("xaxbbbxx"), is(1));
        assertThat(anagram("aaaaaaaaaaaaaaaa"), is(0));
        assertThat(anagram("abcdbcde"), is(1));

    }

    @Test
    public void testMakingAnagrams() {

        assertThat(makingAnagrams("cde", "abc"), is(4));
        assertThat(makingAnagrams("amnop", "abc"), is(6));
        assertThat(makingAnagrams("aaa", "bbb"), is(6));
        assertThat(makingAnagrams("abc", "abc"), is(0));

    }


}