/**
 * This class helps run the game
 * This class controls the PlayedCards object/class for the bots storing all cards played.
 * it has a method to determine the winner of each round.
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
    Card roundWinner(LinkedList cards) {

    }

    /**
     * decides who won the game at the end
     * @return the winner of the game
     */
    public Player gameWinner() {

    }

    /**
     * Used for human player to determine which card s/he can play based on the
     * rules of the game. This is done so that real player cannot play illegal cards.
     * It is called when it is real player's turn to play and either enables or
     * disables card choices based on whether the cards can be played or not.
     * @param myHand player's hand to be evaluated
     * @param pile The middlePile linked-list that contains the cards already played in the order they were played
     */
    private void playableCards(LinkedList myHand, LinkedList pile) {

    }

    /**
     * Calculates the number of points a player scored for a round based on their tricks bid and tricks taken.
     * Called once for every player
     * @param p1TricksBid first player's tricks bid
     * @param p2TricksBid second player's tricks bid
     * @param p3TricksBid third player's tricks bid
     * @param p4TricksBid fourth player's tricks bid
     * @param p1TricksTaken first player's tricks taken
     * @param p2TricksTaken second player's tricks taken
     * @param p3TricksTaken third player's tricks taken
     * @param p4TricksTaken fourth player's tricks taken
     * @return The points for that player for the round
     */
    private int pointsScored(int p1TricksBid, int p2TricksBid, int p3TricksBid, int p4TricksBid, int p1TricksTaken, int p2TricksTaken, int p3TricksTaken, int p4TricksTaken) {

    }

    /**
     * Calculated the number of bags for a player for a round based on their tricks bid and tricks taken.
     * Called once for every player
     * @param p1TricksBid first player's tricks bid
     * @param p2TricksBid second player's tricks bid
     * @param p3TricksBid third player's tricks bid
     * @param p4TricksBid fourth player's tricks bid
     * @param p1TricksTaken first player's tricks taken
     * @param p2TricksTaken second player's tricks taken
     * @param p3TricksTaken third player's tricks taken
     * @param p4TricksTaken fourth player's tricks taken
     * @return The total bags for the player for that round, returns 0 if none.
     */
    private int Bags(int p1TricksBid, int p2TricksBid, int p3TricksBid, int p4TricksBid, int p1TricksTaken, int p2TricksTaken, int p3TricksTaken, int p4TricksTaken) {

    }


}
