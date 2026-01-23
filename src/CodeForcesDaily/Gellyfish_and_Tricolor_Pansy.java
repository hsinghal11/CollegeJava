package CodeForcesDaily;

import java.util.Scanner;

public class Gellyfish_and_Tricolor_Pansy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int l = sc.nextInt();
            int r = sc.nextInt();
            if(m <= n && m<=l ){
                System.out.println("Gellyfish");
            }else if(r <= n && r<=l ){
                System.out.println("Gellyfish");
            }else if(n < m && n<r){
                System.out.println("Flower");
            } else if (l < m && l<r) {
                System.out.println("Flower");
            }
        }
    }
}
