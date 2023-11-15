import java.util.*;

/**
** A palindrome is a word that is spelled the same forward and backward, such as “radar”. Write a
** java static method that will accept a String and will determine whether or not the word is a
** palindrome. The word “aabbcbbaa” will be considered a palindrome by your method
*/

public class Palindrome
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String word;
        
        System.out.println("Please enter a word: ");
        word = in.nextLine();

        if(isPalindrome(word)) {
            System.out.println("The word \"" + word +"\" is a Palindrome");

        } else {
             System.out.println("\"" + word +"\" is NOT a Palindrome");
        }

        in.close();
    }

    public static boolean isPalindrome(String word)
    {
        boolean palindrome = true;
        word.toLowerCase();

        // for(int i = 0, j = word.length() - 1; i < word.length() / 2; i++, j--) {
        //     if(word.toLowerCase().charAt(i) != word.toLowerCase().charAt(j)) {
        //         palindrome = false;
        //     }   
        // }

        for(int i = 0; i < word.length() / 2; i++) {
            if(word.toLowerCase().charAt(i) != word.toLowerCase().charAt(word.length()-1 - i)) {
                palindrome = false;
            }   
        }

        return palindrome;
    }
}