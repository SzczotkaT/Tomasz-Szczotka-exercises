package EuclidsAlgorithm;

import java.util.Scanner;

public class EuclidsAlgo {
    public static void main(String[] Args) {
        System.out.println("Please enter first number: ");
        int m = new Scanner(System.in).nextInt();
        System.out.println("Please enter second number");
        int n = new Scanner(System.in).nextInt();

        System.out.println("GCD of numbers " + m + " and " + n + " is : " + gcd(m, n));
    }

    public static int gcd(int figure1, int figure2) {
        int m = figure1;
        int n = figure2;

        while (n != 0) {
            int c = m % n;
            m = n;
            n = c;
        }
        return m;
    }

}