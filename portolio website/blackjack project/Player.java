import java.util.ArrayList;	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
// Class representing a player in the card game	  	   	      	   	       	     	    	
class Player {	  	   	      	   	       	     	    	
    private String name; // Name of the player	  	   	      	   	       	     	    	
    private ArrayList<Card> cards = new ArrayList<>(); // List to store the player's cards	  	   	      	   	       	     	    	
    private boolean done = false; // Indicates if the player has finished their turn	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
    // Constructor to initialize the player with a name	  	   	      	   	       	     	    	
    public Player(String name) {	  	   	      	   	       	     	    	
        this.name = name;	  	   	      	   	       	     	    	
    }	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
    // Method to get the name of the player	  	   	      	   	       	     	    	
    public String getName() {	  	   	      	   	       	     	    	
        return name;	  	   	      	   	       	     	    	
    }	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
    // Method to get the list of cards held by the player	  	   	      	   	       	     	    	
    public ArrayList<Card> getCards() {	  	   	      	   	       	     	    	
        return cards;	  	   	      	   	       	     	    	
    }	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
    // Method to get the string representation of the player's cards	  	   	      	   	       	     	    	
    public String getCardsAsString() {	  	   	      	   	       	     	    	
        StringBuilder sb = new StringBuilder();	  	   	      	   	       	     	    	
        for (Card card : cards) {	  	   	      	   	       	     	    	
            sb.append(card.toString()).append(", ");	  	   	      	   	       	     	    	
        }	  	   	      	   	       	     	    	
        return sb.toString();	  	   	      	   	       	     	    	
    }	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
    // Method to check if the player has finished their turn	  	   	      	   	       	     	    	
    public boolean isDone() {	  	   	      	   	       	     	    	
        return done;	  	   	      	   	       	     	    	
    }	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
    // Method to set the player's turn status	  	   	      	   	       	     	    	
    public void setDone(boolean done) {	  	   	      	   	       	     	    	
        this.done = done;	  	   	      	   	       	     	    	
    }	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
    // Method to add a card to the player's hand	  	   	      	   	       	     	    	
    public void addCard(Card c) {	  	   	      	   	       	     	    	
        cards.add(c);	  	   	      	   	       	     	    	
    }	  	   	      	   	       	     	    	
}

public String getCardsAsString() {
    String result = "";
    for (Card card : cards) {
        result += card.toString() + ", ";
    }
    return result;
}

import java.util.ArrayList;	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
// Class representing a player in the card game	  	   	      	   	       	     	    	
class Player {	  	   	      	   	       	     	    	
    private String name; // Name of the player	  	   	      	   	       	     	    	
    private ArrayList<Card> cards = new ArrayList<>(); // List to store the player's cards	  	   	      	   	       	     	    	
    private boolean done = false; // Indicates if the player has finished their turn	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
    // Constructor to initialize the player with a name	  	   	      	   	       	     	    	
    public Player(String name) {	  	   	      	   	       	     	    	
        this.name = name;	  	   	      	   	       	     	    	
    }	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
    // Method to get the name of the player	  	   	      	   	       	     	    	
    public String getName() {	  	   	      	   	       	     	    	
        return name;	  	   	      	   	       	     	    	
    }	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
    // Method to get the list of cards held by the player	  	   	      	   	       	     	    	
    public ArrayList<Card> getCards() {	  	   	      	   	       	     	    	
        return cards;	  	   	      	   	       	     	    	
    }	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
    // Method to get the string representation of the player's cards	  	   	      	   	       	     	    	
    public String getCardsAsString() {	  	   	      	   	       	     	    	
        StringBuilder sb = new StringBuilder();	  	   	      	   	       	     	    	
        for (Card card : cards) {	  	   	      	   	       	     	    	
            sb.append(card.toString()).append(", ");	  	   	      	   	       	     	    	
        }	  	   	      	   	       	     	    	
        return sb.toString();	  	   	      	   	       	     	    	
    }	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
    // Method to check if the player has finished their turn	  	   	      	   	       	     	    	
    public boolean isDone() {	  	   	      	   	       	     	    	
        return done;	  	   	      	   	       	     	    	
    }	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
    // Method to set the player's turn status	  	   	      	   	       	     	    	
    public void setDone(boolean done) {	  	   	      	   	       	     	    	
        this.done = done;	  	   	      	   	       	     	    	
    }	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
    // Method to add a card to the player's hand	  	   	      	   	       	     	    	
    public void addCard(Card c) {	  	   	      	   	       	     	    	
        cards.add(c);	  	   	      	   	       	     	    	
    }	  	   	      	   	       	     	    	
}