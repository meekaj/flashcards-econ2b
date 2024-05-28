package app; 

import java.util.Scanner;

public class FlashCardApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FlashCardDeck deck = new FlashCardDeck();
        deck.shuffle(); // Shuffle the cards at the start

        while (deck.hasMoreCards()) {
            FlashCard card = deck.getNextCard();
            System.out.println(card.getQuestion());
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine();

            if (card.checkAnswer(userAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("Incorrect! The correct answer is: " + card.getAnswer());
            }
            System.out.println();
        }

        System.out.println("You've completed all the flashcards!");
        scanner.close();
    }
}
