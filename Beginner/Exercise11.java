import java.util.Scanner;



public class Exercise11 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String fName;
		String lName;
		String fFirstLetter;
		String fLastLetter;
		String lFirstLetter;
		String lLastLetter;
		int nameLength;
		int fIndexes;
		int lIndexes;
		
		System.out.print("Please enter your first name: ");
		fName = keyboard.nextLine();
		
		System.out.print("Please enter your last name: ");
		lName = keyboard.nextLine();
		
		nameLength = fName.length() + lName.length();
		fIndexes = fName.length() - 1;
		lIndexes = lName.length() - 1;
		
		fFirstLetter = "" + fName.charAt(0);
		fLastLetter = "" + fName.charAt(fName.length() - 1);
		
		lFirstLetter = "" + lName.charAt(0);
		lLastLetter = "" + lName.charAt(lName.length() - 1);
		
		System.out.println("Your full name is " + fName.toUpperCase()
						   + " " + lName.toUpperCase());
		
		System.out.println("Your initials are " + fFirstLetter.toUpperCase() + " "
						   + lFirstLetter.toUpperCase());
		
		System.out.println("First name length is " + fName.length() + " letters");
		
		System.out.println("Last name length is " + lName.length() + " letters");
		
		
		
		System.out.println("Full name length is " + nameLength + " letters");
		
		System.out.println("First name starts with " + fFirstLetter.toUpperCase());
		
		System.out.println("First name ends with " + fLastLetter.toUpperCase());
		
		System.out.println("Last name starts with " + lFirstLetter.toUpperCase());
		
		System.out.println("Last name ends with " + lLastLetter.toUpperCase());
		
		System.out.println("First name indexes are 0 - " + fIndexes);
		
		System.out.println("Last name indexes are 0 - " + lIndexes);
		
		System.out.println("First name trims 1: " + fName.substring(0, 3));
		
		System.out.println("First name trims 2: " + fName.substring(1));
		
		System.out.println("Last name trims 1: " + lName.substring(0, 3));
		
		System.out.println("Last name trims 2: " + lName.substring(3));

	}

}
