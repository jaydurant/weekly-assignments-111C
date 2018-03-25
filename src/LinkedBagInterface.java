
public interface LinkedBagInterface<T> {
	public boolean add(T newEntry);
	
	public int getFrequencyOf(T newEntry);
	
	public T[] toArray();
}
