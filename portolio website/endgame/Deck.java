import java.util.ArrayList;	  	   	      	   	       	     	    	
import java.util.Collections;	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    		  	   	      	   	       	     	    	
public class Deck {	  	   	      	   	       	     	    	
    private ArrayList<Card> cards = new ArrayList<>(); // Created an arraylist to store cards  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
      	   	      	   	       	     	    	
    public Deck() {	  	   	      	   	       	     	    	
        	  	   	      	   	       	     	    	
        String[] suitOfCard = {"Diamond", "Heart", "Club", "Spade"};	  	   	      	   	       	     	    	
        String[] valuesOfCard = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
        // Creating cards for each combination 	   	      	   	       	     	    	
        for (String suit : suitOfCard) {	  	   	      	   	       	     	    	
            for (String value : valuesOfCard) {	  	   	      	   	       	     	    	
                cards.add(new Card(suit, value));	  	   	      	   	       	     	    	
            }	  	   	      	   	       	     	    	
        }	  	   	      	   	       	     	    	
    }	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
    // collections method to shuffle the cards in a random order  	   	      	   	       	     	    	
    public void shuffleCards() {	  	   	      	   	       	     	    	
        Collections.shuffle(cards);	  	   	      	   	       	     	    	
    }	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
    // picking a card at random	then removing it from deck  	   	      	    	       	     	    	
    public Card pickCard() {	  	   	      	   	       	     	    	
        int randomValue = (int) (Math.random() * cards.size());    	   	      	   	       	     	    	
        return cards.remove(randomValue);  	   	      	   	       	     	    	
    }	  	   	      	   	       	     	    	
}