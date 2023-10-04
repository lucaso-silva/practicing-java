//Write a Java program that displays the first 50 prime numbers

public class First50PrimeNumbers
{
	public static void main(String[] args)
	{
		int number = 1, numOfDiv = 0, primeNumbersFound = 0;
		
		while(primeNumbersFound <= 50) {
			for(int count = 0; count <= number; count++) {
				if(number % count == 0) {
					numOfDiv++;
				}
			}
			if(numOfDiv == 2) {
					System.out.println(number);
					primeNumbersFound++;
				}
						
		}
		number++;
	}
}