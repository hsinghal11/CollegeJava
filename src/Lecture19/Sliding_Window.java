package Lecture19;

public class Sliding_Window {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 1, 5, 7, 8, 4, 2, 3};
        int k = 3;
        System.out.println(Maximum_Window(arr,k));
    }
    public static int Maximum_Window(int[] arr, int k){
        // TC O(n);
        int sum = 0, ans = 0;
        for (int i = 0; i < k; i++) {
            sum+=arr[i];
        }
        ans = sum;
        for (int i = k; i < arr.length; i++) {
            sum+=arr[i];
            sum-=arr[i-k];
            ans=Math.max(ans,sum);
        }
        return ans;
    }
}
