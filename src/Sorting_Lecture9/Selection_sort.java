package Sorting_Lecture9;

public class Selection_sort {
    public static void main(String[] args) {
        int[] arr = {4, -1, 5, 3, 2, 1, 7};
//        System.out.println(min_from_ith_index(arr,2));
        Sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void Sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int indx = min_from_ith_index(arr, i);
            int temp = arr[i];
            arr[i] = arr[indx];
            arr[indx] = temp;
        }
    }

    public static int min_from_ith_index(int[] arr, int k) {
        int mini = k;
        for (int i = k + 1; i < arr.length; i++) {
            if (arr[i] < arr[mini]) {
                mini = i;
            }
        }
        return mini;
    }
}
