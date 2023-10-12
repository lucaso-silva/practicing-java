//Write a Java program that displays the first 50 prime numbers

public class First50PrimeNumbers
{
	public static void main(String[] args)
	{
		int num = 2, primeNumFound = 0;
		
		while(primeNumFound < 50)
		{
			if(isPrime(num)){
				System.out.print(num + " ");
				primeNumFound++;
			}
			num++;
		}
	}
	
	public static boolean isPrime(int num)
	{
		for(int i = 2; i < num/2; i++)
		{
			if(num % i == 0) {
				return false;
			}	
		}
		return true;
	}
}