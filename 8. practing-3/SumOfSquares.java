/**
** Write an algorithm to decide if a given positive integer can be written as the sum of two perfect 
** squares. For example, the number 58 is the sum of 9 and 49, both of which are square, but the 
** number 14 cannot be written as such a sum. 
*/

import java.util.Scanner;

public class SumOfSquares 
{   
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int number;

        System.out.println("Please enter a positive number: ");
        number = in.nextInt();

        sumOfPerfect(number);
        // if(sumOfPerfect(number)) {
        //     System.out.println(number + " can be written as the sum of two perfect squares.");

        // } else {
        //     System.out.println(number + " CAN NOT be written as the sum of two perfect squares.");
        // }

        in.close();
    }

    public static void sumOfPerfect(int number)
    {
        int sum;

        for(int i = 0; i < Math.sqrt(number); i++) {
            for(int j = i; j < Math.sqrt(number); j++) {
                if(number == Math.pow(i,2) + Math.pow(j, 2)) {
                    //return true;
                    System.out.println(number + " can be written as the sum of two perfect squares: " + (int)Math.pow(i,2) + " and " + (int)Math.pow(j, 2));
                }
            }
        }

        //return false;
    }
}
