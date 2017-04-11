package com.google.codejam._2016._1a;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TheLastWord {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 1; i <= t; i++) {
            String n = in.next();
            Deque<Character> queue = new ArrayDeque<>(n.length());
            queue.add(n.charAt(0));
            for (int j = 1; j < n.length(); j++) {
                char ch = n.charAt(j);
                if (ch >= queue.peekFirst()) {
                    queue.addFirst(ch);
                } else {
                    queue.addLast(ch);
                }
            }

            System.out.println("Case #" + i + ": " + queue.stream().map(Object::toString).collect(Collectors.joining()));

        }


    }

}
