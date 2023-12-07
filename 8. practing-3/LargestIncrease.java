/**
** Write a java program to read in a sequence of positive integers and print out the largest increase 
** observed from one value in the sequence to the next. The sequence will be terminated as soon as a 
** negative number is entered. 
** For example, if the sequence of numbers is 7, 20, 16, 25, 36, and -1 then the increases observed 
** are 13, -4, 9, 11, so the program would print 13. Don’t output anything other than the single 
** numerical value requested
*/
import java.util.*;

public class LargestIncrease 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int number, temp = 0, increase, largest = 0;

        do {
            System.out.println("Enter a positive number");
            number = in.nextInt();
            increase = number - temp;
            
            if(increase >= largest) {
                largest = increase;
            }
            temp = number;

        } while (number >= 0);

        in.close();
        System.out.println(largest);
    }
}
