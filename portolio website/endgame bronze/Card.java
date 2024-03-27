public class Card	  	   	      	   	       	     	    	
{	  	   	      	   	       	     	    	
  private String suit;	  	   	      	   	       	     	    	
  private String value;	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
  public Card(String suit, String value ){	  	   	      	   	       	     	    	
    this.suit = suit;	  	   	      	   	       	     	    	
    this.value = value;	  	   	      	   	       	     	    	
  }	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
  // setters and getters//	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
  public void setSuit(String suit)	  	   	      	   	       	     	    	
  {	  	   	      	   	       	     	    	
     this.suit = suit;	  	   	      	   	       	     	    	
  }	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
  public String getSuit()	  	   	      	   	       	     	    	
  {	  	   	      	   	       	     	    	
     return this.suit;	  	   	      	   	       	     	    	
  }	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
  public void setValue(String value)	  	   	      	   	       	     	    	
  {	  	   	      	   	       	     	    	
     this.value = value;	  	   	      	   	       	     	    	
  }	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
  public String getValue()	  	   	      	   	       	     	    	
  {	  	   	      	   	       	     	    	
     return this.value;	  	   	      	   	       	     	    	
  }	  	   	      	   	       	     	    	
	  	   	      	   	       	     	    	
}