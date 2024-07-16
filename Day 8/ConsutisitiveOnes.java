
import java.util.Scanner;

// Consutisitive1's means no of ones that are continue such as 11110111 = 4 ,1010101=0 ,101101=2
class ConsutisitiveOnes {

    static boolean checkIsConsutisitiveOnes(int n) {

        if ((n & (n << 1)) != 0) {
            return true;
        } else {
            return false;
        }
    }

    static int countConsutisitiveOnes(int n) {
        int count = 0;
        while (n > 0) {
            n = (n & (n << 1));
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the number :");
            int n = sc.nextInt();
            System.out.println(checkIsConsutisitiveOnes(n));
            System.out.println(countConsutisitiveOnes(n));
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
