package Lecture21_recurssion2;

public class Coin_Toss2 {
    public static void main(String[] args) {
        int n = 3;
        print(n,"");
    }
    private static void print(int n,String ans){
        if(n == 0){
            System.out.println(ans);
            return;
        }
        if(ans.isEmpty() || ans.charAt(ans.length()-1) != 'H') {
            print(n - 1, ans + "H");
        }
        print(n-1, ans+"T");
    }
}