//Write a Java application that converts a Celsius temperature to its Fahrenheit equivalent

import java.util.Scanner;

public class ConvertTemperature
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		double tempCelsius, tempFahrenheit;
		
		System.out.println("Enter a temperature in Celsius degree");
		tempCelsius = in.nextDouble();
		
		tempFahrenheit = (tempCelsius * 9/5) + 32;
		
		System.out.println(tempCelsius + " in Celsius degree is equal to " + tempFahrenheit + " Fahrenheit.");
	}
}