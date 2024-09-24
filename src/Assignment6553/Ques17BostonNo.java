package Assignment6553;

import jdk.dynalink.beans.StaticClass;

import java.util.Scanner;

public class Ques17BostonNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(sumOfnumber(n) == sumOfFactors(n)) System.out.println(1);
        else System.out.println(0);
    }

    public static int sumOfFactors(int n){
        int div = 2;
        int sum = 0;
        while(n!=1){
            if(n%div!=0) div++;
            if(n%div == 0){
                if(div>9){
                    int div_copy = div;
                    while (div_copy>0){
                        sum=sum+(div_copy%10);
                        div_copy/=10;
                    }
                } else {
                    sum += div;
                }
                n/=div;
            }
        }
        return sum;
    }

    public static int sumOfnumber(int n ){
        int sum = 0;
        while (n >0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
}
