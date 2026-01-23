package CodeForcesDaily;

import java.util.Scanner;

public class Equal_Values {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases

        while (t-- > 0) {
            int n = sc.nextInt();
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }
            long ans = Long.MAX_VALUE;
            int p1=0,p2=0;
            while (p1<n){
                while (p2< n && arr[p1] == arr[p2]) p2++;
                ans = Math.min(ans,p1*arr[p1] + (n- (p2-1) -1)*arr[p1]);
                p1 = p2;
            }
            System.out.println(ans);
        }
    }
}
