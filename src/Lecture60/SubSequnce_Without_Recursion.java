package Lecture60;

public class SubSequnce_Without_Recursion {
    public static void main(String[] args) {

    }

    private static void createAllSubSequence(String s){
        int n = s.length();
        for (int i = 0; i < (1<<n); i++) {
            pattern(s, i);
        }
    }

    private static void pattern(String s, int i){
        int idx = 0;
        StringBuilder ans = new StringBuilder();
        while (i > 0){
            if((i&1) == 1){
                ans.append(s.charAt(idx));
            }
            i >>= 1;
            idx++;
        }
    }
}
