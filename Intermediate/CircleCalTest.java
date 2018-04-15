package intermediate;


	
	


class CircleCal{
	
	//attributes
	float radius;
	static int noOfCircles=0;
	
	//functions
	public void printDiameter(){
		System.out.println(2*radius);
	}
	public void printArea(){
		System.out.println(3.14f*radius*radius);
		
	}
	
	public CircleCal(){
		noOfCircles++;
		System.out.println(noOfCircles);
		System.out.println("new circle!");
	
}
}

public class CircleCalTest {

	public static void main(String[] args) {
	
		CircleCal obj= new CircleCal();
		System.out.println(obj);
		obj.radius=10;
		obj.printArea();
		obj.printDiameter();
		
		CircleCal obj1= new CircleCal();
		CircleCal obj2= new CircleCal();
		
		
	}

	
	
	
}
