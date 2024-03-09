
import java.util.Scanner;

class FlipkartProduct{
	
 	String pname;
	double price;
	int qty;

	void addToCart(){
	
	System.out.println(this.qty +" qty " +  this.pname + " Product Added to cart");
	}
	

	void makePayment(){
	
	System.out.println("Total Payment done for = " + this.qty  + " qty " + this.price*this.qty);
	}
	
}

class ShoeProduct extends FlipkartProduct
{
	
	
}


class ClothProduct extends FlipkartProduct
{
	
	
}

class FlipkartApp{

 public static void main(String[]args){
	ShoeProduct p1 = new ShoeProduct();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the shoe name");
	p1.pname = sc.next();
	System.out.println("Enter the Price");
	p1.price = sc.nextInt();
	System.out.println("Enter the qty");
	p1.qty = sc.nextInt();

	ClothProduct cp1 = new ClothProduct();
	System.out.println("Enter the Cloth name");
	cp1.pname = sc.next();
	System.out.println("Enter the Price");
	cp1.price = sc.nextInt();
	System.out.println("Enter the qty");
	cp1.qty = sc.nextInt();
	
	p1.addToCart();
	
	p1.makePayment();

	cp1.addToCart();
	
	cp1.makePayment();

 }

}


