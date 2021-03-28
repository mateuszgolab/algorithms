package com.google.codejam._2020.q;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class VestigiumTest {

    @Test
    public void testExample() {

        int n = 4;

        int[][] matrix = new int[n][n];
        for(int i = 0; i < n; i++){
            matrix[i][0] = matrix[0][i] = i + 1;
            matrix[i][i] = 1;
            matrix[n-1][i] = matrix[i][n-1] = n - i;
        }
        matrix[1][2] = matrix[2][1] = 4;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

        String output = Vestigium.matrix(matrix);

        assertThat(output, is("4 0 0"));

    }

    @Test
    public void testMin() {

        int n = 2;

        int[][] matrix = new int[n][n];

        matrix[0][0] = 1;
        matrix[0][1] = 1;
        matrix[1][0] = 3;
        matrix[1][1] = 1;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

        String output = Vestigium.matrix(matrix);

        assertThat(output, is("2 1 1"));

    }


}