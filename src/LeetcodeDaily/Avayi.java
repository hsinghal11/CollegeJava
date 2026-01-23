package LeetcodeDaily;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Avayi {
    public static void main(String[] args) {
        System.out.println(solev(90));
    }
    public static int solev(int num){
        ArrayList<Integer> arr = new ArrayList<>();
        while (num > 0){
            int rem = num%10;
            arr.add(rem);
            num = num/10;
        }
        int max = 0;
        int min = 0;
        Collections.reverse(arr);
        int digit = 0;
        for(int intt : arr){
            if(intt!=9){
                digit = intt;
                break;
            }
        }
        for (int integer : arr) {
            if (integer == digit) {
                max = max * 10 + 9;
            } else {
                max = max * 10 + integer;
            }
        }
        int minDigit = arr.getFirst();
        for (int integer : arr) {
            if (integer == minDigit) {
                min = min * 10;
            } else {
                min = min * 10 + integer;
            }
        }
        return max-min;

    }
}
