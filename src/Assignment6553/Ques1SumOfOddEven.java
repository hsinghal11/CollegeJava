package Assignment6553;

import java.util.Scanner;

public class Ques1SumOfOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n_copy = n;
        int sumOfeven = 0;
        int sumOdOdd = 0;
        int count = 0;
        while (n>0){
            int rem = n%10;
            if(count%2==0) sumOfeven+=rem;
            else  sumOdOdd+=rem;
            count++;
            n/=10;
        }
        System.out.println(sumOfeven);
        System.out.println(sumOdOdd);
    }
}
