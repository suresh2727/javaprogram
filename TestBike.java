class Vehicle{

	void start(){

	System.out.println("Vehicle start");
	
	}


	void move(){
	System.out.println("Vehicle move");

	}

}

class Car extends Vehicle{
	@Override

	void start(){

	System.out.println("Start the car with press on push button");
	
	}


	void move(){
	System.out.println("Release the hand brake put the car in gear");

	}

	void music(){
	System.out.println("Play/Pause music");
	}



}



class Bike extends Vehicle{
	@Override

	void start(){

	System.out.println("Turn ON the ignation of the bike with self Start");
	
	}


	void move(){
	System.out.println("Take the side Stand and put in the 1st gear");

	}
}


public class TestBike{

public static void main(String [] args){

	Bike b = new Bike();
	b.start();
	b.move();
	
	Car c = new Car();
	c.start();
	c.move();	
	c.music();

}
}



