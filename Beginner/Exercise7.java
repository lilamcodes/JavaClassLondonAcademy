import java.util.Scanner;



public class Exercise7 {
	
	public static void main(String [] args){
		Scanner keyboard = new Scanner(System.in);
		
		float pound;
		float dollar;
		
		System.out.print("Please enter amount in pounds: ");
		
		pound = keyboard.nextFloat();
		dollar = 1.42f * pound;
		
		System.out.println("£ " + pound + " are $ " + dollar);
	}
}
