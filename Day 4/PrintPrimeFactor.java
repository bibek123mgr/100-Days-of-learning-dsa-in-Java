
import java.util.Scanner;

class PrintPrimeFactor {

    void primefactor(int n) {
        int i = 2;
        while (n > 1) {
            while (n % i == 0) {
                System.out.print(i);
                System.out.print(" ");
                n = n / i;
            }
            i++;
        }
    }

    static void optPrimefactor(int n) {
        int i = 2;
        while (i * i <= n) {
            while (n % i == 0) {
                System.out.print(i);
                System.out.print(" ");
                n = n / i;
            }
            i++;
        }

        if (n > i) {
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the number:");
            int n = sc.nextInt();

            PrintPrimeFactor pf = new PrintPrimeFactor();
            pf.primefactor(n);
            System.out.println("");
            optPrimefactor(n);

        }
    }
}
