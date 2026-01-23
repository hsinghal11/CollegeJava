package Contests.Div3_1043;

import java.util.*;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            solve(n);
        }
        sc.close();
    }

    public static void solve(long n) {
        List<Long> sol = new ArrayList<>();

        long pOf10 = 10;

        for (int k = 1; k <= 18; k++) {
            long div = 1 + pOf10;
            if (n < div) {
                break;
            }

            if (n % div == 0) {
                sol.add(n / div);
            }
            pOf10 *= 10;
        }

        Collections.sort(sol);

        if (sol.isEmpty()) {
            System.out.println(0);
        } else {
            System.out.println(sol.size());
            for (long x : sol) {
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
