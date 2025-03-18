package Assignment6992;

import java.util.Scanner;

public class Strings_Remove_Duplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s= sc.next();
        String ans = s.charAt(0)+"";
        for (int i = 1; i < s.length(); i++) {
            if(s.charAt(i)!=s.charAt(i-1)){
                ans+= s.charAt(i);
            }
        }
        System.out.println(ans);
    }
}
