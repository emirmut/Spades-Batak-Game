/**
 * This class just helps run the game, but the GUI serves as the game's principal operating system.
 * This class controls the PlayedCards object/class for the bots storing all cards played.
 * Based on the choices made in the StartGUI, it also identifies the Players, indicating if they are actual players or bots.
 * At the beginning of each hand, a new GamePlay object is created in the GUI after winner is determined.
 */
public class Gameplay {
    public LinkedList players; // total number of players
    public LinkedList playerAry; // number of bot and real players
    public Deck deck; // deck that will be used for the game
    public static PlayedCards playedCards; // playedCards that will be used for the game

    /**
     * creates deck, playedCards, and all the players and transfers it to the game
     */
    public Gameplay() { // Constructor

    }

    /**
     * deals hand to every player
     */
    void dealHands() {

    }

    /**
     * takes 4 cards that are played on that round and determines the winner at the end of each round
     * @param cards the cards only played in that round
     * @return winner card
     */
    Card theWinner(LinkedList cards) {

    }
}
