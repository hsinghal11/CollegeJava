package lecture3;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t1 = 0;
        int t2 = 1;
        System.out.print(t1+" "+t2+" ");
        for(int i = 3; i <= n; i++){
            int temp = t1+t2;
            t1 = t2;
            t2 = temp;
            System.out.print(temp+" ");
        }
    }
}
