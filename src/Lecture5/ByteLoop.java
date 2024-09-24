package Lecture5;

public class ByteLoop {
    public static void main(String[] args) {
        for(byte b = 1; b < 128; b++){
            System.out.println(b);
        }
        // first 1 to 127 then
        // infinite loop byte 128 will change into -128
//        then -127
//        then -126
//        then -125
        for(byte b = 1; b <= 127; b++){
            System.out.println(b);
        }
    }
}
