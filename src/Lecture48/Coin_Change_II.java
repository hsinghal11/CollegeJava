package Lecture48;

import java.util.Arrays;

public class Coin_Change_II {
    public static void main(String[] args) {
        int amount = 5;
        int[] coins = {1,2,5};
        int[][] dp = new int[amount+1][coins.length];
        for(int[] a: dp){
            Arrays.fill(a, -1);
        }
//        System.out.println(coin_change(coins,amount,0));
        System.out.println(coin_changeDP(coins,amount,0,dp));
    }
    public static int coin_change(int[] coins, int amount, int i){
        if(amount == 0){
            return 1;
        }
        if(i == coins.length){
            return 0;
        }

        int inc = 0, exc = 0; // inclusion, exclusion
        if(amount >= coins[i]){
            inc = coin_change(coins, amount - coins[i], i);
        }
        exc  = coin_change(coins, amount, i+1);
        return inc+exc;
    }

    public static int coin_changeDP(int[] coins, int amount, int i, int[][] dp){
        if(amount == 0){
            return 1;
        }
        if(i == coins.length){
            return 0;
        }
        if(dp[amount][i] != -1){
            return dp[amount][i];
        }
        int inc = 0, exc = 0; // inclusion, exclusion
        if(amount >= coins[i]){
            inc = coin_change(coins, amount - coins[i], i);
        }
        exc  = coin_change(coins, amount, i+1);
        return dp[amount][i] =inc+exc;
    }
}
