package Assignment6926;

import java.util.Scanner;

public class Column_max_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        int ans = Integer.MIN_VALUE;
        int idx = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            int sum =0;
            for (int j = 0; j < n; j++) {
                sum+=arr[j][i];
            }
            if(sum>ans) {
                ans = sum;
                idx = i+1;
            }
        }
        System.out.println(idx+" "+ans);

    }
}
