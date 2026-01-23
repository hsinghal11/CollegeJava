package CodeForcesDaily;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class A_Redstone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            solve(arr, n);
        }
    }

    private static void solve(long[] arr, int n) {
        Map<Long, Integer> mp = new HashMap<>();
        boolean hasDuplicate = false;

        for (int i = 0; i < n; i++) {
            mp.put((long) arr[i], mp.getOrDefault(arr[i], 0) + 1);
            if (mp.get(arr[i]) >= 2) {
                hasDuplicate = true;
                break; // no need to check further
            }
        }

        System.out.println(hasDuplicate ? "Yes" : "No");
    }
}
