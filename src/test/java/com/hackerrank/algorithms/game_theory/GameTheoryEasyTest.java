package com.hackerrank.algorithms.game_theory;

import org.junit.Test;

import static com.hackerrank.algorithms.game_theory.GameTheoryEasy.*;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GameTheoryEasyTest {

    @Test
    public void testGameOfStones() {

        assertThat(gameOfStones(1), is("Second"));
        assertThat(gameOfStones(2), is("First"));
        assertThat(gameOfStones(3), is("First"));
        assertThat(gameOfStones(4), is("First"));
        assertThat(gameOfStones(5), is("First"));
        assertThat(gameOfStones(6), is("First"));
        assertThat(gameOfStones(7), is("Second"));
        assertThat(gameOfStones(8), is("Second"));
        assertThat(gameOfStones(9), is("First"));
        assertThat(gameOfStones(10), is("First"));
        assertThat(gameOfStones(11), is("First"));

    }

    @Test
    public void testTowerBreakers() {

        assertThat(towerBreakers(2,2), is(2));
        assertThat(towerBreakers(1,4), is(1));
        assertThat(towerBreakers(2,6), is(2));
        assertThat(towerBreakers(1,6), is(1));
        assertThat(towerBreakers(1,14), is(1));
        assertThat(towerBreakers(2,8), is(2));
        assertThat(towerBreakers(1,8), is(1));
        assertThat(towerBreakers(1,1), is(2));

    }

    @Test
    public void testChessboardGame() {

        assertThat(chessboardGame(5,2), is("Second"));
        assertThat(chessboardGame(5,3), is("First"));
        assertThat(chessboardGame(8,8), is("First"));


    }

    @Test
    public void testNimGame1() {

        assertThat(nimGame(new int[]{1,1}), is("Second"));
        assertThat(nimGame(new int[]{2,1,4}), is("First"));
        assertThat(nimGame(new int[]{5,5}), is("Second"));
        assertThat(nimGame(new int[]{5,5,1,7}), is("First"));
        assertThat(nimGame(new int[]{3,5}), is("First"));
        assertThat(nimGame(new int[]{1,3,5,7}), is("Second"));
        assertThat(nimGame(new int[]{2,5}), is("First"));

    }

    @Test
    public void testMisereNimGame1() {

        assertThat(misereNimGame(new int[]{9,8,4,4,4,7}), is("First"));
        assertThat(misereNimGame(new int[]{2}), is("First"));
        assertThat(misereNimGame(new int[]{3}), is("First"));
        assertThat(misereNimGame(new int[]{4}), is("First"));
        assertThat(misereNimGame(new int[]{2,1,3}), is("Second"));
        assertThat(misereNimGame(new int[]{1,1}), is("First"));
        assertThat(misereNimGame(new int[]{1,1,1}), is("Second"));
        assertThat(misereNimGame(new int[]{1}), is("Second"));




    }

}