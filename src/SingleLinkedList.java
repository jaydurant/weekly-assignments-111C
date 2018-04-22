
public class SingleLinkedList<T> implements SingleLinkedListInterface<T> {
	private Node firstNode;
	private Integer numberOfEntries;
	
	public SingleLinkedList() {
		firstNode = null;
		numberOfEntries = 0;
	}
	
	public boolean addToHead(T newEntry) {
		if (newEntry == null) return false;
		firstNode = new Node(newEntry,firstNode);
		return true;
	}
	
	public boolean addToTail(T newEntry) {
		if (firstNode == null) {
			firstNode = new Node(newEntry);
			return true;
		}
		
		Node newNode = new Node(newEntry);
		Node currentNode = firstNode;
		
		while(currentNode.next != null) {
			currentNode = currentNode.next;
		}
		
		currentNode.next = newNode;
		return true;
	}
	
	public boolean entryExists(T entry) {
		if (firstNode == null) return false;
		boolean nodeFound = false;
		
		Node currentNode = firstNode;
		
		while(currentNode != null & !nodeFound) {
			if(currentNode.data.equals(entry)) {
				nodeFound = true;
			}else{
				currentNode = currentNode.next;
			}
		}
		
		return nodeFound;
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
	
	public boolean removeLast() {
		if(firstNode.next == null) {
			firstNode = null;
			return true;
		}
		
		Node priorNode = firstNode;
		Node currentNode = firstNode;
		
		while(currentNode.next != null) {
			priorNode = currentNode;
			currentNode = currentNode.next;
		}
		
		priorNode.next = null;
		numberOfEntries--;
		return true;
	}
	
	public boolean removeAllNodesOfValue(T entry) {
		
		Node currentNode = firstNode;
		while(currentNode != null) {
			if(currentNode.getData().equals(entry)) {
				remove(entry);
			}
			currentNode = currentNode.next;
		}
		
		return true;
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
		
		if(found) {
			return currentNode;
		}else {
			return null;
		}
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
	
	public void display() {
		Node currentNode = firstNode;
		
		while(currentNode != null) {
			System.out.println(currentNode.getData());
			currentNode = currentNode.next;
		}
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
			this(data,null);
		}
		
		private Node(T data, Node next) {
			this.data = data;
			this.next = next;
		}

		private void setData(T data) {
			this.data = data;
		}
		
		private T getData() {
			return data;
		}
		
		private void setNext(Node next) {
			this.next = next;
		}
		
		private Node getNext() {
			return next;
		}
		
	}
	
}
