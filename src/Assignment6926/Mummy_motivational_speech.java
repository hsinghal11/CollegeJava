package Assignment6926;

import java.util.Scanner;

public class Mummy_motivational_speech {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[i][j]!=0){
                    System.out.println(false);
                    return;
                }
            }
        }
        System.out.println(true);
    }
}
