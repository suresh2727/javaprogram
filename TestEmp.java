import java.util.Scanner;
public class TestEmp {
	
	public static void main(String [] args) {
//		Scanner sc = new Scanner(System.in);	
//		String name;
//		System.out.println("Enter employee name");
//		name = sc.nextLine();
//		int empid;
//		System.out.println("Enter employee ID");
//		empid = sc.nextInt();
//		double salary;
//		System.out.println("Enter employee salary");
//		salary = sc.nextDouble();
//		int age;
//		System.out.println("Enter employee age");
//		age =sc.nextInt();
		
		
		Employee e1 = new Employee("suresh" , 24 , 27999);
		 e1.displayinfo();
		Employee e2 = new Employee("Dell" , 25 , 256666);
	     e2.displayinfo();
	 
       
		
	}
}
