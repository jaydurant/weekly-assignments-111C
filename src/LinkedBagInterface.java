
public interface LinkedBagInterface<T> {
	public boolean add(T newEntry);
	public int getFrequencyOf(T newEntry);
	public T remove();
	public boolean remove(T entry);
	public T[] toArray();
}
