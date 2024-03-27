public class Dealer {	  	   	      	   	       	     	    	
    private Deck deck; // The deck from which the dealer deals cards	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
    //Creation of deck	   	      	   	       	     	    	
    public Dealer(Deck deck) {	  	   	      	   	       	     	    	
        this.deck = deck;	  	   	      	   	       	     	    	
    }	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
    //function to pick a card  	   	      	   	       	     	    	
    public Card dealCard() {	  	   	      	   	       	     	    	
        return deck.pickCard();	  	   	      	   	       	     	    	
    }	  	   	      	   	       	     	    	
}