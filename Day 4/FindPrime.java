
import java.util.Scanner;

public class FindPrime {

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2 || n == 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        for (int i = 5; i <= Math.sqrt(n); i += 6) {
            if (n % i == 0 || n % i + 2 == 0) {
                return false;
            }
        }
        return true;
    }

    static void primeNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i);
                System.out.print(" ");
            }
        }

    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter the interger:");
            int a = sc.nextInt();
            primeNumbers(a);
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
