/**
 * This class helps run the game
 * This class controls the PlayedCards object/class for the bots storing all cards played.
 * it has a method to determine the winner of each round.
 */
public class Gameplay {
    public LinkedList players; // total number of players
    public Deck deck; // deck that will be used for the game
    public static PlayedCards playedCards; // playedCards that will be used for the game

    private boolean spadesPlayed;

    /**
     * creates deck, playedCards, and all the players and transfers it to the game
     */
    public Gameplay() { // Constructor
        deck = new Deck();
        playedCards = new PlayedCards();
    }

    /**
     * deals hand to every player
     */
    void dealHands() {
        for (Player player : players) {
            player.setHand(deck.dealHand());
        }
    }

    /**
     * takes 4 cards that are played on that round and determines the winner at the end of each round
     * @param c the cards only played in that round
     * @return winner card
     */
    Card roundWinner(LinkedList c) {
        Card card0 = c.getNodeI(0);
        Card card1 = c.getNodeI(1);
        Card card2 = c.getNodeI(2);
        Card card3 = c.getNodeI(3);
        Card highCard = null;
        if (Card.compareCards(card0, card1) == 1) {
            highCard = new Card(card0.getSuit(), card0.getNumber());
        } else {
            if (card1.getSuit() == Suit.SPADE || card1.getSuit() == card0.getSuit()) {
                highCard = new Card(card1.getSuit(), card1.getNumber());
            }
        }

        if (Card.compareCards(highCard, card2) == -1) {
            if (card2.getSuit() == Suit.SPADE || card2.getSuit() == card0.getSuit()) {
                highCard = new Card(card2.getSuit(), card2.getNumber());
            }
        }
        if (Card.compareCards(highCard, card3) == -1) {
            if (card3.getSuit() == Suit.SPADE || card3.getSuit() == card0.getSuit()) {
                highCard = new Card(card3.getSuit(), card3.getNumber());
            }
        }
        playedCards.add(c.getNodeI(0));
        playedCards.add(c.getNodeI(1));
        playedCards.add(c.getNodeI(2));
        playedCards.add(c.getNodeI(3));
        return highCard;
    }

    /**
     * decides who won the game at the end
     * @return the winner of the game
     */
    public Player gameWinner() {

    }

    /**
     * Used for player to determine which card s/he can play based on the
     * rules of the game. This is done so that real player cannot play illegal cards.
     * It is called when it is real player's turn to play and either enables or
     * disables card choices based on whether the cards can be played or not.
     * @param myHand player's hand to be evaluated
     * @param pile The middlePile linked-list that contains the cards already played in the order they were played
     */
    private LinkedList playableCards(LinkedList myHand, LinkedList pile) {
        Linkedlist list = new LinkedList();
        if (pile == null || pile.size() == 0) {
            for (Card card : myHand) {
                if (!(card.getCard().getSuit() == Suit.SPADE && !spadesPlayed)) {
                    list.insertLast(new Node(card));
                }
            }
        }
        Card card1 = pile.getNodeI(0);
        int count = 0;
        for (Card card : myHand) {
            if (card.getCard().getSuit() == card1.getSuit()) {
                list.insertLast(new Node(card));
                count++;
            }
        }
        if (count == myHand.size()) {
            for (Card card : myHand) {
                list.insertLast(new Node(card));
            }
        }
        return list;
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
    private int pointsScored(int tricksBid,int tricksTaken) {
        int score;
        if (tricksTaken < tricksBid) {
            score = -(10 * (tricksBid));
        }
        else if (tricksTaken == tricksBid) {
            score = 10 * (tricksBid);
        }
        else {
            score = (10 * (tricksBid)) + (tricksTaken) - (tricksBid);
        }
        return score;
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
    private int Bags(int tricksBid,int tricksTaken) {
        int bags = 0;
        if (tricksTaken > tricksBid) {
            bags = tricksTaken - tricksBid;
        }
        return bags;
    }
}
