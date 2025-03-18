package Lecture22_recursion3;

public class Lexicographical_Numbers {
    public static void main(String[] args) {
        int n = 10;
        print_lex(n, 0);
    }

    private static void print_lex(int n, int ans) {
        if (ans > n) {
            return;
        }
        System.out.println(ans);
        int i = 0;
        if (ans == 0) {
            i = 1;
        }
        while (i <= 9) {
            print_lex(n, ans * 10 + i);
            i++;
        }
    }
}

