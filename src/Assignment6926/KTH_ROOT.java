package Assignment6926;

import java.util.Scanner;

public class KTH_ROOT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long n = sc.nextLong();
            int k = sc.nextInt();
            long start = 1;
            long end = n;
            long ans = 0;
            while (start<=end){
                long mid = start +(end-start)/2;
                if(Math.pow(mid,k)<=n){
                    ans = mid;
                    start=mid+1;
                } else {
                    end = mid-1;
                }
            }
            System.out.println(ans);
        }
    }
}
