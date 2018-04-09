package com.santander.isban;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class CountryPopulationsTest {

    @Test
    public void test1() {

        int out = CountryPopulations.getCountries("un", 100090);
        assertThat(out, is(8));

    }

    @Test
    public void test2() {

        int out = CountryPopulations.getCountries("a", 100090);
        assertThat(out, is(8));

    }


}
