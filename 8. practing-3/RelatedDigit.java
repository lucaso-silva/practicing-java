/**
** Write a java method which receives as input a single letter. The method returns the corresponding 
** digit on the telephone. The letters and digits on a telephone are grouped this way:
**      2 = ABC      4 = GHI    6 = MNO     8 = TUV
**      3 = DEF      5 = JKL    7 = PRS     9 = WXY
** No digit corresponding to Q or Z. For these two letters, your function should return a negative number
*/

import java.util.Scanner;

public class RelatedDigit 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String letter;
        char ch;
        do {
            System.out.print("Please a letter: ");
            letter = in.next();
            letter = letter.toUpperCase();
            ch = letter.charAt(0);

            System.out.println("The related digit is " + digit(ch));
        } while ((ch >= 'A') && (ch <= 'Z'));
        in.close();
    }

    public static int digit(char ch)
    {
        int number;
        
        switch (ch) {
            case 'A':
            case 'B':
            case 'C':
                number = 2;
                break;
            case 'D':
            case 'E':
            case 'F':
                number = 3;
                break;
            case 'G':
            case 'H':
            case 'I':
                number = 4;
                break;
            case 'J':
            case 'K':
            case 'L':
                number = 5;
                break;
            case 'M':
            case 'N':
            case 'O':
                number = 6;
                break;
            case 'P':
            case 'R':
            case 'S':
                number = 7;
                break;
            case 'T':
            case 'U':
            case 'V':
                number = 8;
                break;
            case 'W':
            case 'X':
            case 'Y':
                number = 9;
                break;
            default:
                number = -1;
                break;
        }
        return number;
    }
}
