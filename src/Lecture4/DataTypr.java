package Lecture4;

import java.util.Scanner;

public class DataTypr {
    public static void main(String[] args) {
        /* Data types are of two type -:
        1. Primitive 2. non-primitive
            Primitive DataType only 8 kind :
               -> these 4 are integer type:
                    byte 8bit-> 1byte
                    short 16 bit-> 2byte
                    int  32 bit -> 4byte
                    long 64 bit -> 8byte
               -> these are 2 of float type :
                    float 32 bit -> 4byte
                    double 64 bit -> 8byte
               -> these 2 are different :
                    char 16 bit -> 2 byte
                    boolean 8 bit -> 1 byte
   ================================================================================================
        Number System :- 1) Decimal (Base 10, 0 to 9) 2) Binary (Base 2, 0 to 1) 3)Ocatal(base 8, 0 to 7)
         */
        Scanner sc = new Scanner(System.in);
//        System.out.print("enter the no :");
//        int n = sc.nextInt();
//        int sum = 0;
//        int mult = 1;
//        while(n>0){
//            int rem = n%2;
//            sum = sum + rem*mult;
//            n/=2;
//            mult*=10;
//        }
//        System.out.println(sum);
//        byte b = sc.nextByte();
//        short s = sc.nextShort();
//        int i = sc.nextInt();
//        long l = sc.nextLong();
//        System.out.println(b);
//        System.out.println(s);
//        System.out.println(i);
//        System.out.println(l);
        int a = 032;// octal ban gaya
        System.out.println(a);
//        int b = 0328; // out of range of octal
    }
}
