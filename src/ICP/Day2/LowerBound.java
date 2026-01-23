package ICP.Day2;

public class LowerBound {
    public static void main(String[] args) {
        int[] arr = {1,2,4,4,4,7,9};
        for (int i = 0; i < arr[arr.length-1]; i++) {
            System.out.println(i+"->"+LowerBound(arr, i));
        }
    }
    public static int LowerBound(int[] arr, int target){
        int l = 0;
        int n = arr.length;
        int h = n;
        while (l < h){
            int m = (l+h)/2;
            if(arr[m] > target) {
                h = m;
            }else{
                l = m+1;
            }
        }
        return l;
    }
}
