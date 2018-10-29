package com.hackerrank.algorithms.implementation;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class BonApetit {

    // Complete the bonAppetit function below.
    static int bonAppetit(List<Integer> bill, int k, int b) {
        return b - (bill.stream().mapToInt(Integer::intValue).sum() - bill.get(k)) / 2;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] nk = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        List<Integer> bill = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int b = Integer.parseInt(bufferedReader.readLine().trim());

        int result = bonAppetit(bill, k, b);
        if (result == 0) System.out.println("Bon Appetit");
        else System.out.println(result);

        bufferedReader.close();
    }
}
