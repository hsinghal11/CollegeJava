package CodeForcesDaily;

import java.util.Scanner;

public class A_Collatz_Conjecture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int k = sc.nextInt();
            int y = sc.nextInt();

            for (int i = 0; i < k; i++) {
                if (y % 6 == 4) {
                    y = (y - 1) / 3;
                } else {
                    y = y * 2;
                }
            }
            System.out.println(y);
        }
    }
}
