
# **Card Deck Program**

This Java program simulates a standard deck of 52 playing cards. It provides a menu-driven interface to perform various operations on the deck, such as creating, shuffling, printing, and searching for cards. The program is designed to demonstrate the use of object-oriented programming (OOP) principles, `ArrayList`, and basic Java concepts.

---

## **Table of Contents**
1. [Introduction](#introduction)
2. [Program Structure](#program-structure)
3. [How It Works](#how-it-works)
4. [Functions and Methods](#functions-and-methods)
5. [Concepts Used](#concepts-used)
8. [Learning Outcomes](#learning-outcomes)

---

## **Introduction**
A standard deck of playing cards consists of 52 cards divided into 4 suits: **Hearts**, **Diamonds**, **Clubs**, and **Spades**. Each suit has 13 ranks: **2, 3, 4, 5, 6, 7, 8, 9, 10, Jack, Queen, King, and Ace**. This program simulates such a deck and provides functionalities to interact with it.

---

## **Program Structure**
The program is divided into three Java files:
1. **Card.java**: Represents a single card with a suit and rank.
2. **Deck.java**: Manages the deck of cards and provides methods for operations like shuffling, printing, and searching.
3. **Main.java**: Contains the main program logic and a menu-driven interface for user interaction.

---

## **How It Works**
1. The program starts by creating a deck of 52 cards using the `Deck` class.
2. The user is presented with a menu of options to perform various operations on the deck.
3. Each operation is implemented as a method in the `Deck` class.
4. The program uses `ArrayList` to store the deck of cards, ensuring dynamic and efficient management of the cards.

---

## **Functions and Methods**

### **1. `createDeck()`**
- **Purpose**: Initializes a deck of 52 cards.
- **How It Works**: Iterates through all 4 suits and 13 ranks to create a `Card` object for each combination and adds it to the `ArrayList`.
- **Example**: Creates "2 of Hearts", "3 of Hearts", ..., "Ace of Spades".

### **2. `printDeck()`**
- **Purpose**: Prints all the cards in the deck.
- **How It Works**: Iterates through the `ArrayList` and prints each card using the `toString()` method of the `Card` class.
- **Example**: Prints all 52 cards in order.

### **3. `printCard(int index)`**
- **Purpose**: Prints a specific card at the given index.
- **How It Works**: Accesses the card at the specified index in the `ArrayList` and prints it.
- **Example**: If `index = 10`, it prints "Jack of Hearts".

### **4. `sameCard(String suit)`**
- **Purpose**: Finds and prints all cards of the specified suit.
- **How It Works**: Iterates through the `ArrayList` and checks if each card's suit matches the input suit.
- **Example**: If `suit = "Spades"`, it prints all 13 Spades cards.

### **5. `compareCard(String rank)`**
- **Purpose**: Finds and prints all cards of the specified rank.
- **How It Works**: Iterates through the `ArrayList` and checks if each card's rank matches the input rank.
- **Example**: If `rank = "King"`, it prints all 4 Kings (one from each suit).

### **6. `findCard(String suit, String rank)`**
- **Purpose**: Searches for a specific card in the deck.
- **How It Works**: Iterates through the `ArrayList` and checks if a card matches both the input suit and rank.
- **Example**: If `suit = "Hearts"` and `rank = "Queen"`, it prints "Queen of Hearts".

### **7. `dealCard()`**
- **Purpose**: Deals 5 random cards from the deck.
- **How It Works**: Uses the `Random` class to generate random indices and prints the cards at those indices.
- **Example**: Prints 5 random cards like "7 of Diamonds", "King of Clubs", etc.

### **8. `shuffleDeck()`**
- **Purpose**: Shuffles the deck randomly.
- **How It Works**: Uses the `Collections.shuffle()` method to randomize the order of cards in the `ArrayList`.
- **Example**: Shuffles the deck, and the order of cards changes.

---

## **Concepts Used**
1. **Object-Oriented Programming (OOP)**:
   - Classes and objects (`Card` and `Deck`).
   - Encapsulation (private fields with public getters).
   - `toString()` method for string representation of objects.
2. **Data Structures**:
   - `ArrayList` to store and manage the deck of cards.
3. **Java Libraries**:
   - `java.util.Collections` for shuffling.
   - `java.util.Random` for generating random numbers.
4. **Menu-Driven Interface**:
   - Uses a `do-while` loop and `switch-case` for user interaction.



## **Learning Outcomes**
By studying and running this program, you will learn:
1. How to use `ArrayList` to manage collections of objects.
2. How to implement OOP concepts like classes, objects, and encapsulation.
3. How to create a menu-driven program in Java.
4. How to use Java libraries like `Collections` and `Random`.
5. How to simulate real-world scenarios (like a deck of cards) using programming.

