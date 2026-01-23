package Lecture49;

import java.util.Arrays;

public class Knapsack_zero_one {
    public static void main(String[] args) {
        int cap = 4;
        int[] wt = {1,2,3,2,2};
        int[] val = {8,4,0,5,3};
        int[][] dp = new int[wt.length][val.length];
        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], -1);
        }
        System.out.println(Knapsack(wt,val,cap,0, dp));
    }

    public static int Knapsack(int[] wt, int[] val, int cap, int i, int[][] dp){
        if(cap ==0 || i > wt.length-1){
            return 0;
        }
        if(dp[cap][i] != -1){
            return dp[cap][i];
        }
        int inc = 0, exc = 0;
        if(cap >= wt[i]){
            inc = val[i] + Knapsack(wt,val,cap-wt[i], i+1, dp);
        }
        exc = Knapsack(wt,val,cap, i+1, dp);

        return dp[cap][i] = Math.max(inc, exc);
    }
}
