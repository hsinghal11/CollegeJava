package Assignment_6685;

import java.util.Scanner;

public class SquareOfSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arr[i]=(arr[i]*arr[i]);
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                if(arr[j] > arr[j+1]){
                    int trmo = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = trmo;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}
