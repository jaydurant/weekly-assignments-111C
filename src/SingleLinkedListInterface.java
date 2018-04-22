
public interface SingleLinkedListInterface<T> {
	public boolean addToHead(T newEntry);
	public boolean addToTail(T newEntry);
	public int getFrequencyOf(T entry);
	public boolean entryExists(T entry);
	public T remove();
	public boolean remove(T entry);
	public boolean removeLast();
	public boolean removeAllNodesOfValue(T entry);
	public void display();
	public T[] toArray();
}
