import java.util.Scanner;

class CountDigits {

    static int count(int n) {
        int count = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the number:");
            int number = sc.nextInt();
            System.out.println("Total count of digits is " + count(number));
        } finally {
            sc.close(); 
        }
    }
}
