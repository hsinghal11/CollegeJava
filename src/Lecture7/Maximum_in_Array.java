package Lecture7;

public class Maximum_in_Array {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 1, 7, 9, 8 };
        System.out.println(Maximum(arr));
    }

    public static int Maximum(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static int Maximum2(int[] arr){
        int max = Integer.MIN_VALUE; // -2^31
        for (int j : arr) {
            max = Math.max(max, j);
        }
        return max;
    }
}
