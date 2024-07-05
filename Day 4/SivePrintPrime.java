
import java.util.Scanner;

public class SivePrintPrime {

    static void printPrime(int n) {
        boolean[] prime = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            if (prime[i] == false) {
                for (int j = i * 2; j <= n; j += i) {
                    prime[j] = true;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (prime[i] == false) {
                System.out.print(i);
                System.out.print(" ");

            }
        }
    }

    static void stivePrime(int n) {
        boolean[] prime = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            if (prime[i] == false) {
                for (int j = i * i; j <= n; j += i) {
                    prime[j] = true;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (prime[i] == false) {
                System.out.print(i);
                System.out.print(" ");

            }
        }
    }

    static void optStivePrime(int n) {
        boolean[] prime = new boolean[n + 1];
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (prime[i] == false) {
                for (int j = i * i; j <= n; j += i) {
                    prime[j] = true;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (prime[i] == false) {
                System.out.print(i);
                System.out.print(" ");

            }
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.err.println("enter the number:");
            int n = sc.nextInt();
            printPrime(n);
            System.err.println(" ");
            stivePrime(n);
            System.err.println(" ");
            optStivePrime(n);
        }
    }
}
