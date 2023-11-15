import java.util.*;
/**
** The least common multiple (LCM) of two numbers is the smallest integer evenly divisible by both 
** numbers. For example, the LCM of 9 and 12 is 36. Develop a pseudocode algorithm which will 
** find the LCM of any two given numbers. Translate your algorithm into a java method
 */

public class LeastCommonMultiple 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int num1, num2, leastCommonMultiple;
        
        System.out.println("Please enter the first number");
        num1 = in.nextInt();

        System.out.println("Please enter the second number");
        num2 = in.nextInt();

        leastCommonMultiple = leastCommonMult(num1, num2);

        System.out.println("The least common multiple of " + num1 + " and " + num2 + " is " + leastCommonMultiple);
        in.close();
    }

    public static int leastCommonMult(int number1, int number2)
    {
        int count = 1, lcm = 1;
        
        while(lcm % number2 != 0) {
            lcm = number1 * count;
            count++;
        }
        return lcm;
    }
    
}