import java.util.Arrays;

public class AssignmentBinarySearch3 {

	public static void main(String[] args) {
		int[] a = {1,6,7,3,2};
		int[] b = {9,4,5,8};
		int[] c = new int[a.length + b.length];
		selectionSort(a);
		selectionSort(b);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		merge(a,b,c);

	}
	
	public static void merge(int[] a, int[] b, int[] c) {
		int al = a.length;
		int bl = b.length;
		
		int i = 0, j = 0, k = 0;
		
		while(i < al && j <bl) {
			if(a[i] < b[j]) {
				c[k++] = a[i++];
			}
			else if(b[j] < a[i]) {
				c[k++] = b[j++];
			}else {
				c[k++] = a[i++];
			}
		}
		
		for( int t = i ;i < al;i++) {
			c[k++] = a[i];
		}
		
		for( int z = j ;j < bl;j++) {
			c[k++] = b[j];
		}
		
		System.out.println("Merged Array");
		System.out.println(Arrays.toString(c));
	}
	
	public static void selectionSort(int[] intArr) {
		for(int i = 0 ; i < intArr.length - 1 ; i++ ) {
			int minIndex = i;
			
			for(int y = i ; y < intArr.length; y++) {
				if(intArr[y] < intArr[minIndex]) {
					minIndex = y;
				}
			}
			
			int temp = intArr[minIndex];
			intArr[minIndex] = intArr[i];
			intArr[i] = temp;
		}
	}

}
