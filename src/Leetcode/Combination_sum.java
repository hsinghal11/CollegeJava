package Leetcode;

import  java.util.*;
public class Combination_sum {
    public static void main(String[] args) {
        List<List<Integer>> ll = new ArrayList<>();
        int[] arr = {2,3,6,7};
        int target = 7;
        List<Integer> ans = new ArrayList<>();
        sum(arr, target, ans,0, ll);
        System.out.println(ll);
    }
    private static void sum(int[] arr, int target, List ans,int sum, List ll){

        if(sum == target){
            ll.add(ans);
            return;
        }
        if(sum > target) {
//            ans.removeLast();
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            ans.add(arr[i]);
            sum(arr, target, ans ,sum+arr[i], ll);
        }
    }
}
