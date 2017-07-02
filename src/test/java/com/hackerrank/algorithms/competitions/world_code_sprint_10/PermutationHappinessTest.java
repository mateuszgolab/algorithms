package com.hackerrank.algorithms.competitions.world_code_sprint_10;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class PermutationHappinessTest {


    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream printStream = new PrintStream(outContent);

    @Before
    public void before() {
        System.setOut(printStream);
    }

    @Test
    public void init() {


        ByteArrayInputStream in = new ByteArrayInputStream("3\n3 2\n4 3\n10 7\n".getBytes());
        System.setIn(in);

        PermutationHappiness.main(null);

        assertThat(outContent.toString(), is("4\n8\n1433856\n"));

    }

    @Test
    public void init2() {


        ByteArrayInputStream in = new ByteArrayInputStream("1\n7 4\n".getBytes());
        System.setIn(in);

        PermutationHappiness.main(null);

        assertThat(outContent.toString(), is("4768\n"));

    }

    // 7s
    @Test
    public void init3() {


        ByteArrayInputStream in = new ByteArrayInputStream("1\n11 8\n".getBytes());
        System.setIn(in);

        PermutationHappiness.main(null);

        assertThat(outContent.toString(), is("9248256\n"));

    }

    // 3s
    @Test
    public void init4() {


        ByteArrayInputStream in = new ByteArrayInputStream("1\n11 6\n".getBytes());
        System.setIn(in);

        PermutationHappiness.main(null);

        assertThat(outContent.toString(), is("39563008\n"));

    }

    // 61s
    @Test
    public void init5() {


        ByteArrayInputStream in = new ByteArrayInputStream("1\n12 7\n".getBytes());
        System.setIn(in);

        PermutationHappiness.main(null);

        assertThat(outContent.toString(), is("456633344\n"));

    }

    @Test
    public void init6() {


        ByteArrayInputStream in = new ByteArrayInputStream("1\n10 6\n".getBytes());
        System.setIn(in);

        PermutationHappiness.main(null);

        assertThat(outContent.toString(), is("3275008\n"));

    }

    @Test
    public void init7() {


        ByteArrayInputStream in = new ByteArrayInputStream("1\n9 7\n".getBytes());
        System.setIn(in);

        PermutationHappiness.main(null);

        assertThat(outContent.toString(), is("31872\n"));

    }

    // 9s
    @Test
    public void init8() {


        ByteArrayInputStream in = new ByteArrayInputStream("1\n50 42\n".getBytes());
        System.setIn(in);

        PermutationHappiness.main(null);

        assertThat(outContent.toString(), is("249002963\n"));

    }

    @Test
    public void init9() {


        ByteArrayInputStream in = new ByteArrayInputStream("1\n3000 1600\n".getBytes());
        System.setIn(in);

        PermutationHappiness.main(null);

        assertThat(outContent.toString(), is("459394569\n"));

    }



}