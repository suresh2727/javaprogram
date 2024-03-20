
public class Testapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
				Employee e1 = new Employee("Suresh" , 35000 , "software developer");
				System.out.println(e1.ename + " " + e1.salary + " " + e1.designation);
				Employee e2 = new Employee(e1);
				System.out.println(e2.ename + " " + e2.salary + " " + e2.designation);	
			}
	}


