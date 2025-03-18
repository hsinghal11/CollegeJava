package Lecture18;

public class StringBuilderAndStringFast {
    public static void main(String[] args) {
        String_Demo();
    }

    public static void String_Demo(){
        String s = "";
        for (int i = 0; i < 10000; i++) {
            s=s+i;
        }
        System.out.println(s);
    }
    public static void StringBuilder_Demo(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000000; i++) {
            sb=sb.append(i);
        }
        System.out.println(sb);
    }
}

