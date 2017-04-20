package com.google.codejam._2017._1a;

import java.util.Scanner;

public class AlphabetCake {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 1; i <= t; i++) {

            int r = in.nextInt();
            int c = in.nextInt();

            char[][] array = new char[r][c];

            for (int j = 0; j < r; j++) {
                String row = in.next();
                for (int k = 0; k < row.length(); k++) {
                    array[j][k] = row.charAt(k);
                }
            }

            // rows
            for (int j = 0; j < r; j++) {
                char currentChar = '?';
                for (int k = 0; k < c; k++) {
                    if (array[j][k] == '?') {
                        if (currentChar != '?') {
                            array[j][k] = currentChar;
                        } else {
                            currentChar = array[j][k];
                        }
                    } else {
                        currentChar = array[j][k];
                    }
                }

                currentChar = '?';
                for (int k = c - 1; k > -1; k--) {
                    if (array[j][k] == '?') {
                        if (currentChar != '?') {
                            array[j][k] = currentChar;
                        } else {
                            currentChar = array[j][k];
                        }
                    } else {
                        currentChar = array[j][k];
                    }
                }
            }


            // columns
            for (int k = 0; k < c; k++) {
                char currentChar = '?';
                for (int j = 0; j < r; j++) {
                    if (array[j][k] == '?') {
                        if (currentChar != '?') {
                            array[j][k] = currentChar;
                        } else {
                            currentChar = array[j][k];
                        }
                    } else {
                        currentChar = array[j][k];
                    }
                }

                currentChar = '?';
                for (int j = r - 1; j > -1; j--) {
                    if (array[j][k] == '?') {
                        if (currentChar != '?') {
                            array[j][k] = currentChar;
                        } else {
                            currentChar = array[j][k];
                        }
                    } else {
                        currentChar = array[j][k];
                    }
                }
            }

            System.out.println("Case #" + i + ":");
            for (int j = 0; j < r; j++) {
                for (int k = 0; k < c; k++) {
                    System.out.print(array[j][k]);
                }
                System.out.println();
            }

        }
    }
}
