package Assignment6478;

import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row =0;
        int star =1;
        while (row < n){
            //star
            int ncr = 1;
            int i = 0;
            while (i < star){
                System.out.print(ncr+"\t");
                ncr = ((row - i)*ncr)/(i+1);
                i++;
            }
            System.out.println();
            row++;
            star++;
        }
    }
}
