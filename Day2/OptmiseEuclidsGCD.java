import java.util.Scanner;

class OptmiseEuclidsGCD {
    static int findOptmiseEuclidsGCD(int n1, int n2) {
        while (n1 != 0 && n2 != 0) {
            if (n1 > n2) {
                n1 = n1 % n2;
            } else {
                n2 = n2 % n1;
            }
        }
        return n1 != 0 ? n1 : n2;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the first integer: ");
            int a = sc.nextInt();
            System.out.print("Enter the second integer: ");
            int b = sc.nextInt();
            System.out.println("The GCD is: " + findOptmiseEuclidsGCD(a, b));
        }
    }
}


// let a and b
// 10 20
// find min
// divide (a=max % min || b=max%min)
// repeat the process until a or b become zero
// check which is zero and return not zero

