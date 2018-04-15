import java.util.Scanner;


public class Exercise21 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String name;
		
		System.out.print("Please enter your name: ");
		name = input.nextLine();
		
		for(int i = 0; i < name.length(); i++){
			if((i != 0) && (i != name.length() - 1)){
				System.out.print("*");
			}
			else{
				System.out.print(name.charAt(i));
			}
		}
	}

}
