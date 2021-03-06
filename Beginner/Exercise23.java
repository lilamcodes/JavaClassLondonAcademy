import java.util.Scanner;


public class Exercise23 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String actorName;
		String actor1 = "Sean Connery";
		String actor2 = "Roger Moore";
		String actor3 = "Pierce Brosnan";
		String actor4 = "Daniel Craig";
		
		int score = 0;
		
		System.out.println("Try and name 4 actors who have played James Bond.");
		
		for(int i = 1; i <= 4; i++){
			System.out.print("\nAttempt " + i + " - Name an actor: ");
			actorName = input.nextLine();
			
			if(actorName.equalsIgnoreCase(actor1)){
				System.out.println("Well done: " + actor1 + " was Bond in From"
						+ " Russia with Love.");
				
				score++;
			}
			else if(actorName.equalsIgnoreCase(actor2)){
				System.out.println("Well done: " + actor2 + " was Bond in Live"
						+ " and Let Die.");
				
				score++;
			}
			else if(actorName.equalsIgnoreCase(actor3)){
				System.out.println("Well done: " + actor3 + " was Bond in Die"
						+ " Another Day.");
				
				score++;
			}
			else if(actorName.equalsIgnoreCase(actor4)){
				System.out.println("Well done: " + actor4 + " was Bond in Skyfall");
				
				score++;
			}
			else{
				System.out.println("Sorry. " + actorName + " hasn't played Bond as"
						+ " far as I know.");
			}
		}
		
		System.out.println("\nYou got " + score + " out of 4");
	}

}
