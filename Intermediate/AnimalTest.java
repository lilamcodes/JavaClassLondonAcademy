package intermediate;

class Animal {
	protected String name;
	protected int hunger;
	
	public void die(){
		System.out.println(this.name+" dies like a generic animal!");
	}

	public void makeNoise(int times){
		System.out.println(this.name+ " says ");
		for (int i=0; i < times; i++);
			System.out.println("bamemoooo");
			System.out.println();
			//accessor/mutator methods - need some for hunger as well
			
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHunger() {
		return hunger;
	}

	public void setHunger(int hunger) {
		this.hunger = hunger;
	}

}




class Dog11 extends Animal{
	public void drool(){
		System.out.println(this.name + " is drooling!");
	}
	
}
class Cat extends Animal{
	private int livesLeft = 9;
	
	public void die(){
		if(livesLeft>0){
			System.out.println(this.name + "defies death -" + --this.livesLeft + "lives left!");
		} else super.die();
	}
	
	
}


public class AnimalTest{

	public static void main(String[] args) {
		Dog11 d = new Dog11();
		d.makeNoise(6);
		System.out.println(d.equals(new Dog())?"Dogs same": "Dog different");
		
		d.die();
		System.out.println("Cat test:");
		Cat c = new Cat ();
		c.setName("fluffy");
		c.makeNoise(6);
		for (int i=0; i<9; i++)
		c.die();
		System.out.println((c.equals(new Cat())?"Cats equal": "Cats unequal"));
		
	}

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
