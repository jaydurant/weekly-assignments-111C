package queues;

public class PlayingCardsTest {

	public static void main(String[] args) {
		
		Integer[] cards = {1,2,3,4,5,6,7,8,9,10};
		
		PlayingCards deck1 = new PlayingCards(10,cards);
		System.out.println("inshuffle");
		deck1.inShuffle();
		deck1.displayDeck();
		
		System.out.println(" ");
		PlayingCards deck2 = new PlayingCards(10,cards);
		System.out.println("outshuffle");
		deck2.outShuffle();
		deck2.displayDeck();
		
		//outshuffles to original order
		PlayingCards deck3 = new PlayingCards(10,cards);
		
		deck3.outShuffle();
		int count = 1;
		while(!isSame(cards,deck3.returnDeck()) ) {
			deck3.outShuffle();
			count++;
		}
		System.out.println("");
		deck3.displayDeck();
		
		System.out.println(count + " out shuffles to original order");
		
		//inshuffles to original order
		PlayingCards deck4 = new PlayingCards(10,cards);
		deck4.inShuffle();
		count = 1;
		while(!isSame(cards,deck4.returnDeck()) ) {
			deck4.inShuffle();
			count++;
		}
		System.out.println("");
		deck4.displayDeck();
		System.out.println(count + " in shuffles to original order \n");
	
		PlayingCards deck5 = new PlayingCards(10,cards);
		System.out.println("Binary Card Trick");
		binaryCardTrick(deck5,6);
	}
	
	
	public static void binaryCardTrick(PlayingCards deck,int position) {
		String binaryStr = Integer.toBinaryString(position);
		System.out.println("Original");
		deck.displayDeck();
		for(int i = 0; i < binaryStr.length(); i++) {
			if(binaryStr.charAt(i) == '1') {
				deck.inShuffle();
			}
			else if(binaryStr.charAt(i) == '0') {
				deck.outShuffle();
			}
		}
		System.out.println("Shifted");
		deck.displayDeck();
	}
	
	
	public static boolean isSame(Integer[] entry1 , Integer[] entry2) {
		for(int i = 0; i < entry1.length; i++) {
			if(entry1[i] != entry2[i]) {
				return false;
			}
		}
		
		return true;
	}

}
