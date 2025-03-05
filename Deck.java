// Deck.java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Deck {
    private ArrayList<Card> deck;

    // Constructor to create a deck of 52 cards
    public Deck() {
        deck = new ArrayList<>();
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(new Card(suit, rank));
            }
        }
    }

    // Method to print the entire deck
    public void printDeck() {
        for (Card card : deck) {
            System.out.println(card);
        }
    }

    // Method to print a specific card
    public void printCard(int index) {
        if (index >= 0 && index < deck.size()) {
            System.out.println(deck.get(index));
        } else {
            System.out.println("Invalid index!");
        }
    }

    // Method to find cards of the same suit
    public void sameCard(String suit) {
        for (Card card : deck) {
            if (card.getSuit().equalsIgnoreCase(suit)) {
                System.out.println(card);
            }
        }
    }

    // Method to compare cards of the same rank
    public void compareCard(String rank) {
        for (Card card : deck) {
            if (card.getRank().equalsIgnoreCase(rank)) {
                System.out.println(card);
            }
        }
    }

    // Method to find a specific card
    public void findCard(String suit, String rank) {
        for (Card card : deck) {
            if (card.getSuit().equalsIgnoreCase(suit) && card.getRank().equalsIgnoreCase(rank)) {
                System.out.println("Card found: " + card);
                return;
            }
        }
        System.out.println("Card not found!");
    }

    // Method to deal 5 random cards
    public void dealCard() {
        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            int index = rand.nextInt(deck.size());
            System.out.println(deck.get(index));
        }
    }

    // Method to shuffle the deck
    public void shuffleDeck() {
        Collections.shuffle(deck);
        System.out.println("Deck shuffled!");
    }
}