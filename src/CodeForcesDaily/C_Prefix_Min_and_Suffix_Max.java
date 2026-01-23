package CodeForcesDaily;

import java.util.Arrays;
import java.util.Scanner;

public class C_Prefix_Min_and_Suffix_Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            sc.nextLine();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int[] prefix = new int[n];
            int[] suffix = new int[n];
            prefix[0] = 1;
            suffix[n-1] = 1;
            int prev = a[0];
            for (int i = 1; i < n; i++) {
                if(a[i] <= prev){
                    prefix[i] = 1;
                    prev = a[i];
                }
            }
            prev = a[n-1];
            for (int i = n-2; i > -1; i--) {
                if(a[i] >= prev){
                    suffix[i] = 1;
                    prev = a[i];
                }
            }
            for (int i = 0; i < n; i++) {
                System.out.print(prefix[i] | suffix[i]);
            }
            System.out.println();
        }
    }
}
