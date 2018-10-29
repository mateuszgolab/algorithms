package com.hackerrank.algorithms.implementation;


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class DayOfTheProgrammer {

    private static String leapYear = "12.09.";
    private static String switchLeapYear = "26.09.1918";
    private static String nonLeapYear = "13.09.";


    private static boolean isGregorianLeapYear(int year) {
        return (year % 400) == 0 || ((year % 4 == 0) && (year % 100 != 0));
    }

    private static boolean isJulianLeapYear(int year) {
        return (year % 4) == 0;
    }


    // Complete the dayOfProgrammer function below.
    static String dayOfProgrammer(int year) {

        if (year < 1918) {
            if (isJulianLeapYear(year)) return leapYear + String.valueOf(year);
            else return nonLeapYear + String.valueOf(year);
        } else if (year == 1918) {
            return switchLeapYear;
        } else {
            if (isGregorianLeapYear(year)) return leapYear + String.valueOf(year);
            else return nonLeapYear + String.valueOf(year);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int year = Integer.parseInt(bufferedReader.readLine().trim());

        String result = dayOfProgrammer(year);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
