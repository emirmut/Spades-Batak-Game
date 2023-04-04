/**
 * The bot has a hand and three different playCard methods
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
        super(name);
    }
}

