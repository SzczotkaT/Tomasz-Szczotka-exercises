package fibonnacciSeries;

import java.util.Scanner;

public class FibonnacciCalculator {
    public static void main(String[] Args) {

        System.out.println("Please enter a number: ");
        int number = new Scanner(System.in).nextInt();
        System.out.println("The Fibonacci series up to : " + number + " numbers: ");

        for (int i = 1; i <= number; i++) {
            System.out.print(fibonacciNumber(i) + " ");
        }
        System.out.println();
        System.out.println("The Fibonacci series up to : " + number + " numbers using for loop: ");

        for (int i = 1; i <= number; i++){
            System.out.print(fibonacciNumber2(i) + " ");
        }
    }

    public static int fibonacciNumber(int number){
        if(number == 1 || number == 2){
            return 1;
        }
        return fibonacciNumber(number - 1) + fibonacciNumber(number - 2);
    }

    public static int fibonacciNumber2(int number){
        if(number == 1 || number == 2){
            return 1;
        }
        int num1 = 1, num2 = 1, fibonacci = 1;

        for (int i = 3; i <= number; i++) {
            fibonacci = num1 + num2;
            num1 = num2;
            num2 = fibonacci;
        }
        return fibonacci;
    }
}
