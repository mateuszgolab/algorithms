package com.google.codejam._2019.q;

import java.math.BigInteger;
import java.util.Scanner;

public class Solution1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 1; i <= t; i++) {

            BigInteger n = in.nextBigInteger();
            String output = foregoneSolution(n);

            System.out.println("Case #" + i + ": " + output);

        }
    }

    static String foregoneSolution(BigInteger n) {

        BigInteger originalN = n;
        BigInteger secondCheck = BigInteger.ZERO;
        BigInteger multiplier = BigInteger.ONE;
        BigInteger TEN = BigInteger.valueOf(10);
        BigInteger FOUR = BigInteger.valueOf(4);

        while (n.compareTo(BigInteger.ZERO) > 0) {
            BigInteger m = n.mod(TEN);
            if (m.compareTo(FOUR) == 0) {
                secondCheck = secondCheck.add(multiplier);
            }
            n = n.divide(TEN);
            multiplier = multiplier.multiply(TEN);
        }

        return (originalN.subtract(secondCheck)) + " " + secondCheck;
    }


}
