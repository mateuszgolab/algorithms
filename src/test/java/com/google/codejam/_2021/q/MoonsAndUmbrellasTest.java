package com.google.codejam._2021.q;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MoonsAndUmbrellasTest {

    @Test
    public void testExample() {
        assertThat(MoonsAndUmbrellas.moonsAndUmbrellas("CJ?CC?",2,3), is(5));
        assertThat(MoonsAndUmbrellas.moonsAndUmbrellas("CJCJ",4,2), is(10));
        assertThat(MoonsAndUmbrellas.moonsAndUmbrellas("C?J",1,3), is(1));
        assertThat(MoonsAndUmbrellas.moonsAndUmbrellas("??J???",2,5), is(0));
        assertThat(MoonsAndUmbrellas.moonsAndUmbrellas("??JC??",2,5), is(5));
    }

}