package Lecture23_recursion4;

import java.util.*;

public class Permutation {
    public static void main(String[] args) {
        String sr = "abcd";
        printPerm(sr, "");
        System.out.println(countPrem(sr,""));
    }

    private static void printPerm(String sr, String ans) {
        if (sr.isEmpty()) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < sr.length(); i++) {
            char ch = sr.charAt(i);
            String left = sr.substring(0, i);
            String right = sr.substring(i + 1);
            printPerm(left + right, ans + ch);
        }
    }
    private static int countPrem(String sr, String ans) {
        if (sr.isEmpty()) {
//            System.out.println(ans);
            return 1;
        }
        int count = 0;
        for (int i = 0; i < sr.length(); i++) {
            char ch = sr.charAt(i);
            String left = sr.substring(0, i);
            String right = sr.substring(i + 1);
            count+= countPrem(left + right, ans + ch);
        }
        return count;
    }
}
