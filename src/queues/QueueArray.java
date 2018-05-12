package queues;

public class QueueArray {
	private final int  LIMIT = 5;
	private String[] strArr = new String[5];
	private int front = 0;
	private int last = 0;
	
	public void enqueue(String entry) {
		if(isEmpty()) {
			strArr[front] = entry;
			strArr[last] = entry;
		}else {
			int index = (last + 1) > strArr.length ? ((last + 1) % strArr.length) - 1 : last + 1;
			if(strArr[index] == null) {
				strArr[index] = entry;
				last = index;
			}else {
				System.out.println("Queue is full");
			}
			
		}
	}
	
	public String dequeue() {
		String returnValue = strArr[front];
		strArr[front] = null;
		
		if(front != last) {
			front = (front + 1) > strArr.length ? ((front + 1) % strArr.length) - 1 : front + 1;
		}
		
		return returnValue;
	}
	
	public boolean isEmpty() {
		return strArr[front] == null ? true : false;
	}
	
	public void clear() {
		strArr = new String[LIMIT];
	}
}
