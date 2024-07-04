import java.util.Scanner;

class Factorial {
    static int fact(int n) {
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res *= i;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            System.out.println("Factorial of " + n + " is " + fact(n));
        } finally {
            sc.close(); // Ensure the scanner is closed to prevent resource leak
        }
    }
}
