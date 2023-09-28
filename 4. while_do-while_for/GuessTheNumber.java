import java.util.Scanner;

public class GuessTheNumber
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int number, answer;
		
		number = (int)(Math.random() * 100);
		//System.out.println("The number is " + number + "\n\n");
		
		do 
		{
			System.out.println("\nWhat's your guess? ");
			answer = in.nextInt();
			
			if(answer == number){
				System.out.println("Correct!! The secret number is " + number);
			} else {
				if(answer < number){
					System.out.println("Too loo. Try again!");
				} else {
					System.out.println("Too high. Try again!!");
				}
			}
		} while (answer != number);
		
		System.out.println("End program!");
	}
}