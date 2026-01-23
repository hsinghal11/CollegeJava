package Lecture45;

import java.util.*;

public class Longest_Consecutive_Sequence_128 {
    public static void main(String[] args) {
        int[] arr = {0,3,7,2,5,8,4,6,0,1};
        System.out.println(Longest_consecutive(arr));
    }

    public static int Longest_consecutive(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        int ans = 0;
        for(int i: arr){
            set.add(i);
        }
        for (int i: arr){
            if(!set.contains(i-1)){
                int c = 0;
                int key = i;
                while (set.contains(key)){
                    c++;
                    set.remove(i);
                    key++;
                }
                ans = Math.max(c, ans);
            }
        }
        return ans;
    }
}
