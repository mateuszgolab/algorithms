package com.hackerrank.algorithms.implementation;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.lang.Integer.MIN_VALUE;
import static java.lang.Integer.max;

class Easy {


    static int countingValleys(int n, String s) {

        int seaLevel = 0;
        int valleyCount = 0;

        for (Character ch : s.toCharArray()) {

            if (ch == 'D') seaLevel--;
            else {
                seaLevel++;
                if (seaLevel == 0) valleyCount++;
            }
        }

        return valleyCount;

    }

    static String dayOfProgrammer(int year) {

        String leapYear = "12.09.";
        String nonLeapYear = "13.09.";

        if (year < 1918) {
            if (isJulianLeapYear(year)) return leapYear + year;
            else return nonLeapYear + year;
        } else if (year == 1918) {
            return "26.09.1918";
        } else {
            if (isGregorianLeapYear(year)) return leapYear + year;
            else return nonLeapYear + year;
        }
    }

    static int pageCount(int n, int p) {
        return Math.min(p / 2, (n - p + (n + 1) % 2) / 2);
    }

    static int sockMerchant(int n, int[] ar) {

        return Arrays.stream(ar).
                boxed().
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).
                values().stream().
                mapToInt(v -> (int) (v / 2)).
                sum();

    }

    static int getMoneySpent(int[] keyboards, int[] drives, int b) {

        Arrays.sort(keyboards);
        Arrays.sort(drives);

        int price = -1;

        for (int keyboard : keyboards) {
            if (keyboard < b) {
                for (int drive : drives) {
                    int tmp = keyboard + drive;
                    if (tmp <= b) {
                        if (tmp > price) {
                            price = tmp;
                        }
                    } else {
                        break;
                    }
                }
            } else {
                break;
            }
        }

        return price;
    }

    static String catAndMouse(int x, int y, int z) {

        int catA = Math.abs(z - x);
        int catB = Math.abs(z - y);

        if (catA < catB) {
            return "Cat A";
        } else if (catB < catA) {
            return "Cat B";
        } else {
            return "Mouse C";
        }

    }

    static int pickingNumbers(List<Integer> a) {

        Collections.sort(a);
        int max = 0;

        for (int i = 0; i < a.size() - 1; i++) {
            int tmp = 1;
            for (int j = i + 1; j < a.size(); j++) {
                if (Math.abs(a.get(i) - a.get(j)) < 2) tmp++;
                else break;
            }

            if (tmp > max) max = tmp;

        }

        return max;


    }

    static int hurdleRace(int k, int[] height) {
        return Math.max(Arrays.stream(height).max().orElse(0) - k, 0);
    }

    static int designerPdfViewer(int[] h, String word) {

        int max = 0;
        for (Character ch : word.toCharArray()) {
            int index = ch - (int) 'a';
            max = Math.max(max, h[index]);
        }

        return word.length() * max;

    }

    static int utopianTree(int n) {

        int result = 1;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) result *= 2;
            else result++;
        }

        return result;

    }

    static String angryProfessor(int k, int[] a) {

        if (Arrays.stream(a).filter(v -> v <= 0).count() >= k) {
            return "NO";
        } else {
            return "YES";
        }

    }

    static int beautifulDays(int i, int j, int k) {

        int counter = 0;

        for (int l = i; l <= j; l++) {
            if (Math.abs(l - reverseInt(l)) % k == 0) counter++;
        }

        return counter;

    }

    static int viralAdvertising(int n) {

        int cummulative = 2;
        int lastLiked = 2;

        for (int i = 2; i <= n; i++) {
            lastLiked = lastLiked * 3 / 2;
            cummulative += lastLiked;
        }


        return cummulative;

    }

    static int saveThePrisoner(int n, int m, int s) {

        int result = ((m % n) + s - 1) % n;

        if (result == 0) return n;
        else return result;
    }

    static int[] circularArrayRotation(int[] a, int k, int[] queries) {

        int startIndex = k % a.length;
        int[] result = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            result[i] += a[(queries[i] - startIndex + a.length) % a.length];
        }

        return result;

    }

    static int[] permutationEquation(int[] p) {

        Map<Integer, Integer> map = new HashMap<>(p.length);
        int[] result = new int[p.length];

        for (int i = 0; i < p.length; i++) {
            map.put(p[i], i + 1);
        }


        for (int i = 0; i < p.length; i++) {
            result[i] = map.get(map.get(i + 1));
        }

        return result;

    }

    static int jumpingOnClouds(int[] c, int k) {

        int position = 0;
        int result = 100;

        do {

            position = (position + k) % c.length;
            result -= (1 + c[position] * 2);

        } while (position != 0);

        return result;

    }

    static int findDigits(int n) {

        int counter = 0;
        int number = n;

        while (number > 0) {

            int v = number % 10;
            if (v != 0 && n % v == 0) counter++;
            number /= 10;
        }

        return counter;

    }

    static String appendAndDelete(String s, String t, int k) {

        int common = 0;
        int n = Math.min(s.length(), t.length());

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == t.charAt(i)) {
                common++;
            } else {
                break;
            }
        }

        int diff = s.length() + t.length() - 2 * common;

        if (diff > k) return "No";
        else if (diff == k) return "Yes";
        else if (s.length() + t.length() <= k) return "Yes";
        else if ((k - diff) % 2 == 0 || (k - diff - 2 * s.length() > 0)) return "Yes";
        else return "No";

    }

    static int squares(int a, int b) {

        int counter = 0;

        for (long i = Math.round(Math.sqrt(a)); i <= b; i++) {
            if (i * i <= b) {
                if (i * i >= a) counter++;
            } else break;
        }

        return counter;

    }

    static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {

        if (y1 - y2 > 0) return 10000;
        if (y1 == y2) {
            if (m1 == m2) {
                if (d1 >= d2) {
                    return (d1 - d2) * 15;
                }
            } else if (m1 > m2) {
                return (m1 - m2) * 500;
            }
        }

        return 0;
    }

    static int[] cutTheSticks(int[] arr) {

        List<Integer> result = new ArrayList<>();

        Arrays.sort(arr);

        while (arr.length > 0) {

            result.add(arr.length);

            int min = arr[0];

            arr = Arrays.stream(arr).
                    map(v -> v - min).
                    filter(v -> v > 0).
                    toArray();

        }

        return result.stream().mapToInt(i -> i).toArray();

    }

    static long repeatedString(String s, long n) {

        if (!s.contains("a")) return 0;

        long counter = 0;
        long iterations = n / s.length();

        if (iterations > 0) {
            counter = iterations * s.chars().filter(v -> v == 'a').count();
        }

        long rest = n - (s.length() * iterations);

        counter += s.substring(0, (int) rest).chars().filter(v -> v == 'a').count();

        return counter;

    }

    static int jumpingOnClouds(int[] c) {

        int jumps = 0;
        int i = 0;

        while (i < c.length) {

            if ((i + 2) < c.length && c[i + 2] == 0) {
                i += 2;
                jumps++;
            } else if ((i + 1) < c.length && c[i + 1] == 0) {
                i++;
                jumps++;
            } else {
                break;
            }

        }

        return jumps;

    }

    static int equalizeArray(int[] arr) {

        Arrays.sort(arr);

        int max = 1;
        int previous = arr[0];
        int counter = 1;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] == previous) {
                counter++;
            } else {
                previous = arr[i];
                max = Math.max(max, counter);
                counter = 1;
            }
        }

        max = Math.max(max, counter);

        return arr.length - max;

    }

    static int[] acmTeam(String[] topic) {

        int max = 0;
        int counter = 0;

        for (int i = 0; i < topic.length; i++) {
            for (int j = i + 1; j < topic.length; j++) {

                int candidate = 0;

                for (int k = 0; k < topic[i].length(); k++) {
                    if (topic[i].charAt(k) == '1' || topic[j].charAt(k) == '1') {
                        candidate++;
                    }
                }
                if (candidate > max) {
                    max = candidate;
                    counter = 1;
                } else if (candidate == max) {
                    counter++;
                }
            }
        }

        return new int[]{max, counter};

    }

    static int taumBday(int b, int w, int bc, int wc, int z) {

        return Math.min(bc, (wc + z)) * b + Math.min(wc, (bc + z)) * w;

    }

    static List<Long> kaprekarNumbers(long p, long q) {

        List<Long> result = new ArrayList<>();

        for (long i = p; i <= q; i++) {

            long sq = i * i;
            String sqString = String.valueOf(sq);
            int d = (sqString.length() + 1) / 2;
            int r = sqString.length() - d;
            long left;
            long right = 0;

            if (r > 0) {
                left = Long.valueOf(sqString.substring(0, r));
                right = Long.valueOf(sqString.substring(r));
            } else {
                left = Long.valueOf(sqString);
            }

            if (left + right == i) {
                result.add(i);
            }

        }

        return result;

    }

    static int beautifulTriplets(int d, int[] arr) {

        int counter = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] - arr[i] == d) {
                    for (int k = j + 1; k < arr.length; k++) {
                        if (arr[k] - arr[j] == d) {
                            counter++;
                        }
                    }
                }
            }
        }

        return counter;

    }

    static int minimumDistances(int[] a) {

        if (a.length == 1) return -1;

        int min = a.length;

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] == a[i]) min = Math.min(min, j - i);
            }
            if (min == 1) return 1;
        }

        if (min == a.length) return -1;
        return min;

    }

    static int howManyGames(int p, int d, int m, int s) {

        int counter = 0;
        for (int i = p; i >= m && s >= 0; i -= d) {
            s -= i;
            counter++;
        }

        if (s >= 0) counter += (s / m);
        else counter--;

        return counter;

    }

    static int chocolateFeast(int n, int c, int m) {

        int bars;
        int totalBars = 0;
        int coins = n;
        int wrappers = 0;

        while (coins >= c || wrappers >= m) {

            bars = coins / c + wrappers / m;
            totalBars += bars;
            wrappers = wrappers % m + bars;
            coins = coins % c;

        }

        return totalBars;

    }

    static int[] serviceLane(int[] lane, int[][] cases) {

        int[] result = new int[cases.length];
        int index = 0;

        for (int[] c : cases) {

            int min = Integer.MAX_VALUE;
            for (int i = c[0]; i <= c[1]; i++) min = Math.min(lane[i], min);
            result[index++] = min;

        }

        return result;

    }

    static int workbook(int n, int k, int[] arr) {

        int result = 0;
        int min = 1;
        int max = Math.min(arr[0], k);
        int chapter = 0;
        int page = 1;

        while (chapter < arr.length) {

            if (page >= min && page <= max) result++;

            if (arr[chapter] - min + 1 > k) {
                min += k;
                max = Math.min(arr[chapter], min + k - 1);
            } else {
                chapter++;
                if (chapter < arr.length) {
                    min = 1;
                    max = Math.min(arr[chapter], k);
                }
            }
            page++;
        }

        return result;
    }

    static int flatlandSpaceStations(int n, int[] c) {

        int max = 0;
        for (int i = 0; i < n; i++) {
            int min = n;
            for (int city : c) {
                min = Math.min(min, Math.abs(city - i));
            }

            max = Math.max(max, min);
        }

        return max;

    }

    static int fairRations(int[] B) {

        int counter = 0;
        int previousRound;
        int round = 0;


        do {
            previousRound = round;
            round = 0;
            for (int i = 0; i < B.length; i++) {
                if (B[i] % 2 > 0) {
                    B[i]++;
                    if (i + 1 < B.length) B[i + 1]++;
                    else B[i - 1]++;
                    round += 2;
                }
            }

            counter += round;

        } while (round > 0 && previousRound != round);


        if (round > 0) {
            if (counter == 0) return 0;
            else return -1;
        }

        return counter;

    }

    static String[] cavityMap(String[] grid) {

        for (int i = 1; i < grid.length - 1; i++) {
            for (int j = 1; j < grid.length - 1; j++) {
                if (grid[i].charAt(j) > grid[i].charAt(j - 1) &&
                        grid[i].charAt(j) > grid[i].charAt(j + 1) &&
                        grid[i].charAt(j) > grid[i - 1].charAt(j) &&
                        grid[i].charAt(j) > grid[i + 1].charAt(j)) {

                    StringBuilder sb = new StringBuilder(grid[i]);
                    sb.replace(j, j + 1, "X");
                    grid[i] = sb.toString();
                }
            }
        }

        return grid;
    }

    static int[] stones(int n, int a, int b) {

        Set<Integer> initSet = new HashSet<>();
        initSet.add(0);

        Set<Integer> result = stonesRec(1, n, a, b, initSet);

        int[] resultInt = result.parallelStream().mapToInt(i -> i).toArray();

        Arrays.sort(resultInt);

        return resultInt;
    }

    private static Set<Integer> stonesRec(int i, int n, int a, int b, Set<Integer> set) {

        if (i >= n) return set;

        Set<Integer> tmpSet = set.parallelStream().map(v -> v + a).collect(Collectors.toSet());
        tmpSet.addAll(set.parallelStream().map(v -> v + b).collect(Collectors.toSet()));

        return stonesRec(i + 1, n, a, b, tmpSet);

    }

    static String happyLadybugs(String b) {

        long empty = b.chars().filter(v -> v == '_').count();

        if (b.length() - empty == 0) return "YES";


        Map<Character, Integer> map = new HashMap<>();

        for (Character c : b.toCharArray()) {
            if (c != '_') {
                map.merge(c, 1, (a, b1) -> b1 + 1);
            }
        }

        long singles = map.values().stream().filter(v -> v == 1).count();


        if (singles > 0) {
            return "NO";
        } else if (empty > 0) {
            return "YES";
        } else {
            for (int i = 1; i < b.length() - 1; i++) {
                if (b.charAt(i - 1) != b.charAt(i) && b.charAt(i + 1) != b.charAt(i)) return "NO";
            }

            return "YES";
        }

    }

    static long strangeCounter(long t) {

        long range = 3;
        long accm = range;

        while (t > accm) {
            range *= 2;
            accm += range;
        }

        accm -= range;

        return range - (t - accm) + 1;


    }

    static String[] bigSorting(String[] unsorted) {

        Arrays.sort(unsorted, (o1, o2) -> {
            if (o1.length() == o2.length()) return o1.compareTo(o2);
            else return o1.length() - o2.length();
        });

        return unsorted;

    }

    static List<List<Integer>> insertionSort1(int n, int[] arr) {

        List<List<Integer>> results = new ArrayList<>(n);
        int min = arr[arr.length - 1];
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());

        for (int i = arr.length - 2; i >= 0; i--) {

            if (arr[i] >= min) {
                list.set(i + 1, arr[i]);
                results.add(list);
                list = new ArrayList<>(list);
            } else {
                list.set(i + 1, min);
                results.add(list);
                min = MIN_VALUE;
                return results;
            }
        }

        if (min > MIN_VALUE) {
            list = new ArrayList<>(list);
            list.set(0, min);
            results.add(list);
        }

        return results;

    }

    static List<List<Integer>> insertionSort2(int n, int[] arr) {

        List<List<Integer>> results = new ArrayList<>(n);
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());

        for (int i = 1; i < n; i++) {
            Stack<Integer> stack = new Stack<>();
            for (int j = n - 1; j > i; j--) stack.push(list.get(j));

            int current = list.get(i);

            for (int j = i - 1; j >= 0; j--) {
                if (current > list.get(j)) {
                    stack.push(current);
                    for (int k = j; k >= 0; k--) stack.push(list.get(k));
                    break;
                } else {
                    stack.push(list.get(j));
                }
            }

            if (stack.size() < n) stack.push(current);


            list = new ArrayList<>(n);
            while (!stack.isEmpty()) {
                list.add(stack.pop());
            }

            results.add(list);

        }

        return results;


    }

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

        for(Character c : s.toCharArray()) {
            int lowAIndex = lowA.indexOf(c);
            if(lowAIndex > -1) {
                int shiftedIndex = (lowAIndex + k) % lowA.length();
                sb.append(lowA.charAt(shiftedIndex));
                continue;
            }

            int upIndex = upA.indexOf(c);
            if(upIndex > -1) {
                int shiftedIndex = (upIndex + k) % upA.length();
                sb.append(upA.charAt(shiftedIndex));
                continue;
            }

            sb.append(c);
        }


        return sb.toString();

    }



    // additional methods
    private static boolean isGregorianLeapYear(int year) {
        return (year % 400) == 0 || ((year % 4 == 0) && (year % 100 != 0));
    }

    private static boolean isJulianLeapYear(int year) {
        return (year % 4) == 0;
    }

    static int reverseInt(int n) {

        String intReversed = new StringBuilder(String.valueOf(n)).
                reverse().
                toString();

        return Integer.parseInt(intReversed);
    }


    // additional classes
    static class Pair<T> {

        T x;
        T y;

        Pair(T x, T y) {
            this.x = x;
            this.y = y;
        }

        public T getX() {
            return x;
        }

        public T getY() {
            return y;
        }

    }


}
