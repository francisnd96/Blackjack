import java.util.Random;

public class Deck {
	
	private Card[] myCards;
	private int numCards;
	
	public Deck(){
		this(1,false);
	}
	
	public Deck(int numDecks, boolean shuffle){
		this.numCards = numDecks * 52;
		this.myCards = new Card[this.numCards];
		int c = 0;
		
		for(int i = 0; i < numDecks; i++){
			for (int j = 0; j < 4; j++){
				for (int k = 0; k <= 13; k++){
					this.myCards[c] = new Card(Suit.values()[j],k);
					c++;
				}
			}
		}
		
		if(shuffle){
			this.shuffle();
		}
	}

	public void shuffle(){
		Random rng = new Random();
		
		Card temp;
		
		int j;
		
		for(int i = 0; i < this.numCards; i++){
			j = rng.nextInt(this.numCards);
			temp = this.myCards[i];
			this.myCards[i] = this.myCards[j];
			this.myCards[j] = temp;
		}
	}

	public Card dealNextCard(){
		Card top = this.myCards[0];
		
		for (int c = 1; c < this.numCards; c++){
			this.myCards[c-1] = this.myCards[c];
		}
		this.numCards--;
		return top;
	}
	
	public void printDeck(int numToPrint){
		
	}
}

