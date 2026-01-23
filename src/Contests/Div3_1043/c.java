package Contests.Div3_1043;

import java.util.Scanner;

public class c {
    static long[] pow3 = new long[20];
    static long[] get = new long[20];

    static {
        pow3[0] = 1;
        for (int i = 1; i < 20; i++) {
            pow3[i] = pow3[i - 1] * 3;
        }
        for (int x = 0; x < 19; x++) {
            if (x == 0) get[x] = 3;
            else get[x] = pow3[x + 1] + (long) x * pow3[x - 1];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            System.out.println(solve(n));
        }
        sc.close();
    }

    private static long solve(long n) {
        long total = 0;
        int idx = 0;
        while (n > 0) {
            long digit = n % 3;
            total += digit * get[idx];
            n /= 3;
            idx++;
        }
        return total;
    }
}
