package Leetcode;

public class leetcode_1219 {
    static int max = 0;
    public static void main(String[] args) {
        int[][] grid = {{1,0,7},{2,0,6},{3,4,5},{0,3,0},{9,0,20}};
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] check = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                get(n,m,grid,check,i,j, 0);
            }
        }
        System.out.println(max);
    }

    public static void get(int n, int m, int[][] grid, boolean[][] check, int curri, int currj, int sum){
        if(curri <0 ||currj<0 || curri >= n ||currj>=m || grid[curri][currj] ==0 || check[curri][currj]){
            if(sum > max){
                max = sum;
            }
            return;
        }else{
            sum+=grid[curri][currj];
        }
        int[] rr = {-1,1,0,0};
        int[] cc = {0,0,1,-1};
        check[curri][currj] = true;
        for (int i = 0; i < rr.length; i++) {
            get(n,m,grid,check,curri+rr[i], currj+cc[i], sum);
        }
        check[curri][currj] = false;
    }
}
