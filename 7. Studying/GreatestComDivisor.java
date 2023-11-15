import java.util.*;
/**
** The greatest common divisor (GCD) of two numbers is the largest factor of both numbers. For 
** example, the GCD of 54 and 63 is 9. Develop a pseudocode algorithm which will compute the 
** GCD of any two given numbers. Translate your algorithm into a java method
 */
public class GreatestComDivisor 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int num1, num2, greatestCommonDiv;

        System.out.println("Please enter the first positive number");
        num1 = in.nextInt();

        System.out.println("Please enter the second positive number");
        num2 = in.nextInt();

        greatestCommonDiv = greatestCommonDiv(num1, num2);
        in.close();
        System.out.println("The greatest common divisor of " + num1 + " and " + num2 + " is " + greatestCommonDiv);
    }
    
    public static int greatestCommonDiv(int number1, int number2)
    {
        int max = 0, greatestCommonDiv = 0;

        if(number1 < number2) {
            max = number1;
        } else {
            max = number2;
        }

        for(int i = 1; i < max; i++) {
            if(number1 % i == 0 && number2 % i == 0) {
                greatestCommonDiv = i;
            }
        }

        return greatestCommonDiv;
    }
}
