import java.util.ArrayList;	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
 	   	      	   	       	     	    	
class Player {	  	   	      	   	       	     	    	
    private String name; // player 1 or 2	  	   	      	   	       	     	    	
    private ArrayList<Card> cards = new ArrayList<>(); // ArrayList to store cards  	   	      	   	       	     	    	
    private boolean done = false; // boolean for whether they are finished their turn	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
    //name methods	   & card methods 	      	   	       	     	    	
    public Player(String name) {	  	   	      	   	       	     	    	
        this.name = name;	  	   	      	   	       	     	    	
    }	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
     	   	      	   	       	     	    	
    public String getName() {	  	   	      	   	       	     	    	
        return name;	  	   	      	   	       	     	    	
    }	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
      	   	      	   	       	     	    	
    public ArrayList<Card> getCards() {	  	   	      	   	       	     	    	
        return cards;	  	   	      	   	       	     	    	
    }	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
    // representing the card as a string	   	      	   	       	     	    	
    public String getCardsAsString() {
        String result = "";
        for (Card card : cards) {
            result += card.toString() + ", ";
        }
        return result;
    }	   	       	     	    	
	  	   	      	   	       	     	    	
    // checking if player is finished their turn	  	   	      	   	       	     	    	
    public boolean isDone() {	  	   	      	   	       	     	    	
        return done;	  	   	      	   	       	     	    	
    }	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
    //setting their turn status  	   	      	   	       	     	    	
    public void setDone(boolean done) {	  	   	      	   	       	     	    	
        this.done = done;	  	   	      	   	       	     	    	
    }	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
    // method to add card 	   	      	   	       	     	    	
    public void addCard(Card c) {	  	   	      	   	       	     	    	
        cards.add(c);	  	   	      	   	       	     	    	
    }	  	   	      	   	       	     	    	
}




