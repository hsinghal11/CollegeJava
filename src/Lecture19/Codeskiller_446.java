package Lecture19;

import java.util.Scanner;

public class Codeskiller_446 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        int flip_a = maxLen(s,'a',k);
        int flip_b = maxLen(s,'b',k);
        System.out.println(Math.max(flip_a,flip_b));
    }
    public static int maxLen(String s, char ch, int k){
        int ei=0, si=0, ans=0, flip =0;
        while(ei<s.length()){
            // grow
            if(s.charAt(ei) == ch){
                flip++;
            }
            // shrink
            while(flip>k){
                if(s.charAt(si) == ch) flip--;
                si++;
            }
            ans = Math.max(ans,ei-si+1);
            ei++;
        }
        return ans;
    }
}
