public class Node {
    protected Card card; // the card in the node
    protected Player player; // the player in the node
    protected String string; // Bot or RealPlayer
    protected Node next; // next node of the current node

    /**
     *
     * @param card the card in the node
     */
    public Node(Card card) { // Constructor

    }

    /**
     *
     * @param player the player in the node
     */
    public Node(Player player) { // Constructor

    }

    /**
     *
     * @param string a string having a value "Bot" or "RealPlayer" to determine the number of bot and real players.
     */
    public Node(String string) { // Constructor

    }

    /**
     *
     * @param next next node of the current node
     */
    public void setNext(Node next) { // setter

    }

    /**
     *
     * @return next node
     */
    public Node getNext() { // getter

    }

    /**
     *
     * @return the card in the node
     */
    public Card getCard() { // getter

    }

    /**
     *
     * @return the player in the node
     */
    public Player getPlayer() { // getter

    }

    /**
     *
     * @return the name of bot or real player as string in the node
     */
    public String getString() { // getter

    }
}
