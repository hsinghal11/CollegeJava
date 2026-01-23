package Contests.Div3_1043;

import java.util.Scanner;

public class alag {

    static long[] pow3 = new long[21];
    static long[] cost = new long[21];

    static {
        pow3[0] = 1;
        for (int i = 1; i < 21; i++) {
            pow3[i] = pow3[i - 1] * 3;
        }
        cost[0] = 3;
        for (int x = 1; x < 20; x++) {
            cost[x] = pow3[x + 1] + (long) x * pow3[x - 1];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();
            System.out.println(solve(n, k));
        }
        sc.close();
    }

    private static long solve(long n, long k) {
        long[] digits = new long[20];
        long minDeals = 0;
        long currentCost = 0;
        long tempN = n;
        int maxPower = 0;

        for (int i = 0; tempN > 0; i++) {
            digits[i] = tempN % 3;
            minDeals += digits[i];
            currentCost += digits[i] * cost[i];
            tempN /= 3;
            maxPower = i;
        }

        if (minDeals > k || (k - minDeals) % 2 != 0) {
            return -1;
        }

        long ops = (k - minDeals) / 2;

        for (int i = maxPower; i >= 1; i--) {
            if (ops == 0) {
                break;
            }

            long numToBreak = Math.min(ops, digits[i]);
            long savings = cost[i] - (3 * cost[i - 1]);
            currentCost -= numToBreak * savings;
            ops -= numToBreak;
        }

        return currentCost;
    }

}
