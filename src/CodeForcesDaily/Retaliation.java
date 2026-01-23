package CodeForcesDaily;

import java.util.Scanner;

public class Retaliation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            if(2*a[0] - a[1] <0 || (2*a[0] - a[1])%(n+1) !=0){
                System.out.println("no");
                continue;
            }
            int x2 = (2*a[0] - a[1]) / (n+1);
            int x1 = a[0] - n*x2;

            if(x1 <0){
                System.out.println("no");
                continue;
            }
            boolean flag = true;
            for (int i = 1; i <= n; i++) {
                if(a[i-1] - i*x1 - (n-i+1)*x2 != 0){
                    flag = false;
                    break;
                }
            }
            if(flag) System.out.println("yes");
            else System.out.println("no");
        }
    }
}
