package Lecture44;

import java.util.HashMap;
import java.util.Set;

public class HashMap_demo {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        // add
        map.put("raj", 77);
        map.put("Kunal", 23);
        map.put("ankit", 76);
        map.put("punit", 55);
        System.out.println(map);

        //get
        System.out.println(map.get("aki"));
        System.out.println(map.get("ankit"));

        //contains key
        System.out.println(map.containsKey("kaju"));
        System.out.println(map.containsKey("ankit"));

        //remove
        System.out.println(map.remove("kaju"));
        System.out.println(map.remove("ankit"));
        System.out.println(map);
        Set<String> key = map.keySet();
        for(String k : map.keySet()){
            System.out.println(k+" "+map.get(k));
        }
    }
}
