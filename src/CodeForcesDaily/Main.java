package CodeForcesDaily;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt()) {
            int t = sc.nextInt();

            while (t-- > 0) {
                String s = sc.next();
                String tStr = sc.next();
                solve(s, tStr);
            }
        }
    }

    private static void solve(String s, String t) {
        int[] countS = new int[26];
        int[] countT = new int[26];

        for (char c : s.toCharArray()) countS[c - 'a']++;
        for (char c : t.toCharArray()) countT[c - 'a']++;

        for (int i = 0; i < 26; i++) {
            if (countT[i] < countS[i]) {
                System.out.println("Impossible");
                return;
            }
        }

        int[] excess = new int[26];
        for (int i = 0; i < 26; i++) {
            excess[i] = countT[i] - countS[i];
        }

        StringBuilder result = new StringBuilder();

        for (char c : s.toCharArray()) {
            int currentVal = c - 'a';

            for (int i = 0; i <= currentVal; i++) {
                while (excess[i] > 0) {
                    result.append((char) ('a' + i));
                    excess[i]--;
                }
            }

            result.append(c);
        }

        for (int i = 0; i < 26; i++) {
            while (excess[i] > 0) {
                result.append((char) ('a' + i));
                excess[i]--;
            }
        }

        System.out.println(result.toString());
    }
}