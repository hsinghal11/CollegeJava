package Lecture45;

public class HashMap_Client {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>(10);
        map.put("raj", 77);
        map.put("Kunal", 23);
        map.put("ankit", 76);
        map.put("punit", 55);
        System.out.println(map);
    }
}
