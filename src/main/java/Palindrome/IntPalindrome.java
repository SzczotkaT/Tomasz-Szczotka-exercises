package Palindrome;

import java.util.Scanner;

public class IntPalindrome {
    public static void main (String[] Args){
        System.out.println("Please enter a number: ");
        int number = new Scanner(System.in).nextInt();
        if(isPalindrome(number) == true){
            System.out.println("The number you typed is a palindrome");
        }else{
            System.out.println("The number you typed is not a palindrome");
        }

    }

    public static boolean isPalindrome(int number) {
        int palindrome = number;
        int reverse = 0;

        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }

        if (number == reverse) {
            return true;
        }
        return false;
    }
}
