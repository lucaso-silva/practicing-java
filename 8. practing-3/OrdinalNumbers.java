/**
** Write a java method that accepts an array of positive integer numbers. The method displays the 
** corresponding ordinal forms for the numbers in the array.
** For example if the array contains the following numbers:
**      21 345 42 83 789
** The method displays:
**      21st 345th 42nd 83rd 789th
*/
import java.util.Scanner;

public class OrdinalNumbers 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int size, number;
        
        System.out.println("How many numbers will you enter?");
        size = in.nextInt();

        int[] listNumbers = new int[size];

        for(int i = 0; i < listNumbers.length; i++) {
            System.out.print("Please enter a positive number: ");
            number = in.nextInt();
            listNumbers[i] = number;
        }

        displayOrdinalNumbers(listNumbers);

        in.close();
    }
 
    public static void displayOrdinalNumbers(int[] array)
    {
        String cardinalNumbers = "Cardinal numbers: ", 
            ordinalNumbers = "Ordinal numbers: ";
        String[] listOrdinal = new String[array.length]; 

        for(int i = 0; i < array.length; i++) {
            int last2Digits = array[i] % 100;
            String ordinal = "";

            if(last2Digits == 1) {
                ordinal = array[i] + "" + "st";

            } else if (last2Digits == 2) {
                ordinal = array[i] + "" + "nd";

            } else if (last2Digits == 3) {
                ordinal = array[i] + "" + "rd";
            
            } else if (last2Digits >= 10 && last2Digits <= 20) {
                ordinal = array[i] + "" + "th";
            
            } else {
                int lastDigit = array[i] % 10;

                switch (lastDigit) {
                    case 1:
                        ordinal = array[i] + "" + "st";
                        break;
                    case 2:
                        ordinal = array[i] + "" + "nd";
                        break;
                    case 3:
                        ordinal = array[i] + "" + "rd";
                        break;
                    default:
                        ordinal = array[i] + "" + "th";
                        break;
                }
            }
            listOrdinal[i] = ordinal;
        }

        for(int i = 0; i < array.length; i++) {
            cardinalNumbers += array[i] + "" + " ";
        }
        System.out.println();
        System.out.println(cardinalNumbers);

        for(int i = 0; i < listOrdinal.length; i++) {
            ordinalNumbers += listOrdinal[i] + " ";
        }
        System.out.println(ordinalNumbers);
    }
}
