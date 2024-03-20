
public class Employee {
	
	String ename;
	long salary;
	String designation;
	
	
	public Employee(String ename, long salary, String designation) {
		this.ename = ename;
		this.salary = salary;
		this.designation = designation;
	}

	// Copy Constructor

	public Employee(Employee e) {
		this.ename = e.ename;
		this.salary = e.salary;
		this.designation = e.designation;
	}
	
	
	
}
	
	
	
	
	
	


