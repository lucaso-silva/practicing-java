import java.util.Scanner;

public class ConvertFloatingPoint
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		double input, temp, result, tempResult;
		int num;
		
		System.out.println("Enter a fractional number");
		input = in.nextDouble();
		
		//2.252
		num = (int) input;   //2
		result = input - num;  //0.252
		//System.out.println(input + " minus " + num + " is equal to " + result);
		temp = result;
		do {
			temp = temp * 10;
			//2.52
			System.out.println("temp is " + temp);
			tempResult = temp - (int)temp;
			System.out.println("tempResult " + tempResult);
		} while(tempResult > 0);
			//2.52 - 2 = 0.52
		System.out.println(temp);
	}
}