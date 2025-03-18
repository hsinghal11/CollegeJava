package Lecture20_recurssion;

public class First_Occ_Of_Array {
    public static void main(String[] args) {
        int[] arr = {2,4,7,9,43,16,71,94};
        System.out.println(index(arr,71,0));
    }

    private  static int index(int[] arr, int target, int i){
        if(i == arr.length) return -1;
        if(arr[i] == target){
            return i;
        }

        return index(arr, target, i+1);
    }
}
