class Animal
  { 
	String name;
	String type;
        int age;
	


  void sleep()
	{
	System.out.println("sleeping...");
	} 
	
 void eat()
	{
 	System.out.println("Eatingggggg.....");
	}
  } 
  
class Dog extends Animal
  { 

  void bark()
	{
	System.out.println(this.name + "barking...");
	} 
  }

class Tiger extends Animal{
	
	String type;
	
	void attack()
	{
	System.out.println("Tiger attacked Deer");

	}
	
	
}
  class TestAnimal
  { 
  public static void main(String args[])
  { 
  Dog d=new Dog(); 
  d.bark(); 
  d.sleep(); 
  d.name = "Puppy";
  d.type = "German"; 	
  Tiger t = new Tiger();
 t.attack();
 t.type = "Bengal tiger";
	
 System.out.println(d.name);

 

  }
  } 