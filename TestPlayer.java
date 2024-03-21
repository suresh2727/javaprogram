import java.util.Scanner;

public class TestPlayer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		while(true) {
		System.out.println("Add Player information for");
		
		System.out.println(" 1.Cricket 2.Football 3.Exit" );
		int ch = sc.nextInt();
		switch(ch) {
		
		case 1:
			System.out.println("Enter the details of Cricket player");
			// for cricket
			Cricket c1 = new Cricket();
			System.out.println("Enter the player name");
			c1.name = sc.next();
			System.out.println("Enter the player Age");
			c1.age = sc.nextInt();
			System.out.println("Enter the player Heigth");
			c1.height= sc.nextDouble();
			System.out.println("Enter the player Country");
			c1.country = sc.next();
			System.out.println("Enter Wicket taken");
			c1.wicket_taken =sc.nextInt();
			System.out.println("Enter Runs score");
			c1.runs= sc.nextInt();
			c1.prc();
			
			break;
			
		case 2 :
				System.out.println("Enter the details of Football player");
			
			Football f1 = new Football();
			System.out.println("Enter the player name");
			f1.name = sc.next();
			System.out.println("Enter the player Age");
			f1.age = sc.nextInt();
			System.out.println("Enter the player Heigth");
			f1.height= sc.nextDouble();
			System.out.println("Enter the player Country");
			f1.country = sc.next();
			System.out.println("Enter Goal Score");
			f1.goal =sc.nextInt();
			System.out.println("Enter the position");
			f1.position= sc.next();
			f1.prc();
			
			 break;
			
		case 3 :System.out.print("Thank you for providing data"); 
				System.exit(0);
				break;
			
			
	 default : System.out.print("Invalid choice");
	 			break;
			
			
		}
		
		
		}
		

		
		
		
	}

}
