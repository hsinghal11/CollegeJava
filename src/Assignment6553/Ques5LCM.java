package Assignment6553;

import java.util.Scanner;

public class Ques5LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int max = Math.max(n1,n2);
        int min = Math.min(n1,n2);
        while (true){
            if(max%n1==0 && max%n2==0) {
                System.out.println(max);
                break;
            } else {
                max++;
            }
        }
    }
}
