//Write a Java program that displays the first 50 prime numbers

public class First50PrimeNumbers
{
	public static void main(String[] args)
	{
		int range, numDiv, numPrimeFound = 0;

		while(numPrimeFound <= 50){
			range = 2;
			numDiv = 0;
			
			for(int i=1; i < range ;i++) {
				if(range%i == 0){
					numDiv = numDiv + 1;
				} else {
					numDiv = numDiv;
				}
				
				if(numDiv == 1) {
					numPrimeFound = numPrimeFound + 1;
					System.out.print(i + ", ");
				}
			
			}
			range = range + 1;
		}
	}
}