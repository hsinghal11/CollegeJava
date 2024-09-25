package Lecture10;

public class Binary_Search {
    public static void main(String[] args) {
        int[] arr = {2,4,7,9,13,16,18,19,37,39,43};
        int item = 19;
        System.out.println(Find_Binary(arr,item));
    }
    public static int Find_Binary(int[] arr, int item){
        int low = 0;
        int high = arr.length-1;
        while (low<=high){
            int mid = (low+high)/2;
            if(arr[mid] == item){
                return mid;
            } else if (arr[mid] > item) {
                high = mid-1;
            } else {
                low = mid+1;
            }
        }
        return -1;
    }
}
