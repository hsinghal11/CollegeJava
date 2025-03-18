package Assignment6926;

import java.util.Scanner;

public class Anticlock2d {
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
        Print(arr);
    }
    public static void Print(int[][] arr) {
        int minc = 0, minr = 0, maxc = arr[0].length - 1, maxr = arr.length - 1;
        int toatalElement = arr.length * arr[0].length;
        int c = 0;
        while (c < toatalElement) {
            for (int i = minr; i <= maxr && c < toatalElement; i++) {
                System.out.print(arr[i][minc] + ", ");
                c++;
            }
            minc++;
            for (int i = minc; i <= maxc && c < toatalElement; i++) {
                System.out.print(arr[maxr][i] + ", ");
                c++;

            }
            maxr--;
            for (int i = maxr; i >= minr && c < toatalElement; i--) {
                System.out.print(arr[i][maxc] + ", ");
                c++;

            }
            maxc--;
            for (int i = maxc; i >= minc && c < toatalElement ; i--) {
                System.out.print(arr[minr][i] + ", ");
                c++;

            }
            minr++;
        }
        System.out.print("END");
    }
}
