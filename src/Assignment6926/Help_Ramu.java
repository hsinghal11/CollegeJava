package Assignment6926;

import java.util.*;
public class Help_Ramu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(BS(arr,n,target));
    }
    public static int BS(int[] arr, int n, int target){
        int start = 0;
        int end = n-1;
        while (start<=end){
            int mid = (start+end)/2;
            if(arr[mid] == target){
                return mid;
            } else if(arr[mid] <= arr[end]){
                if(arr[mid] <= target && arr[end]>=target) start=mid+1;
                else end = mid-1;
            } else {
                if(arr[start]<=target && arr[mid]>=target) end=mid-1;
                else start=mid+1;
            }
        }
        return -1;
    }
}
