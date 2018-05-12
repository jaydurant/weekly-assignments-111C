package queues;

public class StackArray {
	private final Integer LIMIT = 5;
	private String[] strArr = new String[LIMIT];
	private int front = 0;
	
	public void push(String entry) {
		int arrLength = strArr.length;

		int index = (front + 1) > arrLength ? ((front + 1) % arrLength) - 1 : front + 1;
		
		if(strArr[index] == null) {
			strArr[index] = entry; 
			front = index;
		}else {
			System.out.println("Array is Full");
		}
	}
	
	public String pop() {
		String returnValue = strArr[front];
		strArr[front] = null;
		front = front - 1 == -1 ? LIMIT - 1 : --front ;
		
		return returnValue;
	}
	
	public boolean isEmpty() {
		return strArr[front] == null ? true : false;
	}
	
	public void clear() {
		strArr = new String[LIMIT];
	}
}
