package Assignment_6685;

import java.util.Scanner;

public class MaxSumIntwoPathArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] arr1 = new int[n];
            int[] arr2 = new int[m];
            for (int i = 0; i < n; i++) {
                arr1[i] = sc.nextInt();
            }
            for (int i = 0; i < m; i++) {
                arr2[i] = sc.nextInt();
            }

            int sum1 = 0;
            int sum2 = 0;
            int i = 0, j = 0;
            int totalsum = 0;
            while (i < n && j < m) {
                if (arr1[i] < arr2[j]) {
                    sum1 += arr1[i];
                    i++;
                } else if (arr1[i] > arr2[j]) {
                    sum2 += arr2[j];
                    j++;
                } else {
                    totalsum += Math.max(sum2, sum1) + arr2[j];
                    i++;
                    j++;
                    sum2 = 0;
                    sum1 = 0;
                }
            }

            while (i < n) {
                sum1 += arr1[i];
                i++;
            }

            while (j < m) {
                sum2 += arr2[j];
                j++;
            }

            totalsum += Math.max(sum2, sum1);
            System.out.println(totalsum);
        }
    }
}
