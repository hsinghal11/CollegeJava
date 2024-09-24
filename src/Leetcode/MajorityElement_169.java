package Leetcode;

public class MajorityElement_169 {
    public static void main(String[] args) {
        int[] nums = {2, 7, 3, 7, 3, 7, 7, 7, 2};
        System.out.println(MooreVoting(nums));
    }

    public static int MooreVoting(int[] nums) {
        int elected = nums[0];
        int voting = 1;
        for (int i = 1; i < nums.length; i++) {
            if (elected == nums[i]) {
                voting++;
            } else {
                voting--;
                if (voting == 0) {
                    elected = nums[i];
                    voting = 1;
                }
            }
        }
        return elected;
    }

}
