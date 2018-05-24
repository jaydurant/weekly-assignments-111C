package queues;


public class Deque<T> implements DequeInterface<T>  {
	private Node firstNode;
	private Node lastNode;
	
	public void addToFront(T entry) {
		Node newNode = new Node(entry,firstNode,null);
		if(lastNode == null) {
			firstNode = newNode;
			lastNode = firstNode;
			
		}else {
			firstNode.setPrev(newNode);
			firstNode = newNode;
		}
	}
	
	public void addToBack(T entry) {
		Node newNode = new Node(entry,null,lastNode);
		lastNode.setNext(newNode);	
		lastNode = newNode;
	}
	
	public T removeFront() {
		T firstNodeData = firstNode.getData();
		firstNode = firstNode.getNext();
		return firstNodeData;
	}
	
	public T removeBack() {
		T lastNodeData = lastNode.getData();
		
		lastNode = lastNode.getPrev();
		if (lastNode != null) {
			lastNode.setNext(null);
		}
		return lastNodeData;
	}
	
	public T getFront() {
		return firstNode.getData();
	}
	
	public T getBack() {
		return lastNode.getData();
	}
	
	public boolean isEmpty() {
		return firstNode != null ? true : false;
	}
	
	public void clear() {
		lastNode = null;
		firstNode = null;
	}
	
	public void display() {
		Node node = firstNode;
		while(node != null) {
			node = node.getNext();
		}
	}
	
	
	private class Node{
		private T data;
		private Node next;
		private Node prev;
		
		private Node(T data, Node next, Node prev) {
			this.data = data;
			this.next = next;
			this.prev = prev;
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
		public Node getPrev() {
			return prev;
		}
		public void setPrev(Node prev) {
			this.prev = prev;
		}
		
		
	}
}
