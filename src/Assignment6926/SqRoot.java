package Assignment6926;

import java.util.Scanner;

public class SqRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long start = 1;
        long end = a;
        long ans = 0;
        while (start<=end){
            long mid = (long) Math.floor(start+(end-start)/2);
            if(mid*mid <= a){
                ans = mid;
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        System.out.println(ans);
    }
}
