package CodeForcesDaily;

import java.util.Scanner;

public class B_Bobritto_Bandito {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int l = sc.nextInt();
            int r = sc.nextInt();
            int ansl, ansr;
            if(m>=Math.abs(l)){
                ansl=l;
                ansr=m-Math.abs(l);
            }else{
                ansl = -m;
                ansr = 0;
            }
            System.out.println(ansl+" "+ansr);
        }
    }
}
