import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Hand implements Comparable<Hand> {
    private ArrayList<Card> hand;
    
    public Hand() {
        hand = new ArrayList<>();
    }
    
    public void add(Card card) {
        hand.add(card);
    }
    
    public void print() {
        for (Card card: hand) {
            System.out.println(card);
        }
    }
    
    public void sort() {
        Collections.sort(hand);
    }
    
    public int compareTo(Hand otherHand) {
        if (this.sumOfHand(this.hand) == otherHand.sumOfHand(otherHand.getHand())) {
            return 0;
        } else if (this.sumOfHand(this.hand) > otherHand.sumOfHand(otherHand.getHand())) {
            return 1;
        } else {
            return -1;
        }
        
    }
    
    public ArrayList<Card> getHand() {
        return this.hand;
    }
    
    public int sumOfHand(ArrayList<Card> hand) {
        int total = 0;
        for (Card card: hand) {
            total += card.getValue();
        }
        return total;
    }
    
    public void sortBySuit() {
        BySuitInValueOrder suitValueSort = new BySuitInValueOrder();
        Collections.sort(hand, suitValueSort);
    }
}
