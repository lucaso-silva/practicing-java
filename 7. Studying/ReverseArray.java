import java.util.*;
/**
** Design and write a java method that reverses the order of the elements in an array that is passed as 
** a parameter. For example, if the array originally contained the values 12 35 21 75 125 5 then it 
** would contain the following after the method was called 5 125 75 21 35 1
 */
public class ReverseArray 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int size = (int)(Math.random() * 11);
        int[] array = new int[size];

        System.out.println("You are creating an array of size " + size);
        for(int i = 0; i < size; i++) {
            System.out.println("Enter a value for element " + i + " in the array:");
            array[i] = in.nextInt();
        }

        System.out.println("\nThe initial array was: ");
        for(int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

        reverseArr(array);
        
        System.out.println("\nThe reverse array is: ");
        for(int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

        in.close();
    }

    public static int[] reverseArr(int[] array)
    {
        int temp;

        for(int i = 0; i < array.length/2; i++) {
            temp = array[i];
            array[i] = array[array.length - 1 - i]; 
            array[array.length - 1 - i] = temp;
        }

        return array;
    }
}
