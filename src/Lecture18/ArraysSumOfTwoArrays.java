package Lecture18;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraysSumOfTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums1 = new int[n];
        for (int i = 0; i < n; i++) {
            nums1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] nums2 = new int[m];
        for (int i = 0; i < m; i++) {
            nums2[i] = sc.nextInt();
        }

        ArrayList<Integer> ans = new ArrayList<>();
        int lastNum1 = n - 1;
        int lastNum2 = m - 1;
        int carry = 0;
        while (lastNum2 >= 0 && lastNum1 >= 0) {
            int sum = nums1[lastNum1] + nums2[lastNum2] + carry;
            carry = sum / 10;
            int temp = sum % 10;
            ans.add(temp);
            lastNum2--;
            lastNum1--;
        }
        for (int i = lastNum1; i >= 0; i--) {
            int sum = nums1[i] + carry;
            carry = sum / 10;
            int temp = sum % 10;
            ans.add(temp);

        }
        for (int i = lastNum2; i >= 0; i--) {
            int sum = nums2[i] + carry;
            carry = sum / 10;
            int temp = sum % 10;
            ans.add(temp);
        }
        if(carry != 0) ans.add(carry);
//        System.out.println(ans);
        for (int i = ans.size()-1; i >= 0 ; i--) {
            System.out.print(ans.get(i) +", ");
        }

        System.out.println("END");
    }
}
