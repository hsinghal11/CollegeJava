package Assignment_6685;

import java.util.Scanner;

public class RunningSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        long sum=0;
        for (int i = 0; i < n; i++) {
            sum+=arr[i];
            System.out.print(sum+" ");
        }
    }
}
