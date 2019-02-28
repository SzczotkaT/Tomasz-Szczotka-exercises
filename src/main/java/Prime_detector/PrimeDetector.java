package Prime_detector;

import java.util.Scanner;

public class PrimeDetector {
    public static void main(String[] Args){
        System.out.println("Please enter a number to check if prime: ");
        int number = new Scanner(System.in).nextInt();

        if(number != 0 ) {
            if (primeDetect(number) == false) {
                System.out.println("The number: " + number + " is not a prime number");
            } else {
                System.out.println("The number: " + number + " is a prime number");
            }
        }
    }

    public static boolean primeDetect(int number){
        int sqrt = (int) Math.sqrt(number) + 1;
        for(int i = 2; i < sqrt; i++){
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
