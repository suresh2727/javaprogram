class Dog{
	String name = "Ruby";
	double height = 3.2;
	
	void sleep(){
		double noh = 3.5;
		System.out.println(this.name +" sleep for " + noh + " hours");
		
	}

	void jump(){
	double height = 7.5;
	System.out.println(this.name + " height is " + this.height);
	System.out.println(this.name   +" can jump upto " + height);
	}

	public static void main(String[] args){
		Dog d = new Dog();
		d.sleep();
		d.jump();
	}

}