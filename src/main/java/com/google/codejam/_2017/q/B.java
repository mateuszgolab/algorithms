package com.google.codejam._2017.q;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class B {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 1; i <= t; i++) {

            List<Integer> numberList = in.next().
                    chars().
                    map(e -> e - '0').boxed().
                    collect(Collectors.toList());

            while (!isSorted(numberList)) {

                int lastSortedIndex = getLastSortedIndex(numberList);
                int number = numberList.get(lastSortedIndex);

                numberList.set(lastSortedIndex, number - 1);
                setMaxValuesForSuffixNumbers(numberList, lastSortedIndex + 1);

            }

            System.out.println("Case #" + i + ": " + getNumber(numberList));

        }
    }


    private static void setMaxValuesForSuffixNumbers(List<Integer> numberList, int index) {

        for (int i = index; i < numberList.size(); i++) {
            numberList.set(i, 9);
        }

    }

    private static int getLastSortedIndex(List<Integer> numberList) {

        for (int i = 0; i < numberList.size() - 1; i++) {
            if (numberList.get(i) > numberList.get(i + 1)) {
                return i;
            }
        }

        return numberList.size() - 1;
    }

    private static String getNumber(List<Integer> numberList) {

        StringBuilder stringBuilder = new StringBuilder();
        numberList.
                stream().
                filter(i -> i > 0).
                forEach(stringBuilder::append);

        return stringBuilder.toString();
    }

    private static boolean isSorted(List<Integer> numberList) {

        return getLastSortedIndex(numberList) == (numberList.size() - 1);
    }


}
