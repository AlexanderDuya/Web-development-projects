import java.util.Collections;	  	   	      	   	       	     	    	
import java.util.ArrayList;	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
public class Deck	  	   	      	   	       	     	    	
{	  	   	      	   	       	     	    	
  private ArrayList<Card> cards = new ArrayList();	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
 public Deck(){	  	   	      	   	       	     	    	
 cards = new ArrayList();	  	   	      	   	       	     	    	
 String[] suitOfCard = {"Diamond", "Heart", "Club", "Spade" };	  	   	      	   	       	     	    	
 String[] valuesOfCard = {"ace", "2" ,"3" ,"4" ,"5" ,"6" ,"7" ,"8" ,"9" ,"10" ,"Jack" ,"Queen" ,"King" };	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
 for (String suit : suitOfCard){	  	   	      	   	       	     	    	
   for(String value : valuesOfCard){	  	   	      	   	       	     	    	
     cards.add(new Card(suit, value));	  	   	      	   	       	     	    	
   }	  	   	      	   	       	     	    	
  }	  	   	      	   	       	     	    	
 }	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
 public ArrayList<Card> fiveCards(){	  	   	      	   	       	     	    	
   //shuffling cards//	  	   	      	   	       	     	    	
   Collections.shuffle(cards);	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
   //picking cards//	  	   	      	   	       	     	    	
   ArrayList<Card> drawCard = new ArrayList();	  	   	      	   	       	     	    	
   for(int i = 0; i<5; i++){	  	   	      	   	       	     	    	
     drawCard.add(cards.get(i));	  	   	      	   	       	     	    	
   } return drawCard;	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
}	  	   	      	   	       	     	    	
}