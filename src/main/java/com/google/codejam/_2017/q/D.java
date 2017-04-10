package com.google.codejam._2017.q;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class D {

    private static char show[][];
    private static boolean diagonalR[];
    private static boolean diagonalL[];
    private static boolean columns[];
    private static int total;
    private static List<String> solution;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 1; i <= t; i++) {

            int n = in.nextInt();
            int m = in.nextInt();

            show = new char[n][n];
            diagonalR = new boolean[(2 * n) * (2 * n)];
            diagonalL = new boolean[(2 * n) * (2 * n)];
            columns = new boolean[n];
            solution = new ArrayList<>();
            total = 0;

            for (int j = 0; j < m; j++) {
                String model = in.next();
                int row = in.nextInt();
                int col = in.nextInt();

                show[col - 1][row - 1] = model.charAt(0);

                if (show[col - 1][row - 1] == 'o') {
                    diagonalR[col - 1 - row - 1 + (2 * n * n)] = true;
                    diagonalL[row - 1 + col - 1 + (2 * n * n)] = true;
                    columns[col - 1] = true;
                }

            }

            if (n > 2) {
                int termination = (n == 3) ? 1 : n - 1;
                solveUsingHetmans(0, n, termination, i);
            } else {
                solveManually(n, m, i);
            }

            addPlus(n);
            addX(n);

            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (show[j][k] == '+' || show[j][k] == 'x') {
                        solution.add(show[j][k] + " " + (j + 1) + " " + (k + 1));
                        total++;
                    }
                }
            }

            System.out.println("Case #" + i + ": " + total + " " + solution.size());
            for (String s : solution) {
                System.out.println(s);
            }

        }
    }

    private static void solveManually(int n, int m, int i) {

        if (n == 1) {
            if (m == 0) {
                solution.add("o 1 1");
            }
        } else {
            if (show[0][0] != 'o' && show[0][1] != 'o' && show[1][0] != 'o' && show[1][1] != 'o') {
                show[0][0] = 'o';
                solution.add("o 1 1");
            }
        }

        total = 2;

    }


    private static boolean isPossible(int col, int row, int n) {
        return show[col][row] != '+' &&
                show[col][row] != 'x' &&
                checkRow(col, n) &&
                chechColumn(row, n) &&
                checkDiagonals(col, row, n) &&
                !((columns[col]) || (diagonalR[col - row + (2 * n * n)]) || (diagonalL[row + col + (2 * n * n)]));
    }

    private static void solveUsingHetmans(int row, int n, int termination, int i) {
        for (int col = 0; col < n; col++) {
            if (isPossible(col, row, n)) {

                diagonalR[col - row + (2 * n * n)] = true;
                diagonalL[row + col + (2 * n * n)] = true;
                columns[col] = true;
                show[col][row] = 'o';

                if (row < termination) {
                    solveUsingHetmans(row + 1, n, termination, i);
                } else {
                    checkSolution(n, i);
                }

                diagonalR[col - row + 2 * n * n] = false;
                diagonalL[row + col + 2 * n * n] = false;
                columns[col] = false;
                show[col][row] = 0;
            }
        }
    }

    private static void addPlus(int n) {
        for (int rows = 0; rows < n; rows++) {
            for (int cols = 0; cols < n; cols++) {
                if (show[rows][cols] == 0) {
                    if (checkDiagonals(rows, cols, n)) {
                        show[rows][cols] = '+';
                    }
                }
            }
        }
    }

    private static void addX(int n) {
        for (int rows = 0; rows < n; rows++) {
            for (int cols = 0; cols < n; cols++) {
                if (show[rows][cols] == 0) {
                    if (checkRow(rows, n) && chechColumn(cols, n)) {
                        show[rows][cols] = 'x';
                    }
                }
            }
        }
    }

    private static boolean chechColumn(int col, int n) {
        for (int r = 0; r < n; r++) {
            if (show[r][col] == 'x' || show[r][col] == 'o') {
                return false;
            }
        }

        return true;
    }

    private static boolean checkRow(int row, int n) {

        for (int c = 0; c < n; c++) {
            if (show[row][c] == 'x' || show[row][c] == 'o') {
                return false;
            }
        }

        return true;
    }

    private static boolean checkDiagonals(int row, int col, int n) {

        for (int r = row, c = col; r >= 0 && c >= 0; r--, c--) {
            if (show[r][c] == '+' || show[r][c] == 'o') {
                return false;
            }
        }

        for (int r = row, c = col; r < n && c < n; r++, c++) {
            if (show[r][c] == '+' || show[r][c] == 'o') {
                return false;
            }
        }

        for (int r = row, c = col; r >= 0 && c < n; r--, c++) {
            if (show[r][c] == '+' || show[r][c] == 'o') {
                return false;
            }
        }

        for (int r = row, c = col; r >= 0 && c < n; r--, c++) {
            if (show[r][c] == '+' || show[r][c] == 'o') {
                return false;
            }
        }


        return true;

    }

    private static void checkSolution(int n, int i) {

        int counter = 0;

        for (int j = 0; j < n; j++) {
            for (int k = 0; k < n; k++) {
                if (show[j][k] == 'o') counter++;
            }
        }


        if (counter > total) {
            total = counter * 2;
            solution = new ArrayList<>(n);
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (show[j][k] == 'o') {
                        solution.add(show[j][k] + " " + (j + 1) + " " + (k + 1));
                    }
                }
            }
        }

    }

}
