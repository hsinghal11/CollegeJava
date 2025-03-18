package Assignment6926;

import java.util.Arrays;
import java.util.Scanner;

public class A_Boolean_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        int[][] temp = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
                if(arr[i][j]==1){
                    for (int k = 0; k < m; k++) {
                        temp[i][k]=1;
                    }
                    for (int k = 0; k < n; k++) {
                        temp[k][j]=1;
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(temp[i][j]+" ");
            }
            System.out.println();
        }
    }
}
