public class Dealer {	  	   	      	   	       	     	    	
    private Deck deck; // The deck from which the dealer deals cards	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
    // Constructor to initialize the dealer with a deck	  	   	      	   	       	     	    	
    public Dealer(Deck deck) {	  	   	      	   	       	     	    	
        this.deck = deck;	  	   	      	   	       	     	    	
    }	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
    // Method to deal a card from the deck	  	   	      	   	       	     	    	
    public Card dealCard() {	  	   	      	   	       	     	    	
        return deck.pickCard();	  	   	      	   	       	     	    	
    }	  	   	      	   	       	     	    	
}