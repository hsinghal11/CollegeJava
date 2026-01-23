package Lecture51;

public class Predict_the_Winner {
    public static void main(String[] args) {
        int[] nums = {1,5,233,7};
        System.out.println(Winner(nums, 0, nums.length-1));
    }
    public static int Winner(int[] arr, int i, int j){
        if( i> j) return 0;
        int f = arr[i] + Math.min(Winner(arr, i+2, j), Winner(arr, i+1, j-1));
        int s = arr[j] + Math.min(Winner(arr, i+1, j-1), Winner(arr, i, j-2));
        return Math.max(f,s);
    }
}
