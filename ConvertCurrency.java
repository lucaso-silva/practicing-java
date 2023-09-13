//import methods in the library
import java.util.Scanner;

public class ConvertCurrency
{	/** Main method */
	public static void main(String[] args)
	{
		//assign variables and constant 
			  double canadianDollar;
			  double americanDollar;
		final double VALUE_CONVERSION = 0.74;

		//Scanner input
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a Canadian Dollar value:");
		canadianDollar = input.nextDouble();
		
		americanDollar = canadianDollar * VALUE_CONVERSION;
		
		System.out.println("\u0024CAD " + canadianDollar +  " corresponds to US\u0024 " + americanDollar + ".");
	}
}