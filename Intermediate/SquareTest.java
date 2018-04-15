package intermediate;

class Square {
	//attributes
	int length;
	int width;
	
	
	//functions

public int perimeter(){
	int perimeter;
	perimeter=2*(length+width);
	return perimeter;
	//System.out.println(perimeter);
}

public int area(){
	int area, area2;
	//area=length*width;
	area=(int) Math.pow(length, 2);
	area2=length*length;
	return area;
	//System.out.println(area);
	
}
//public void, public int, all data t

}



public class SquareTest {

	public static void main(String[] args) {
		Square obj=new Square();
		obj.length=10;
		obj.width=10;
		int perimeter=obj.perimeter();
		System.out.println(perimeter);
		obj.area();
		
		int area=obj.area();

	}

}
