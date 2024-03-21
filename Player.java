
public class Player {
	String name;
	int age;
	double height;
	String country;
	
	void display() {
		System.out.println("Name = "+ this.name);
		System.out.println("age = "+ this.age);
		System.out.println("Height = " + this.height);
		System.out.println("Country = " + this.country);
		
	}
	
}

class Cricket extends Player{
	int wicket_taken;
	int runs;
	
	
	void prc() {
		
		 super.display();
		System.out.println("Wicket taken = " + this.wicket_taken);
		System.out.println("Total runs = " + this.runs);
		System.out.println("Performance rating of Cricket player = " + (this.runs+this.wicket_taken)/2);
	}
}


class Football extends Player{
	
	
	int  goal;
	String position;
	
	void prc() {  
		super.display();
		System.out.println("Total goals = " + this.goal);
		System.out.println("Position = " + this.position);
		System.out.println("Performance rating of Football player = " +this.goal);
	}
	
}
