package CodeForcesDaily;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            sc.nextLine();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            long sumOfNonZeros = 0;
            int zeroCount = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] == 0) {
                    zeroCount++;
                }else{
                    sumOfNonZeros += a[i];
                }
            }
            long maxScore = sumOfNonZeros + zeroCount;
            System.out.println(maxScore);
        }
    }
}
