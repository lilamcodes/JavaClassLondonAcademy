import java.util.Scanner;

public class Exercise15 {
	
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		float weight;
		float height;
		float BMI;
		
		System.out.print("Enter your weight in (kg): ");
		weight = input.nextFloat();
		
		System.out.print("Enter your height (m): ");
		height = input.nextFloat();
		
		BMI = weight / (height * height);
		
		System.out.println("\nYour BMI is: " + BMI);
		
		if(BMI < 18.5f){
			System.out.println("You are in \"Underweight\" range.");
		}
		else if(BMI >= 18.5f && BMI <= 24.9f){
			System.out.println("You are in \"Normal\" range.");
		}
		else if(BMI >= 25 && BMI <= 29.9f){
			System.out.println("You are in \"Overweight\" range.");
		}
		else if(BMI >= 30f){
			System.out.println("You are in \"Obese\" range.");
		}
	}
}
