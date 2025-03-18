package Lecture23_recursion4;

import java.util.*;

public class Key_Paid {
    static String[] key = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

    public static void main(String[] args) {
        List<String> ll = new ArrayList<>();
        printKeys("23", "", ll);
        System.out.println(ll);
    }

    private static void printKeys(String digits, String ans, List ll){
        if(digits.isEmpty()){
            ll.add(ans);
            return;
        }
        int idx = digits.charAt(0) - '0'; // '0' -> ascii of 0 is 48 -> there for 1-> 49 ('1'-'0') -> [49-48] = 1
        for (int i = 0; i < key[idx].length(); i++) {
            char ch = key[idx].charAt(i);
            printKeys(digits.substring(1), ans+ch, ll);
        }
    }
}
