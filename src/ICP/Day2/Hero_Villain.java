package ICP.Day2;

import java.util.Arrays;
import java.util.Scanner;

public class Hero_Villain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n_v = sc.nextInt();  // number of villains
            int n_h = sc.nextInt();  // number of heroes
            int h_h = sc.nextInt();  // health of each hero
            int[] h_v = new int[n_v];
            for (int i = 0; i < n_v; i++) {
                h_v[i] = sc.nextInt();  // villain healths
            }

            int ans = 0;
            int l = 0, r = n_v;   // binary search range

            while (l <= r) {
                int m = (l + r) / 2; // try to defeat m villains
                if (isPossible(h_v, m, n_h, h_h)) {
                    ans = m;
                    l = m + 1;   // try more
                } else {
                    r = m - 1;   // try fewer
                }
            }

            System.out.println(ans);
        }
    }

    private static boolean isPossible(int[] hV, int m, int nH, int hH) {
        int[] hero = new int[nH];
        Arrays.fill(hero, hH);

        int i = 0; // villain index
        int j = 0; // hero index

        while (i < m && j < nH) {
            if (hV[i] > hero[j]) {
                // hero dies, villain survives → next hero fights same villain
                j++;
            } else if (hV[i] == hero[j]) {
                // both die
                j++;
                i++;
            } else {
                // hero survives with reduced health
                hero[j] -= hV[i];
                i++;
            }
        }

        return i == m; // true if all m villains are defeated
    }
}
