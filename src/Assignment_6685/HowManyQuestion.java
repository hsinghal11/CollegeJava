package Assignment_6685;

import java.util.Scanner;

public class HowManyQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while (n-- > 0){
            int tempCount = 0;
            int[] ques= new int[3];
            for (int i = 0; i < 3; i++) {
                ques[i] = sc.nextInt();
                if(ques[i]==1) tempCount++;
            }
            if(tempCount>1) count++;
        }
        System.out.println(count);
    }
}
