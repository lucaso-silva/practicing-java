import java.util.Scanner;

public class AdditionQuiz
{
	public static void main(String[] args)
	{
		int num1, num2, answer;
		Scanner in = new Scanner(System.in);
		
		num1 = (int)(Math.random() * 100);
		num2 = (int)(Math.random() * 100);
		answer = -1;
		
		while(answer != (num1 + num2)) {
			System.out.println("The sum of " + num1 + " + " + num2 + " is: ");
			answer = in.nextInt();
			if(answer == (num1 + num2)) {
				System.out.println("Correct answer!!");
			} 
			else {
				System.out.println("You're wrong! What's the sum of " + num1 + " + " + num2 + "?");
			}
		}
	}
}