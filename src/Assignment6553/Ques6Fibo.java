package Assignment6553;

import java.util.Scanner;

public class Ques6Fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t0=0;
        int t1=1;
        if(n == 0){
            System.out.println(0);
            return;
        }
        if(n==1){
            System.out.println(1);
            return;
        }
        int temp =0;
        for (int i = 2; i <= n; i++) {
            temp = t0+t1;
            t0=t1;
            t1=temp;
        }
        System.out.println(temp);
    }
}
