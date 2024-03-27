import java.util.ArrayList;	  	   	      	   	       	     	    	
import java.util.Collections;	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
// Class representing a deck of playing cards	  	   	      	   	       	     	    	
public class Deck {	  	   	      	   	       	     	    	
    private ArrayList<Card> cards = new ArrayList<>(); // ArrayList to store the cards in the deck	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
    // Constructor to initialize the deck with all 52 cards	  	   	      	   	       	     	    	
    public Deck() {	  	   	      	   	       	     	    	
        // Define arrays for suits and values of cards	  	   	      	   	       	     	    	
        String[] suitOfCard = {"Diamond", "Heart", "Club", "Spade"};	  	   	      	   	       	     	    	
        String[] valuesOfCard = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
        // Create cards for each combination of suit and value and add them to the deck	  	   	      	   	       	     	    	
        for (String suit : suitOfCard) {	  	   	      	   	       	     	    	
            for (String value : valuesOfCard) {	  	   	      	   	       	     	    	
                cards.add(new Card(suit, value));	  	   	      	   	       	     	    	
            }	  	   	      	   	       	     	    	
        }	  	   	      	   	       	     	    	
    }	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
    // Method to shuffle the cards in the deck	  	   	      	   	       	     	    	
    public void shuffleCards() {	  	   	      	   	       	     	    	
        Collections.shuffle(cards);	  	   	      	   	       	     	    	
    }	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
    // Method to pick a random card from the deck	  	   	      	   	       	     	    	
    public Card pickCard() {	  	   	      	   	       	     	    	
        int randomValue = (int) (Math.random() * cards.size()); // Generate a random index within the range of cards	  	   	      	   	       	     	    	
        return cards.remove(randomValue); // Remove and return the card at the randomly generated index	  	   	      	   	       	     	    	
    }	  	   	      	   	       	     	    	
}