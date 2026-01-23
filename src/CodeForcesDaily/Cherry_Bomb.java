package CodeForcesDaily;

import java.util.Scanner;

public class Cherry_Bomb {
    static  Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t= sc.nextInt();
        while (t-- > 0){
            solve();
        }
    }
    public static void solve(){
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
            if(b[i] == -1) count++;
        }
        if(count != n){
            int x = -1;
            for (int i = 0; i < n; i++) {
                if(b[i] != -1){
                    x = a[i] + b[i];
                    break;
                }
            }
            for (int i = 0; i < n; i++) {
                if(b[i] != -1){
                    if(b[i] + a[i] != x){
                        System.out.println(0);
                        return;
                    }
                }else{
                    if(0 > x-a[i] || x-a[i] >k){
                        System.out.println(0);
                        return;
                    }
                }
            }
            System.out.println(1);
            return;
        }
        int min=Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            min = Math.min(min, a[i]+k);
            max = Math.max(max, a[i]);
        }
        System.out.println(Math.max(0, min-max+1));
    }
}
