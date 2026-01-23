package CodeForcesDaily;

import java.util.*;

public class B_Villagers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] arr = new long[n];
            long min = Long.MAX_VALUE;
            long max = Long.MIN_VALUE;
            boolean allEqual = true;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
                min = Math.min(min, arr[i]);
                max = Math.max(max, arr[i]);
                if (i > 0 && arr[i] != arr[0]) {
                    allEqual = false;
                }
            }

            long ans;
            if (allEqual) {
                ans = (n / 2) * min;
                if (n % 2 == 1) ans += min;
            } else {
                ans = max + (long)(n - 2) * min;
            }

            System.out.println(ans);
        }
    }
}
