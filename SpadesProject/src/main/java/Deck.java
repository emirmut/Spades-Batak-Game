import java.lang.Math;
/**
 * A deck consists of 52 unique card objects. 13 spades, 13 diamonds, 13 clubs and 13 hearts.
 * It can shuffle and deal the deck. 1 is ace, 11 is Jack, 12 is Queen, 13 is King.
 */
public class Deck {
    private LinkedList deck = new LinkedList(); // linked list of 52 cards

    /**
     * Deck constructor creates a new linked list of 52 unique cards
     * and shuffles them in a random order.
     */
    public Deck() { // Constructor
        for (int i = 1; i <= 13; i++) {
            deck.add(new Card(Suit.SPADE, i);
        }
        for (int i = 1; i <= 13; i++) {
            deck.add(new Card(Suit.CLUB, i);
        }
        for (int i = 1; i <= 13; i++) {
            deck.add(new Card(Suit.HEART, i);
        }
        for (int i = 1; i <= 13; i++) {
            deck.add(new Card(Suit.DIAMOND, i);
        }
        shuffle();
    }

    /**
     * shuffles the order of the deck
     * @param deck deck to be shuffled
     * @param n number of times for a deck to be shuffled
     */
    void shuffle(LinkedList deck, int n) {
        for (int i = 0; i < deck.numberOfElements(); i++) {
            int a = (int)((Math.random() * 52) + 0);
            int b = (int)((Math.random() * 52) + 0);
        }
    }
    
    /**
     * creates a hand and adds 13 cards to it, starting where the index is
     * @return a brand-new hand containing 13 cards
     */
    public Hand dealHand() {
        Hand hand = new Hand();
        int index = 0;
        while (index < 13) {
            hand.add(deck.remove(0));
            index++;
        }
        return hand;
    }
    
    /**
     * Prints every card of the deck
     * @return all cards in the deck
     */
    public String toString() {
        return deck.toString();
    }
}
