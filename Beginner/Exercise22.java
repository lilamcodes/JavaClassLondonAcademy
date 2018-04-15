import java.util.Scanner;


public class Exercise22 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int cMin;
		int cMax;
		
		System.out.print("Enter the first amount in Celsius: ");
		cMin = input.nextInt();
		
		System.out.print("Enter the last amount in Celsius: ");
		cMax = input.nextInt();
		
		System.out.println("CELSIUS   FAHRENHEIT\n");
		
		for(int i = cMin; i <= cMax; i++){
			float F = (float)i * (9f / 5f) + 32f;
			
			System.out.println("  " + i + "        " + F);
		}
	}
}
