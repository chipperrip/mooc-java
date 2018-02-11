
import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Chipper
 */
public class Hand implements Comparable<Hand> {

    private ArrayList<Card> hand;

    public Hand() {
        this.hand = new ArrayList<Card>();
    }

    public void add(Card card) {
        hand.add(card);
    }

    public void print() {
        for (Card card : hand) {
            System.out.println(card);
        }
    }

    public void sort() {
        Collections.sort(hand);
    }

    public int sum() {
        int sum = 0;
        for (Card card : hand) {
            sum += card.getValue();
        }

        return sum;
    }

    public void sortAgainstSuit() {
        Collections.sort(hand, new SortAgainstSuitAndValue());
    }

    @Override
    public int compareTo(Hand otherHand) {
        return this.sum() - otherHand.sum();
    }

}
