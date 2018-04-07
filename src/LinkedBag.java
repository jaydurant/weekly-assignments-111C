
public class LinkedBag<T> implements LinkedBagInterface<T> {
	private Node firstNode;
	private int numberOfEntries;
	
	public LinkedBag() {
		firstNode = null;
		numberOfEntries= 0;
	}
	
	public T remove() {
		T result = null;
		if(firstNode != null) {
			result = firstNode.data;
			firstNode = firstNode.next;
			numberOfEntries--;
		}
		
		return result;
	}
	
	public boolean remove(T entry) {
		Node entryNode = getReferenceTo(entry);
		boolean result = false;
		
		if(entryNode != null) {
			entryNode.data = firstNode.data;
			firstNode = firstNode.next;
			numberOfEntries--;
			result = true;
		}
		
		return result;
	}
	
	
	public boolean add(T entry) {
		Node newNode = new Node(entry,firstNode);
		firstNode = newNode;
		numberOfEntries++;
		return true;
	}
	
	public int getFrequencyOf(T newEntry) {
		Node cN = firstNode;
		int loopCount = 0;
		int count = 0;
		while(loopCount < numberOfEntries && cN != null) {
			if(cN.data.equals(newEntry)) {
				count++;
			}
			loopCount++;
			cN = cN.next;
		}
		
		return count;
	}
	
	private Node getReferenceTo(T anEntry) {
		boolean found = false;
		Node currentNode = firstNode;
		
		while(!found && currentNode != null) {
			if(anEntry.equals(currentNode.data)) {
				found = true;
			}else {
				currentNode = currentNode.next;
			}
		}
		
		return currentNode;
	}
	
	@SuppressWarnings("unchecked")
	public T[] toArray() {
		Object[] result = new Object[numberOfEntries];
		int index = 0;
		Node cN = firstNode;
		while((index < numberOfEntries) && cN != null) {
			result[index] = (T)cN.data;
			index++;
			cN = cN.next;
		}
		T[] tArr = (T[])result;
		return tArr;
	}
	
	
	
	private class Node{
		private T data;
		private Node next;
		
		private Node(T data) {
			this.data = data;
			next = null;
		}
		
		private Node(T data,Node next) {
			this.data = data;
			this.next = next;
		}
		
	}
}
