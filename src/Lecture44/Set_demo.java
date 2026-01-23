package Lecture44;

import java.util.HashSet;

public class Set_demo {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(31);
        set.add(5);
        set.add(11);
        System.out.println(set);
        // contains
        System.out.println(set.contains(1));
        System.out.println(set.contains(9));

        //remove
        System.out.println(set.remove(1));
        System.out.println(set.remove(9));
        System.out.println(set);
        for(int s: set){
            System.out.print(s+" ");
        }
    }
}
