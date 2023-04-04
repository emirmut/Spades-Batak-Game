/**
 * Bot and RealPlayer extends this class having hand and tricks.
 */
public class Player {
    private Hand playersHand; // player's hand
    private boolean myTurn; // its value is true if the player has the turn to play
    private String name; // name of the player
    private int tricksBid; // tricks bid by players
    private int tricksTaken // tricks taken by players

    /**
     * creates a brand-new real-player with default hand, name, tricks bid, tricks taken
     * since there will be only one real player.
     */
    public Player() { // Constructor
        playersHand = null;
        name = "Player";
    }
    
    /**
     * creates a new bot-player with a specified name, but default hand, tricks bid and tricks taken
     * since there will be 3 bot players.
     * @param name name of the bot-player
     */    
    public Player(String name) { // Constructor
        playersHand = null;
        this.name = name;
    }

    /**
     * returns player's name
     * @return player's name
     */
    public String getName() { // getter
        return name;
    }

    /**
     * returns player's hand
     * @return player's hand
     */
    public Hand getPlayersHand() { // getter
        return playersHand;
    }

    /**
     * sets player's hand
     * @param hand player's hand
     */
    public void setPlayersHand(Hand hand) { // setter
        playersHand = hand;
    }

    /**
     * checks whether the player has the turn
     * @return true if the player has the turn to play, else false
     */
    public boolean getMyTurn() { // getter
        return myTurn;
    }

    /**
     * sets the player's turn to play
     * @param turn true if the player has the turn to play, else false
     */
    public void setMyTurn(boolean turn) { // setter
        myTurn = turn;
    }

    /**
     * returns tricks bid by a player
     * @return tricks bid by a player
     */
    public int getTricksBid() { // getter
        return tricksBid;
    }

    /**
     * returns tricks taken by a player
     * @return tricks taken by a player
     */
    public int getTricksTaken() { // getter
        return tricksTaken;
    }

    /**
     * this method allows real player and bot player to play a card from its hand
     * @return card card that player played
     */
    public Card cardToPlay() {
        playableCards(LinkedList playersHand, LinkedList pile);
    }
}
