
import java.util.Scanner;

class CountTrailingZero {

    static int countNoOfTrailingZero(int n) {
        return (int) (Math.log10((n & n - 1) ^ n) / Math.log10(2));
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the number");
            int n = sc.nextInt();
            System.out.println(countNoOfTrailingZero(n));
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
