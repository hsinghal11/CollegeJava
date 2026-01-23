package Lecture48;

public class Distinct_Subsequences {
    public static void main(String[] args) {
        String s = "rabbit", t = "rabbit";
    }

    // s-> coin | T-> amount | i-> s | j-> t
    public static int distinct(String s, String t, int i, int j){
        if(j == t.length()){
            return 1;
        }
        if(i == s.length()){
            return 0;
        }
        int inc =0, exc = 0;
//        if(s.charAt(i) == t.charAt(j)){
//            inc =a
//        }
        return -1;
    }
}
