class Horse{
	String name;
	double height;
	
	void run(){
		System.out.println(this.name + " Horse Running ");
		System.out.println(this);
	}
	public static void main(String []args)
	{
		Horse h1 = new Horse();
		h1.name = "Chetak";
		h1.height = 8.5;

		Horse h2 = new Horse();
		h2.name = "Badal";
		h2.height = 7.5;
		
		h1.run();
		h2.run();
		
	}

}