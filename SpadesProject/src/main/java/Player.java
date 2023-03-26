/**
 * Bot and RealPlayer extends this class having hand and tricks.
 */
public class Player {
    private Hand playersHand; // player's hand
    private boolean myTurn; // its value is true if the player has the turn to play
    private String name; // name of the player

    /**
     * creates a brand-new player with default hand, name, tricks bid, tricks taken
     * since there will be only one real player.
     */
    public Player() { // Constructor

    }
    
    /**
     * creates a new bot-player with a specified name, but default hand, tricks bid and tricks taken
     * since there will be 3 bot players.
     * @param name name of the bot-player
     */    
    public Player(String name) { // Constructor
        
    }

    /**
     * returns player's name
     * @return player's name
     */
    public String getName() { // getter

    }

    /**
     * returns player's hand
     * @return player's hand
     */
    public Hand getPlayersHand() { // getter

    }

    /**
     * sets player's hand
     * @param hand player's hand
     */
    public void setPlayersHand(Hand hand) { // setter

    }

    /**
     * checks whether the player has the turn
     * @return true if the player has the turn to play, else false
     */
    public boolean getMyTurn() { // getter

    }

    /**
     * sets the player's turn to play
     * @param turn true if the player has the turn to play, else false
     */
    public void setMyTurn(boolean turn) { // setter

    }
}
