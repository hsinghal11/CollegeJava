package Contest970CodeForces;

import java.util.Scanner;

public class MathExam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int totalSum = a + 2 * b;

            // Check if total sum is even
            if (totalSum % 2 != 0) {
                System.out.println("NO");
            } else {
                if (b%2 != 0 && a==0){
                    System.out.println("NO");

                } else {
                    System.out.println("YES");
                }
            }
        }
        sc.close();
    }
}