
import java.util.Scanner;

class SwapOddEven {

    static int swapEvenOddBit(int n) {
        return ((n & 0xaaaaaaaa) >>> 1) | ((n & 0x55555555) << 1);
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the number");
            int n = sc.nextInt();
            System.out.println(swapEvenOddBit(n));
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
