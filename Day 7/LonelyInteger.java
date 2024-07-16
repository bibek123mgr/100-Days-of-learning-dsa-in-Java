
import java.util.HashSet;
import java.util.Scanner;

class LonelyInteger {

    static int lonelyInteger(int[] arr) {
        HashSet<Integer> s = new HashSet<>();

        for (int i : arr) {
            if (s.contains(i)) {
                s.remove(i);
            } else {
                s.add(i);
            }
        }
        for (int i : s) {
            return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(lonelyInteger(arr));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
