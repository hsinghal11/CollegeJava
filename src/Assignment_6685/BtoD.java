package Assignment_6685;

import java.util.Scanner;

public class BtoD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int num = sc.nextInt();
            int ans = 0;
            int mult = 1;
            while (num>0){
                int rem = num%10;
                ans += rem*mult;
                num/=10;
                mult*=2;
            }
            System.out.println(ans);
        }
    }
}
