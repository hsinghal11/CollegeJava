package Lecture15;

public class PrintAllSubString {
    public static void main(String[] args) {
        String s = "hello";
        PrintSubString(s);
    }
    public static void PrintSubString(String S){
        for (int i = 0; i <= S.length(); i++) {
            for (int j = i+1; j <= S.length(); j++) {
                System.out.print(S.substring(i,j)+" ");
            }
            System.out.println();
        }
    }
}
