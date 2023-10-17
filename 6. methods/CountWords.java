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
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String text;
		
		System.out.print("Enter a text:");
		text = in.nextLine();
		
		System.out.println("Number of words: " + count_words(text));
	}
	
	public static int count_words(String text)
	{
		int numberOfwords = 1, index = 0;
		String word;
		//char ch;
		
		if(text.length() == 0) {
			System.out.println("The word must have at least 1 character");
			
		} 
		
		else {		
		
			while(index != -1) {
				
				text = text.trim();
				index = text.indexOf(" ");
				
				if(index != -1) {
					word = text.substring(0, index);
					numberOfwords++;
					text = text.substring(index + 1);
				}
				
			}
			
			
		}
		return numberOfwords;
	}
}