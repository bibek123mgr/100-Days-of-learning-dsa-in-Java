
import java.util.Scanner;

public class Divisors {

//linear approach timeComplixity =0(n)
    static void printDivisor(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i);
                System.out.print(" ");
            }
        }
    }

//timeComplixity =0(root.n)
    static void printDivisorOpt(int n) {
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i);
                System.out.print(" ");
                if (i != n / i) {
                    System.out.print(n / i);
                    System.out.print(" ");
                }
            }
        }
    }

//timeComplixity =0(root.n)
    static void AscprintDivisorOpt(int n) {
        int i;
        for (i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i);
                System.out.print(" ");
            }
        }

        for (; i >= 1; i--) {
            if (n % i == 0 && i != n / i) {
                System.out.print(n / i);
                System.out.print(" ");
            }
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.err.println("enter the number:");
            int n = sc.nextInt();
            printDivisor(n);
            System.out.println(" ");
            printDivisorOpt(n);
            System.out.println(" ");
            AscprintDivisorOpt(n);
        }
    }
}
