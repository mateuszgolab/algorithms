package com.tesco.technology;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class PokerHand {

    private List<Card> cards;
    private Category category;

    public PokerHand(List<Card> cards) {
        this.cards = cards;
        this.category = categorize(cards);
    }

    public Category getCategory() {
        return this.category;
    }

    private Category categorize(List<Card> cards) {

        Collections.sort(cards);

        boolean isFlush = isFlush(cards);
        boolean isStraight = isStraight(cards);

        if (isFlush && isStraight) {

            if(containsRank(Rank.A) && containsRank(Rank.K)) {
                return Category.ROYAL_FLUSH;
            }

            return Category.STRAIGHT_FLUSH;

        } else if (isFlush) {
            return Category.FLUSH;
        } else if (isStraight) {
            return Category.STRAIGHT;
        }

//        Map<Rank, Integer> ranksMap = new HashMap<>();
//
//        cards.forEach(card -> r);


        if (getDistinctRankSize(cards) == 4) {
            return Category.ONE_PAIR;
        }


        return Category.HIGH_CARD;

    }

    private int getDistinctRankSize(List<Card> cards) {

        return cards.
                stream().
                map(Card::getRank).
                collect(Collectors.toSet()).
                size();
    }

    private int getDistinctSuitSize(List<Card> cards) {

        return cards.
                stream().
                map(Card::getSuit).
                collect(Collectors.toSet()).
                size();
    }

    private boolean isFlush(List<Card> cards) {
        return getDistinctSuitSize(cards) == 1;
    }

    private boolean isStraight(List<Card> cards) {
        int distance = cards.get(4).getRank().ordinal() - cards.get(0).getRank().ordinal();
        return distance == 4;

    }

    private boolean containsRank(Rank rank) {

        return !cards.stream().
                filter(card -> card.getRank().equals(rank)).
                collect(Collectors.toList()).
                isEmpty();
    }
}
