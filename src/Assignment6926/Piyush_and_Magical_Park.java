package Assignment6926;

import java.util.Arrays;
import java.util.Scanner;

public class Piyush_and_Magical_Park {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int s = sc.nextInt();
        char[][] arr = new char[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j]=sc.next().charAt(0);
            }
//            System.out.println(Arrays.toString(arr[i]));
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                s--;
                if(arr[i][j]=='.'){
                    s-=2;
                }else if(arr[i][j]=='*'){
                    s+=5;
                }else {
                    break;
                }
                if(s<k){
                    break;
                }
            }
            if(s<k){
                break;
            }
            s+=1;
        }
        if(s>=k){
            System.out.println("Yes");
            System.out.println(s);
        }
        else {
            System.out.println("No");
        }
    }
}
