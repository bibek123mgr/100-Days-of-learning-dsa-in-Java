import java.util.Scanner;

class GCD {
    static int findGCD(int n1, int n2) {
        int min;
        if (n1 < n2) {
            min = n1;
        } else {
            min = n2;
        }
        for (int i = min; i >= 1; i--) {
            if (n1 % i == 0 && n2 % i == 0) {
                return i;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter first integer: ");
            int a = sc.nextInt();
            System.out.print("Enter second integer: ");
            int b = sc.nextInt();
            System.out.println("The GCD of " + a + " & " + b + " is " + findGCD(a, b));
        }
    }
}
