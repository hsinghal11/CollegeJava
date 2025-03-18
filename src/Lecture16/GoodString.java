package Lecture16;

import java.util.Scanner;

public class GoodString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(solution(s));
    }
    public static int solution(String s){
        int count = 0;
        int mini = 0;
        s = s.toLowerCase();

        for (int i = 0; i < s.length(); i++) {
//            System.out.println(s.charAt(i));
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'u' || s.charAt(i) == 'o'){
                mini++;
                if(mini > count) {
                    count = mini;
                }
            } else {
                mini = 0;
            }
        }
        return count;
    }
}
