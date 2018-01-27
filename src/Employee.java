import java.util.*;
public class Employee {
	 private String name;
	 private String DOJ;
	 private String dept;
	 private int id;
	 
	 public Employee() {}
	 
	 public Employee(String name, String DOJ, String dept,int id) {
		 this.name = name;
		 this.DOJ = DOJ;
		 this.dept = dept;
		 this.id = id;
	 }
	 
	 public void input() {
		 Scanner input = new Scanner(System.in);
		 System.out.println("Enter Name");
		 this.name = input.nextLine();
		 System.out.println("Enter DOJ");
		 this.DOJ = input.nextLine();
		 System.out.println("Enter Dept");
		 this.dept = input.nextLine();
		 System.out.println("Enter Id");
		 this.id = input.nextInt();
		 
	 }
	 
	 public String display() {
		 return "Name: " + name + ", DOJ: "+ DOJ + " , " + "Dept: " + dept + " , id: " + id;
	 }
	 
}
