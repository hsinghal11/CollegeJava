package Lecture18;

public class String_Builder_Demo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");
        System.out.println(sb.capacity());
        // () capacity -> 16
        // (100) capacity -> 100
        // ("Hello") capacity -> 16+5 = 21
        sb.append("kuytr");
        sb.append(true);
        sb.append(7);
        sb.append('a');
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.charAt(2));
        System.out.println(sb.reverse());
        System.out.println(sb.delete(1, 3));
        System.out.println(sb.substring(0,4));
//        String s = sb.toString(); // String builder to string
//        String str = "ffsgagrfgrgRGG"; // String to StringBuilder
//        sb.append(str);
        System.out.println(sb.capacity());
        // Vector grows by 2X
        // Arratlist grows by 1.5X
        // String builder grows by 2X+2
        sb.append("asdfghvv");
        System.out.println(sb.capacity());
    }
}
