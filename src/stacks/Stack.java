package stacks;

public class Stack<T> implements StackInterface<T> {
	private Node top = null;
	
	public Stack(){
		
	}
	public T peek() {
		if(top == null) {
			return null;
		}else {
			return top.getData();
		}
		
	}


	public T pop() {
		if(top == null) {
			return null;
		}else {
			Node currentNode = top;
			top = top.getNext();
			return currentNode.getData();
		}
		
	}


	public void push(T entry) {
		top = new Node(entry, top);
	}


	public boolean isEmpty() {
		return top == null ? true : false;
	}


	public void clear() {
		top = null;
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
