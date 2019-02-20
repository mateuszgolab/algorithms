package com.hackerrank.algorithms.strings;


import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static com.utils.Common.isPalindrome;
import static java.lang.Integer.max;

class StringsEasy {

    static String superReducedString(String s) {

        StringBuilder sb = new StringBuilder(s);
        boolean change = true;

        while (sb.length() > 0 && change) {
            change = false;

            for (int i = 0; i < sb.length() - 1; i++) {
                if (sb.charAt(i) == sb.charAt(i + 1)) {
                    sb.replace(i, i + 2, "");
                    change = true;
                    break;
                }
            }
        }

        return sb.length() == 0 ? "Empty String" : sb.toString();

    }

    static int camelcase(String s) {

        return (int) (s.chars().filter(ch -> ch >= 'A' && ch <= 'Z').count() + 1);

    }

    static int minimumNumber(int n, String password) {

        final String specialCharacters = "!@#$%^&*()-+";

        int numbers = 0;
        int lowerCase = 0;
        int upperCase = 0;
        int special = 0;

        for (Character c : password.toCharArray()) {
            if (c >= 'a' && c <= 'z') lowerCase++;
            else if (c >= 'A' && c <= 'Z') upperCase++;
            else if (c >= '0' && c <= '9') numbers++;
            else if (specialCharacters.contains(c + "")) special++;
        }

        int missing = (lowerCase == 0) ? 1 : 0;
        if (upperCase == 0) missing++;
        if (numbers == 0) missing++;
        if (special == 0) missing++;

        return max(6 - n, missing);

    }

    static String reduceString(String s) {

        String tmp;

        do {

            tmp = s;

            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i) == s.charAt(i - 1)) {
                    s = s.replace(String.valueOf(s.charAt(i)), "");
                    break;
                }
            }

        } while (s.length() < tmp.length());


        return s;

    }

    static int alternate(String s) {

        s = reduceString(s);

        long count = s.chars().parallel().distinct().count();

        if (count == 2) {
            return s.length();
        } else if (count < 2) {
            return 0;
        } else if (s.length() == count) {
            return 2;
        }


        Map<String, Long> map = Arrays.stream(s.split("")).
                collect(Collectors.groupingBy(c -> c, Collectors.counting())).
                entrySet().stream().
                sorted(Map.Entry.comparingByValue()).
                collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        List<String> keys = new ArrayList<>(map.keySet());

        int max = 0;

        for (int i = keys.size() - 1; i >= 0; i--) {
            for (int j = i - 1; j >= 0; j--) {

                String k1 = keys.get(i);
                String k2 = keys.get(j);

                if (Math.abs(map.get(k1) - map.get(k2)) < 2) {

                    String newString = s;
                    for (String c : keys) {
                        if (!c.equals(k1) && !c.equals(k2)) {
                            newString = newString.replace(c, "");
                        }
                    }

                    max = Math.max(max, alternate(newString));

                } else {
                    // increment i, no point to continue with j (keys are sorted, because map is sorted)
                    break;
                }

            }
        }

        return max;


    }

    static String caesarCipher(String s, int k) {

        String lowA = "abcdefghijklmnopqrstuvwxyz";
        String upA = lowA.toUpperCase();

        StringBuilder sb = new StringBuilder();

        for (Character c : s.toCharArray()) {
            int lowAIndex = lowA.indexOf(c);
            if (lowAIndex > -1) {
                int shiftedIndex = (lowAIndex + k) % lowA.length();
                sb.append(lowA.charAt(shiftedIndex));
                continue;
            }

            int upIndex = upA.indexOf(c);
            if (upIndex > -1) {
                int shiftedIndex = (upIndex + k) % upA.length();
                sb.append(upA.charAt(shiftedIndex));
                continue;
            }

            sb.append(c);
        }


        return sb.toString();

    }

    static int marsExploration(String s) {

        int counter = 0;
        String sos = "SOS";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != sos.charAt(i % 3)) counter++;
        }

        return counter;

    }

    static String hackerrankInString(String s) {

        String check = "hackerrank";
        int index = 0;

        for (Character c : s.toCharArray()) {
            if (c == check.charAt(index)) index++;
            if (index >= check.length()) return "YES";
        }

        return "NO";

    }

    static String pangrams(String s) {

        Set<Character> letters = new HashSet<>();

        for (Character c : s.toLowerCase().replace(" ", "").toCharArray()) {
            letters.add(c);
        }

        return (letters.size() < 26) ? "not pangram" : "pangram";

    }

    static String[] weightedUniformStrings(String s, int[] queries) {

        Map<Integer, Boolean> map = new HashMap<>();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        char previous = ' ';
        int counter = 0;

        for (Character c : s.toCharArray()) {

            if (c == previous) {
                counter++;
            } else {
                counter = 1;
            }

            int weight = alphabet.indexOf(c) + 1;
            map.put(weight * counter, true);
            previous = c;
        }

        return Arrays.stream(queries).
                mapToObj(q -> map.containsKey(q) ? "Yes" : "No").
                toArray(String[]::new);

    }

    static long separateNumbers(String s) {

        int maxSize = s.length() / 2;

        for (int size = 1; size <= maxSize; size++) {

            String s2 = s;
            long n = Long.valueOf(s2.substring(0, size));

            while (!s2.isEmpty()) {

                String candidateString = String.valueOf(n) + (n + 1);

                if (s2.startsWith(candidateString)) {
                    s2 = s2.replaceFirst(String.valueOf(n), "");
                    n++;
                    if (s2.compareTo(String.valueOf(n)) == 0) s2 = "";
                } else {
                    break;
                }
            }


            if (s2.isEmpty()) {
                return Long.valueOf(s.substring(0, size));
            }
        }

        return -1;

    }

    static String funnyString(String s) {

        String r = new StringBuilder(s).reverse().toString();

        for (int i = 0; i < s.length() - 1; i++) {

            if (Math.abs(s.charAt(i + 1) - s.charAt(i)) != Math.abs(r.charAt(i + 1) - r.charAt(i))) {
                return "Not Funny";
            }

        }

        return "Funny";

    }

    static int gemstones(String[] arr) {

        Set<Character> set = new HashSet<>();

        for (String s : arr) {

            List<Character> list = s.chars().mapToObj(e -> (char) e).collect(Collectors.toList());

            if (!set.isEmpty()) {
                set.retainAll(list);
                if (set.isEmpty()) return 0;
            } else {
                set.addAll(list);
            }

        }

        return set.size();

    }

    static int alternatingCharacters(String s) {

        int counter = 0;
        char previous = s.charAt(0);

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == previous) counter++;
            else previous = s.charAt(i);
        }

        return counter;

    }

    static int beautifulBinaryString(String b) {

        int count = 0;

        while (b.contains("010")) {
            b = b.replaceFirst("010", "011");
            count++;
        }

        return count;

    }

    static int theLoveLetterMystery(String s) {

        int counter = 0;

        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            counter += Math.abs(s.charAt(i) - s.charAt(j));
        }

        return counter;

    }

    static int palindromeIndex(String s) {

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {

                String candidate = s.substring(0, i) + s.substring(i + 1);
                if (isPalindrome(candidate)) {
                    return i;
                }

                candidate = s.substring(0, s.length() - 1 - i) + s.substring(s.length() - i);
                if (isPalindrome(candidate)) {
                    return s.length() - 1 - i;
                }

                return -1;
            }

        }

        return -1;

    }

    static int anagram(String s) {

        if (s.length() % 2 != 0) return -1;

        List<Character> letters = s.chars().distinct().mapToObj(i -> (char) i).collect(Collectors.toList());

        Map<Character, Long> word1Map = s.substring(0, s.length() / 2).
                chars().
                mapToObj(i -> (char) i).
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Map<Character, Long> word2Map = s.substring(s.length() / 2).
                chars().
                mapToObj(i -> (char) i).
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));


        Long counter = 0L;

        for (Character c : letters) {
            long diff = word1Map.getOrDefault(c, 0L) - word2Map.getOrDefault(c, 0L);
            if (diff > 0) {
                counter += diff;
            }
        }

        return counter.intValue();


    }

    static int makingAnagrams(String s1, String s2) {

        List<Character> letters = (s1 + s2).chars().distinct().mapToObj(i -> (char) i).collect(Collectors.toList());

        Map<Character, Long> word1Map = s1.chars().
                mapToObj(i -> (char) i).
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Map<Character, Long> word2Map = s2.chars().
                mapToObj(i -> (char) i).
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));


        Long counter = 0L;

        for (Character c : letters) {
            long diff = Math.abs(word1Map.getOrDefault(c, 0L) - word2Map.getOrDefault(c, 0L));
            counter += diff;

        }

        return counter.intValue();

    }


}
