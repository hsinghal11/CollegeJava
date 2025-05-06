package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Permutation_Sequence_60 {
    static int no = 0;

    public static void main(String[] args) {
        int n = 3;
        int k = 3;
        StringBuilder given = new StringBuilder();
        for (int i = 0; i < n; i++) {
            given.append(i + 1);
        }
        List<String> ans = new ArrayList<>();
        print(given.toString(), n, k, "", ans);
        System.out.println(ans.get(k-1));
    }

    private static void print(String Given, int n, int k, String ans, List ll) {
        if(ll.size() == k){
            return;
        }
        if (Given.isEmpty()) {
            ll.add(ans);
            return;
        }
        for (int i = 0; i < Given.length(); i++) {
            char ch = Given.charAt(i);
            String left = Given.substring(0, i);
            String right = Given.substring(i + 1);
            print(left + right, n, k, ans + ch, ll);
        }
    }
}
