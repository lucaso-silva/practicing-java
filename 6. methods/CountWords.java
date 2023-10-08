/**
Write a Java method to count all the words in a string.
Test Data:
	Input the string: The quick brown fox jumps over the lazy dog.

Expected Output:
	Number of words in the string: 9
*/

import java.util.Scanner;

public class CountWords
{
	public  static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String text;
		
		System.out.print("Enter a text:");
		text = in.nextLine();
		
		System.out.println("Number of words: " + count_words(text));
	}
	
	public static int count_words(String text)
	{
		int numberOfwords = 0;
		
		if(text.length() == 0) {
			System.out.println("The word must have at least 1 character");
		} 
		
		else {		
			for(int i = 0; i < text.length(); i++){
				numberOfwords++;
			}
		}
		return numberOfwords;
	}
}