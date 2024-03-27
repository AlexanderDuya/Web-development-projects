import java.util.Scanner;	  	   	      	   	       	     	    	
public class Main {	  	   	      	   	       	     	    	
    public static void main(String[] args) {	  	   	      	   	       	     	    	
        Scanner scanner = new Scanner(System.in); // Scanner object for user input	  	   	      	   	       	     	    	
        boolean playAgain; // Variable to control the loop for playing again	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
        // Main loop to allow the user to play multiple games	  	   	      	   	       	     	    	
        do {	  	   	      	   	       	     	    	
            // Create a new instance of the Logic class to start the game	  	   	      	   	       	     	    	
            Logic blackjack = new Logic();	  	   	      	   	       	     	    	
            blackjack.startGame(); // Start the game	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
            // Ask the user if they want to play again	  	   	      	   	       	     	    	
            System.out.println("Do you want to play again? (Y/N)");	  	   	      	   	       	     	    	
            String playAgainChoice = scanner.nextLine(); // Read user input	  	   	      	   	       	     	    	
            playAgain = playAgainChoice.equalsIgnoreCase("y"); // Check if the user wants to play again	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
        } while (playAgain); // Continue the loop if the user wants to play again	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
        // Display a farewell message when the user decides to stop playing	  	   	      	   	       	     	    	
        System.out.println("Thanks for playing!");	  	   	      	   	       	     	    	
    }	  	   	      	   	       	     	    	
}