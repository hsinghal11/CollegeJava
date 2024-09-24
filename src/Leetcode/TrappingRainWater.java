package Leetcode;

public class TrappingRainWater {
    public static void main(String[] args) {
        int[] height = {5, 3, 1, 2, 7, 4, 1, 6};
        int hLength = height.length;
        int[] leftMaximum = new int[hLength];
        int[] rightMaximum = new int[hLength];
        LeftMax(leftMaximum, height, hLength);
        RightMax(rightMaximum, height, hLength);
        int sum = 0;
        for (int i = 0; i < hLength; i++) {
            sum+=Math.min(leftMaximum[i],rightMaximum[i])-height[i];
        }
        System.out.println(sum);
    }

    public static void LeftMax(int[] leftMaximum, int[] height, int hLength) {
        leftMaximum[0] = height[0];
        for (int i = 1; i < hLength ; i++) {
            leftMaximum[i] = Math.max(leftMaximum[i - 1], height[i]);
        }
    }

    public static void RightMax(int[] rightMaximum, int[] height, int hLength) {
        rightMaximum[hLength - 1] = height[hLength - 1];
        for (int i = hLength - 2; i >= 0; i--) {
            rightMaximum[i] = Math.max(rightMaximum[i + 1], height[i]);
        }
    }
}
