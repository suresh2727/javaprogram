import java.util.Scanner;
public class Student {
	 public static void greet(String name) {
	        System.out.println("Hello, " + name + "!"); 
	       
	
	 }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		a =sc.nextInt();
		System.out.println(a);
		 greet("Alice");
	     greet("Bob");
}
}