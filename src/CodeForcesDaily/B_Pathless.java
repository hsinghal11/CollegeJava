package CodeForcesDaily;

import java.util.Scanner;

//https://codeforces.com/problemset/problem/2130/B
public class B_Pathless {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int count0 = 0;
            int count1 = 0;
            int count2 = 0;

            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if(arr[i] == 0) count0++;
                else if(arr[i] == 1) count1++;
                else count2++;
            }
            int total = count1+2*count2;
            if(k < total){
                for (int i = 0; i < n; i++) {
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
            } else if (k == total+1) {
                for (int i = 0; i < count0; i++) {
                    System.out.print(0+" ");
                }
                for (int i = 0; i < count2; i++) {
                    System.out.print(2+" ");
                }
                for (int i = 0; i < count1; i++) {
                    System.out.print(1+" ");
                }
                System.out.println();
            }else{
                System.out.println(-1);
            }

        }
    }
}
