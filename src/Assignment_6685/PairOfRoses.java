package Assignment_6685;

import java.util.Arrays;
import java.util.Scanner;

public class PairOfRoses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            int target = sc.nextInt();
            Arrays.sort(arr);
            int diff = Integer.MAX_VALUE;
            int[] ans = new int[2];
             for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] + arr[j] == target) {
                        if(arr[j]-arr[i] < diff){
                            diff = arr[j]-arr[i];
                            ans[0] = arr[i];
                            ans[1] = arr[j];
                        }
                    }
                }
            }
            System.out.println("Deepak should buy roses whose prices are "+ans[0]+" and "+ans[1]+".");
        }
    }
}

