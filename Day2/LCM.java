package Day2;
import java.util.Scanner;

public class LCM {
    static int findLCM(int a, int b) {
        int res = Math.max(a, b);
        while (true) {
            if (res % a == 0 && res % b == 0) {
                break;
            }
            res++;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int a = sc.nextInt();
        System.out.print("Enter second integer: ");
        int b = sc.nextInt();
        System.out.println("The LCM is: " + findLCM(a, b));
    }
}
