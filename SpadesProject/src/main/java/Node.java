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
        this.card = card;
        this.next = null;
    }

    /**
     *
     * @param player the player in the node
     */
    public Node(Player player) { // Constructor
        this.player = player;
        this.next = null;
    }

    /**
     *
     * @param string a string having a value "Bot" or "RealPlayer" to determine the number of bot and real players.
     */
    public Node(String string) { // Constructor
        this.string = string;
        this.next = null;
    }

    /**
     *
     * @param next next node of the current node
     */
    public void setNext(Node next) { // setter
        this.next = next;
    }

    /**
     *
     * @return next node
     */
    public Node getNext() { // getter
        return next;
    }

    /**
     *
     * @return the card in the node
     */
    public Card getCard() { // getter
        return card;
    }

    /**
     *
     * @return the player in the node
     */
    public Player getPlayer() { // getter
        return player;
    }

    /**
     *
     * @return the name of bot or real player as string in the node
     */
    public String getString() { // getter
        return "" + data;
    }
}
