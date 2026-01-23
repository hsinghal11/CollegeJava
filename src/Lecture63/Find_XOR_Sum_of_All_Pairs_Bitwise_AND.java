package Lecture63;

public class Find_XOR_Sum_of_All_Pairs_Bitwise_AND {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3}, arr2 = {6,5};
        System.out.println(getXORSum(arr1, arr2));
    }

    public static int getXORSum(int[] arr1, int[] arr2) {
        int x1 = 0;
        for(int i: arr1){
            x1 ^= i;
        }

        int x2 = 0;
        for(int i: arr2){
            x2 ^= i;
        }

        return x1&x2;
    }
}
