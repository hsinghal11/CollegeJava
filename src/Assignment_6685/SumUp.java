package Assignment_6685;

import java.util.Arrays;
import java.util.Scanner;

public class SumUp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int tasks = sc.nextInt();
        while (tasks-- > 0){
            int index = sc.nextInt();
            index%=n;
            int[] temparr= new int[n];
            for (int i = 0; i < n; i++) {
                temparr[i] = arr[i];
            }
            for (int i = 0; i < n; i++) {
                int temp = index;
                if(i-temp < 0) temp = n-temp+i;
                else temp = i-temp;
                arr[i] = arr[i]+temparr[temp];
            }
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum+= arr[i];
        }
        System.out.println(sum);
    }
}
