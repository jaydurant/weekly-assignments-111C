package queues;


public class PlayingCards {
	private Deque<Integer> topDequeue;
	private Deque<Integer> bottomDequeue;
	private Integer[] cardList;
	private int limit;
	
	
	public PlayingCards(int limit,Integer[] cardList) {
		topDequeue = new Deque<Integer>();
		bottomDequeue = new Deque<Integer>();
		this.limit = limit;
		this.cardList = cardList;
	}
	
	
	public void outShuffle() {
		Integer midpoint = limit / 2;
		Integer currentCardCount = limit;
		
		for(int i = 0; i < midpoint; i++) {
			topDequeue.addToFront(cardList[i]);
		}
		
		for(int mid = midpoint ; mid < limit ; mid++) {
			bottomDequeue.addToFront(cardList[mid]);
		}
		topDequeue.display();
	    bottomDequeue.display();
		cardList = new Integer[limit];
		
		for (int i = 0; i < midpoint; i++) {
			Integer bottomEntry =  bottomDequeue.removeFront();
			Integer topEntry = topDequeue.removeFront();

			cardList[--currentCardCount] =  bottomEntry;
			cardList[--currentCardCount] = topEntry;
		}
		
		topDequeue.clear();
		bottomDequeue.clear();
	}
	
	public void inShuffle() {
		Integer midpoint = limit / 2;
		Integer currentCardCount = limit;
		
		for(int i = 0; i < midpoint; i++) {
			topDequeue.addToFront(cardList[i]);
		}
		
		for(int mid = midpoint ; mid < limit ; mid++) {
			bottomDequeue.addToFront(cardList[mid]);
		}
		topDequeue.display();
	    bottomDequeue.display();
		cardList = new Integer[limit];
		
		for (int i = 0; i < midpoint; i++) {
			Integer bottomEntry =  bottomDequeue.removeFront();
			Integer topEntry = topDequeue.removeFront();

			cardList[--currentCardCount] = topEntry;
			cardList[--currentCardCount] =  bottomEntry;
		}
		
		topDequeue.clear();
		bottomDequeue.clear();
	}
	
	public void displayDeck() {
		for (Integer val : cardList) {
			System.out.print(val + ",");
		}
		System.out.println(" ");
	}
	
	public Integer[] returnDeck() {
		return cardList;
	}
	
}
