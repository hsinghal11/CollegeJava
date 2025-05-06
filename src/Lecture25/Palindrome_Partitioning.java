package Lecture25;

import java.util.*;

public class Palindrome_Partitioning {
    public static void main(String[] args) {
        String ques = "nitin";
        List<List<String>> ans = new ArrayList<>();
        List<String> ll = new ArrayList<>();
        onlyPrintPartioning(ques, "");
        System.out.println("-----------------------");
        onlyPrintPartioningWithPalindrom(ques, "");
        System.out.println("-----------------------");
        PrintPartioning(ll, ans, ques);
        System.out.println(ans);
    }

    private static void onlyPrintPartioning(String ques, String ans) {
        if (ques.length() == 0) {
            System.out.println(ans);
            return;
        }
        for (int cut = 1; cut <= ques.length(); cut++) {
            String s = ques.substring(0, cut);
            onlyPrintPartioning(ques.substring(cut), ans + s + "|");
        }
    }

    private static void onlyPrintPartioningWithPalindrom(String ques, String ans) {
        if (ques.length() == 0) {
            System.out.println(ans);
            return;
        }
        for (int cut = 1; cut <= ques.length(); cut++) {
            String s = ques.substring(0, cut);
            if (checkPalindrome(s)) {
                onlyPrintPartioningWithPalindrom(ques.substring(cut), ans + s + "|");
            }
        }
    }

    private static void PrintPartioning(List ll, List ans, String ques) {
        if (ques.length() == 0) {
            ans.add(new ArrayList<>(ll));
            return;
        }
        for (int cut = 1; cut <= ques.length(); cut++) {
            String s = ques.substring(0, cut);
            if (checkPalindrome(s)) {
                ll.add(s);
                PrintPartioning(ll, ans, ques.substring(cut));
                ll.removeLast();
            }
        }
    }

    private static boolean checkPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
