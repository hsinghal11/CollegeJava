package CodeForcesDaily;

import java.util.*;

public class Gellyfish_and_Baby_Breath {
    static final int MOD = 998244353;
    static final int MAX = 100005;
    static long[] pow2 = new long[MAX];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        precomputePowers(); // pow2[i] = 2^i % MOD

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] p2 = new int[n]; // store 2^p[i] % MOD
            int[] q2 = new int[n]; // store 2^q[i] % MOD

            for (int i = 0; i < n; i++) {
                p2[i] = sc.nextInt();
            }

            for (int i = 0; i < n; i++) {
                q2[i] = sc.nextInt();
            }
            int[] posA = new int[n], posB = new int[n];
            for (int i = 0; i < n; i++) {
                posA[p2[i]] = i;
                posB[q2[i]] = i;
            }
            long[] r = new long[n];

            int maxa = 0, maxb = 0;
            for (int i = 0; i < n; i++) {
                maxa = Math.max(maxa, p2[i]);
                maxb = Math.max(maxb, q2[i]);

                int maxa_p, maxb_p;
                maxa_p = q2[i-posA[maxa]];
                maxb_p = p2[i-posB[maxb]];

                long max = 0;

                if(maxa == maxb){
                    if(maxa_p > maxb_p){
                        max = (pow2[maxa] + pow2[maxa_p]) %MOD;
                    }else{
                        max = (pow2[maxa] + pow2[maxb_p]) %MOD;
                    }
                } else if (maxa > maxb) {
                    max = (pow2[maxa] + pow2[maxa_p]) %MOD;
                }else{
                    max = (pow2[maxb] + pow2[maxb_p]) %MOD;
                }

                r[i] = max;
            }

            // Print result
            for (int i = 0; i < n; i++) {
                System.out.print(r[i] + " ");
            }
            System.out.println();
        }
    }

    static void precomputePowers() {
        pow2[0] = 1;
        for (int i = 1; i < MAX; i++) {
            pow2[i] = (pow2[i - 1] * 2)%MOD;
        }
    }
}
