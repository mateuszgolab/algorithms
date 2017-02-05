package com.tesco.technology;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class PokerHandTest {

    @Test
    public void testOnePair() {

        List<Card> cards = Arrays.asList(new Card(Suit.HEARTS, Rank.K),
                new Card(Suit.SPADES, Rank.K),
                new Card(Suit.CLUBS, Rank._9),
                new Card(Suit.DIAMONDS, Rank._8),
                new Card(Suit.SPADES, Rank._4));

        PokerHand hand = new PokerHand(cards);

        assertThat(hand.getCategory(), is(Category.ONE_PAIR));

    }


    @Test
    public void testFlush() {

        List<Card> cards = Arrays.asList(new Card(Suit.HEARTS, Rank.Q),
                new Card(Suit.HEARTS, Rank.K),
                new Card(Suit.HEARTS, Rank._9),
                new Card(Suit.HEARTS, Rank._8),
                new Card(Suit.HEARTS, Rank._4));

        PokerHand hand = new PokerHand(cards);

        assertThat(hand.getCategory(), is(Category.FLUSH));

    }


    @Test
    public void testStriaght() {

        List<Card> cards = Arrays.asList(new Card(Suit.CLUBS, Rank.Q),
                new Card(Suit.HEARTS, Rank.K),
                new Card(Suit.HEARTS, Rank._9),
                new Card(Suit.HEARTS, Rank._10),
                new Card(Suit.HEARTS, Rank.J));

        PokerHand hand = new PokerHand(cards);

        assertThat(hand.getCategory(), is(Category.STRAIGHT));

    }

    @Test
    public void testStriaghtFlush() {

        List<Card> cards = Arrays.asList(new Card(Suit.HEARTS, Rank.Q),
                new Card(Suit.HEARTS, Rank.K),
                new Card(Suit.HEARTS, Rank._9),
                new Card(Suit.HEARTS, Rank._10),
                new Card(Suit.HEARTS, Rank.J));

        PokerHand hand = new PokerHand(cards);

        assertThat(hand.getCategory(), is(Category.STRAIGHT_FLUSH));

    }

    @Test
    public void testRoyalFlush() {

        List<Card> cards = Arrays.asList(new Card(Suit.HEARTS, Rank.Q),
                new Card(Suit.HEARTS, Rank.K),
                new Card(Suit.HEARTS, Rank.A),
                new Card(Suit.HEARTS, Rank._10),
                new Card(Suit.HEARTS, Rank.J));

        PokerHand hand = new PokerHand(cards);

        assertThat(hand.getCategory(), is(Category.ROYAL_FLUSH));

    }

    @Test
    public void testFourOfAKind() {

        List<Card> cards = Arrays.asList(new Card(Suit.HEARTS, Rank.K),
                new Card(Suit.CLUBS, Rank.K),
                new Card(Suit.HEARTS, Rank.A),
                new Card(Suit.DIAMONDS, Rank.K),
                new Card(Suit.SPADES, Rank.K));

        PokerHand hand = new PokerHand(cards);

        assertThat(hand.getCategory(), is(Category.FOUR_OF_A_KIND));

    }
}