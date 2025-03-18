package Lecture23_recursion4;

public class Permutation2 {
    public static void main(String[] args) {
        String s = "abca";
        printPerm(s, "");
    }

    private static void printPerm(String sr, String ans) {
        if (sr.isEmpty()) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < sr.length(); i++) {
            char ch = sr.charAt(i);
            boolean flag = true;
            for (int j = i + 1; j < sr.length(); j++) {
                if (ch == sr.charAt(j)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                String left = sr.substring(0, i);
                String right = sr.substring(i + 1);
                printPerm(left + right, ans + ch);
            }
        }
    }
}
