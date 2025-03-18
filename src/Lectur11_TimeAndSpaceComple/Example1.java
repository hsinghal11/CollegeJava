package Lectur11_TimeAndSpaceComple;

public class Example1 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println(start);
//        for (long i = 0; i < 1000000000l; i++) {
//
//        }
        long end = System.currentTimeMillis();
        System.out.println(end);
        System.out.println(end-start);
    }
}
