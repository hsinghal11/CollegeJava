package Assignment6926;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class AgrrsiveCows {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(solution(arr,n,c));
    }

    private static int solution(int[] arr, int n, int c) {
        int low = 0;
        int high = arr[arr.length-1]-arr[0];
        int ans = 0;
        while (low<=high){
            int  mid = (low+high)/2;
            if(isPossible(mid,c,arr)){
                ans = mid;
                low=mid+1;
            } else {
                high = mid-1;
            }
        }
        return ans;
    }

    private static boolean isPossible(int mid, int c, int[] arr) {
        int count = 1;
        int positon = arr[0];
        for (int i = 1; i < arr.length ; i++) {
            if(arr[i]-positon>=mid){
                positon=arr[i];
                count++;
            }
            if(count==c){
                return true;
            }
        }
        return false;
    }
}
