
public class EmployeeData {
	private Integer id;
	private String name;
	private String position;
	private Float salary;
	
	public EmployeeData(Integer id, String name, String position, Float salary){
		this.id = id;
		this.name = name;
		this.position = position;
		this.salary = salary;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public Float getSalary() {
		return salary;
	}
	public void setSalary(Float salary) {
		this.salary = salary;
	}
}
