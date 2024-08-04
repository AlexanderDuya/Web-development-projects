import java.util.ArrayList;	  	   	      	   	       	     	    	
import java.util.Collections;	  	   	      	   	       	     	    	
import java.util.Scanner;	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
public class Logic {	  	   	      	   	       	     	    	
    private Deck deck; // Instance of deck	  	   	      	   	       	     	    	
    private Dealer dealer; // Instance of dealer	  	   	      	   	       	     	    	
    private Player player1; // Instance of player 1	  	   	      	   	       	     	    	
    private Player player2; // Instance of player 2	  	   	      	   	       	     	    	
    private Scanner scanner; // Scanner for input	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
    public Logic() {	  	   	      	   	       	     	    	
        deck = new Deck();	  	   	      	   	       	     	    	
        dealer = new Dealer(deck);	  	   	      	   	       	     	    	
        player1 = new Player("Player 1");	  	   	      	   	       	     	    	
        player2 = new Player("Player 2");	  	   	      	   	       	     	    	
        scanner = new Scanner(System.in);	  	   	      	   	       	     	    	
    }	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
    // method to start the game	  	   	      	   	       	     	    	
    public void startGame() {	  	   	      	   	       	     	    	
        deck.shuffleCards(); //ensures deck is random	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
        // giving each player a random card at the start	  	   	      	   	       	     	    	
        player1.addCard(dealer.dealCard());	  	   	      	   	       	     	    	
        player2.addCard(dealer.dealCard());	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
        // continues the game until each player is finished	  	   	      	   	       	     	    	
        while (!player1.isDone() || !player2.isDone()) {	  	   	      	   	       	     	    	
            if (!player1.isDone()) {	  	   	      	   	       	     	    	
                playRound(player1, player2); // player 1 turn	  	   	      	   	       	     	    	
            }	  	   	      	   	       	     	    	
            if (!player2.isDone()) {	  	   	      	   	       	     	    	
                playRound(player2, player1); // player 2 turn	  	   	      	   	       	     	    	
            }	  	   	      	   	       	     	    	
        }	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
        // calling the method to determine the winner	  	   	      	   	       	     	    	
        determineWinner();	  	   	      	   	       	     	    	
    }	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
    // each turn method	  	   	      	   	       	     	    	
    private void playRound(Player currentPlayer, Player opponentPlayer) {	  	   	      	   	       	     	    	
        if (!currentPlayer.isDone()) {	  	   	      	   	       	     	    	
            System.out.println(currentPlayer.getName() + "'s turn:");	  	   	      	   	       	     	    	
            System.out.println("Your cards: " + currentPlayer.getCards());	  	   	      	   	       	     	    	
            System.out.println("Do you want to twist? (Y/N)");	  	   	      	   	       	     	    	
            String choice = scanner.nextLine();	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
            if (choice.equalsIgnoreCase("Y")) {	  	   	      	   	       	     	    	
                // Giving a new card to the player	  	   	      	   	       	     	    	
                Card newCard = dealer.dealCard();	  	   	      	   	       	     	    	
                currentPlayer.addCard(newCard);	  	   	      	   	       	     	    	
                int currentPlayerScore = calculateScore(currentPlayer);	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
                // Checks if player busted when giving the new card	  	   	      	   	       	     	    	
                if (currentPlayerScore == -1) {	  	   	      	   	       	     	    	
                    // checking score with ace	  	   	      	   	       	     	    	
                    int currentScore = calculateScoreWithAces(currentPlayer);	  	   	      	   	       	     	    	
                    System.out.println(currentPlayer.getName() + " busted with a score of " + currentScore + "!");	  	   	      	   	       	     	    	
                    currentPlayer.setDone(true); // ending their turn	  	   	      	   	       	     	    	
                    opponentPlayer.setDone(true); // ending their turn	  	   	      	   	       	     	    	
                    return;	  	   	      	   	       	     	    	
                }	  	   	      	   	       	     	    	
            } else {	  	   	      	   	       	     	    	
                System.out.println(currentPlayer.getName() + " sticks.");	  	   	      	   	       	     	    	
                currentPlayer.setDone(true); // ending their turn	  	   	      	   	       	     	    	
            }	  	   	      	   	       	     	    	
        }	  	   	      	   	       	     	    	
    }	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
    // calculating scores	  	   	      	   	       	     	    	
    private int calculateScore(Player player) {	  	   	      	   	       	     	    	
        int score = 0;	  	   	      	   	       	     	    	
        int numOfAces = 0;	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
        // Going through each card	  	   	      	   	       	     	    	
        for (Card card : player.getCards()) {	  	   	      	   	       	     	    	
            String value = card.getValue();	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
            if (value.equals("Jack") || value.equals("Queen") || value.equals("King")) {	  	   	      	   	       	     	    	
                score += 10;	  	   	      	   	       	     	    	
            } else if (value.equals("Ace")) {	  	   	      	   	       	     	    	
                score += 11; //  Assuming ace is worth 11	  	   	      	   	       	     	    	
                numOfAces++;	  	   	      	   	       	     	    	
            } else {	  	   	      	   	       	     	    	
                score += Integer.parseInt(value);	  	   	      	   	       	     	    	
            }	  	   	      	   	       	     	    	
        }	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
        // changing score if aces are present	  	   	      	   	       	     	    	
        while (score > 21 && numOfAces > 0) {	  	   	      	   	       	     	    	
            score -= 10; // -10 as each ace is worth 11 or 1.	  	   	      	   	       	     	    	
            numOfAces--;	  	   	      	   	       	     	    	
        }	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
        if (score > 21) {	  	   	      	   	       	     	    	
            return -1; // player has now busted	  	   	      	   	       	     	    	
        }	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
        return score;	  	   	      	   	       	     	    	
    }	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
    // calculate score with aces check	  	   	      	   	       	     	    	
    private int calculateScoreWithAces(Player player) {	  	   	      	   	       	     	    	
        int score = 0;	  	   	      	   	       	     	    	
        int numOfAces = 0;	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
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
	  	   	      	   	       	     	    	
        // checking aces	  	   	      	   	       	     	    	
        for (int i = 0; i < numOfAces; i++) {	  	   	      	   	       	     	    	
            if (score + 11 <= 21) {	  	   	      	   	       	     	    	
                score += 11;	  	   	      	   	       	     	    	
            } else {	  	   	      	   	       	     	    	
                score += 1;	  	   	      	   	       	     	    	
            }	  	   	      	   	       	     	    	
        }	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
        return score;	  	   	      	   	       	     	    	
    }	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
    // Winner of game method	  	   	      	   	       	     	    	
 private void determineWinner() {	  	   	      	   	       	     	    	
    int score1 = calculateScoreWithAces(player1);	  	   	      	   	       	     	    	
    int score2 = calculateScoreWithAces(player2);	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
    System.out.println("Player 1's cards: " + player1.getCards() + " (Score: " + score1 + ")");	  	   	      	   	       	     	    	
    System.out.println("Player 2's cards: " + player2.getCards() + " (Score: " + score2 + ")");	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
    if (score1 > 21 && score2 > 21) {	  	   	      	   	       	     	    	
        System.out.println("Both players busted. It's a tie!");	  	   	      	   	       	     	    	
    } else if (score1 > 21) {	  	   	      	   	       	     	    	
        System.out.println(player2.getName() + " wins!");	  	   	      	   	       	     	    	
    } else if (score2 > 21) {	  	   	      	   	       	     	    	
        System.out.println(player1.getName() + " wins!");	  	   	      	   	       	     	    	
    } else if (score1 > score2) {	  	   	      	   	       	     	    	
        System.out.println(player1.getName() + " wins!");	  	   	      	   	       	     	    	
    } else if (score2 > score1) {	  	   	      	   	       	     	    	
        System.out.println(player2.getName() + " wins!");	  	   	      	   	       	     	    	
    } else {	  	   	      	   	       	     	    	
        System.out.println("It's a tie!");	  	   	      	   	       	     	    	
    }	  	   	      	   	       	     	    	
}	  	   	      	   	       	     	    	
}