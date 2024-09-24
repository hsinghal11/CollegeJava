package Assignment6553;

import java.util.Scanner;

public class Ques14Simple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (true){
            int temp = sc.nextInt();
            sum+=temp;
            if(sum<0) break;
            System.out.println(temp);
        }

    }
}
