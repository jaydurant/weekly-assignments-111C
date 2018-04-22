
public class SingleLinkedListClient {

	public static void main(String[] args) {
		EmployeeData[] empDataArr = {new EmployeeData(1,"jason","manager",10.54F),new EmployeeData(2,"carl","employee",15.54F),new EmployeeData(3,"monica","super manager",50.54F),new EmployeeData(4,"jane","manager",100.54F)};
		
		SingleLinkedListInterface<EmployeeData> linkedList = new SingleLinkedList<>();
		
		for(EmployeeData data : empDataArr) {
			linkedList.addToHead(data);
		}
		
		System.out.println("Frequency " + linkedList.getFrequencyOf(empDataArr[0]));
		System.out.println("Remove first " + linkedList.remove() );
		System.out.println("Remove last " + linkedList.removeLast());
		System.out.println("Remove all nodes of Value " + linkedList.removeAllNodesOfValue(empDataArr[1]));
		linkedList.display();
		System.out.println("AddToHead " + linkedList.addToHead(new EmployeeData(6,"jack","manager",60.54F)));
		System.out.println("AddToTail " + linkedList.addToTail(new EmployeeData(6,"dan","pathfinder",2.54F)));
		linkedList.display();
	}

}
