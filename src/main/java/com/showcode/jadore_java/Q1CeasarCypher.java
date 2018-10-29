package com.showcode.jadore_java;


class Q1CeasarCypher {

    static String CeasarCypher(String input, int key) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {

            Character ch = input.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                if (ch + key <= 'z') sb.append((char) (ch + key));
                else sb.append((char) (ch + key - 'z' + 'a' - 1));

            } else if (ch >= 'A' && ch <= 'Z') {
                if (ch + key <= 'Z') sb.append((char) (ch + key));
                else sb.append((char) (ch + key - 'Z' + 'A' - 1));

            } else {
                sb.append(ch);
            }
        }

        return sb.toString();

    }



}


