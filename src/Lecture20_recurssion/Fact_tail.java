package Lecture20_recurssion;

public class Fact_tail {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(fac(n, 1));
    }

    private static int fac(int n, int ans) {
        if (n == 0) {
            return ans;
        }

        // int fn = fac(n - 1);// sp
        return fac(n - 1, ans * n);
    }
}
