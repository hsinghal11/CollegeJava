package Lecture24_recursion5_backtracking;

import java.util.ArrayList;
import java.util.List;

public class Coin_permutation {
    public static void main(String[] args) {
        int t = 8;
        int[] arr = {2,3,5};
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ll =new ArrayList<>();
        find(arr,8, ll, 0, ans);
        System.out.println(ans);
    }

    private static void find(int[] coins, int target, List ll, int sum, List ans){
        if(sum == target){
            ans.add(new ArrayList<>(ll));
//            System.out.println(ll);
            return;
        }
        if(sum > target) return;
        for (int i = 0; i < coins.length; i++) {
            ll.add(coins[i]);
            find(coins, target, ll, sum+coins[i],ans);
            ll.removeLast();
        }
    }

//    public static void main(String[] args) {
//        int t = 8;
//        int[] arr = {2, 3, 5};
//        find(arr, 8, "");
//    }
//
//    private static void find(int[] coins, int amount, String ans) {
//        if (amount == 0) {
//            System.out.println(ans);
//            return;
//        }
//        for (int i = 0; i < coins.length; i++) {
//            if (amount >= coins[i]) {
//                find(coins, amount - coins[i], ans+coins[i]);
//            }
//        }
//    }
}
