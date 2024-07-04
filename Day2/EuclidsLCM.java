package Day2;

import java.util.Scanner;

class EuclidsLCM {

    static int findEuclidsLCM(int a, int b) {
        return (a * b) / findEuclidsHCf(a, b);
    }
    static int findEuclidsHCf(int a, int b) {
        while (a != 0 && b != 0) {
            if (a > b) {
                a %= b;
            } else {
                b %= a;
            }
        }
        return a != 0 ? a : b;
    }
    public static void main(String[] args) {
               try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the first integer: ");
            int a = sc.nextInt();
            System.out.print("Enter the second integer: ");
            int b = sc.nextInt();
            System.out.println("The LCM is: " + findEuclidsLCM(a, b));
        } 
    }
}
