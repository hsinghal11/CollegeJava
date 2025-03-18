package Assignment6992;

import java.util.Arrays;
import java.util.Scanner;

public class String_Compression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s2 = sc.nextLine().toLowerCase();
        String s1 = "";
        char[] charArray = s2.toCharArray();
        Arrays.sort(charArray);
        String s = new String(charArray);

        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            char x = s.charAt(i);


            for (int j = 0; j < s.length(); j++) {
                if (x == s.charAt(j)) {
                    count++;
                }
            }

            if (s1.indexOf(x) == -1) {
                s1 = s1 + x + count;
            }
        }

        System.out.print(s1);

    }
}
