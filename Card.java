// Card.java
public class Card {
    private String suit;
    private String rank;

    // Constructor
    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    // Getters
    public String getSuit() {
        return suit;
    }

    public String getRank() {
        return rank;
    }

    // Override toString() to print card details
    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}