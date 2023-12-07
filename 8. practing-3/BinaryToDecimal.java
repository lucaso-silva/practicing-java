/**
** Using Top-Down design methodology, write a java program that asks the user to enter
** 16 zeros and ones representing a binary number.  
** The program then displays the signed decimal number represented by the 16 bits binary number.
** Note that two’s complement method should be used for negative numbers.
*/

import java.util.Scanner;

public class BinaryToDecimal 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String number = "";

        System.out.println("Please a sequence of 16 zeros an ones representing a binary number");
        number = in.nextLine();

        if(validBinary16Bits(number)) {
            System.out.println("The number entered corresponds to : " + convertToDecimal(number));

        } else {
            System.out.println("You didn't enter a valid 16-bits binary number");
        }

        in.close();
    }
    public static boolean validBinary16Bits(String numberString)
    {
        boolean valid = true;

        if(numberString.length() != 16) {
            valid = false;
        }

        for(int i = 0; i < numberString.length(); i++) {
            if((numberString.charAt(i) != '1') && (numberString.charAt(i) != '0')) {
                valid = false;
            }
        }

        return valid;
    }

    public static int convertToDecimal(String numberString)
    {
        double decimal = 0;

        if(numberString.charAt(0) == '1') {
            decimal = convertToPositive(numberString) * -1;

        } else {
            for(int i = numberString.length()-1, j = 0; i > 0; i--, j++) {
                if(numberString.charAt(i) == '1') {
                    decimal = decimal + Math.pow(2, j);
                }
            }
        }

        return (int)decimal;
    }

    public static int convertToPositive(String numberString)
    {
        int positive = 0, lastIndex1;
        String positiveNum = "";

        lastIndex1 = numberString.lastIndexOf('1');
        positiveNum = numberString.substring(lastIndex1);

        for(int i = lastIndex1-1; i >= 0; i--) {
            if(numberString.charAt(i) == '1') {
                positiveNum = '0' + positiveNum;

            } else {
                positiveNum = '1' + positiveNum;
            }
        }

        positive = convertToDecimal(positiveNum);

        return positive;
    }
}
