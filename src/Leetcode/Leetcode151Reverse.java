package Leetcode;

public class Leetcode151Reverse {
    public static void main(String[] args) {
    String s = "    the sky is       blue      ";

    }
    public static String Solution(String s){
        s= s.trim();
        String ans = "";
        String[] arr = s.split("\s+");
        for (int i = arr.length -1; i >=  0; i--) {
            ans += arr[i]+" ";
        }
        return ans.trim();
    }
}
