import java.util.ArrayList;

public class PiggyBank<T> implements BagInterface<T>  {
	ArrayList<T>  moneyArr = new ArrayList<>();
	
	public int getCurrentSize() {
		return moneyArr.size();
	}
	
	public boolean isEmpty() {
		return moneyArr.isEmpty();
	}
	
	public boolean add(T newEntry) {
		return moneyArr.add(newEntry);
	}
	
	public T remove(){
		return moneyArr.remove(moneyArr.size() - 1);
	}
	
	public boolean remove (T anEntry) {
		return moneyArr.remove(anEntry);
	}
	
	public void clear() {
		moneyArr.clear();
	}
	
	public int getFrequencyOf(T anEntry) {
		int count = 0;
		
		for(T entry : moneyArr ) {
			if(entry.equals(anEntry)) {
				count++;
			}
		}
		
		return count;
	}
	
	public boolean contains(T anEntry) {
		return moneyArr.contains(anEntry); 
	}
	
	public T[] toArray() {
		T[] arrT = (T[]) moneyArr.toArray();
		return arrT;
		
	}

}
