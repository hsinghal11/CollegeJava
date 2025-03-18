package Lecture14;

import java.util.*;

public class AgrCows {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            int n = sc.nextInt();
            int c = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            System.out.println(Largest_Min(arr,c));
        }
    }
    public static int Largest_Min(int[] stall, int noc){
        int low = 0;
        int high = stall[stall.length-1] - stall[0];
        int ans = 0;
        while (low<=high){
            int mid = (low+high)/2;
            if(isPossible(stall,noc,mid)){
                ans = mid;
                low = mid+1;
            }
            else {
                high=mid-1;
            }
        }
        return ans;
    }
    public static boolean isPossible(int[] stall, int noc, int mid){
        int count = 1;
        int position = stall[0];
        for (int i = 1; i < stall.length; i++) {
            if(stall[i]-position >= mid){
                position=stall[i];
                count++;
            }
            if(count==noc){
                return true;
            }
        }
        return false;
    }
}
