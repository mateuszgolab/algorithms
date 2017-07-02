package com.hackerrank.algorithms.competitions.world_code_sprint_10;

import java.util.*;

public class PermutationHappiness {

    private static long MODULO = 1000000007;
    private static long F[][] = new long[3001][3001];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for (int a0 = 0; a0 < q; a0++) {
            int n = in.nextInt();
            int k = in.nextInt();

            long result = query(n, k);
            System.out.println(result);
        }
    }

    private static long query(int n, int k) {

        if (k <= n / 2) {
            return factorial(n);
        } else if (k == n) {
            return 0;
        } else if (k == n - 1) {
            return power2(n - 1);
        } else {
            long result = 0;
            for (int i = k; i < n; i++) {
                int s = n - 1 - i;
                result = (result + f(s, n)) % MODULO;
            }

            return result;
        }

    }

    private static long f(int s, int n) {

        if(F[s][n] != 0) return F[s][n];

        if (s == 0) {
            F[s][n] = power2(n - 1);
            return F[s][n];
        } else if (s >= (n + 1) / 2) {
            return 0;
        } else {
            F[s][n] = (((n - 2 * s) * f(s - 1, n - 1)) % MODULO + ((2 * s + 2) * f(s, n - 1)) % MODULO) % MODULO;
            return F[s][n];
        }
    }

    private static long power2(long n) {

        long res = 1;

        for (long i = 1; i <= n; i++) {
            res = (res * 2) % MODULO;
        }

        return res;

    }

    private static long factorial(long n) {

        if (n == 0) return 1;
        if (n < 3) return n;

        long res = 2;

        for (long l = 3; l <= n; l++) {
            res = (res * l) % MODULO;
        }

        return res;
    }
}
