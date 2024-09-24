package Assignment6553;

import java.util.Scanner;

public class Ques18ShopGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- >0){
            int M = sc.nextInt();
            int N = sc.nextInt();
            if(M==N) System.out.println("Harshit");
            else if (M > N) {
                System.out.println("Aayush");
            } else System.out.println("Harshit");
        }
        sc.close();
    }
}
