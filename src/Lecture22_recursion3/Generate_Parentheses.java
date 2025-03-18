package Lecture22_recursion3;

import java.util.*;

public class Generate_Parentheses {
    static int count = 0;

    public static void main(String[] args) {
        long startTime = System.nanoTime();
        int n = 3;
        List<String> ll = new ArrayList<>();
        Parentheses(n, 0, 0, "", ll);
        long endTime = System.nanoTime();
        System.out.println("\n"+(endTime-startTime)/1000000);
    }

    private static void Parentheses(int n, int left, int right, String ans, List ll) {
        System.out.print(count + " ");
        count += 1;
        if (left == n && right == n) {
            System.out.println(ans);
            ll.add(ans);
            return;
        }
        if (left < n) {
            Parentheses(n, left + 1, right, ans + "(", ll);
        }
        if (right < left) {
            Parentheses(n, left, right + 1, ans + ")", ll);
        }
    }
}
