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
     hand = new LinkedList();
    }

    /**
     * returns the number of spades in a hand
     * this method's existence is important for bidding
     * because the more you have spade, the more chance you have for the win.
     * @return number of spades in a hand
     */
    int getNumberOfSpades() {
     int numSpades = 0;
     for (Card card : hand) {
      if (card.getSuit().equals(Suit.SPADE)) {
       numSpades++;
      }
     }
     return numSpades;
    }

    /**
     * returns the number of cards in a single hand
     * @return an int. between 0 and 13 representing the size of the hand
     */
    public int size() {
     return hand.size();
    }

    /**
     * removes a card object from the hand
     * @param position the position to be removed from the hand
     * @return the card removed
     */
    public Card remove(int position) {
     Card returnCard = hand.getNodeI(position);
     hand.remove(returnCard);
     return returnCard;
    }

    /**
     * removes a specific card object from the hand,
     * @param card the card to be removed from the hand.
     * @return true if the card is successfully removed, false otherwise
     */
    public boolean specificRemove(Card card) {
     return hand.remove(card);
    }

    /**
     * adds a card object to the hand and sorts the hand when a new card is added
     * @param card the card to be added to the hand
     */
    public void add(Card card) {
     int i = hand.size();
     if (i < 13) {
      hand.add(i, card);
     }
     hand.sortList();
    }

    /**
     * returns a card at a specific position in the hand
     * @param position the position to be returned from the hand
     * @return the card at the position which will be returned
     */
    Card getCardAtPosition(int position) {
     return hand.getNodeI(position);
    }

    /**
     * checking if a particular card is in the hand
     * @param c the card to be checked
     * @return true if it is in the hand, false otherwise
     */
    public boolean contains(Card c) {
     for (Card card : hand) {
      if (card.getNumber() == c.getNumber() && card.getSuit() == c.getSuit()) {
       return true;
      }
     }
     return false;
    }

    /**
     * returns and prints the size of the hand and every card in the hand
     * @return size of the hand and every card in the hand
     */
    public String toString() {
     return hand.toString() + " Length: " + hand.size();
    }
}
