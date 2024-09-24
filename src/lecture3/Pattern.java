package lecture3;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int space = n - 1;
        int number = 1;
        int start = 1;
        int row = 1;
        while (row <= 2 * n - 1) {

            int i = 1;
            while (i <= space) {
                System.out.print(" \t");
                i++;
            }
            int j = 1;
            int temp = start;
            while (j <= number) {
                System.out.print(temp + "\t");
                if (j <= number / 2) {
                    temp++;
                } else temp--;
                j++;
            }

            if (row < n) {
                number += 2;
                space--;
                start++;
            } else {
                number -= 2;
                space++;
                start--;
            }
            row++;
            System.out.println();
        }
    }

}
