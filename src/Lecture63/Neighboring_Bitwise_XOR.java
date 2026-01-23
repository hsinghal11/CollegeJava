package Lecture63;

public class Neighboring_Bitwise_XOR {
    public static void main(String[] args) {
        int[] derived = {1,1,0};
        System.out.println(doesValidArrayExist(derived));
    }

    public static boolean doesValidArrayExist(int[] derived) {
        int xor = 0;
        for(int i: derived){
            xor ^= i;
        }

        return xor == 0;
    }
}
