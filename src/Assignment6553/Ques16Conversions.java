package Assignment6553;

import java.util.Scanner;

public class Ques16Conversions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sourceBase = sc.nextInt();
        int convertBase = sc.nextInt();
        int number = sc.nextInt();
        int mult = 1;
        int ans = 0;
        int decimalNumber = 0;
        while (number > 0) {
            int rem = number % 10;
            decimalNumber = decimalNumber + rem * mult;
            number /= 10;
            mult *= sourceBase;
        }
        mult = 1;
        while (decimalNumber > 0) {
            int rem = decimalNumber % convertBase;
            ans = ans + rem * mult;
            decimalNumber /= convertBase;
            mult *= 10;
        }
        System.out.println(ans);
    }
}
