/**
 * Bot makes use of this class. A card is sent to this class each time it is played.
 * The bot will then utilize the information in PlayedCards in some circumstances to determine which card should be played next.
 */
public class PlayedCards {
    private LinkedList playedCards; // linkedlist of cards that are already played in the current round

    /**
     * creates a linkedlist storing cards
     */
    public PlayedCards() { // Constructor
        playedCards = new LinkedList();
    }

    /**
     * adds a card to the playedCards using LinkedList's insertLast method
     * @param card card to be added to the linkedlist
     */
    public void add(Card card) {
        playedCards.insertLast(card);
    }

    /**
     * controls whether a particular card is in the playedCards
     * @param c card to be controlled
     * @return true if it is in the playedCards, false otherwise
     */
    public boolean contains(Card c) {
        for (Card card : memory) {
            if (card.getNumber() == c.getNumber() && card.getSuit() == c.getSuit()) {
                return true;
            }
        }
        return false;
    }
}
