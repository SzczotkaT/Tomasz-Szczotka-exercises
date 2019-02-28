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
    }

    public static int fibonacciNumber(int number){
        if(number == 1 || number == 2){
            return 1;
        }
        return fibonacciNumber(number - 1) + fibonacciNumber(number - 2);
    }
}
