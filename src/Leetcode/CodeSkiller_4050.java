package Leetcode;

import java.util.*;

public class CodeSkiller_4050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        int p1 = 0;
        while (p1 < arr.size() - 1) {
            int a = arr.get(p1);
            int b = arr.get(p1 + 1);
            int gcd = gcd(a, b);
            if (gcd > 1) {
                int lcm = (a / gcd) * b;
                arr.set(p1, lcm);
                arr.remove(p1 + 1);
            } else {
                p1++;
            }
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    private static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
