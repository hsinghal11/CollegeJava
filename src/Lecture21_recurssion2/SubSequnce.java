package Lecture21_recurssion2;

public class SubSequnce {
    static int store = 0;

    public static void main(String[] args) {
        String s = "abc";
        print(s, "");
    }

    private static void print(String remain, String done) {
        System.out.println(store);
        store += 1;
        if (remain.length() == 0) {
            System.out.println(done);
            return;
        }
        char first = remain.charAt(0);
        print(remain.substring(1), done);
        print(remain.substring(1), done + first);

    }
//    private static int printWithCount(String remain, String done) {
//        if (remain.length() == 0) {
//            System.out.println(done);
//            return 1;
//        }
//        char first = remain.charAt(0);
//        int a = printWithCount(remain.substring(1), done);
//        int b = printWithCount(remain.substring(1), done + first);
//        return a+b;
//    }
}
