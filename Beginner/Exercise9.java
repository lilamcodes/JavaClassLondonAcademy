import java.util.Scanner;

public class Exercise9 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int bornYear;
		int futureAge;
		
		System.out.print("Please enter your born year: ");
		bornYear = keyboard.nextInt();
		
		futureAge = 2020 - bornYear;
		
		System.out.println("You are born in " + bornYear);
		
		System.out.println("In the year 2020, you will be " + futureAge + " years old.");
	}

}
