package Assignment6553;

import java.util.Scanner;

public class Ques19Car {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int sumOfOdd = 0, sumOfEven = 0;
            while (n > 0) {
                int rem = n % 10;
                if (rem % 2 == 0) sumOfEven += rem;
                else sumOfOdd += rem;
                n /= 10;
            }
            if (sumOfOdd % 3 == 0 || sumOfEven % 4 == 0) {
                System.out.println("Yes");
            } else System.out.println("No");
        }
        sc.close();
    }
}
