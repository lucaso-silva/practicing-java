/**
Develop a Java method which accepts an integer value as input. The application displays
each digit of the given number on a separate line. For example if the input is 749 the
output will be: 9 4 7 (each number per line)
*/

import java.util.Scanner;

public class PrintNumbersPerLine
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String numberString; 
		int size;
		//int number;
		
		System.out.println("Enter a positive number");
		numberString = in.next();
		//number = (int)(numberString);
		// ?? check invalid input
		/**if(number < 0) {
			System.out.println("Error: You must enter a positive number!");
			return;
		} else { */
			size = numberString.length();
			System.out.println();
			
			for(int i = (size-1); i >= 0; i--) {
			System.out.println(numberString.charAt(i));
		}
		//}
	}	
}