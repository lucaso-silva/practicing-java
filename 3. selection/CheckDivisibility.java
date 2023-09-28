import java.util.Scanner;

public class CheckDivisibility
{
	public static void main(String[] args)
	{
		int number;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter a positive value");
		number = in.nextInt();
		
		if(number <= 0) {
			System.out.println("Enter a positive number");
		}
		
		else {
			System.out.println("Is " + number + " divisible by 2 and 3? " + ((number % 2 == 0)&&(number % 3 == 0)));
			System.out.println("Is " + number + " divisible by 2 or 3? " + ((number % 2 == 0)||(number % 3 == 0)));
			System.out.println("Is " + number + " divisible by 2 or 3, but not both? " + ((number % 2 == 0)^(number % 3 == 0)));
		}
	}
}