package com.santander.isban;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class BSTTest {


    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream printStream = new PrintStream(outContent);

    @Before
    public void before() {
        System.setOut(printStream);
    }

    @Test
    public void test1() {

        BST.createBST(new int[]{1,2,3});

        assertThat(outContent.toString(), is("0\n1\n3\n"));

    }

    @Test
    public void test2() {

        BST.createBST(new int[]{2,1,3});

        assertThat(outContent.toString(), is("0\n1\n2\n"));

    }




}