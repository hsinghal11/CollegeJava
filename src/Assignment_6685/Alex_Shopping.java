package Assignment_6685;

import java.util.Scanner;

public class Alex_Shopping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int t = sc.nextInt();
        while (t-->0){
            int count = 0;
            int price = sc.nextInt();
            int item = sc.nextInt();
            for (int i = 0; i < arr.length; i++) {
                if(price%arr[i] == 0 ) count++;
            }
            if(count<item) System.out.println("No");
            else System.out.println("Yes");
        }
    }
}
