package Lecture21_recurssion2;

public class Coin_Toss {
    public static void main(String[] args) {
        int n = 3;
        print(n,"");
    }
    private static void print(int n,String ans){
        if(ans.length() == n){
            System.out.println(ans);
            return;
        }
        print(n, ans+"H");
        print(n, ans+"T");
    }
}
