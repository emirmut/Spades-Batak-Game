/*
The card class creates a card object that contains a
suit and a number. It will be used in hand, deck and playedCards.
 */
public class Card {
    private Suit suit; // suit of the card
    private int number; // number of the card

    /**
     * Card constructor making a new card based on the suit and number.
     * @param suit suit of the card
     * @param number number of the card
     */
    public Card(Suit suit, int number) {
        this.suit = suit;
        this.number = number;
    }

    /**
     * @return suit of the card
     */
    public Suit getSuit() { // getter
        return suit;
    }

    /**
     * @return number of the card
     */
    public int getNumber() { // getter
        return number;
    }

    /**
     * @return the card's name according to its number and suit
     */
    public String getName() { // getter
        String cardName = "";
        switch (this.getNumber()) {
            case 1:
                cardName += "Ace of ";
                break;
            case 2:
                cardName += "2 of ";
                break;
            case 3:
                cardName += "3 of ";
                break;
            case 4:
                cardName += "4 of ";
                break;
            case 5:
                cardName += "5 of ";
                break;
            case 6:
                cardName += "6 of ";
                break;
            case 7:
                cardName += "7 of ";
                break;
            case 8:
                cardName += "8 of ";
                break;
            case 9:
                cardName += "9 of ";
                break;
            case 10:
                cardName += "10 of ";
                break;
            case 11:
                cardName += "Jack of ";
                break;
            case 12:
                cardName += "Queen of ";
                break;
            case 13:
                cardName += "King of ";
                break;
            default:
                break;
        }
        switch (this.getSuit()) {
            case SPADE:
                cardName += "Spades";
                break;
            case CLUB:
                cardName += "Clubs";
                break;
            case HEART:
                cardName += "Hearts";
                break;
            case DIAMOND:
                cardName += "Diamonds";
                break;
            default:
                break;
        }
        return cardName;
    }

    /**
     * prints the name of the card by using getName method
     *
     * @return name of the card
     */
    public String toString() {
        return getName();
    }

    /**
     * Compares two cards to check whether their suit and number are equal
     *
     * @param obj a card object to compare with this card
     * @return true if number and suit of the card are equal, false otherwise.
     */
    public boolean equals(Object obj) {
        if (getClass() != obj.getClass()) {
            return false;
        }
        Card otherCard = (Card) obj;
        if (this.getSuit().equals(otherCard.getSuit())) {
            if (this.getNumber() == (otherCard.getNumber())) {
                return true;
            }
        }
        return false;
    }

    /**
     * sets all suits besides spade as the equal to each other
     * @param firstCard first card to compare with seconds card
     * @param secondCard second card to compare with first card
     * @return 1 if firstCard > secondCard, -1 if secondCard > firstCard
     */
    static int compareCards(Card firstCard, Card secondCard) {
        int suit1;
        int suit2;
        suit1 = enumToInt(firstCard.getSuit());
        suit2 = enumToInt((secondCard).getSuit());
        if ((firstCard).getSuit() == (secondCard).getSuit()) {
            if ((firstCard).getNumber() == 1) {
                return 1;
            } else if ((secondCard).getNumber() == 1) {
                return -1;
            }
            if ((firstCard).getNumber() < (secondCard).getNumber()) {
                return -1;
            } else {
                return 1;
            }
        }
        if (suit1 < suit2) {
            return -1;
        } else {
            return 1;
        }
    }

    /**
     * transforms a Suit enum to an int
     * @param suit suit enum of the card
     * @return 0 as default, 4 for spade, 1 for remaining suits
     */
    private static int enumToInt(Suit suit) {
        switch (suit) {
            case SPADE:
                return 4;
            case DIAMOND:
                return 1;
            case CLUB:
                return 1;
            case HEART:
                return 1;
            default:
                return 0;
        }
    }
}
