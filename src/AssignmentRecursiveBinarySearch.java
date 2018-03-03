
public class AssignmentRecursiveBinarySearch {
	private static int[] array = {6,5,3,2,1};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(5 + " is located at index " + recursiveBinarySearch(5, 0,  array.length - 1));
	}

	public static int recursiveBinarySearch(int target, int start, int end ) {
		int result = -1;
		int mid = (start + end) / 2;
		if(start > end) {
			return result;
		}else {
			if(target == array[mid] ) {
				result = mid;
				return result;
			}else if(target > array[mid]) {
				result = recursiveBinarySearch(target,start, --mid);
			}else {
				result = recursiveBinarySearch(target,++mid, end);
			}
		}
		
		return result;
	}
}
