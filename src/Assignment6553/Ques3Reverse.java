package Assignment6553;

import java.util.Scanner;

public class Ques3Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        long ans = 0;
        while (num > 0) {
            long rem = num % 10;
            ans = ans * 10 + rem;
            num /= 10;
        }
        System.out.println(ans);
    }
}
