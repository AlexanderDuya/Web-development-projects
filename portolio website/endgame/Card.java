import java.util.ArrayList;	  	   	      	   	       	     	    	
import java.util.Collections;	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
public class Card {	  	   	      	   	       	     	    	
    private String suit; // Suit of Card  	   	      	   	       	     	    	
    private String value; // Value of Card	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
    // Creating a card with a suit and value 	   	      	   	       	     	    	
    public Card(String suit, String value) {	  	   	      	   	       	     	    	
        this.suit = suit;	  	   	      	   	       	     	    	
        this.value = value;	  	   	      	   	       	     	    	
    }	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
    //getters for suit and value 	   	      	   	       	     	    	
    public String getSuit() {	  	   	      	   	       	     	    	
        return suit;	  	   	      	   	       	     	    	
    }	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
      	   	      	   	       	     	    	
    public String getValue() {	  	   	      	   	       	     	    	
        return value;	  	   	      	   	       	     	    	
    }	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
    // to represent the card. Ace of Hearts for example 	   	      	   	       	     	    	
    public String toString() {	  	   	      	   	       	     	    	
        return value + " of " + suit;	  	   	      	   	       	     	    	
    }	  	   	      	   	       	     	    	
}