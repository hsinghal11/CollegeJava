package Lecture4;

import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the no :");
        int n = sc.nextInt();
        int sum = 0;
        int mult = 1;
        while(n>0){
            int rem = n%2;
            sum = sum + rem*mult;
            n/=2;
            mult*=10;
        }
        System.out.println(sum);
    }
}
