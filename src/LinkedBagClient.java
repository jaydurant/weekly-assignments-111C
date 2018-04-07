
public class LinkedBagClient {

	public static void main(String[] args) {
		Data[] dataArr = {new Data(1),new Data(2),new Data(3),new Data(4)};
		
		LinkedBagInterface<Data> linkedBag = new LinkedBag<>();
		
		for(Data data : dataArr) {
			linkedBag.add(data);
		}
		
		System.out.println("Frequency " + linkedBag.getFrequencyOf(dataArr[0]));
		System.out.println("Remove first " + linkedBag.remove() );
		System.out.println("Remove last " + linkedBag.remove(dataArr[2]));
		//System.out.println("LinkedBag size " + linkedBag.toArray().length);

	}

}
