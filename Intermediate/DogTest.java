package intermediate;

class Dog{
	//attributes
	String eye;
	String name;
	String typefur;
	int noOfLegs;
	
	//functions
	public void eatdogfood(){
		System.out.println("dogs eat dog food");
	}
	
	public void bark(){
		System.out.println("dogs says woof");
	}
}


public class DogTest {

	public static void main(String[] args) {
	
	Dog obj=new Dog();
	System.out.println(obj);
	obj.eye="brown";
	obj.name="frank";
	obj.typefur="shaggy";
	obj.noOfLegs=4;
	System.out.println(obj.noOfLegs);
	Dog obj2=new Dog();
	System.out.println(obj2);
	obj.eye	="blue";
	obj.name="jeff";
	obj.typefur="soft";
	obj.noOfLegs=4;
			
	}
	
}
	
	

