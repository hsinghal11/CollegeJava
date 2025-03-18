package Lecture19;

public class Leetcode_731 {
    public static void main(String[] args) {
        int[] arr = {7, 5, 2, 6, 3, 4, 6};
        int k = 10;
    }

    public static int product_less_than_k(int[] arr, int k) {
        int ans = 0, si = 0, ei = 0, p = 1;
        while (ei < arr.length) {
            // O(n)
            // grow
            p = p * arr[ei];

            //shrink
            while (p >= k && si<=ei) {
                p = p / arr[si];
                si++;
            }

            //ans update
            ans = ans + (ei - si - 1);
            ei++;
        }
        return ans;
    }
}
