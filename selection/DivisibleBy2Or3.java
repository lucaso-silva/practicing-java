import java.util.Scanner;

public class DivisibleBy2Or3
{
	public static void main(String[] args)
	{
		double num;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a positive number");
		num = in.nextDouble();
		
		if(num <= 0) {
			System.out.println("Please. Enter a positive number!\n");
		}
	
		if((num%2 == 0) && (num%3==0)) {
			System.out.println(num + " is divided by both 2 AND 3.\n");
		}
		
		else if((num%2 == 0) || (num%3 == 0)) {
			System.out.println(num + " is divisible by 2 OR 3, but not both.");
			
			if(num%2 == 0) {
				System.out.println("This number is only divided by 2.\n");
			} 
			
			else {
				System.out.println("This number is only divided by 3.\n");
			}
		}
		
		else {
			System.out.println(num + " is not divisible either by 2 or 3.\n");
		}
	}
}