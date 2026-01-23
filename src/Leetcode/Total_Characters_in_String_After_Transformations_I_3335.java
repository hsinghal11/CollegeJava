package Leetcode;

import java.util.*;

public class Total_Characters_in_String_After_Transformations_I_3335 {
    static String apl = "abcdefghijklmnopqrstuvwxyz";
    public static void main(String[] args) {
        String s = "abcyy";
        int t= 2;
        System.out.println(lengthAfterTransformations(s,t));
    }
    public static int lengthAfterTransformations(String s, int t) {
        if(t==0){
            return s.length();
        }
        StringBuilder ss = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'z') ss.append("ab");
            else{
                int j = (s.charAt(i)-'a');
                j=j+1;
                char c = apl.charAt(j);
                ss.append(c);
            }
        }
        System.out.println(ss.toString());
        return lengthAfterTransformations(ss.toString(), t-1);
    }
}
