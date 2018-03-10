import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ComputeArray implements ComputeArrayInterface {
	private ArrayList<Integer> intArr = new ArrayList<>();
	
	public void addToArray(Integer value) {
		intArr.add(value);
	}
	
	public Integer computeSmallest() {
		Integer min = intArr.get(0);
		
		for(int i = 1 ; i < intArr.size(); i++) {
			if(intArr.get(i) < min) {
				min = intArr.get(i);
			}
		}
		
		return min;
	}
	
	public Integer computeSecondSmallest() {
		Collections.sort(intArr);
		
		return intArr.get(1);
	}
	
	public Double averageOfArray() {
		Integer sum = 0;
		for(Integer val : intArr) {
			sum += val;
		}
		
		return  (sum / (double)intArr.size());
	}
	

}
