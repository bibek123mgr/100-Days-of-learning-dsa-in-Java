
import java.util.Scanner;

class DecimalToBinary {

    static String convertToBinary(int n) {

        String b = "";
        while (n >= 1) {
            int r = n % 2;
            n = n / 2;
            b = r + b;
        }
        return b;
    }

    static int convertToDecimal(String n) {
        int powerOf2 = 1;
        int result = 0;

        for (int i = n.length() - 1; i >= 0; i--) {
            if (n.charAt(i) == '1') {
                result += powerOf2;
            }
            powerOf2 *= 2;
        }
        return result;
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the number in decimal");
            int n = sc.nextInt();
            System.out.println(convertToBinary(n));
            System.out.println(convertToDecimal(convertToBinary(n)));
        } catch (Exception e) {
            System.err.println("error");
        }
    }
}
