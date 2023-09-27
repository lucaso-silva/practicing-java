import java.util.Scanner;

public class GuessANumber3Tries
{
	public static void main(String args[])
	{
		int number, count, guess;
		
		Scanner in = new Scanner(System.in);
		
		number = (int)(Math.random() * 16);
		System.out.println(number);
		System.out.println("\n");
		
		for(count = 3; count >= 1; count--) {
			System.out.println("Guess the secret number (between 0 and 15). You have "+ count + " tries.");
			guess = in.nextInt();
			
;			if(guess == number) {
				System.out.println("Correct! The secret number is " + number);
				return;
			} else {
				if(guess < number) {
					System.out.println("Too loo. Try again");
				} else {
					System.out.println("Too high. Try again");
				}
			}
		}
		
	}
}