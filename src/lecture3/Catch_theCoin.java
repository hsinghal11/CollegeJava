package lecture3;

import java.util.Scanner;

public class Catch_theCoin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n!=0){
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            if(n2 < -1){
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
            n--;
        }
    }
}
