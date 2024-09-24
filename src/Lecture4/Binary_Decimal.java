package Lecture4;

import java.util.Scanner;

public class Binary_Decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int mult = 1;
        while(n>0){
            int rem = n%10;
            sum = sum + rem*mult;
            n/=10;
            mult*=2;
        }
        System.out.println(sum);
    }
}