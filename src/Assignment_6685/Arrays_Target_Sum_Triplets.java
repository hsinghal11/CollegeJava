package Assignment_6685;

import java.util.*;

public class Arrays_Target_Sum_Triplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        sort(arr);

        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n-1; j++) {
                int new_target = target-(arr[i]+arr[j]);
                for (int k = j+1; k < n; k++) {
                    if(arr[k]==new_target){
                        System.out.println(arr[i]+", "+arr[j]+" and "+arr[k]);
                    }
                }
            }
        }

    }
    public static void sort(int[] arr){
        for (int turn = 1; turn < arr.length; turn++) {
            for (int i = 0; i < arr.length-turn; i++) {
                if(arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
    }
}
