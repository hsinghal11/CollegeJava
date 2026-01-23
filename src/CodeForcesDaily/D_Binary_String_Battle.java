package CodeForcesDaily;

import java.util.Scanner;

public class D_Binary_String_Battle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int  k = sc.nextInt();
            String s = sc.next();
            int c=0;
            for(int i=0;i<n;i++){
                if(s.charAt(i)=='1') c++;
            }
            if(c <= k || k > n/2) System.out.println("Alice");
            else System.out.println("Bob");
        }
    }
}
