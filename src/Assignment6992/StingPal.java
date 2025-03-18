package Assignment6992;

import java.util.Scanner;

public class StingPal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int start = 0;
        int end = s.length()-1;
        while (start<=end){
            if(s.charAt(start)!=s.charAt(end)) {
                System.out.println(false);
                return;
            }
            else {
                start++;
                end--;
            }
        }
        System.out.println(true);
    }
}
