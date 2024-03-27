import java.util.ArrayList;	  	   	      	   	       	     	    	
import java.util.Collections;	  	   	      	   	       	     	    	
import java.util.Scanner;	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
// Class representing the game logic	  	   	      	   	       	     	    	
public class Logic {	  	   	      	   	       	     	    	
    private Deck deck; // Instance variable for the deck of cards	  	   	      	   	       	     	    	
    private Dealer dealer; // Instance variable for the dealer	  	   	      	   	       	     	    	
    private Player player1; // Instance variable for player 1	  	   	      	   	       	     	    	
    private Player player2; // Instance variable for player 2	  	   	      	   	       	     	    	
    private Scanner scanner; // Scanner object for user input	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
    // Constructor to initialize the game	  	   	      	   	       	     	    	
    public Logic() {	  	   	      	   	       	     	    	
        deck = new Deck(); // Create a new deck	  	   	      	   	       	     	    	
        dealer = new Dealer(deck); // Create a new dealer with the deck	  	   	      	   	       	     	    	
        player1 = new Player("Player1"); // Create player 1 with the name "Player1"	  	   	      	   	       	     	    	
        player2 = new Player("Player2"); // Create player 2 with the name "Player2"	  	   	      	   	       	     	    	
        scanner = new Scanner(System.in); // Create a Scanner object for user input	  	   	      	   	       	     	    	
    }	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
    // Method to start the game	  	   	      	   	       	     	    	
    public void startGame() {	  	   	      	   	       	     	    	
        deck.shuffleCards(); // Shuffle the deck of cards	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
        // Deal initial cards to each player	  	   	      	   	       	     	    	
        player1.addCard(dealer.dealCard());	  	   	      	   	       	     	    	
        player2.addCard(dealer.dealCard());	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
        // Continue playing until both players are done	  	   	      	   	       	     	    	
        while (!player1.isDone() || !player2.isDone()) {	  	   	      	   	       	     	    	
            if (!player1.isDone()) {	  	   	      	   	       	     	    	
                playRound(player1, player2); // Player 1's turn	  	   	      	   	       	     	    	
            }	  	   	      	   	       	     	    	
            if (!player2.isDone()) {	  	   	      	   	       	     	    	
                playRound(player2, player1); // Player 2's turn	  	   	      	   	       	     	    	
            }	  	   	      	   	       	     	    	
        }	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
        // Determine the winner	  	   	      	   	       	     	    	
        determineWinner();	  	   	      	   	       	     	    	
    }	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
    // Method to play a round for the current player	  	   	      	   	       	     	    	
    private void playRound(Player currentPlayer, Player opponentPlayer) {	  	   	      	   	       	     	    	
        if (!currentPlayer.isDone()) {	  	   	      	   	       	     	    	
            System.out.println(currentPlayer.getName() + "'s turn:");	  	   	      	   	       	     	    	
            System.out.println("Your cards: " + currentPlayer.getCards());	  	   	      	   	       	     	    	
            System.out.println("Do you want to twist? (Y/N)");	  	   	      	   	       	     	    	
            String choice = scanner.nextLine();	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
            if (choice.equalsIgnoreCase("Y")) {	  	   	      	   	       	     	    	
                // Deal a new card to the player	  	   	      	   	       	     	    	
                Card newCard = dealer.dealCard();	  	   	      	   	       	     	    	
                currentPlayer.addCard(newCard);	  	   	      	   	       	     	    	
                int currentPlayerScore = calculateScore(currentPlayer);	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
                // Check if the player busted	  	   	      	   	       	     	    	
                if (currentPlayerScore == -1) {	  	   	      	   	       	     	    	
                    // Calculate the score considering Aces	  	   	      	   	       	     	    	
                    int currentScore = calculateScoreWithAces(currentPlayer);	  	   	      	   	       	     	    	
                    System.out.println(currentPlayer.getName() + " busted with a score of " + currentScore + "!");	  	   	      	   	       	     	    	
                    currentPlayer.setDone(true); // Set the player as done	  	   	      	   	       	     	    	
                    opponentPlayer.setDone(true); // Set the opponent player as done	  	   	      	   	       	     	    	
                    return;	  	   	      	   	       	     	    	
                }	  	   	      	   	       	     	    	
            } else {	  	   	      	   	       	     	    	
                System.out.println(currentPlayer.getName() + " sticks.");	  	   	      	   	       	     	    	
                currentPlayer.setDone(true); // Set the player as done	  	   	      	   	       	     	    	
            }	  	   	      	   	       	     	    	
        }	  	   	      	   	       	     	    	
    }	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
    // Method to calculate the score for a player without considering Aces as 1	  	   	      	   	       	     	    	
    private int calculateScore(Player player) {	  	   	      	   	       	     	    	
        int score = 0;	  	   	      	   	       	     	    	
        int numOfAces = 0; // Variable to count the number of Aces	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
        // Iterate through each card of the player	  	   	      	   	       	     	    	
        for (Card card : player.getCards()) {	  	   	      	   	       	     	    	
            String value = card.getValue();	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
            // Handle face cards and Aces separately	  	   	      	   	       	     	    	
            if (value.equals("Jack") || value.equals("Queen") || value.equals("King")) {	  	   	      	   	       	     	    	
                score += 10;	  	   	      	   	       	     	    	
            } else if (value.equals("Ace")) {	  	   	      	   	       	     	    	
                score += 11; // Assume Ace initially counts as 11	  	   	      	   	       	     	    	
                numOfAces++; // Increment the count of Aces	  	   	      	   	       	     	    	
            } else {	  	   	      	   	       	     	    	
                score += Integer.parseInt(value);	  	   	      	   	       	     	    	
            }	  	   	      	   	       	     	    	
        }	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
        // Adjust the score if necessary due to Aces	  	   	      	   	       	     	    	
        while (score > 21 && numOfAces > 0) {	  	   	      	   	       	     	    	
            score -= 10; // Adjust for each Ace considered as 11	  	   	      	   	       	     	    	
            numOfAces--; // Reduce the count of remaining Aces	  	   	      	   	       	     	    	
        }	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
        if (score > 21) {	  	   	      	   	       	     	    	
            return -1; // Player busted	  	   	      	   	       	     	    	
        }	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
        return score;	  	   	      	   	       	     	    	
    }	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
    // Method to calculate the score for a player considering Aces as 1 or 11	  	   	      	   	       	     	    	
    private int calculateScoreWithAces(Player player) {	  	   	      	   	       	     	    	
        int score = 0;	  	   	      	   	       	     	    	
        int numOfAces = 0;	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
        // Iterate through each card of the player	  	   	      	   	       	     	    	
        for (Card card : player.getCards()) {	  	   	      	   	       	     	    	
            String value = card.getValue();	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
            if (value.equals("Jack") || value.equals("Queen") || value.equals("King")) {	  	   	      	   	       	     	    	
                score += 10;	  	   	      	   	       	     	    	
            } else if (value.equals("Ace")) {	  	   	      	   	       	     	    	
                numOfAces++;	  	   	      	   	       	     	    	
            } else {	  	   	      	   	       	     	    	
                score += Integer.parseInt(value);	  	   	      	   	       	     	    	
            }	  	   	      	   	       	     	    	
        }	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
        // Handle Aces	  	   	      	   	       	     	    	
        for (int i = 0; i < numOfAces; i++) {	  	   	      	   	       	     	    	
            if (score + 11 <= 21) {	  	   	      	   	       	     	    	
                score += 11;	  	   	      	   	       	     	    	
            } else {	  	   	      	   	       	     	    	
                score += 1;	  	   	      	   	       	     	    	
            }	  	   	      	   	       	     	    	
        }	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
        return score;	  	   	      	   	       	     	    	
    }	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
    // Method to determine the winner of the game	  	   	      	   	       	     	    	
    private void determineWinner() {	  	   	      	   	       	     	    	
        int score1 = calculateScoreWithAces(player1); // Calculate score for player 1	  	   	      	   	       	     	    	
        int score2 = calculateScoreWithAces(player2); // Calculate score for player 2	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
        // Check if both players busted	  	   	      	   	       	     	    	
        if (score1 > 21 && score2 > 21) {	  	   	      	   	       	     	    	
            System.out.println("Both players busted. It's a tie!");	  	   	      	   	       	     	    	
        } else if (score1 > 21) {	  	   	      	   	       	     	    	
            System.out.println(player2.getName() + " wins with a score of " + score2 + "!");	  	   	      	   	       	     	    	
            System.out.println("Player 2's cards: " + player2.getCards());	  	   	      	   	       	     	    	
        } else if (score2 > 21) {	  	   	      	   	       	     	    	
            System.out.println(player1.getName() + " wins with a score of " + score1 + "!");	  	   	      	   	       	     	    	
            System.out.println("Player 1's cards: " + player1.getCards());	  	   	      	   	       	     	    	
        } else if (score1 > score2) {	  	   	      	   	       	     	    	
            System.out.println(player1.getName() + " wins with a score of " + score1 + "!");	  	   	      	   	       	     	    	
            System.out.println("Player 1's cards: " + player1.getCards());	  	   	      	   	       	     	    	
        } else if (score2 > score1) {	  	   	      	   	       	     	    	
            System.out.println(player2.getName() + " wins with a score of " + score2 + "!");	  	   	      	   	       	     	    	
            System.out.println("Player 2's cards: " + player2.getCards());	  	   	      	   	       	     	    	
        } else {	  	   	      	   	       	     	    	
            System.out.println("It's a tie!");	  	   	      	   	       	     	    	
        }	  	   	      	   	       	     	    	
    }	  	   	      	   	       	     	    	
}