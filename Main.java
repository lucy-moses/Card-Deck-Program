// Main.java
import java.util.Scanner;

/*
Name: Ugwuaneke lucy ifoma
PRN: 23070126169
Batch: 2023 -2027
*/

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Print Deck");
            System.out.println("2. Print a Specific Card");
            System.out.println("3. Find Cards of the Same Suit");
            System.out.println("4. Compare Cards of the Same Rank");
            System.out.println("5. Find a Specific Card");
            System.out.println("6. Deal 5 Random Cards");
            System.out.println("7. Shuffle Deck");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    deck.printDeck();
                    break;
                case 2:
                    System.out.print("Enter the index of the card: ");
                    int index = scanner.nextInt();
                    deck.printCard(index);
                    break;
                case 3:
                    System.out.print("Enter the suit: ");
                    String suit = scanner.next();
                    deck.sameCard(suit);
                    break;
                case 4:
                    System.out.print("Enter the rank: ");
                    String rank = scanner.next();
                    deck.compareCard(rank);
                    break;
                case 5:
                    System.out.print("Enter the suit: ");
                    String findSuit = scanner.next();
                    System.out.print("Enter the rank: ");
                    String findRank = scanner.next();
                    deck.findCard(findSuit, findRank);
                    break;
                case 6:
                    deck.dealCard();
                    break;
                case 7:
                    deck.shuffleDeck();
                    break;
                case 8:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 8);

        scanner.close();
    }
}