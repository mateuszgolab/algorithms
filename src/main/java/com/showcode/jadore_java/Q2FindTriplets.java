package com.showcode.jadore_java;

class Q2FindTriplets {


    static int FindTriplets(int[] input) {

        int sum = 0;
        int index = 0;

        while (index < input.length - 2) {

            if (input[index] == input[index + 1] && input[index + 1] == input[index + 2]) {
                sum++;
                index += 3;
            } else {
                index++;
            }

        }

        return sum;

    }


}
