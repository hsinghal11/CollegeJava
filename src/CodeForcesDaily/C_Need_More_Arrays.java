package CodeForcesDaily;

import java.util.Scanner;

//https://codeforces.com/problemset/problem/2114/C
public class C_Need_More_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int ans = 1;
            int j = 0;
            for (int i = 0; i < n; i++) {
                if(arr[i] > arr[j]+1){
                    ans++;
                    j = i;
                }
            }
            System.out.println(ans);
        }
    }
}
