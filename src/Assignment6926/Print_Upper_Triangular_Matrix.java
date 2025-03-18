package Assignment6926;

import java.util.Scanner;

public class Print_Upper_Triangular_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i > j) {
                    System.out.print(0 + " ");
                } else {
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}
