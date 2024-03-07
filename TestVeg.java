class Vegtable {
 	String name;
	String color;
	double qty;
	
	void wash(){
	System.out.println("Vegetable washed");
	}

	void chop(){
	System.out.println("Choped");
	}
}


class Carrot extends Vegtable{

	String type;
	
	void prepareHalwa(){
	
	System.out.println("Halwa is Prepared using carrot");


	}
}



class Chilly extends Vegtable{

	String size;
	
	void prepareBaji(){
	
	System.out.println("Baji is Prepared");


	}
}


class TestVeg{
	public static void main(String [] args){
	
	Vegtable v = new Vegtable();
	v.name = "Mixed_veg";
	v.color = "red";
	

	Carrot c = new Carrot();
	c.color = "orange";
	c.name = "ootyCarrot";
	c.qty = 2.5;
	c.type = "sweetcarrot";
	

	
	c.prepareHalwa();          // method calling 
	System.out.println(c.name); 
	System.out.println(c.color);
	c.chop();
	c.wash();
	System.out.println(c);

	Chilly d = new Chilly();

	d.prepareBaji();
	
	   
	
	}
	}

