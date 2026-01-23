package Lecture49;

import java.util.Arrays;

public class Minimum_Falling_Path_Sum_II {
    public static void main(String[] args) {
        int[][] matrix = {{2,1,3},{4,5,6},{7,8,9}};
        int[][] dp = new int[matrix.length+1][matrix[0].length+1];
        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], -66666);
        }
        int answer = Integer.MAX_VALUE;
        for (int i = 0; i < matrix[0].length; i++) {
            answer = Math.min(answer, ans(matrix, 0, i, dp));
        }
        System.out.println(answer);
    }

    private static int ans(int[][] matrix, int cr, int cc, int[][] dp) {
        if(cr == matrix.length -1){
            return matrix[cr][cc];
        }

        if(dp[cr][cc] != (-66666)){
            return dp[cr][cc];
        }
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < matrix[0].length; i++) {
            if(i == cc){
                continue;
            }
            ans = Math.min(ans, ans(matrix, cr+1, i, dp));
        }
        return dp[cr][cc] = ans + matrix[cr][cc];
    }
}
