import java.util.Scanner;

class TrailingZero {
    static int countTrailingZeros(int n) {
        int powerOf5 = 5;
        int count = 0;
        while (powerOf5 <= n) {
            count = count + (n / powerOf5);
            powerOf5 = powerOf5 * 5;
        }
        return count;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number:");
            int number = sc.nextInt();
            System.out.println("The number of trailing zeros in " + number + "! is " + countTrailingZeros(number));
        }
    }
}

// trailing Zero means number of Zero in the fattorial of number in last
// 5!=1
// 10!=2
// 15!=3
// 20!=4
// 25!=6
// while the powerof 5 increase the zero count add


