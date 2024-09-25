package Lecture10;

public class Kadanes_algo {
    public static void main(String[] args) {
        int[] arr = {-2,-3,-5,0,-7,1,-1};
        System.out.println(Max_Sum(arr));
    }
    public static int Max_Sum(int[] arr){
        int ans = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            ans = Math.max(ans,sum);
            if(sum<0){
                sum = 0;
            }
        }
        return ans;
    }
}
