import java.util.Scanner;	  	   	      	   	       	     	    	
public class Main {	  	   	      	   	       	     	    	
    public static void main(String[] args) {	  	   	      	   	       	     	    	
        Scanner scanner = new Scanner(System.in); // Scanner for input	  	   	      	   	       	     	    	
        boolean playAgain; // variable to see if player wants to play again	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
        //loop	  	   	      	   	       	     	    	
        do {	  	   	      	   	       	     	    	
            // start of game	  	   	      	   	       	     	    	
            Logic blackjack = new Logic();	  	   	      	   	       	     	    	
            blackjack.startGame(); // Start the game	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
            // option to play again	  	   	      	   	       	     	    	
            System.out.println("Do you want to play again? (Y/N)");	  	   	      	   	       	     	    	
            String playAgainChoice = scanner.nextLine();	  	   	      	   	       	     	    	
            playAgain = playAgainChoice.equalsIgnoreCase("y");	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
        } while (playAgain); // continue game if they say y	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
        // end game	  	   	      	   	       	     	    	
        System.out.println("Thanks for playing blackjack!");	  	   	      	   	       	     	    	
    }	  	   	      	   	       	     	    	
}