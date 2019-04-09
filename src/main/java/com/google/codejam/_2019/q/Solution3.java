package com.google.codejam._2019.q;

import java.math.BigInteger;
import java.util.*;

public class Solution3 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 1; i <= t; i++) {

            BigInteger n = in.nextBigInteger();
            int l = in.nextInt();

            List<BigInteger> numbers = new ArrayList<>(l);

            for (int j = 0; j < l; j++) {
                numbers.add(in.nextBigInteger());
            }

            String output = cryptopangrams(numbers);

            System.out.println("Case #" + i + ": " + output);

        }
    }

    static String cryptopangrams(List<BigInteger> bigNumbers) {

//        List<BigInteger> bigNumbers = numbers.stream().
//                map(BigInteger::valueOf).
//                collect(Collectors.toList());


        Set<BigInteger> primesFound = new HashSet<>(bigNumbers.size());
        List<BigInteger> alphabet = new ArrayList<>(bigNumbers.size() + 1);
        BigInteger gcdPrime = BigInteger.ONE;


        for (int i = 0; i < bigNumbers.size() - 2; i++) {
            if (!bigNumbers.get(i + 1).equals(bigNumbers.get(i))) {
                BigInteger tmp = bigNumbers.get(i + 1).gcd(bigNumbers.get(i));
                if (i % 2 == 0) {
                    gcdPrime = tmp;
                } else{
                    gcdPrime = bigNumbers.get(0).gcd(tmp);
                }
                break;
            } else if (!bigNumbers.get(i + 2).equals(bigNumbers.get(i + 1))) {
                BigInteger tmp = bigNumbers.get(i + 2).gcd(bigNumbers.get(i + 1));
                if (i % 2 == 0) {
                    gcdPrime = bigNumbers.get(0).divide(tmp);
                } else{
                    gcdPrime = tmp;
                }
                break;
            }
        }


        BigInteger prime1 = bigNumbers.get(0).divide(gcdPrime);
        BigInteger latestPrime = bigNumbers.get(1).divide(gcdPrime);

        alphabet.add(prime1);
        alphabet.add(gcdPrime);
        alphabet.add(latestPrime);
        primesFound.addAll(alphabet);

        for (int i = 2; i < bigNumbers.size(); i++) {
            latestPrime = bigNumbers.get(i).divide(latestPrime);
            alphabet.add(latestPrime);
            primesFound.add(latestPrime);
        }

        List<BigInteger> primesSorted = new ArrayList<>(primesFound);
        primesSorted.sort(null);
        char letter = 'A';
        Map<BigInteger, Character> map = new HashMap<>();
        for (BigInteger p : primesSorted) {
            map.put(p, letter++);
        }

        StringBuilder sb = new StringBuilder(bigNumbers.size());

        for (BigInteger p : alphabet) {
            sb.append(map.get(p));
        }

        return sb.toString();

    }



}
