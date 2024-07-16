
import java.util.Scanner;

///count set means count the number of 1 in binary 
//let assume 2 in decimal and represent in binary 10
//to perform this we have to subtract n by 1 untile 0 
// number of iteration become number of set bit
class CountSetBit {

    static int showCount(int n) {
        int count = 0;
        while (n != 0) {
            n = n & (n - 1);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            System.out.println(showCount(n));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
