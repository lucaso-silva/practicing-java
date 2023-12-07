/**
** The Fibonacci numbers are used in population growth studies. The first few Fibonacci numbers are:
**      1, 1, 2, 3, 5, 8, ….
** That is, starting at the third number, each number is the sum of the previous two numbers.
**      a) Write a static method to make and return an array of a given size from the calling 
**          method with Fibonacci numbers.
**      b) Write another static method to find out which numbers in the above array are two’s powers.
*/
import java.util.Scanner;

public class FibonacciNumbers 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int size;

        System.out.println("How many Fibonacci numbers do you want to see (Enter a number greater than 3)?");
        size = in.nextInt();

        in.close();
        fibNumbers(size);
    }
    
    public static void fibNumbers(int sizeArray)
    {
        Scanner in = new Scanner(System.in);
        int[] fibNumbers = new int[sizeArray];
        String answer = "";
        fibNumbers[0] = 1;
        fibNumbers[1] = 1;

        for(int i = 2; i < sizeArray; i++) {
            fibNumbers[i] = fibNumbers[i-1] + fibNumbers[i-2];
        }
        
        System.out.println("The first " + sizeArray + " Fibonacci numbers: ");
        for(int i = 0; i < fibNumbers.length; i++) {
            System.out.print(fibNumbers[i] + " ");
        }

        System.out.println("\nDo you want to know which of these numbers are two's powers?");
        answer = in.nextLine();
        answer.toLowerCase();

        if(answer.charAt(0) == 'y') {
            displayPower2Numbers(fibNumbers);
        
        } else {
            return;
        }
        in.close();
    }

    public static void displayPower2Numbers(int[] array) 
    {
        System.out.println("These numbers are two's power");
        for(int i = 1; i < array.length; i++) {
            for(int j = 0; j < array[i]; j++) {
                
                if(array[i] == Math.pow(2,j)) {
                    System.out.print(array[i] + " ");
                }
            }
        }
    }
}
