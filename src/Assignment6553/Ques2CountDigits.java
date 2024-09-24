package Assignment6553;

import java.util.Scanner;

public class Ques2CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int count = 0;
        if (n == 0 && t == 0) {
            System.out.println(1);
            return;
        }
        while (n > 0) {
            int rem = n % 10;
            if (rem == t) count++;
            n /= 10;
        }
        System.out.println(count);
    }
}
