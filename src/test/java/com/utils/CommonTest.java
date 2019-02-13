package com.utils;

import org.junit.Test;

import static com.utils.Common.isPalindrome;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CommonTest {

    @Test
    public void testIsPalindrome() {

        assertThat(isPalindrome("aba"), is(true));
        assertThat(isPalindrome("aa"), is(true));
        assertThat(isPalindrome("abba"), is(true));
        assertThat(isPalindrome("abcba"), is(true));
        assertThat(isPalindrome("av"), is(false));
        assertThat(isPalindrome("abc"), is(false));
        assertThat(isPalindrome("saddfs"), is(false));


    }


}