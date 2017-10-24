
public class Card {
	
	
	private Suit mySuit;
	
	private int myNumber;
	
	public Card(Suit aSuit, int aNumber){
		
		this.mySuit = aSuit;
		this.myNumber = aNumber;
		
	}
	
	public int getNumber(){
		return myNumber;
	}

	public String toString(){
		String cards[] = new String [14];
		cards[0] =  "Ace";
		cards[1] = "One";
		cards[2] = "Two";
		cards[3] = "Three";
		cards[4] = "Four";
		cards[5] = "Five";
		cards[6] = "Six";
		cards[7] = "Seven";
		cards[8] = "Eight";
		cards[9] = "Nine";
		cards[10] = "Ten";
		cards[11] = "Jack";
		cards[12] = "Queen";
		cards[13] = "King";
		
		return cards[myNumber] + " of " + mySuit.toString();
	}
}
