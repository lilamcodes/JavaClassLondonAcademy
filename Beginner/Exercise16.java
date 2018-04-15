import java.util.Scanner;

public class Exercise16 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String answers;
		
		System.out.print("Would you like to see a comedy (yes / no)? ");
		answers = input.nextLine();
		
		if(answers.equals("yes")){
			System.out.println("You might like either Yes Minister or SPAMalot");
		}
		else{
			System.out.print("Would you like to see a musical (yes / no)? ");
			answers = input.nextLine();
			
			if(answers.equals("yes")){
				System.out.println("You might like either Les Miserables or Mamma Mia");
			}
			else{
				System.out.println("You might like either The Woman in Black or Macbeth");
			}
		}
	}
}
