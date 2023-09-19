import java.util.Scanner;	

public class CheckAddition
{
	public static void main(String[] args)
	{
		int num1 = (int)(Math.random() * 100); 
		int num2 = (int)(Math.random() * 100);
		int result;
		
		Scanner in = new Scanner(System.in);
		System.out.println("The sum of " + num1 + " + " + num2 + " is equal to: ");
		result = in.nextInt();
		
		if(result == (num1 + num2)) {
			System.out.println("Your answer is correct!!");
		} else {
			System.out.println("You are wrong. \nThe sum of " + num1 + " + " + num2 + " is equal to " + (num1 + num2) + ".");
		}	
	}
}