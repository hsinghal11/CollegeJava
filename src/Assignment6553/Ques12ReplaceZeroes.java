package Assignment6553;

import java.util.Scanner;

public class Ques12ReplaceZeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        long num_Copy = num;
        long count = 0;
        if(num_Copy==0){
            System.out.println(5);
            return;
        }
        while (num_Copy>0){
            long rem = num_Copy%10;
            if(rem == 0){
                num = num+(long) (5* Math.pow(10,count));
            }
            count++;
            num_Copy/=10;
        }
        System.out.println(num);
    }
}
