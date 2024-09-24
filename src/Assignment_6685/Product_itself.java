package Assignment_6685;

import java.util.Scanner;

public class Product_itself {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        long[] left = new long[n];
        long[] rigt = new long[n];
        left[0] = 1;
        rigt[n-1] = 1;
        for (int i = 1; i < n; i++) {
            left[i] = left[i-1]*arr[i-1];
        }
        for (int i = n-2; i >= 0; i--) {
            rigt[i] = rigt[i+1]*arr[i+1];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(left[i]*rigt[i]+" ");
        }
    }
}
