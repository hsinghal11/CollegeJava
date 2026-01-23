package CodeForcesDaily;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class A_Mix_Mex_Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve();
        }
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 2; i++) {
            int max = Math.max(a[i], Math.max(a[i + 1], a[i + 2]));
            int minn = Math.min(a[i], Math.min(a[i + 1], a[i + 2]));
            int mex = mex(a[i], a[i + 1], a[i + 2]);
            if (mex != (max - minn)) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");

    }

    public static int mex(int a, int b, int c) {
        Set<Integer> set = new HashSet<>();
        set.add(a);
        set.add(b);
        set.add(c);

        int mex = 0;
        while (set.contains(mex)) {
            mex++;
        }
        return mex;

    }

}

