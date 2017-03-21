package com.hackerrank.algorithms.warmup;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TimeConversion {

    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);
        String time = in.next();

        SimpleDateFormat dateFormatter = new SimpleDateFormat("hh:mm:ssaaa");
        Date d = dateFormatter.parse(time);
        dateFormatter.applyPattern("HH:mm:ss");

        System.out.println(dateFormatter.format(d));

    }
}
