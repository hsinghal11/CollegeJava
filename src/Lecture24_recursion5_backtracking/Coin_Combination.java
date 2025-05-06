package Lecture24_recursion5_backtracking;

import java.util.ArrayList;
import java.util.List;

public class Coin_Combination {
    public static void main(String[] args) {
        int t = 6;
        int[] arr = {2, 3, 5};
        find(arr, t, "", 0);
        List<List<Integer>> ll = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        findList(arr,t,ans,0,ll);
        System.out.println(ll);
    }

    private static void findList(int[] coins, int amount, List ans, int idx, List ll){
        if(amount == 0){
            ll.add(new ArrayList<>(ans));
        }
        for (int i = idx; i < coins.length; i++) {
            if (amount >= coins[i]) {
                ans.add(coins[i]);
                findList(coins, amount - coins[i], ans, i, ll);
                ans.removeLast();
            }
        }
    }

    private static void find(int[] coins, int amount, String ans, int idx) {
        if (amount == 0) {
            System.out.println(ans);
            return;
        }
        for (int i = idx; i < coins.length; i++) {
            if (amount >= coins[i]) {
                find(coins, amount - coins[i], ans+coins[i], i);
            }
        }
    }
}
