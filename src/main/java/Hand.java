/**
 * Hand, which can be used by human and bot, is a linked-list of 13 card objects.
 * It has methods that check the status and manipulate the cards in the hand.
 */
public class Hand {
    private LinkedList hand; // linked-list of 13 cards

    /**
     * creates a new linked-list that can store Card objects
     */
    public Hand() { // Constructor

    }

    /**
     * returns the number of spades in a hand
     * this method's existence is important for bidding
     * because the more you have spade, the more chance you have for the win.
     * @return number of spades in a hand
     */
    int getNumberOfSpades() {

    }

    /**
     * returns the number of cards in a single hand
     * @return an int. between 0 and 13 representing the size of the hand
     */
    public int size() {

    }

    /**
     * removes a card object from the hand
     * @param position the position to be removed from the hand
     * @return the card removed
     */
    public Card remove(int position) {

    }

    /**
     * removes a specific card object from the hand,
     * but I might not use this method meaning that I might delete it. It is here just in case.
     * @param card the card to be removed from the hand.
     * @return 1 if the card is successfully removed, -1 otherwise
     */
    public int specificRemove(Card card) {

    }

    /**
     * adds a card object to the hand and sorts the hand when a new card is added
     * @param card the card to be added to the hand
     */
    public void add(Card card) {

    }

    /**
     * returns a card at a specific position in the hand
     * @param position the position to be returned from the hand
     * @return the card at the position which will be returned
     */
    Card getCardAtPosition(int position) {

    }

    /**
     * checking if a particular card is in the hand
     * @param card the card to be checked
     * @return true if it is in the hand, false otherwise
     */
    public boolean contains(Card card) {

    }

    /**
     * returns the size of the hand and every card in the hand
     * @return size of the hand and every card in the hand
     */
    public String toString() {

    }
}
