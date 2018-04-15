
import java.util.Scanner;

public class Exercise10 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int test1;
		int test2;
		int avgScore;
		int pc;
		int age;
		int pcAgeDiff;
		
		System.out.print("Score for fitness test 1? ");
		test1 = keyboard.nextInt();
		
		System.out.print("Score for fitness test 2? ");
		test2 = keyboard.nextInt();
		
		avgScore = (test1 + test2) / 2;
		pc = ((avgScore * 8) / 5) + 10;
		
		System.out.println("Your average score is " + avgScore);
		System.out.println("Your PC Fit age is " + pc + " years old.");
		
		System.out.print("What is your actual age? ");
		age = keyboard.nextInt();
		
		pcAgeDiff = age - pc;
		
		System.out.println("You are " + pcAgeDiff + " years away from your PC fit age.");
	}

}
