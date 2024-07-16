
import java.util.Scanner;

//to check whether the power of two of not 
//to perfom this sub n by 1 if this of two become zero in binary in AND operation then it is power of two
//let assume 8 in 1000 and n-1= 0110 ans = 0000 so power of two
class CheckPowOf2 {

    static boolean check(int n) {
        return n != 0 && (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            System.out.println(check(n));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
