package Contest970CodeForces;

import java.util.Scanner;

public class GoodArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0){
            int i = sc.nextInt();
            int j = sc.nextInt();
            int diff = 1;
            int total = 0;
            while(i <= j) {
                i = i+diff;
                diff++;
                total++;
            }
            System.out.println(total);
        }
    }
}
