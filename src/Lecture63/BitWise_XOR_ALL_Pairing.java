package Lecture63;

public class BitWise_XOR_ALL_Pairing {
    public static void main(String[] args) {
        int[] nums1 = {2,1,3}, nums2 = {10,2,5,0};
        System.out.println(xorAllNums(nums1, nums2));
    }
    public static int xorAllNums(int[] nums1, int[] nums2) {
        int n = nums1.length %2;
        int m = nums2.length %2;
        int ans = 0;
        if(m != 0){
            for(int i: nums1){
                ans ^= i;
            }
        }

        if(n!=-0){
            for(int i: nums2){
                ans ^= i;
            }
        }
        return ans;
    }
}
