/*
The card class creates a card object that contains a
suit and a number. It will be used in hand, deck and playedCards.
 */
public class Card {
    private Suit suit; // suit of the card
    private int number; // number of the card

    /**
     * Card constructor making a new card based on the suit and number.
     * @param s suit of the card
     * @param number number of the card
     */
    public Card(Suit s, int number) {

    }
    
    /**
     *
     * @return suit of the card
     */
    public Suit getSuit() { // getter

    }

    /**
     *
     * @return number of the card
     */
    public int getNumber() { // getter

    }

    /**
     *
     * @return the card's name according to its number and suit
     */
    public String getName() { // getter

    }

    /**
     * prints the name of the card by using getName method
     * @return name of the card
     */
    public String toString() {

    }

    /**
     * Compares two cards to check whether their suit and number are equal
     * @param obj a card object to compare with this card
     * @return true if number and suit of the card are equal, false otherwise.
     */
    public boolean equals(Object obj) {

    }

    /**
     * sets all suits besides spade as the equal to each other
     * @param firstCard first card to compare with seconds card
     * @param secondCard second card to compare with first card
     * @return 1 if firstCard > secondCard, -1 if secondCard > firstCard
     */
    static int compareCards(Card firstCard, Card secondCard) {

    }

    /**
     * transforms a Suit enum to an int
     * @param s suit enum of the card
     * @return 0 as default, 4 for spade, 1 for remaining suits
     */
    private static int enumToInt(Suit s) {

    }
}
