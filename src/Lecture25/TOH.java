package Lecture25;

public class TOH {
    public static void main(String[] args) {
        int n = 3;
        print(n, "A", "B", "C");
    }
    private static void print(int n, String src, String des, String hlp){
        if(n==0){
            return;
        }
        print(n-1,src,hlp,des);
        System.out.println("Move " + n + "th disk form " + src + " to " + des);
        print(n-1, hlp, src, des);
    }
}
