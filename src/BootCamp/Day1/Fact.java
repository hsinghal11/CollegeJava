package BootCamp.Day1;

public class Fact {
    public static void main(String[] args) {
        int f = 5;

        System.out.println(fact(f));
        System.out.println(fibo(10));
    }

    public static int fact(int n){
        if(n==1||n==2){
            return n;
        }
        return n*fact(n-1);
    }

    public static int fibo(int n){
        if(n == 1 || n == 0){
            return n;
        }

        return fibo(n-1)+fibo(n-2);
    }
}
