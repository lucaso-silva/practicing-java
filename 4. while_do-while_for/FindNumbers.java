/**
Develop a program to find all positive integers less than 1000 which do not end in zero and have the property that if the rightmost digit is deleted, the integer obtained divides into the original evenly.
For example, 39 is such an integer since 3 remains after deleting the rightmost digit, and 3 divides 39 evenly.
*/

public class FindNumbers 
{
	public static void main(String[] args)
	{
			
		for(int number = 10; number < 1000; number++) {
			String numberChecked = Integer.toString(number);
			
			if(!numberChecked.endsWith("0")) {
				
				int lastDigitPosition = numberChecked.length() - 1;
				
				String numberWithoutLastDigit = numberChecked.substring(0, lastDigitPosition);
				
				int numberObtained = Integer.parseInt(numberWithoutLastDigit);
				
				if(number % numberObtained == 0) {
					System.out.print(number + " ");
				}
				
			}
		}
	}
}
