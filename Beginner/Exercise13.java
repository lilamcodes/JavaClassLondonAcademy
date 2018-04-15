
import java.util.Scanner;

public class Exercise13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number;
		
		System.out.print("Please Enter a number: ");
		number = input.nextInt();
		
		if((number % 2) == 0){
			System.out.println("The number " + number + " is an even number.");
		}
		else{
			System.out.println("The number " + number + " is a odd number.");
		}
	}

}
