public class SumOfNumbers
{
	public static void main(String[] args)
	{
		int sum = 0;
		
		for(int i = 1; i <= 100; i++){
			sum = sum + i;
		}
		
		System.out.println("The sum of 1 + 2 + 3 + 4 + (...) up to 100 is: " + sum);
	}
}