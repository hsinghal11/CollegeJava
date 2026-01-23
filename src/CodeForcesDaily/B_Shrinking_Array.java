package CodeForcesDaily;

import java.util.Scanner;

public class B_Shrinking_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            sc.nextLine();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int ans = -1;
            for(int i = 0; i<n-2; i++){
                if (Math.min(a[i + 1], a[i + 2]) <= a[i] && a[i] <= Math.max(a[i + 1], a[i + 2])) {
                    ans = 1;
                    break;
                }
            }
            for (int i = 2; i < n; i++) {
                if (Math.min(a[i - 1], a[i - 2]) <= a[i] && a[i] <= Math.max(a[i - 1], a[i - 2])) {
                    ans = 1;
                    break;
                }
            }
            for (int i = 1; i < n; i++) {
                if (Math.abs(a[i] - a[i - 1]) <= 1) {
                    ans = 0;
                    break;
                }
            }
            System.out.println(ans);
        }
    }
}
