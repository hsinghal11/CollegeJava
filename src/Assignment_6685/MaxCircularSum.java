package Assignment_6685;

import java.util.Scanner;

public class MaxCircularSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                int sum = 0;
                for (int j = 0; j < n; j++) {
                    sum+=arr[(j+i)%n];
                    if(max<sum) max = sum;
                }
            }
            System.out.println(max);
        }
    }
}
