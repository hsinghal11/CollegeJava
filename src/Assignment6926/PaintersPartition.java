package Assignment6926;

import java.util.Arrays;
import java.util.Scanner;

public class PaintersPartition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[k];
        for (int i = 0; i < k; i++) {
            arr[i] = sc.nextInt();
        }
        long ans = 0;
        if(p>k){
            for (int i = 0; i < k; i++) {
                if(arr[i]>ans) ans = arr[i];
            }
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < k; i+=p) {
            int max = 0;
            for (int j = i; j < i+p; j++) {
                if(arr[j]>max) max = arr[j];
            }
            ans+=max;
        }
        System.out.println(ans);
    }
}
