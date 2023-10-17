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
		int num;
		
		System.out.println("Enter a positive number");
		num = in.nextInt();
		
		if(num <=0) {
			System.out.println("ERROR: Enter a positive number");
		} else {
			String number = num + "";
			char ch;
			
			for(int i = number.length() -1; i >= 0; i--) {
				ch = number.charAt(i);
				System.out.println(ch);
			}
		}
	}	
}