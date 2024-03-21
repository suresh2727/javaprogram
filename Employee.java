
public class Employee {
	private int empId;
	private String name;
	private int age;
	private double salary;
	static int count=1;
	public Employee(String name, int age, double salary) {
		this.empId = count++;
		this.name = name;
		setAge(age);
		setSalary(salary);
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age>= 0 && age<= 120 ) {
			this.age = age;
		}
		else {
			System.out.println("Invalid age for employeeID = " + empId);
		}
		
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		if(salary > 0) {
			this.salary = salary;
		}
		else {
			System.out.println("Invalid salary data or Negative Salary for employeeID = " + empId);
		}
		
	}

	public int getEmpId() {
		return empId;
	}

	public String getName() {
		return name;
	}
	
	
	public void displayinfo() {
		System.out.println("---------Employee Details-----------");
		System.out.println("Employee ID:= " + empId);
		System.out.println("Employee Name:= " + name);
		if(getAge()>0) {
		System.out.println("Age of Employee:= " + getAge());
		}
		if(getSalary()>0)
		System.out.println("Salary of Employee:= " + getSalary());
		}	
	}
	
	
	
	
	
