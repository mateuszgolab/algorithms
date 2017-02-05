package com.tesco.technology;

public class Task1 {

    public int solution(String S) {

        // skip leading zeros

        String input = "";

        for(int i = 0; i < S.length(); i++) {
            if(S.charAt(i) == '1'){
                input = S.substring(i);
                break;
            }
        }

        if(input.isEmpty()) {
            return 0;
        }

        // count number of 1
        int numberOf1 = input.length() - input.replace("1", "").length();

        // count number of 0
        int numberOf0 = input.length() - input.replace("0", "").length();

        // (number of 1) * 2 + (number of 0) - 1
        return numberOf1 * 2 + numberOf0 - 1;

    }

}
