package CodeForcesDaily;

import java.util.Scanner;

public class C_Even_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
    }

    private static void solve(Scanner sc) {
        long a = sc.nextLong();
        long b = sc.nextLong();
        if (a % 2 != 0) {
            if (b % 2 != 0) {
                System.out.println(a * b + 1);
            } else {
                if (b % 4 == 0) {
                    System.out.println(a * b / 2 + 2);
                } else {
                    System.out.println(-1);
                }
            }
        } else {
            if (b % 2 != 0) {
                System.out.println(-1);
            } else {
                long s1 = a + b;
                long s2 = (a * b / 2) + 2;
                System.out.println(Math.max(s1, s2));
            }
        }
    }
}
