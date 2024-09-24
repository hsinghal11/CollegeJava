package Assignment6553;

import java.util.Scanner;

public class Ques13Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n=1;
        while(n1 > 0){
            if((3*n+2)%n2!=0){
                System.out.println(3*n+2);
                n1--;
            }
            n++;
        }
    }
}
