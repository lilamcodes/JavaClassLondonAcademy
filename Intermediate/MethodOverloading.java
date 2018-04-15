package intermediate;

public class MethodOverloading {
	
	public void add(int number1, int number2){
		int sum=number1+number2;
		System.out.println(sum);
	}
	
	public void add(int number1, int number2, int number3){
		int sum=number1+number2+number3;
		System.out.println(sum);
	}
	
	public void subtract(int number1, int number2){
		int diff=number1-number2;
		System.out.println(diff);
		
	}
	

	public static void main(String[] args) {
		MethodOverloading obj= new MethodOverloading();
		obj.add(2, 3);
		obj.add(2, 3,4);
		obj.subtract(5, 6);
	}

}
