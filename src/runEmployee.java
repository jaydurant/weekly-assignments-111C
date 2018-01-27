
public class runEmployee {

	public static void main(String[] args) {
		Employee emp = new Employee("Jason","test","science",1);
		System.out.println(emp.display());
		emp.input();
		
		System.out.println(emp.display());
	}

}
