import java.util.Scanner;
public class Exercise14 {
/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float ticketPrice = 6f;
		int age;
		float price = 0;
		
		System.out.print("Enter your age: ");
		age = input.nextInt();
		
		if(age < 16){
			price = ticketPrice / 2.00f;
			System.out.println("Your ticket costs £" + price);
		}
		else if(age >= 60){
			price = ticketPrice / 3.00f;
			System.out.println("Your ticket costs £" + price);
		}
		else{
			System.out.println("Your ticket costs £" + ticketPrice);
		}

	}

}
