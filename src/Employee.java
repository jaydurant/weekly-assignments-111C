
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
	 
	 public void input(String name, String DOJ, String dept,int id) {
		 this.name = name;
		 this.DOJ = DOJ;
		 this.dept = dept;
		 this.id = id;
	 }
	 
	 public String display() {
		 return "Name: " + name + ", DOJ: "+ DOJ + " , " + "Dept: " + dept + " , id: " + id;
	 }
	 
}
