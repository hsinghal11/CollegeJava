package Assignment6926;

import java.util.Scanner;

public class Arrays_Wave_print_Column_Wise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        boolean flag = true;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (flag) {
                    System.out.print(arr[j][i] + ", ");
                }else {
                    System.out.print(arr[n-j-1][i]+", ");
                }
            }
            flag=!flag;
        }
        System.out.print("END");
    }
}
