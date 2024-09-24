package Leetcode;

public class ProductItself {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] ans = Product(nums);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }

    public static int[] Product(int[] nums) {
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        left[0] = 1;
        right[n-1] = 1;
        for (int i = 1; i < n; i++) {
            left[i] = left[i-1]*nums[i-1];
            System.out.print(left[i]+" ");
        }
        System.out.println();
        for (int i = n-2; i >= 0; i--){
            right[i] = right[i+1]*nums[i+1];
            System.out.print(right[i]+" ");
        }
        System.out.println();
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = left[i]*right[i];
        }
        return ans;
    }
}
