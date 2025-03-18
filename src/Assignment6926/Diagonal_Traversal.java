package Assignment6926;

import java.util.Scanner;

public class Diagonal_Traversal {
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
        int i = 0;
        int j = 0;
        int count = 0;
        int total = arr.length*arr[0].length;
        int printed = 0;
        boolean flag = true;
        while (count <= n+m-2 && printed<=total){
            while (i+j <= count && printed<=total) {
                System.out.println(arr[i][j]);
                printed++;
                if(flag){
                    j++;
                    if(i+j>count){
                        count++;
                    } else {
                        flag=!flag;
                        continue;
                    }

                }else {
                    i++;
                    if(i+j>count){
                        count++;
                    }
                }
            }
        }
    }
}
