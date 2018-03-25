import java.util.ArrayList;

public class ShoppingCart<T> implements BagInterface<T>{
	private ArrayList<T> bagContents = new ArrayList<>();
	
	public ShoppingCart(){};
	
	public int getCurrentSize() {
		return bagContents.size();
	}
	
	public boolean isEmpty() {
		return bagContents.isEmpty();
	}
	
	public void clear() {
		bagContents.clear();
	}

	public boolean add(T newEntry) {
		return bagContents.add(newEntry);
	} 
	
	public T remove() {
		return bagContents.remove(bagContents.size() - 1);
	}
	
	public boolean remove (T anEntry) {
		return bagContents.remove(anEntry);
	}
	
	public int getFrequencyOf(T anEntry) {
		int count = 0;
		
		for(T entry: bagContents) {
			if(entry.equals(anEntry)) {
				count++;
			}
		}
		
		return count;
	}
	
	public boolean contains(T anEntry) {
		return bagContents.contains(anEntry);
	}
	
	public T[] toArray() {
		T[] arrT = (T[]) bagContents.toArray();
		return arrT;
		
	} 


}
