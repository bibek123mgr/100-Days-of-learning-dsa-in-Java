package Day3;
import java.util.Scanner;

class isPrime {

    static boolean Prime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    static boolean checkPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static boolean checkPrimeByOptmise(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2 || n == 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        for (int i = 5; i <= Math.sqrt(n); i+=6) {
            if(n % i == 0 || n % i+2 == 0){
                return false;
            }
        }
        return true;
        
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter the interger:");
            int a = sc.nextInt();
            System.out.println(Prime(a));
            System.out.println(checkPrime(a));
            System.out.println(checkPrimeByOptmise(a));
        }
    }
}
