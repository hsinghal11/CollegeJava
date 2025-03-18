package Lecture20_recurssion;

public class Power {
    public static void main(String[] args) {
        System.out.println(findPow(2,8));
    }

    private static int findPow(int n, int times){
        if(times == 0){
            return 1;
        }
        return n*findPow(n,times-1);
    }
}
