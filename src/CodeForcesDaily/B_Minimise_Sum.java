package CodeForcesDaily;


import java.util.Arrays;
import java.util.Scanner;

//https://codeforces.com/problemset/problem/2124/B
public class B_Minimise_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(arr[0] + (Math.min(arr[0],arr[1])));
        }
    }
}
