/**
 * The bot has a hand and four different playCard methods
 * based on the number of cards in the current middle pile.
 * It determines the most logical choice to play in that situation
 * based on PlayedCards class and current cards in its hand.
 * It also has a method that evaluates which playCard method should be implemented.
 */
public class Bot extends Player {
    /**
     * calls Player constructor using super method with a string parameter
     * @param name bot's name
     */
    public Bot(String name) { // Constructor

    }

    /**
     * this method allows Bot to play when the middle pile is empty
     * @return card from bot's hand
     */
    private Card playCard1() {

    }

    /**
     * this method allows Bot to play when the middle pile has 1 card
     * @param card card led by the first player, first card in the middle pile
     * @return card from bot's hand
     */
    private Card playCard2(Card card) {

    }

    /**
     * this method allows Bot to play when the middle pile has 2 cards
     * @param fcimp card led by the first player, fcimp stands for first card in the middle pile
     * @param scimp card played second in the round, scimp stands for second card in the middle pile
     * @return card from bot's hand
     */
    private Card playCard3(Card fcimp, Card scimp) {

    }

    /**
     * this method allows Bot to play when the middle pile has 3 cards
     * @param fcimp card led by the first player, fcimp stands for first card in the middle pile
     * @param scimp card played second in the round, scimp stands for second card in the middle pile
     * @param tcimp card played third in the round, tcimp stands for third card in the middle pile
     * @return card from bot's hand
     */
    private Card playCard4(Card fcimp, Card scimp, Card tcimp) {

    }

    /**
     * takes in the cards already played and plays the most logical card to play according to the other player
     * @param l cards that are already played (the middle pile)
     * @return bot card played
     */
    Card playCardMain(LinkedList l) {

    }
}

