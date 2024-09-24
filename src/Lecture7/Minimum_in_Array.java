package Lecture7;

public class Minimum_in_Array {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 1, 7, 9, 8 };
        System.out.println(Minimum(arr));
    }

    public static int Minimum(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
