package queues;

public class Queue<T> implements QueueInterface<T> {
	private Node firstNode;
	private Node lastNode;
	
	public Queue() {
		firstNode = null;
		lastNode = null;
	}
	
	public void enqueue(T newEntry) {
		Node newNode = new Node(newEntry,null);
		
		if(isEmpty()) {
			firstNode = newNode;
		}else {
			lastNode.setNext(newNode);
		}
		lastNode = newNode;
	}
	
	public T getFront() {
		if(isEmpty()) {
			return null;
		}else {
			return firstNode.getData();
		}
	}
	
	public T dequeue() {
		T returnValue = getFront();
		
		firstNode = firstNode.getNext();
		if(firstNode == null) {
			lastNode = null;
		}
		
		return returnValue;
	}
	
	public boolean isEmpty() {
		return firstNode == null ? true : false ;
	}
	
	public void clear() {
		firstNode = null;
		lastNode = null;
	}
	
	private class Node{
		private T data;
		private Node next;
		
		private Node(T data, Node next) {
			this.data = data;
			this.next = next;
		}
		public T getData() {
			return data;
		}
		public void setData(T data) {
			this.data = data;
		}
		public Node getNext() {
			return next;
		}
		public void setNext(Node next) {
			this.next = next;
		}
		
		
	}
	
	
}
