import java.util.ArrayList;	  	   	      	   	       	     	    	
public class Main{	  	   	      	   	       	     	    	
  public static void main(String[] args)	  	   	      	   	       	     	    	
  {	  	   	      	   	       	     	    	
    Deck deck = new Deck();	  	   	      	   	       	     	    	
    ArrayList<Card> drawnCards = deck.fiveCards();	  	   	      	   	       	     	    	
    for (Card card: drawnCards){	  	   	      	   	       	     	    	
      System.out.println("Suit: " +card.getSuit() + ", Value: " +card.getValue());	  	   	      	   	       	     	    	
    }	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
  }	  	   	      	   	       	     	    	
}