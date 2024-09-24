package Assignment6553;

import java.util.Scanner;

public class Ques11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num_copy = sc.nextLong();
        long ans = 0;
        long placeValue = 1;
        boolean isFirstDigit = true;

        while (num_copy > 0) {
            long rem = num_copy % 10;
            num_copy /= 10;

            long a = Math.min(rem, 9 - rem);

            if (isFirstDigit && a == 0) {
                a = rem;
            }

            ans = ans + (a * placeValue);
            placeValue *= 10;
            isFirstDigit = false;
        }

        System.out.println(ans);
    }
}
