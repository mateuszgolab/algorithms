package com.santander.isban;

import java.util.HashMap;
import java.util.Map;

public class CompletingADnaStrand {



    private static Map<Character,Character> dnaMap = new HashMap<>();

    static {
        dnaMap.put('A','T');
        dnaMap.put('T','A');
        dnaMap.put('C','G');
        dnaMap.put('G','C');
    }



    static String dnaComplement(String s) {

        String reversed = new StringBuilder(s).reverse().toString();
        StringBuilder result = new StringBuilder();

        for(Character ch :reversed.toCharArray()){
            result.append(dnaMap.get(ch));
        }

        return result.toString();

    }

}
