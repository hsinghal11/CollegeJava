package Leetcode;

public class _74_Search_in_2d_Array {
    public static void main(String[] args) {
        int[][] matrix = {{1,3}};
        int target = 3;
        System.out.println(solution(matrix, target));
    }

    public static boolean solution(int[][] arr, int target) {
        int n = arr.length;    // Number of rows
        int m = arr[0].length; // Number of columns
        int start = 0;
        int end = m * n - 1;

        while (start <= end) {
            // Safe calculation of mid to avoid overflow
            int mid = start + (end - start) / 2;
            int row = mid / m;
            int col = mid % m;

            if (arr[row][col] == target) {
                return true;
            } else if (arr[row][col] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return false;
    }
}
