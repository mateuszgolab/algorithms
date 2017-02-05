package com.codility.lessons.lesson3;

public class FrogJmp {

    public int solution(int X, int Y, int D) {
        int rest = (Y - X) % D;
        int result = (Y - X) / D;
        return (rest > 0) ? result + 1 : result;
    }

}
