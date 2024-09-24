package Assignment6553;

import java.util.Scanner;

public class Ques11Copy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long ans = 0;
        long mult = 1;
        long temp = n;
        while (temp>0){
            long rem = temp%10;
            long add = mult*Math.min(rem,9-rem);
            if(temp<10 && rem==9){
                add = mult*rem;
            }
            ans+=add;
            mult*=10;
            temp/=10;
        }
        System.out.println(ans);
    }
}
