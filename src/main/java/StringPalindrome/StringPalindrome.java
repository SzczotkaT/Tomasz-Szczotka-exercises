package StringPalindrome;

import java.util.Scanner;

public class StringPalindrome {
    public static void main (String[] Args){
        System.out.println("Please enter a word you would like to check: ");
        String word = new Scanner(System.in).next();
        char[] wordArray = word.toCharArray();
        System.out.println("The word you typed " + palindromeCheck(wordArray));

    }

    public static String palindromeCheck(char[] word){
        int begChar = 0;
        int endChar = word.length - 1;

        while(begChar < endChar){
            if(word[begChar] != word[endChar]){
                return "is not a palindrome";
            }
            ++begChar;
            --endChar;
        }
        return "is a palindrome";
    }
}
