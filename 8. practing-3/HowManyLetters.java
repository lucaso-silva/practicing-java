/**
** Write a method that reads a sentence, then computes and displays the frequency of each letter
** regardless of its type. For example, if the sentence were “It is a wonderful day”, 
** the method would display the following:
** A has occurred 2 time(s) / D has occurred 2 time(s) / E has occurred 1 time(s) / F has occurred 1 time(s),
** and so on (...)
**/
import java.util.*;

public class HowManyLetters 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String sentence = "";

        System.out.println("Please enter a sentence:");
        sentence = in.nextLine();

        countLetters(sentence);
        in.close();
    }

    public static void countLetters(String sentence)
    {
        int[] numLetters = new int[26];
        sentence = sentence.toLowerCase();

        for(int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            
            if(ch >= 'a' && ch <= 'z') {
                numLetters[ch - 'a']++;
            }
        }

        for(int i = 0; i < numLetters.length; i++) {
            if(numLetters[i] > 0) {
                System.out.println((char)(i+'A') + " has ocurred " + numLetters[i] + " times.");
            }
        }
    }
}
