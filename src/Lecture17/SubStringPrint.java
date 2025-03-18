package Lecture17;

public class SubStringPrint {
    public static void main(String[] args) {
        String s = "Hello";
        PrintSubString(s);
    }

    private static void PrintSubString(String s) {
        for (int len = 1; len <= s.length(); len++) {
            for (int j = len; j <= s.length(); j++) {
                int i = j-len;
                System.out.print(s.substring(i,j)+" ");
            }
            System.out.println();
        }
    }
}
