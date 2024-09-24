package Assignment6553;

import java.util.Scanner;

public class Ques15Arm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        for (int i = n1; i <= n2 ; i++) {
            if(Armstrong_Number(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean Armstrong_Number(int n) {
        int cod = Countofdigit(n);
        int sum = 0;
        int p = n;
        while (n > 0) {
            int rem = n % 10;
            sum = (int) (sum + Math.pow(rem, cod));
            n = n / 10;
        }
        if (sum == p) {
            return true;
        } else {
            return false;
        }
    }

    public static int Countofdigit(int n) {
        int c = 0;
        while (n > 0) {
            n = n / 10;
            c++;
        }
        return c;
    }
}
