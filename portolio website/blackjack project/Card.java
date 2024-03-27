import java.util.ArrayList;	  	   	      	   	       	     	    	
import java.util.Collections;	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
public class Card {	  	   	      	   	       	     	    	
    private String suit; // The suit of the card (e.g., Hearts, Diamonds, Clubs, Spades)	  	   	      	   	       	     	    	
    private String value; // The value of the card (e.g., Ace, 2, 3, ..., Jack, Queen, King)	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
    // Constructor to initialize a card with a suit and a value	  	   	      	   	       	     	    	
    public Card(String suit, String value) {	  	   	      	   	       	     	    	
        this.suit = suit;	  	   	      	   	       	     	    	
        this.value = value;	  	   	      	   	       	     	    	
    }	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
    // Getter method to retrieve the suit of the card	  	   	      	   	       	     	    	
    public String getSuit() {	  	   	      	   	       	     	    	
        return suit;	  	   	      	   	       	     	    	
    }	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
    // Getter method to retrieve the value of the card	  	   	      	   	       	     	    	
    public String getValue() {	  	   	      	   	       	     	    	
        return value;	  	   	      	   	       	     	    	
    }	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
    // Method to represent the card as a string (e.g., "Ace of Hearts")	  	   	      	   	       	     	    	
    public String toString() {	  	   	      	   	       	     	    	
        return value + " of " + suit;	  	   	      	   	       	     	    	
    }	  	   	      	   	       	     	    	
}