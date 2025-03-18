package Lecture14;

public class CircularKadens {
    public static void main(String[] args) {
        int[] arr= {8,-8,9,-9,-10,-11,12};
        int minni = circularkadanes(arr);
        System.out.println(minni);
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println(sum-minni);
    }
    public static int circularkadanes(int[] arr){
        int ans = Integer.MAX_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            ans = Math.min(sum,ans);
            if(sum>=0){
                sum = 0;
            }
        }
        return ans;
    }
}
